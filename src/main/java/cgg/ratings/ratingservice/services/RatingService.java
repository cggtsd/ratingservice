package cgg.ratings.ratingservice.services;

import java.util.List;

import cgg.ratings.ratingservice.entities.Rating;

public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getRatings();

    // get all by userId
    List<Rating> getRatingsByUserId(String userId);

    // get all by hotel
    List<Rating> getRatingsByHotelId(String hotelId);

}
