package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class CashFlowCollection {

    CashFlow tminus9CashFlow = new CashFlow();
    CashFlow tminus8CashFlow = new CashFlow();
    CashFlow tminus7CashFlow = new CashFlow();
    CashFlow tminus6CashFlow= new CashFlow();
    CashFlow tminus5CashFlow= new CashFlow();
    CashFlow tminus4CashFlow= new CashFlow();
    CashFlow tminus3CashFlow= new CashFlow();
    CashFlow tminus2CashFlow= new CashFlow();
    CashFlow tminus1CashFlow= new CashFlow();
    CashFlow tCashFlow = new CashFlow();

    @Override
    public String toString() {
        return "CashFlowCollection{\n" +
                "  tminus9CashFlow=" + tminus9CashFlow + "\n" +
                ", tminus8CashFlow=" + tminus8CashFlow + "\n" +
                ", tminus7CashFlow=" + tminus7CashFlow + "\n" +
                ", tminus6CashFlow=" + tminus6CashFlow + "\n" +
                ", tminus5CashFlow=" + tminus5CashFlow + "\n" +
                ", tminus4CashFlow=" + tminus4CashFlow + "\n" +
                ", tminus3CashFlow=" + tminus3CashFlow + "\n" +
                ", tminus2CashFlow=" + tminus2CashFlow + "\n" +
                ", tminus1CashFlow=" + tminus1CashFlow + "\n" +
                ", tCashFlow=" + tCashFlow + "\n" +
                '}';
    }
}
