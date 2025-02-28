package br.com.company.loans.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoanParameter {
	PERSONAL(4), 
	GUARANTEED(3),
    CONSIGNMENT(2);

	private final int interestRate;
}
