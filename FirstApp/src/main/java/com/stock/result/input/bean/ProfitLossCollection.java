package com.stock.result.input.bean;

import com.stock.result.input.sheet.DataSheetInfo;
import lombok.Data;

@Data
public class ProfitLossCollection {
    ProfitLoss tminus9ProfitLoss = new ProfitLoss();
    ProfitLoss tminus8ProfitLoss = new ProfitLoss();
    ProfitLoss tminus7ProfitLoss = new ProfitLoss();
    ProfitLoss tminus6ProfitLoss= new ProfitLoss();
    ProfitLoss tminus5ProfitLoss= new ProfitLoss();
    ProfitLoss tminus4ProfitLoss= new ProfitLoss();
    ProfitLoss tminus3ProfitLoss= new ProfitLoss();
    ProfitLoss tminus2ProfitLoss= new ProfitLoss();
    ProfitLoss tminus1ProfitLoss= new ProfitLoss();
    ProfitLoss tProfitLoss = new ProfitLoss();

    public void calculate(DataSheetInfo dataSheetInfo) {
        tminus9ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus9AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus9Price());
        tminus8ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus8AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus8Price());
        tminus7ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus7AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus7Price());
        tminus6ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus6AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus6Price());
        tminus5ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus5AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus5Price());
        tminus4ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus4AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus4Price());
        tminus3ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus3AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus3Price());
        tminus2ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus2AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus2Price());
        tminus1ProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTminus1AdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTminus1Price());
        tProfitLoss.calculate(dataSheetInfo.getAdjustedEquitySharesRow().getTAdjustedEquitySharesRow(), dataSheetInfo.getPriceRow().getTPrice());
    }

    @Override
    public String toString() {
        return "ProfitLossCollection{ \n" +
                "  tminus9ProfitLoss=" + tminus9ProfitLoss +   "\n" +
                ", tminus8ProfitLoss=" + tminus8ProfitLoss +  "\n" +
                ", tminus7ProfitLoss=" + tminus7ProfitLoss +  "\n" +
                ", tminus6ProfitLoss=" + tminus6ProfitLoss +  "\n" +
                ", tminus5ProfitLoss=" + tminus5ProfitLoss +  "\n" +
                ", tminus4ProfitLoss=" + tminus4ProfitLoss +  "\n" +
                ", tminus3ProfitLoss=" + tminus3ProfitLoss +  "\n" +
                ", tminus2ProfitLoss=" + tminus2ProfitLoss +  "\n" +
                ", tminus1ProfitLoss=" + tminus1ProfitLoss +  "\n" +
                ", tProfitLoss=      " + tProfitLoss +  "\n" +
                '}';
    }
}
