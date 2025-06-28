package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class AdjustedEquitySharesRow {
    BigDecimal tminus9AdjustedEquitySharesRow ;
    BigDecimal tminus8AdjustedEquitySharesRow ;
    BigDecimal tminus7AdjustedEquitySharesRow ;
    BigDecimal tminus6AdjustedEquitySharesRow;
    BigDecimal tminus5AdjustedEquitySharesRow;
    BigDecimal tminus4AdjustedEquitySharesRow;
    BigDecimal tminus3AdjustedEquitySharesRow;
    BigDecimal tminus2AdjustedEquitySharesRow;
    BigDecimal tminus1AdjustedEquitySharesRow;
    BigDecimal tAdjustedEquitySharesRow ;
}
