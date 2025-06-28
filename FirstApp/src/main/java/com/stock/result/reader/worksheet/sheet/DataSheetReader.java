package com.stock.result.reader.worksheet.sheet;

import com.stock.result.input.sheet.DataSheetInfo;
import org.apache.commons.beanutils2.PropertyUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

@Service
public class DataSheetReader {

    public DataSheetInfo readMe(XSSFSheet profitAndLossSheet) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        DataSheetInfo dataSheetInfo = new DataSheetInfo();
        for (int i = 0 ; i <= profitAndLossSheet.getLastRowNum(); i++)
        {
            XSSFRow row = profitAndLossSheet.getRow(i);
            switch (i) {
                case 0:
                    handleRow_1(row, dataSheetInfo);
                    break;
                case 1:
                    handleRow_2(row, dataSheetInfo);
                    break;
                case 2:
                    handleRow_3(row, dataSheetInfo);
                    break;
                case 3, 4:
                    break;
                case 5:
                    handleRow_6(row, dataSheetInfo);
                    break;
                case 6:
                    handleRow_7(row, dataSheetInfo);
                    break;
                case 7:
                    handleRow_8(row, dataSheetInfo);
                    break;
                case 8:
                    handleRow_9(row, dataSheetInfo);
                    break;
                case 9, 10, 11, 12, 13, 14, 15:
                    break;
                case 16:
                    handleRow_17_31(row, dataSheetInfo, "sales");
                    break;
                case 17:
                    handleRow_17_31(row, dataSheetInfo, "rawMaterialCost");
                    break;
                case 18:
                    handleRow_17_31(row, dataSheetInfo, "changeInInventory");
                    break;
                case 19:
                    handleRow_17_31(row, dataSheetInfo, "powerAndFuel");
                    break;
                case 20:
                    handleRow_17_31(row, dataSheetInfo, "otherMfrExp");
                    break;
                case 21:
                    handleRow_17_31(row, dataSheetInfo, "employeeCost");
                    break;
                case 22:
                    handleRow_17_31(row, dataSheetInfo, "sellingAndAdmin");
                    break;
                case 23:
                    handleRow_17_31(row, dataSheetInfo, "otherExpenses");
                    break;
                case 24:
                    handleRow_17_31(row, dataSheetInfo, "otherIncome");
                    break;
                case 25:
                    handleRow_17_31(row, dataSheetInfo, "depreciation");
                    break;
                case 26:
                    handleRow_17_31(row, dataSheetInfo, "interest");
                    break;
                case 27:
                    handleRow_17_31(row, dataSheetInfo, "profitBeforeTax");
                    break;
                case 28:
                    handleRow_17_31(row, dataSheetInfo, "tax");
                    break;
                case 29:
                    handleRow_17_31(row, dataSheetInfo, "netProfit");
                    break;
                case 30:
                    handleRow_17_31(row, dataSheetInfo, "dividendPayout");
                    break;
                case 31, 32, 33, 34, 35, 36, 37, 38, 39, 40:
                    break;
                case 41:
                    handleRow_42_50(row, dataSheetInfo, "sales");
                    break;
                case 42:
                    handleRow_42_50(row, dataSheetInfo, "expenses");
                    break;
                case 43:
                    handleRow_42_50(row, dataSheetInfo, "otherIncome");
                    break;
                case 44:
                    handleRow_42_50(row, dataSheetInfo, "depreciation");
                    break;
                case 45:
                    handleRow_42_50(row, dataSheetInfo, "interest");
                    break;
                case 46:
                    handleRow_42_50(row, dataSheetInfo, "profitBeforeTax");
                    break;
                case 47:
                    handleRow_42_50(row, dataSheetInfo, "tax");
                    break;
                case 48:
                    handleRow_42_50(row, dataSheetInfo, "netProfit");
                    break;
                case 49:
                    handleRow_42_50(row, dataSheetInfo, "operatingProfit");
                    break;
                case 50, 51, 52, 53, 54, 55:
                    break;
                case 56:
                    handleRow_57_72(row, dataSheetInfo, "equityShareCapital");
                    break;
                case 57:
                    handleRow_57_72(row, dataSheetInfo, "reserves");
                    break;
                case 58:
                    handleRow_57_72(row, dataSheetInfo, "borrowings");
                    break;
                case 59:
                    handleRow_57_72(row, dataSheetInfo, "otherLiabilities");
                    break;
                case 60:
                    handleRow_57_72(row, dataSheetInfo, "total1");
                    break;
                case 61:
                    handleRow_57_72(row, dataSheetInfo, "netBlock");
                    break;
                case 62:
                    handleRow_57_72(row, dataSheetInfo, "capitalWorkInProgress");
                    break;
                case 63:
                    handleRow_57_72(row, dataSheetInfo, "investments");
                    break;
                case 64:
                    handleRow_57_72(row, dataSheetInfo, "otherAssets");
                    break;
                case 65:
                    handleRow_57_72(row, dataSheetInfo, "total2");
                    break;
                case 66:
                    handleRow_57_72(row, dataSheetInfo, "receivables");
                    break;
                case 67:
                    handleRow_57_72(row, dataSheetInfo, "inventory");
                    break;
                case 68:
                    handleRow_57_72(row, dataSheetInfo, "cashAndBank");
                    break;
                case 69:
                    handleRow_57_72(row, dataSheetInfo, "noOfEquityShares");
                    break;
                case 70:
                    handleRow_57_72(row, dataSheetInfo, "newBonusShares");
                    break;
                case 71:
                    handleRow_57_72(row, dataSheetInfo, "faceValue");
                    break;
                case 72, 73, 74, 75, 76, 77, 78, 79, 80:
                    break;
                case 81:
                    handleRow_82_85(row, dataSheetInfo, "cashFromOperatingActivity");
                    break;
                case 82:
                    handleRow_82_85(row, dataSheetInfo, "cashFromInvestingActivity");
                    break;
                case 83:
                    handleRow_82_85(row, dataSheetInfo, "cashFromFinancingActivity");
                    break;
                case 84:
                    handleRow_82_85(row, dataSheetInfo, "netCashFlow");
                    break;
                case 89:
                    handleRow_90(row, dataSheetInfo);
                    break;
                case 92:
                    handleRow_93(row, dataSheetInfo);
                    break;
            }
        }

