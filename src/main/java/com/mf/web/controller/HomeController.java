package com.mf.web.controller;

import java.security.Principal;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mf.web.layout.Layout;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends AbstractController{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String index(Principal principal) {
	  return principal != null ? "homeSignedIn" : "hello";
	 }
}

