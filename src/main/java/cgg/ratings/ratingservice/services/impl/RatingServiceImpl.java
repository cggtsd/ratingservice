package cgg.ratings.ratingservice.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cgg.ratings.ratingservice.entities.Rating;
import cgg.ratings.ratingservice.repositories.RatingRepository;
import cgg.ratings.ratingservice.services.RatingService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RatingServiceImpl implements RatingService {

    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

}
