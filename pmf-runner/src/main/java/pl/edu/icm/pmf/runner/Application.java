package pl.edu.icm.pmf.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private final SimulationService simulationService;

    @Autowired
    public Application(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @Override
    public void run(String... args) throws Exception {
        simulationService.execute(args);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
