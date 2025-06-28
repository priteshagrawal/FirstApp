package com.strategy.resultbased.reader;

import com.opencsv.bean.CsvToBeanBuilder;
import com.strategy.resultbased.input.bean.InputData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static com.strategy.resultbased.config.StrategyResultConstant.*;

@Service
@Slf4j
public class QueryResultWorkSheetReader {

    public List<InputData> readData()
    {
        try {
            List<InputData> beans = new CsvToBeanBuilder(new FileReader(FILE_PATH + File.separator + INPUT_FILE_NAME + INPUT_PATTERN))
                    .withType(InputData.class).build().parse();
            beans.forEach(b -> log.info(" Beans ->  {} " , b));
            return beans;
        } catch (FileNotFoundException e) {
           log.error("Error in reading Query Result {}" , FILE_PATH , e);
        }
        return null;
    }

}
