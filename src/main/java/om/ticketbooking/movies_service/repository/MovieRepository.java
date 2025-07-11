package om.ticketbooking.movies_service.repository;

import om.ticketbooking.movies_service.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}