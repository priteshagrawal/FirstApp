package com.stock.result.reader.worksheet.sheet;

import com.stock.result.input.sheet.DataSheetInfo;
import com.stock.result.input.sheet.QuartersSheetInfo;
import org.springframework.stereotype.Service;

@Service
public class QuartersSheetReader {

    public QuartersSheetInfo readMe(DataSheetInfo dataSheetInfo) {
        QuartersSheetInfo quartersSheetInfo = new QuartersSheetInfo();
        quartersSheetInfo.setCompanyName(dataSheetInfo.getCompanyName());
        quartersSheetInfo.setQuarterCollection(dataSheetInfo.getQuarterCollection());
        quartersSheetInfo.calculate();
        return quartersSheetInfo;
    }

}