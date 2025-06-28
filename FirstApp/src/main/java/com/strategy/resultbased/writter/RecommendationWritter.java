package com.strategy.resultbased.writter;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.strategy.resultbased.input.bean.InputData;
import com.strategy.resultbased.output.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import static com.strategy.resultbased.config.StrategyResultConstant.*;
import static com.strategy.resultbased.config.StrategyResultConstant.INPUT_PATTERN;

@Slf4j
@Service
public class RecommendationWritter {

    public void writeData(Map<InputData, Recommendation> data) {
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
}
