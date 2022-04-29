package int371.project.EventMod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import int371.project.Service.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class EventModApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventModApplication.class, args);
	}
}