/**
 * 
 */
package com.rp.service.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.rp.service.model.RPServiceResponse;

/**
 * This class is used to mention all the end points.
 *
 */
@Service
public interface RPServiceService {
	
	/**
	 * This method will return reward point summary for all users
	 * @return Object
	 * @throws ParseException 
	 */
	public RPServiceResponse calculateRewardPoints();

}
