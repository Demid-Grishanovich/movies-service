package om.ticketbooking.movies_service.controller;

import om.ticketbooking.movies_service.model.Movie;
import om.ticketbooking.movies_service.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieRepository repository;

    public MovieController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @Cacheable("movies")
    public List<Movie> getAllMovies() {
        System.out.println("Fetching movies from DB..."); // для проверки
        return repository.findAll();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/metrics")
    public String metrics() {
        return "Movies count: " + repository.count();
    }
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return repository.save(movie);
    }

}
