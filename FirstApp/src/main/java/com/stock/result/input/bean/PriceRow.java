package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class PriceRow {
    BigDecimal tminus9Price ;
    BigDecimal tminus8Price ;
    BigDecimal tminus7Price ;
    BigDecimal tminus6Price;
    BigDecimal tminus5Price;
    BigDecimal tminus4Price;
    BigDecimal tminus3Price;
    BigDecimal tminus2Price;
    BigDecimal tminus1Price;
    BigDecimal tPrice ;
}
