package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.PlaneModel;
import com.cognizant.service.AddPlaneImplService;
import com.cognizant.service.AddPlaneService;


@Controller
public class AirportController {

	@Autowired
	AddPlaneService addPlane;
	
	@RequestMapping(value="AddPlaneinfo.htm")
	public String viewHello(){
		return "AddPlane";
	}
	
	@RequestMapping(value="planeViewinfo.htm")
	public String viewPlaneInfo(){
		return "PlaneView";
	}
	
	@RequestMapping(value="index.htm", method=RequestMethod.GET)
	public String viewAddPlane(){
		
		return "Hello";
	}
	
	@RequestMapping(value="AddPlaneInfo.htm",method = RequestMethod.POST)
	public ModelAndView addPlane(@ModelAttribute("plane")PlaneModel plane){
		
		addPlane.addPlaneDetails(plane);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddPlane");
		return mv;
	}
	
	@ModelAttribute("planemodel")
	public PlaneModel addPlaneObject(){
		PlaneModel plane = new PlaneModel();
		return plane;
	}
	
}
