package om.ticketbooking.movies_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class MoviesServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviesServiceApplication.class, args);
	}
}
