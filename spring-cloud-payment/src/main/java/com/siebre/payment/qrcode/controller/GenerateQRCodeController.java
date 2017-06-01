package com.siebre.payment.qrcode.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siebre.payment.qrcode.service.QrCodeService;

@Controller
public class GenerateQRCodeController {
	
	@Autowired
	private QrCodeService qrCodeService;
	
	@RequestMapping(value = "/qrcode/generateQrCode")
	public void process(@RequestParam("text")String text, HttpServletResponse response) {
		response.setContentType("image/png");
		
		try {
			this.qrCodeService.generateQrCode(text, response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}