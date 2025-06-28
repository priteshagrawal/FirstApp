package com.stock.result.reader.worksheet.sheet;

import com.stock.result.input.sheet.BalanceSheetInfo;
import com.stock.result.input.sheet.DataSheetInfo;
import org.springframework.stereotype.Service;

@Service
public class BalanceSheetReader {

    public BalanceSheetInfo readMe(DataSheetInfo dataSheetInfo) {
        BalanceSheetInfo balanceSheetInfo = new BalanceSheetInfo();
        balanceSheetInfo.setCompanyName(dataSheetInfo.getCompanyName());
        balanceSheetInfo.setBalanceSheetCollection(dataSheetInfo.getBalanceSheetCollection());
        balanceSheetInfo.calculate(dataSheetInfo);
        return balanceSheetInfo;
    }

}