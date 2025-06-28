package com.database.tester;

// Import necessary Spring Boot classes
import com.database.dao.InstrumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Main application class marked with @SpringBootApplication annotation
@SpringBootApplication( scanBasePackages = { "com.database.*" })
@EnableAutoConfiguration()
@Slf4j
public class DatabaseRunner implements CommandLineRunner {

    @Autowired
    InstrumentRepository instrumentRepository;

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        // Run the application
        log.info("Staring DatabaseRunner");
        SpringApplication.run(DatabaseRunner.class, args);
        log.info("Ending DatabaseRunner");
    }

    @Override
    public void run(String... args) {
        log.info("EXECUTING : command line runner");
        log.info("Count {}  ", instrumentRepository.count());
    }
}