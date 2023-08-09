package dev.suyash.Movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // Creates method to find my imdb id
    Optional<Movie> findMovieByImdbId(String imdbId);
}
