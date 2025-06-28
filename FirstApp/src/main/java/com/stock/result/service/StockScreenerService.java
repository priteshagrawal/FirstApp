package com.stock.result.service;

import com.stock.result.input.StockResult;
import com.stock.result.reader.folder.FolderReaderService;
import com.stock.result.reader.worksheet.StockResultWorkbookReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class StockScreenerService {

    @Autowired
    FolderReaderService folderReaderService;

    @Autowired
    StockResultWorkbookReaderService stockResultWorkbookReaderService;

    public Collection<StockResult> screen()
    {
        List<Path> pathList = folderReaderService.readStocksInfo();
        folderReaderService.folderInfo(pathList);
        if(pathList == null){
            return Collections.EMPTY_LIST;
        }
        pathList.forEach(p ->
                {
                    stockResultWorkbookReaderService.readStockResult(p);}
        );
        Collection<StockResult> stockResultList = pathList.stream().map(p -> stockResultWorkbookReaderService.readStockResult(p)).toList();
        return stockResultList;
    }

}
