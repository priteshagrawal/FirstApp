package com.stock.result.input.sheet;

import com.stock.result.input.bean.CashFlowCollection;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class CashFlowSheetInfo {

    String companyName;

    CashFlowCollection cashFlowCollection = new CashFlowCollection();

    @Override
    public String toString() {
        return "CashFlowSheetInfo{" +
                "companyName='" + companyName + '\'' + "\n" +
                ", cashFlowCollection=" + cashFlowCollection +
                '}';
    }

}
