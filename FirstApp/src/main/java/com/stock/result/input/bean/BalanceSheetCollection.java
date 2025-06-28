package com.stock.result.input.bean;

import com.stock.result.input.sheet.DataSheetInfo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BalanceSheetCollection {
    BalanceSheet tminus9BalanceSheet = new BalanceSheet();
    BalanceSheet tminus8BalanceSheet = new BalanceSheet();
    BalanceSheet tminus7BalanceSheet = new BalanceSheet();
    BalanceSheet tminus6BalanceSheet= new BalanceSheet();
    BalanceSheet tminus5BalanceSheet= new BalanceSheet();
    BalanceSheet tminus4BalanceSheet= new BalanceSheet();
    BalanceSheet tminus3BalanceSheet= new BalanceSheet();
    BalanceSheet tminus2BalanceSheet= new BalanceSheet();
    BalanceSheet tminus1BalanceSheet= new BalanceSheet();
    BalanceSheet tBalanceSheet = new BalanceSheet();

    public void calculate(DataSheetInfo dataSheetInfo) {
        tminus9BalanceSheet.calculate(dataSheetInfo);
        tminus8BalanceSheet.calculate(dataSheetInfo);
        tminus7BalanceSheet.calculate(dataSheetInfo);
        tminus6BalanceSheet.calculate(dataSheetInfo);
        tminus5BalanceSheet.calculate(dataSheetInfo);
        tminus4BalanceSheet.calculate(dataSheetInfo);
        tminus3BalanceSheet.calculate(dataSheetInfo);
        tminus2BalanceSheet.calculate(dataSheetInfo);
        tminus1BalanceSheet.calculate(dataSheetInfo);
        tBalanceSheet.calculate(dataSheetInfo);
    }

    @Override
    public String toString() {
        return "BalanceSheetCollection{\n" +
                "  tminus9BalanceSheet=" + tminus9BalanceSheet + "\n" +
                ", tminus8BalanceSheet=" + tminus8BalanceSheet + "\n" +
                ", tminus7BalanceSheet=" + tminus7BalanceSheet + "\n" +
                ", tminus6BalanceSheet=" + tminus6BalanceSheet + "\n" +
                ", tminus5BalanceSheet=" + tminus5BalanceSheet + "\n" +
                ", tminus4BalanceSheet=" + tminus4BalanceSheet + "\n" +
                ", tminus3BalanceSheet=" + tminus3BalanceSheet + "\n" +
                ", tminus2BalanceSheet=" + tminus2BalanceSheet + "\n" +
                ", tminus1BalanceSheet=" + tminus1BalanceSheet + "\n" +
                ", tBalanceSheet      =" + tBalanceSheet + "\n" +
                '}';
    }

}
