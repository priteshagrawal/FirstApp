package com.stock.result;

// Import necessary Spring Boot classes
import com.stock.result.service.StockScreenerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Main application class marked with @SpringBootApplication annotation
@SpringBootApplication( scanBasePackages = { "com.stock.*" })
@Slf4j
public class StockFileReaderStarter implements CommandLineRunner {

    @Autowired
    StockScreenerService stockScreenerService;

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        // Run the application
        log.info("Staring StockFileReaderStarter");
        SpringApplication.run(StockFileReaderStarter.class, args);
        log.info("Ending StockFileReaderStarter");
    }

    @Override
    public void run(String... args) {
        log.info("EXECUTING : command line runner");
      //  stockScreenerService.screen();
    }
}