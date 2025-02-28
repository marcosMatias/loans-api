package br.com.company.loans.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.company.loans.dto.LoansDto;
import br.com.company.loans.dto.LoansResponseDto;
import br.com.company.loans.dto.RegistrationDto;
import br.com.company.loans.enums.IcomeParameter;
import br.com.company.loans.enums.LoanParameter;

@Service
public class LoansService {

	
	
	private List<LoansDto> loans;

	
	public LoansResponseDto calculateLoan(RegistrationDto form) {
		
		verifyLoans(form);
		
		
		return null;
	}

	
	
	
	/*  
	 Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
	 Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
     Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
     Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
     Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
	 */
	
	
	
	
	private List<LoansDto> verifyLoans(RegistrationDto form) {

		loans = new ArrayList<>();
		if (form.income() <= IcomeParameter.LOW.getSalary()) {

			 addElments(setLoans(LoanParameter.PERSONAL.name(), LoanParameter.PERSONAL.getInterestRate()));
		}
		
		if ((form.income() > IcomeParameter.LOW.getSalary() && form.income() < IcomeParameter.HIGH.getSalary())) {

			 addElments(setLoans(LoanParameter.PERSONAL.name(), LoanParameter.PERSONAL.getInterestRate()));
		}
		
		return loans;
	}
	
	private LoansDto setLoans(String type, int rate) {
		
		return LoansDto.builder()
				       .type(type)
				       .interestRate(rate)
				       .build();
	}
	
	
	private List<LoansDto> addElments(LoansDto loansDto) {

		loans.add(loansDto);

		return loans;

	}

}
