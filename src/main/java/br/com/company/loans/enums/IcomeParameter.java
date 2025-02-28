package br.com.company.loans.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IcomeParameter {
	LOW(3000), 
	HIGH(5000);

	private final double salary;

	

}
