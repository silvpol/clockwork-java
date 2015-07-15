package com.clockworksms.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Balance_Resp")
public class BalanceResponse extends XmlResponse {


	@XmlElement(name = "AccountType", required = true)
	protected String accountType;
	@XmlElement(name = "Balance", required = true)
	protected Float balance;
	@XmlElement(name = "Currency", required = true)
	protected BalanceResponse.Currency currency;

	/**
	 * Gets the value of the accountType property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets the value of the accountType property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link String }
	 */
	public void setAccountType(String value) {
		this.accountType = value;
	}

	/**
	 * Gets the value of the balance property.
	 *
	 * @return possible object is
	 * {@link Float }
	 */
	public Float getBalance() {
		return balance;
	}

	/**
	 * Sets the value of the balance property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link Float }
	 */
	public void setBalance(Float value) {
		this.balance = value;
	}

	/**
	 * Gets the value of the currency property.
	 *
	 * @return possible object is
	 * {@link BalanceResponse.Currency }
	 */
	public BalanceResponse.Currency getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 *
	 * @param value
	 * 		allowed object is
	 * 		{@link BalanceResponse.Currency }
	 */
	public void setCurrency(BalanceResponse.Currency value) {
		this.currency = value;
	}


	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"code", "symbol"
	})
	public static class Currency {

		@XmlElement(name = "Code", required = true)
		protected String code;
		@XmlElement(name = "Symbol", required = true)
		protected String symbol;

		/**
		 * Gets the value of the code property.
		 *
		 * @return possible object is
		 * {@link String }
		 */
		public String getCode() {
			return code;
		}

		/**
		 * Sets the value of the code property.
		 *
		 * @param value
		 * 		allowed object is
		 * 		{@link String }
		 */
		public void setCode(String value) {
			this.code = value;
		}

		/**
		 * Gets the value of the symbol property.
		 *
		 * @return possible object is
		 * {@link String }
		 */
		public String getSymbol() {
			return symbol;
		}

		/**
		 * Sets the value of the symbol property.
		 *
		 * @param value
		 * 		allowed object is
		 * 		{@link String }
		 */
		public void setSymbol(String value) {
			this.symbol = value;
		}
	}

	public String getCurrencySymbol() {
		return currency.getSymbol();
	}

	public String getCurrencyCode() {
		return currency.getCode();
	}
}