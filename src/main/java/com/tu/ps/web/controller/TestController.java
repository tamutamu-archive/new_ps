package com.mf.web.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mf.web.domain.CustomerAccount;
import com.mf.web.service.CustomerAccountService;

/**
 * Handles requests for the application test page.
 */
@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", "12345678" );

		return "home";
	}

	@Autowired
	private CustomerAccountService customerAccountService;

	@ModelAttribute("allCustomer")
	public List<CustomerAccount> populateTypes() {
		// return Arrays.asList(CustomerAccount.ALL);
		List<CustomerAccount> list = new ArrayList<CustomerAccount>();
		CustomerAccount account = new CustomerAccount();
		account.setId("1111");
		account.setName("TomLo");
		list.add(account);

		account = new CustomerAccount();
		account.setId("2222");
		account.setName("aaaaa");
		list.add(account);
		return list;
	}

	@RequestMapping({"/customer" })
	public String showCustomer() {
		System.out.println("22222");
		//seedStarter.setDatePlanted(Calendar.getInstance().getTime());
		//return "classpath:resources/templates/customer";
		return "customer";
	}
}
