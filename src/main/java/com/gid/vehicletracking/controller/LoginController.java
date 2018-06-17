package com.gid.vehicletracking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		return "adminHome";

	}
	@RequestMapping(value = "/viewuser", method = RequestMethod.GET)
	public String viewUser(ModelMap model) {

		return "viewUser";

	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutUser(ModelMap model,HttpServletRequest request) {

		request.getSession().invalidate();
		return "login";

	}
	@RequestMapping(value = "/userhome", method = RequestMethod.GET)
	public String userHomePage(ModelMap model) {

		return "userhome";

	}
	@RequestMapping(value = "/vehicleinformation", method = RequestMethod.GET)
	public String vehicleInformation(ModelMap model,HttpServletRequest request) {

		request.getSession().invalidate();
		return "vehicleinformation";

	}
	@RequestMapping(value = "/editvehicle", method = RequestMethod.GET)
	public String editVehicleInformation(ModelMap model,HttpServletRequest request) {

		request.getSession().invalidate();
		return "editvehicle";

	}
}
