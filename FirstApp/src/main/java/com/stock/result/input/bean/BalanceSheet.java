package com.stock.result.input.bean;

import com.stock.result.input.sheet.DataSheetInfo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class BalanceSheet {
    BigDecimal equityShareCapital ;
    BigDecimal reserves ;
    BigDecimal borrowings ;
    BigDecimal otherLiabilities;
    BigDecimal total1;
    BigDecimal netBlock;
    BigDecimal capitalWorkInProgress;
    BigDecimal investments;
    BigDecimal otherAssets;
    BigDecimal total2;
    BigDecimal receivables;
    BigDecimal inventory;
    BigDecimal cashAndBank;
    BigDecimal noOfEquityShares;
    BigDecimal newBonusShares;
    BigDecimal faceValue;

    BigDecimal workingCapital; // Other Assets -Other Liabilities
    BigDecimal debtors; // receivables

    BigDecimal debtorDays; //
    BigDecimal inventoryTurnover; //

    BigDecimal returnOnEquity; //
    BigDecimal returnOnCapitalEmp;//



    public void calculate(DataSheetInfo dataSheetInfo) {
        this.setWorkingCapital(BigDecimal.valueOf(this.otherAssets.doubleValue()-this.otherLiabilities.doubleValue()));
        this.setDebtors(BigDecimal.valueOf(this.receivables.doubleValue()));


    }

}
