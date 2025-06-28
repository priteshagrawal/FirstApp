package com.stock.result.input.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/*
 */

@Data
@Slf4j
public class ProfitLoss {
    BigDecimal sales;
    BigDecimal rawMaterialCost;
    BigDecimal changeInInventory;
    BigDecimal powerAndFuel ;
    BigDecimal otherMfrExp ;
    BigDecimal employeeCost ;
    BigDecimal sellingAndAdmin;
    BigDecimal otherExpenses;

    BigDecimal otherIncome;
    BigDecimal depreciation;
    BigDecimal interest;
    BigDecimal profitBeforeTax;
    BigDecimal tax;
    BigDecimal netProfit;
    BigDecimal dividendPayout ;

    BigDecimal expenses;
    BigDecimal operatingProfit;

    BigDecimal eps;
    BigDecimal priceToEarning;

    BigDecimal price;
    BigDecimal opm;

    public void calculate(BigDecimal adjustedEquityShares, BigDecimal price){

        double exp = this.getRawMaterialCost().doubleValue() + this.getPowerAndFuel().doubleValue()
               + this.getOtherMfrExp().doubleValue() + this.getEmployeeCost().doubleValue() +this.getSellingAndAdmin().doubleValue()
               + this.getOtherExpenses().doubleValue() - this.getChangeInInventory().doubleValue();
        this.setExpenses(BigDecimal.valueOf(exp));

        this.setOperatingProfit(BigDecimal.valueOf(this.getSales().doubleValue()-this.getExpenses().doubleValue()));

        double epps =adjustedEquityShares.doubleValue() ==0 ? adjustedEquityShares.doubleValue() : this.getNetProfit().doubleValue()/adjustedEquityShares.doubleValue();
        this.setEps(BigDecimal.valueOf(epps));

        double priceToEarningg = price.doubleValue() > 0 ? price.doubleValue()/epps : 0 ;
        this.setPriceToEarning(BigDecimal.valueOf(priceToEarningg));

        this.setPrice(price);

        double opmmm = this.getOperatingProfit().doubleValue() > 0 ? this.getOperatingProfit().doubleValue()/this.getSales().doubleValue() : 0 ;
        this.setOpm(BigDecimal.valueOf(opmmm));

    }



}
