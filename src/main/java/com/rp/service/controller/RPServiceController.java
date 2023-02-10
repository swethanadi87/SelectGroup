/**
 * 
 */
package com.rp.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rp.service.model.RPServiceResponse;
import com.rp.service.service.RPServiceService;

/**
 * 
 * This class will work as controller and will used to match end points
 */
@RestController
@CrossOrigin
@RequestMapping("/v1")
public class RPServiceController {

	@Autowired
	private RPServiceService rPServiceService;

	@RequestMapping(value = "/rewardpoint", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public RPServiceResponse sortAndConvertString(HttpServletRequest request, HttpServletResponse response) {
			return rPServiceService.calculateRewardPoints();
	}

}
