package com.example.kafkaprocessorusagecost.config;

import com.example.kafkaprocessorusagecost.model.UsageCostDetail;
import com.example.kafkaprocessorusagecost.model.UsageDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class UsageCostProcessor {
    private double ratePerSecond = 0.1;
    private double ratePerMB = 0.05;

    @Bean
    public Function<UsageDetail, UsageCostDetail> processUsageCost() {
        return usageDetail -> {
            UsageCostDetail costDetail = new UsageCostDetail();
            costDetail.setUserId(usageDetail.getUserId());
            costDetail.setCallCost(usageDetail.getDuration() * this.ratePerSecond);
            costDetail.setDataCost(usageDetail.getData() * this.ratePerMB);

            return costDetail;
        };
    }
}
