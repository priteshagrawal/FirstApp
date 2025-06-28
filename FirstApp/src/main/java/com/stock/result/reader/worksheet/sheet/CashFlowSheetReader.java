package com.stock.result.reader.worksheet.sheet;

import com.stock.result.input.sheet.CashFlowSheetInfo;
import com.stock.result.input.sheet.DataSheetInfo;
import org.springframework.stereotype.Service;

@Service
public class CashFlowSheetReader {

    public CashFlowSheetInfo readMe(DataSheetInfo dataSheetInfo) {
        CashFlowSheetInfo cashFlowSheetInfo = new CashFlowSheetInfo();
        cashFlowSheetInfo.setCompanyName(dataSheetInfo.getCompanyName());
        cashFlowSheetInfo.setCashFlowCollection(dataSheetInfo.getCashFlowCollection());
        return cashFlowSheetInfo;
    }

}