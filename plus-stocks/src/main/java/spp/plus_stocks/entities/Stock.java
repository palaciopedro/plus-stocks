package spp.plus_stocks.entities;

import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ticket;
	private Double price;
	private Double pl;
	private Double lpa;
	private Double vpa;
	private Double roe;
	private Double payout;
	
	public Stock() {
	}

	public Stock(Long id, String ticket, Double price, Double pl, Double lpa, Double vpa, Double roe, Double payout) {
		this.id = id;
		this.ticket = ticket;
		this.price = price;
		this.pl = pl;
		this.lpa = lpa;
		this.vpa = vpa;
		this.roe = roe;
		this.payout = payout;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPl() {
		return pl;
	}

	public void setPl(Double pl) {
		this.pl = pl;
	}

	public Double getLpa() {
		return lpa;
	}

	public void setLpa(Double lpa) {
		this.lpa = lpa;
	}

	public Double getVpa() {
		return vpa;
	}

	public void setVpa(Double vpa) {
		this.vpa = vpa;
	}

	public Double getRoe() {
		return roe;
	}

	public void setRoe(Double roe) {
		this.roe = roe;
	}

	public Double getPayout() {
		return payout;
	}

	public void setPayout(Double payout) {
		this.payout = payout;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
