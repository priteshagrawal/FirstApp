package com.stock.result.input;

import com.stock.result.input.sheet.*;
import lombok.Data;

@Data
public class StockResult {

    DataSheetInfo dataSheetInfo = new DataSheetInfo();

    CashFlowSheetInfo cashFlowSheetInfo = new CashFlowSheetInfo();

    QuartersSheetInfo quartersSheetInfo = new QuartersSheetInfo();

    BalanceSheetInfo balanceSheetInfo = new BalanceSheetInfo();

    ProfitAndLossInfo profitAndLossInfo = new ProfitAndLossInfo();

    public String getStockName(){
        return getDataSheetInfo().getCompanyName();
    }


}
