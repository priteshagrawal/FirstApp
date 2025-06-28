package com.strategy.resultbased;

// Import necessary Spring Boot classes
import com.stock.result.StockFileReaderStarter;
import com.stock.result.service.StockScreenerService;
import com.strategy.resultbased.service.RecommendationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Main application class marked with @SpringBootApplication annotation
@SpringBootApplication( scanBasePackages = { "com.stock.*" , "com.strategy.*"})
//@EnableAutoConfiguration(exclude = {StockFileReaderStarter.class})
@Slf4j
public class StrategyRunner implements CommandLineRunner {

    @Autowired
    RecommendationService recommendationService;

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        // Run the application
        log.info("Staring StrategyRunner");
        SpringApplication.run(StrategyRunner.class, args);
        log.info("Ending StrategyRunner");
    }

    @Override
    public void run(String... args) {
        log.info("EXECUTING : command line runner");
        recommendationService.performMagic();
    }
}