package com.stock.result.reader.worksheet;

import com.stock.result.input.sheet.DataSheetInfo;
import com.stock.result.input.StockResult;
import com.stock.result.reader.worksheet.sheet.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.nio.file.Path;

import static com.stock.result.config.ReaderConstant.DATA_SHEET;

@Service
@Slf4j
public class StockResultWorkbookReaderService {

    @Autowired
    DataSheetReader dataSheetReader;

    @Autowired
    QuartersSheetReader quartersSheetReader;

    @Autowired
    BalanceSheetReader balanceSheetReader;

    @Autowired
    CashFlowSheetReader cashFlowSheetReader;

    @Autowired
    ProfitAndLossSheetReader profitAndLossSheetReader;

   public StockResult readStockResult(Path p) {
        try {
             return readAllSheet(p);
        } catch (Exception e) {
           log.error("Error in reading the Excel Sheet ", e);
        }
        return null;
    }

    public StockResult readAllSheet(Path p)  {
        log.info("Reading {} ", p.toString());

        StockResult stockResultInfo = new StockResult();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(p.toFile());
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            DataSheetInfo dataSheetInfo =  dataSheetReader.readMe( workbook.getSheet(DATA_SHEET));

            stockResultInfo.setQuartersSheetInfo(quartersSheetReader.readMe(dataSheetInfo));
            stockResultInfo.setCashFlowSheetInfo(cashFlowSheetReader.readMe(dataSheetInfo));

            stockResultInfo.setProfitAndLossInfo(profitAndLossSheetReader.readMe(dataSheetInfo));

            stockResultInfo.setBalanceSheetInfo(balanceSheetReader.readMe(dataSheetInfo));

            stockResultInfo.setDataSheetInfo(dataSheetInfo);

            //log.info("StockInfo --> {}", stockResultInfo);
        } catch (Exception e) {
           log.error("Error in reading the Stock info " , e);
        }

        return stockResultInfo;
    }

}
