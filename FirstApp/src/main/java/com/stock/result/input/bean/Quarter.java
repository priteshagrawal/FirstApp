package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class Quarter {

    BigDecimal sales;
    BigDecimal expenses;
    BigDecimal otherIncome;
    BigDecimal depreciation;
    BigDecimal interest;

    BigDecimal profitBeforeTax;
    BigDecimal tax;
    BigDecimal netProfit;
    BigDecimal operatingProfit;

    BigDecimal opm;

    public void calculate() {
        this.setOpm(sales.compareTo(BigDecimal.ZERO) > 0 ? BigDecimal.valueOf(sales.doubleValue()/operatingProfit.doubleValue()) : BigDecimal.ZERO);
    }
}
