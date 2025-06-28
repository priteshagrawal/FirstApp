package com.stock.result.input.sheet;

import com.stock.result.input.bean.ProfitLossCollection;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ProfitAndLossInfo {

    String companyName;
    
    ProfitLossCollection profitLossCollection = new ProfitLossCollection();

    public void calculate(DataSheetInfo dataSheetInfo) {
        profitLossCollection.calculate(dataSheetInfo);
    }
}
