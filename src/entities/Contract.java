package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double toalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double toalValue) {
		number = number;
		this.date = date;
		this.toalValue = toalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getToalValue() {
		return toalValue;
	}

	public void setToalValue(Double toalValue) {
		this.toalValue = toalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
}
