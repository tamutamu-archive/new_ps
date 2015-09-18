package com.mf.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mf.web.domain.CustomerAccount;
import com.mf.web.domain.MenuItem;
import com.mf.web.domain.User;
import com.mf.web.form.LoginForm;
import com.mf.web.service.SecurityService;

@Controller
public class LoginController implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1;
	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(Map<String, Object> model) {
		model.put("customer", new CustomerAccount());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitLogin(@Valid @ModelAttribute("customer") CustomerAccount customerAccount, BindingResult result, Model model, HttpSession session) {
		if (!result.hasErrors()) {
			Collection reusltList = securityService.login(customerAccount);
			model.addAttribute("customer", customerAccount);
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
			/*menu.add("Currency");
			menu.add("Contract");
			menu.add("Currency Margin");
			menu.add("Global Contract Setting");
			menu.add("Normal Trading Hour");
			menu.add("Other Information");
			menu.add("LP Setting");*/
			//request.getSession().setAttribute("menu", menu);
			//model.addO
			session.setAttribute("menu", menu);
			session.setAttribute("testing", "abcde");
			//model.addAttribute("menu", menu);
			return "main";
		} else {
			model.addAttribute("customer", customerAccount);
			return null;
		}
	}

	@RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
	public void forgotPassword(CustomerAccount customerAccount) {

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
