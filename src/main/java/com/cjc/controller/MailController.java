package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.MailInfo;
import com.cjc.service.MailService;

@RestController
public class MailController {

	  @Autowired
	  private MailService service;
	  
	  
	 @RequestMapping("/sendMail")
	public String sendMail(@RequestBody MailInfo mailInfo) {
         System.out.println(mailInfo);
		 return service.sendMail(mailInfo);
	}
}
