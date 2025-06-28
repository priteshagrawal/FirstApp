package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class CashFlow {
    BigDecimal cashFromOperatingActivity;
    BigDecimal cashFromInvestingActivity;
    BigDecimal cashFromFinancingActivity;
    BigDecimal netCashFlow;
}
