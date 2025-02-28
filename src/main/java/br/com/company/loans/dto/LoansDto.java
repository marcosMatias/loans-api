package br.com.company.loans.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoansDto {
	
	private String type;
	@JsonProperty("interest_rate")
	private int interestRate;
}
