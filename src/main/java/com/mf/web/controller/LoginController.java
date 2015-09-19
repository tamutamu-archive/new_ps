package com.mf.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mf.web.domain.CustomerAccount;
import com.mf.web.domain.MenuItem;
import com.mf.web.layout.Layout;
import com.mf.web.service.SecurityService;

@Controller
public class LoginController {

	@Autowired
	private SecurityService securityService;

	@Layout(value="blank")
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Map<String, Object> model,HttpServletResponse response) {
		return "forward:/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(Map<String, Object> model, @RequestParam(value = "error", required = false) String error) {
		model.put("customer", new CustomerAccount());
		if (error != null) {
			System.out.println("error:" + error);
		}
		return "login";
	}

	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		//model.addAttribute("user", getPrincipal());
		model.put("customer", new CustomerAccount());
		return "login";
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		System.out.println("sfasf");
		return "redirect:/login?logout";
	}

	@RequestMapping(value = "/loginsuccess", method = RequestMethod.GET)
	public String loginSuccess(Model model, HttpSession session) {
		List<MenuItem> menu = new ArrayList<MenuItem>();

		menu.add(new MenuItem("System Setup", "0", null, "#"));
		menu.add(new MenuItem("Currency", "1", null, "currency"));
		menu.add(new MenuItem("Contract", "1", null, "contract"));
		menu.add(new MenuItem("Currency Margin", "1", null, "currency_margin"));
		menu.add(new MenuItem("Global Contract Setting", "1", null, "global_contract_setting"));
		menu.add(new MenuItem("Normal Trading Hour", "1", null, "normal_trading_hour"));
		menu.add(new MenuItem("Other Information", "1", null, "other_information"));
		menu.add(new MenuItem("Account Setup", "0", null, "#"));
		menu.add(new MenuItem("User List", "1", null, "userlist"));

		session.setAttribute("menu", menu);
		return "main";
	}

	@RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
	public void forgotPassword(CustomerAccount customerAccount) {

	}

	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	/*@RequestMapping("/login2")
	public String testCaptcha(@RequestParam(value = "error", required = false) Integer errorCode, Model model, HttpServletRequest servletRequest)
	{
	    if (errorCode != null)
	    {
	        if (errorCode.equals(1))
	        {
	            model.addAttribute("authenticationError", true);
	        }
	        else if (errorCode.equals(2))
	        {
	            String login = servletRequest.getParameter("j_username");
	            model.addAttribute("reCaptchaError", true);
	            model.addAttribute("login", login);
	        }
	    }

	    return "login2";
	}*/

}
