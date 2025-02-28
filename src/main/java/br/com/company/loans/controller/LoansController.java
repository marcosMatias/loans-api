package br.com.company.loans.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.company.loans.dto.LoansResponseDto;
import br.com.company.loans.dto.RegistrationDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/challeng")
public class LoansController {
	
	
	@PostMapping("/customer-loans")
	public LoansResponseDto calculateLoan(@RequestBody @Valid RegistrationDto form) {
		
		
		return null;
	}

}
