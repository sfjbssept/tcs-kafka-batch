package com.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billing.entity.Invoice;

@RestController
public class BillingController {
	
	
	@Autowired
	private KafkaTemplate<String, Object> template;
	
	
	private String topic = "myTopic";
	
	@GetMapping("/publishInvoice")
	public String publishInvoice( @RequestBody Invoice invoice) {
		template.send(topic, invoice);
		return "Invoice has been published";
	}
	

	
}
