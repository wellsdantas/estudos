package com.itau.openbanking.clientinformation.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.itau.openbanking.clientinformation.model.ClientInformation;

@Component
public class ClientInformationService {

	private final String INFO_PATH = "/open-banking/client";

	private RestTemplate restTemplate;
	public void infoClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public ClientInformation getClientInformationByCPF(String cpf) {
		return null;
				//restTemplate.getForObject(INFO_PATH + cpf.toString(), ClientInformation.class);
	}

	public ClientInformation getClientInformationByCNPJ(String cnpj) {
		return null;
				//restTemplate.getForObject(INFO_PATH + cnpj.toString(), ClientInformation.class);
	}
}
