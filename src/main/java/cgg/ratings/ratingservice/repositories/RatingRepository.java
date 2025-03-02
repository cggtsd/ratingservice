package cgg.ratings.ratingservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import cgg.ratings.ratingservice.entities.Rating;
import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    // custom finder methods
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);

}
