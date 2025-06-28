package com.strategy.resultbased.input.bean;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
1. Stock Name
2. CMP
3. Market Cap
4.

 */

@Slf4j
@Data
public class InputData {
    @CsvBindByName(column = "S.No.", required = false)
    private Integer sno;

    @CsvBindByName(column = "Name", required = true)
    private String stockName;

    @CsvBindByName(column = "CMP Rs.", required = true)
    private Double currentMarketPrice;

    @CsvBindByName(column = "P/E", required = true)
    private Double profitEarningRatio;

    @CsvBindByName(column = "Mar Cap Rs.Cr.", required = true)
    private Double marketCap;

    @CsvBindByName(column = "Div Yld %", required = true)
    private Double dividendYield;

    @CsvBindByName(column = "NP Qtr Rs.Cr.", required = true)
    private Double netProfitInQuarter;

    @CsvBindByName(column = "Qtr Profit Var %", required = true)
    private Double quarterProfitVariance;

    @CsvBindByName(column = "Sales Qtr Rs.Cr.", required = true)
    private Double salesQuarter;

    @CsvBindByName(column = "Qtr Sales Var %", required = true)
    private Double quarterSalesVariance;

    @CsvBindByName(column = "ROCE %", required = true)
    private Double roce;

    @CsvBindByName(column = "200 DMA Rs.", required = true)
    private Double dma200;

    @CsvBindByName(column = "200 DMA prev. Rs.", required = true)
    private Double dma200prev;

    @CsvBindByName(column = "3mth return %", required = true)
    private Double quarterReturn;

    @CsvBindByName(column = "Prom. Hold. %", required = true)
    private Double promoterHolding;

    @CsvBindByName(column = "FII Hold. %", required = false)
    private Double fiiHolding;

    @CsvBindByName(column = "Debt / Eq", required = false)
    private Double debtToEquity;
}
