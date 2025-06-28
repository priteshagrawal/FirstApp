package com.stock.result.input.sheet;

import com.stock.result.input.bean.QuarterCollection;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class QuartersSheetInfo {

    String companyName;
    
    QuarterCollection quarterCollection = new QuarterCollection();

    public void calculate() {
        quarterCollection.calculate();
    }
    @Override
    public String toString() {
        return "QuartersSheetInfo{" +
                "companyName='" + companyName + '\'' + "\n" +
                ", quarterCollection=" + quarterCollection +
                '}';
    }


}
