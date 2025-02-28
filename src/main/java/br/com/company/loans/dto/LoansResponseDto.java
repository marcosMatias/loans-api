package br.com.company.loans.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoansResponseDto {

	private String customer;
	private List<LoansDto> loans;
}
