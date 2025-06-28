package com.strategy.resultbased.service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.strategy.resultbased.input.bean.InputData;
import com.strategy.resultbased.output.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.strategy.resultbased.config.StrategyResultConstant.*;

@SpringBootApplication
@Slf4j
public class FirstAppApplication {



	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);

        log.info("Reading the Input");
        List<InputData> beans = readData();

        log.info("Processing Recommendation for {} ", beans.size());
        Map<InputData, Recommendation> data = processData(beans);

        log.info("Recommendation Calculated for {} ", beans.size());
        writeData(data);

        log.info("Enjoy Trading");

    }

    private static void writeData(Map<InputData, Recommendation> data) {
        Writer writer = null;
        try {
            writer = new FileWriter(FILE_PATH + File.separator + INPUT_FILE_NAME + OUT_PUT_FILE_NAME + INPUT_PATTERN);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        try {
            beanToCsv.write(data.values());
            writer.close();
        } catch (CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);
        } catch (CsvRequiredFieldEmptyException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Map<InputData, Recommendation> processData(List<InputData> beans) {
        Map<InputData, Recommendation> recommendationMap = new HashMap<>();
        beans.forEach(b -> {
            Recommendation r = Recommendation.from(b.getCurrentMarketPrice(), b.getStockName());
            recommendationMap.put(b,r);
        });
        return  recommendationMap;
    }

    public static  List<InputData> readData()
    {
        try {
            List<InputData> beans = new CsvToBeanBuilder(new FileReader(FILE_PATH + File.separator + INPUT_FILE_NAME + INPUT_PATTERN))
                    .withType(InputData.class).build().parse();
            beans.forEach(b -> log.info(" Beans ->  {} " , b));
            return beans;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
