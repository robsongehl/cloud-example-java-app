package cloud.example.java.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cloud.example.java.app")
public class CloudExampleJavaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudExampleJavaAppApplication.class, args);
    }

}
