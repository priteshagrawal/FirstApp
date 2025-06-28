package com.stock.result.reader.folder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static com.stock.result.config.ReaderConstant.FOLDER_NAME;

@Service
@Slf4j
public class FolderReaderService {

    public List<Path> readStocksInfo() {
        List<Path> pathList = null;
        try (Stream<Path> paths = Files.walk(Paths.get(FOLDER_NAME))) {
            pathList = paths.filter(Files::isRegularFile).toList();
        } catch (IOException exp) {
            log.error("Exception in reading the folder {}", FOLDER_NAME, exp);
        }
        return pathList;
    }

    public void folderInfo(List<Path> files) {
        if(files == null){
            log.info("No Stock statement to use");
        }
        files.forEach(f -> { log.info(f.toString()); });

    }


}
