package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.model.MailInfo;

@Service
public class MailService {

	@Autowired
	private JavaMailSender sender;

	public String sendMail(MailInfo info) {

		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom(info.getFrom());
		smm.setTo(info.getTo());
		smm.setSubject(info.getSub());
		smm.setText(info.getTxt());
		smm.setCc(info.getCc());
		
		sender.send(smm);
		return "********* Mail Send Successs !! *******";
	}
}
