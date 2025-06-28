package com.stock.result.input.sheet;

import com.stock.result.input.bean.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
public class DataSheetInfo {

    String companyName;
    BigDecimal latestExcelVersion ;
    BigDecimal currentExcelVersion;

    BigDecimal noOfShares;
    BigDecimal faceValue;
    BigDecimal currentPrice;
    BigDecimal marketCapitalization;

    ProfitLossCollection profitLossCollection = new ProfitLossCollection();
    QuarterCollection quarterCollection = new QuarterCollection();

    BalanceSheetCollection balanceSheetCollection = new BalanceSheetCollection();
    CashFlowCollection cashFlowCollection = new CashFlowCollection();
    PriceRow priceRow = new PriceRow();
    AdjustedEquitySharesRow adjustedEquitySharesRow = new AdjustedEquitySharesRow();

    @Override
    public String toString() {
        return "DataSheet{" +
                "companyName='" + companyName + '\'' + "\n" +
                ", latestExcelVersion=" + latestExcelVersion + "\n" +
                ", currentExcelVersion=" + currentExcelVersion + "\n" +
                ", noOfShares=" + noOfShares + "\n" +
                ", faceValue=" + faceValue +"\n" +
                ", currentPrice=" + currentPrice +"\n" +
                ", marketCapitalization=" + marketCapitalization +"\n" +
         //       ", profitLossCollection=" + profitLossCollection +"\n" +
         //       ", quarterCollection=" + quarterCollection +"\n" +
         //       ", balanceSheetCollection=" + balanceSheetCollection +"\n" +
         //       ", cashFlowCollection=" + cashFlowCollection +"\n" +
                ", priceRow=" + priceRow +"\n" +
                ", adjustedEquitySharesRow=" + adjustedEquitySharesRow +"\n" +
                '}';
    }

}
