package com.stock.result.reader.worksheet.sheet;

import com.stock.result.input.sheet.DataSheetInfo;
import com.stock.result.input.sheet.ProfitAndLossInfo;
import org.springframework.stereotype.Service;

@Service
public class ProfitAndLossSheetReader {

    public ProfitAndLossInfo readMe(DataSheetInfo dataSheetInfo) {
        ProfitAndLossInfo profitAndLossInfo = new ProfitAndLossInfo();
        profitAndLossInfo.setCompanyName(dataSheetInfo.getCompanyName());
        profitAndLossInfo.setProfitLossCollection(dataSheetInfo.getProfitLossCollection());
        profitAndLossInfo.calculate(dataSheetInfo);
        return profitAndLossInfo;
    }

}
