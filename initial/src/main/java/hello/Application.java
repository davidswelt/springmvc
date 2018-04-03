package hello;

import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(GTRepository repository) {
        return (args) -> {
            repository.save(new GreetThing("Reitter","David"));
            repository.save(new GreetThing("Cole","Jeremy"));
            repository.save(new GreetThing("Bowie","David"));

            log.info("GT found with findOne(1L):");
            GreetThing gtx = repository.findOne(1L);
            log.info(gtx.toString());
            
            log.info("GT found with findAll():");
            for (GreetThing gt : repository.findAll())
            {
                log.info(gt.toString());
            }
            
            log.info("GT found with findByFirstName():");
            for (GreetThing gt : repository.findByFirstName("David"))
            {
                log.info(gt.toString());
            }
            
        };
    }

}
