package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.HangerStatusModel;
import com.cognizant.service.HangerAllocationStatusImpl;
import com.cognizant.service.PlaneDetailsImpl;

@Controller
@SessionAttributes({"hangarId","managerId"})
public class HangerStatusAllocationControler {
	
	@Autowired
	HangerAllocationStatusImpl hangerallocationstatusimpl;

	@Autowired
	PlaneDetailsImpl planedetailsimpl;
	
	@RequestMapping(value="allocation.htm",method=RequestMethod.GET)
	public String setAllocationView()
	{
		return "hangerAllocationView";
	}
	
	@RequestMapping(value="allocateplaneviewform.htm",method=RequestMethod.GET)
	public ModelAndView viewAllocationForm(ModelMap map,@RequestParam("hangarId")int hangar_id,@RequestParam("managerId")int manager_id){
		
		ModelAndView mv = new ModelAndView();
		
		System.out.println(hangar_id);
		System.out.println(manager_id);
		List<Number> planeId =planedetailsimpl.getPlaneId();
		
		for(Number i:planeId){
			
			System.out.println(i);
		}
		
		mv.addObject("planeId",planeId);
	    map.addAttribute("hangarId",hangar_id);
		map.addAttribute("managerId",manager_id);
		mv.setViewName("HangarAllocationForm");
		
		
		return mv;
	}
	
	@RequestMapping(value="AddPlaneIntoHanger.htm",method=RequestMethod.POST)
	public ModelAndView allocatePlaneMethod(@ModelAttribute("allocatemodel")HangerStatusModel hangerStatusmodel){
		ModelAndView mv = new ModelAndView();
	String status="allocated successfully";
		System.out.println("********in allocatePlaneMethod****"+hangerStatusmodel);
		hangerallocationstatusimpl.allocatePlane(hangerStatusmodel);
		List<Number> planeId =planedetailsimpl.getPlaneId();
		mv.setViewName("HangarAllocationForm");
		mv.addObject("planeId",planeId);
	mv.addObject("status",status);
		return mv;
	}
	
	@ModelAttribute("allocatemodel")
	public HangerStatusModel createObject()
	{
		HangerStatusModel obj = new HangerStatusModel();
		return obj;
	}
	
}
