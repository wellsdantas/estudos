package com.itau.openbanking.clientinformation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@data
@NoArgsConstructor
@AllArgsConstructor
public class ClientInformation {
	private String fullName;
	private String email;
}
