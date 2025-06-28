package com.stock.result.input.sheet;

import com.stock.result.input.bean.BalanceSheetCollection;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class BalanceSheetInfo {

    String companyName;
    
    BalanceSheetCollection balanceSheetCollection = new BalanceSheetCollection();

    public void calculate(DataSheetInfo dataSheetInfo) {
        balanceSheetCollection.calculate(dataSheetInfo);
    }
    @Override
    public String toString() {
        return "BalanceSheetInfo{" +
                "companyName='" + companyName + '\'' + "\n" +
                ", balanceSheetCollection=" + balanceSheetCollection +
                '}';
    }


}
