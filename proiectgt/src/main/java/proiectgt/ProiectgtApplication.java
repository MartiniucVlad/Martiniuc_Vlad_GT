package proiectgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class ProiectgtApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
        SpringApplication.run(ProiectgtApplication.class, args);


    ComputerPartsController controller = context.getBean(ComputerPartsController.class);

    // controller.initialize();
  }
}
