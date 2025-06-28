package com.strategy.resultbased.service;

import com.stock.result.input.StockResult;
import com.stock.result.service.StockScreenerService;
import com.strategy.resultbased.input.bean.InputData;
import com.strategy.resultbased.output.Recommendation;
import com.strategy.resultbased.reader.QueryResultWorkSheetReader;
import com.strategy.resultbased.writter.RecommendationWritter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RecommendationService {

    @Autowired
    QueryResultWorkSheetReader resultReader;

    @Autowired
    RecommendationWritter recommendationWritter;

    @Autowired
    StockScreenerService stockScreenerService;

	public void performMagic() {

        log.info("Reading the Input");
        List<InputData> beans = resultReader.readData();

        log.info("Reading the Results");
        Collection<StockResult> stockResult = stockScreenerService.screen();

        log.info("Processing Recommendation for {} ", beans.size());
        Map<InputData, Recommendation> data = processData(beans, stockResult);

        processData_new(beans, stockResult);

        log.info("Recommendation Calculated for {} ", beans.size());
        recommendationWritter.writeData(data);

        log.info("Enjoy Trading");

    }

    public Map<InputData, Recommendation> processData_new(List<InputData> beans, Collection<StockResult> stockResult) {
        Map<String, StockResult> stockResultMap =
                stockResult.stream().collect(Collectors.toMap((StockResult::getStockName), Function.identity()));

        log.info("{}", stockResultMap.keySet());

        Map<InputData, Recommendation> recommendationMap = new HashMap<>();
        for ( InputData bean : beans){
            if (stockResultMap.containsKey(bean.getStockName())){
                log.info("found result of {}" , bean.getStockName());
            }
            else {
                log.info("Missing result for {}" , bean.getStockName());
            }
        }
        return recommendationMap;
    }


    public Map<InputData, Recommendation> processData(List<InputData> beans, Collection<StockResult> stockResult) {
        Map<String, StockResult> stockResultMap =
        stockResult.stream().collect(Collectors.toMap(StockResult::getStockName, Function.identity()));

        Map<InputData, Recommendation> recommendationMap = new HashMap<>();
        beans.forEach(b -> {
            recommendationMap.put(b,Recommendation.from(b.getCurrentMarketPrice(), b.getStockName()));
        });
        return recommendationMap;
    }
}
