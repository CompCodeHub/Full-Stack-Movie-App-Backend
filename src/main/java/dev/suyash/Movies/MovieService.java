package dev.suyash.Movies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> allMovies(){
        return repository.findAll();
    }

    public Movie singleMovie(String imdbId){
        return repository.findMovieByImdbId(imdbId).get();
    }
}
