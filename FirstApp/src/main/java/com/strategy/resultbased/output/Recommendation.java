package com.strategy.resultbased.output;

import com.opencsv.bean.CsvBindByName;
import com.strategy.resultbased.input.bean.InputData;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
public class Recommendation {

    @CsvBindByName(column = "Name", required = true)
    private String stockName;

    @CsvBindByName(column = "Recommendation Date", required = false)
    private String date;

    @CsvBindByName(column = "CMP Rs.", required = true)
    private Double cmp;

    @CsvBindByName(column = "Recommendation Price", required = false)
    private Double recommendationPrice;

    @CsvBindByName(column = "Comments", required = false)
    private List<String> comments = new ArrayList<>();

    public static Recommendation from(InputData bean){
        Recommendation r=  new Recommendation();
        r.setCmp(bean.getCurrentMarketPrice());
        r.setStockName(bean.getStockName());
        return r;
    }

    public static Recommendation from(Double cmp, String stockName){
        Recommendation r=  new Recommendation();
        r.setCmp(cmp);
        r.setStockName(stockName);
        return r;
    }

    public void addComments(String str)
    {
        comments.add(str);
    }
}
