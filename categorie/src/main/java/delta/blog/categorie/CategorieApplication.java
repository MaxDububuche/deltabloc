package delta.blog.categorie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CategorieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategorieApplication.class, args);
	}

}
