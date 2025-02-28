package br.com.company.loans.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegistrationDto(
		@NotBlank(message="Age cannot be null")
		Integer age, 
		
		@NotBlank(message="CPF ir required")
		@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "Invalid CPF format")
		String cpf,
		
		@NotBlank(message = "Name is required")
		@Size(min = 3, max = 100, message = "The name must be between 3 and 100 characters")
		String name,
		
		@NotNull(message = "Income cannot be null")
		@DecimalMin(value = "1000.00", message = "The minimum allowed income is 1000.00")
		Double income,
		
		@NotBlank(message = "Location is required")
		String location) {

}
