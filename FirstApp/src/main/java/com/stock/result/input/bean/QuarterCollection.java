package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class QuarterCollection {
    Quarter tminus9Quarter = new Quarter();
    Quarter tminus8Quarter = new Quarter();
    Quarter tminus7Quarter = new Quarter();
    Quarter tminus6Quarter= new Quarter();
    Quarter tminus5Quarter= new Quarter();
    Quarter tminus4Quarter= new Quarter();
    Quarter tminus3Quarter= new Quarter();
    Quarter tminus2Quarter= new Quarter();
    Quarter tminus1Quarter= new Quarter();
    Quarter tQuarter = new Quarter();

    public void calculate() {
        tminus9Quarter.calculate();
        tminus8Quarter.calculate();
        tminus7Quarter.calculate();
        tminus6Quarter.calculate();
        tminus5Quarter.calculate();
        tminus4Quarter.calculate();
        tminus3Quarter.calculate();
        tminus2Quarter.calculate();
        tminus1Quarter.calculate();
        tQuarter.calculate();
    }


    @Override
    public String toString() {
        return "QuarterCollection{\n" +
                "  tminus9Quarter=" + tminus9Quarter + "\n" +
                ", tminus8Quarter=" + tminus8Quarter + "\n" +
                ", tminus7Quarter=" + tminus7Quarter + "\n" +
                ", tminus6Quarter=" + tminus6Quarter +"\n" +
                ", tminus5Quarter=" + tminus5Quarter +"\n" +
                ", tminus4Quarter=" + tminus4Quarter +"\n" +
                ", tminus3Quarter=" + tminus3Quarter +"\n" +
                ", tminus2Quarter=" + tminus2Quarter +"\n" +
                ", tminus1Quarter=" + tminus1Quarter +"\n" +
                ", tQuarter      =" + tQuarter +"\n" +
                '}';
    }


}
