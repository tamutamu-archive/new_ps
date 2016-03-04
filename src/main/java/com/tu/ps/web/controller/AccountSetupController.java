package com.mf.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mf.web.dao.DataCache;
import com.mf.web.domain.AccountExecutive;
import com.mf.web.domain.UserAccount;
import com.mf.web.domain.SearchingCriteria;

@Controller
//@RequestMapping(value = "/accountsetup")
public class AccountSetupController {

	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String viewUserList(Model model) {
		SearchingCriteria searchingCriteria = new SearchingCriteria();
		model.addAttribute("searchingCriteria", searchingCriteria);
		return "userlist";
	}

	@RequestMapping(value = "userlist", method = RequestMethod.POST)
	public String viewUserList(SearchingCriteria searchingCriteria, Model model) {
		List<AccountExecutive> userlistResult = new ArrayList<AccountExecutive>();
		AccountExecutive user = new AccountExecutive();
		user.setName("111");
		user.setManager("PRODUCTION");
		user.setAe("2222");
		user.setHkid("12345678");
		user.setSalesCode("sasasaaws");
		userlistResult.add(user);
		user.setName(new String("222"));
		userlistResult.add(user);
		user.setName(new String("333"));
		userlistResult.add(user);
		user.setName(new String("444"));
		userlistResult.add(user);
		user.setName(new String("5555"));
		userlistResult.add(user);
		model.addAttribute("result",userlistResult);
		return "userlist";
	}

	@RequestMapping(value = "/usersetup", method = RequestMethod.GET)
	public String viewUserSetup(Model model) {
		UserAccount userAccount = new UserAccount();
		model.addAttribute("userAccount", userAccount);
		return "usersetup";
	}

	@RequestMapping(value = "/getAccExecList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<String> getAccExecList(@RequestParam("term") String name) {
		ArrayList<String> matchName = (ArrayList<String>) DataCache.getName(name);
		return matchName;
	}

	@RequestMapping(value = "/acchrcMain", method = RequestMethod.GET)
	public String viewAccountHierarchyMaintenacne(Model model) {
		SearchingCriteria searchingCriteria = new SearchingCriteria();
		model.addAttribute("searchingCriteria", searchingCriteria);
		return "userlist";
	}
}