        return dataSheetInfo;
    }

    BigDecimal handleNumericCellWithDefault(XSSFCell cell)
    {
       return  cell== null || cell.getCellType() != CellType.NUMERIC ?  BigDecimal.ZERO : BigDecimal.valueOf(cell.getNumericCellValue());
    }

    private void handleRow_93(XSSFRow row, DataSheetInfo dataSheetInfo) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus9AdjustedEquitySharesRow" ,handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus8AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus7AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus6AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus5AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus4AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus3AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus2AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "tminus1AdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getAdjustedEquitySharesRow(), "TAdjustedEquitySharesRow" , handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }
    private void handleRow_90(XSSFRow row, DataSheetInfo dataSheetInfo) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus9Price" , handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus8Price" , handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus7Price" , handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus6Price" , handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus5Price" , handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus4Price" , handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus3Price" , handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus2Price" , handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "tminus1Price" , handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setSimpleProperty(dataSheetInfo.getPriceRow(), "TPrice" , handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }

    private void handleRow_82_85(XSSFRow row, DataSheetInfo dataSheetInfo, String element) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus9CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus8CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus7CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus6CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus5CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus4CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus3CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus2CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "tminus1CashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getCashFlowCollection(), "TCashFlow." + element, handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }

    private void handleRow_57_72(XSSFRow row, DataSheetInfo dataSheetInfo, String element) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus9BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus8BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus7BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus6BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus5BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus4BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus3BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus2BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "tminus1BalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getBalanceSheetCollection(), "TBalanceSheet." + element, handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }


    private void handleRow_42_50(XSSFRow row, DataSheetInfo dataSheetInfo, String element) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus9Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus8Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus7Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus6Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus5Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus4Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus3Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus2Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "tminus1Quarter." + element, handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getQuarterCollection(), "TQuarter." + element, handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }

    private void handleRow_17_31(XSSFRow row, DataSheetInfo dataSheetInfo, String element) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (int j =0 ; j<11; j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus9ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 2:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus8ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 3:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus7ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 4:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus6ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 5:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus5ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 6:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus4ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 7:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus3ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 8:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus2ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 9:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "tminus1ProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
                case 10:
                    PropertyUtils.setNestedProperty(dataSheetInfo.getProfitLossCollection(), "TProfitLoss." + element, handleNumericCellWithDefault(cell));
                    break;
            }
        }
    }


    private void handleRow_9(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setMarketCapitalization(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_8(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setCurrentPrice(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_7(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setFaceValue(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_6(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setNoOfShares(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_3(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setCurrentExcelVersion(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_2(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setLatestExcelVersion(handleNumericCellWithDefault(cell));
                    break;
                default:
                    break;
            }
        }

    }

    private void handleRow_1(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setCompanyName(cell.getStringCellValue());
                    break;
                default:
                    break;
            }
        }
    }

    private void handleRow_template(XSSFRow row, DataSheetInfo dataSheetInfo) {
        for (int j =0 ; j<row.getLastCellNum(); j++){
            XSSFCell cell = row.getCell(j);
            switch (j) {
                case 1:
                    dataSheetInfo.setCompanyName(cell.getStringCellValue());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                default:
                    break;
            }
        }
    }
}