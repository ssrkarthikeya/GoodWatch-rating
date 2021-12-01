/**
 * 
 */
package io.icegadda.goodwatchratingsservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.icegadda.goodwatchratingsservice.model.Rating;
import io.icegadda.goodwatchratingsservice.model.UserRating;

/**
 * @author icegadda
 *
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {

		return new UserRating(Arrays.asList(new Rating("1", 4), new Rating("2", 3)));
	}

}
