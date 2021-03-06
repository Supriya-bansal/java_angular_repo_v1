package com.finance.model;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Supriya
 *
 */
public class TradeInfo {
	
	private String customer;
	private String ccyPair;
	
	private String type;
	private String style;
	private String direction;
	private String strategy;
	private String tradeDate;
	private double amount1;
	private double amount2;
	private String rate;
	private String deliveryDate;
	private String expiryDate;
	private String excerciseStartDate;
	private String payCcy;
	private float premium;
	private String premiumCcy;
	private String premiumType;
	private String premiumDate;
	private String valueDate;
	private String legalEntity;
	private String trader;
	private List<ErrorDto> listOfErrors = new ArrayList<>();
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCcyPair() {
		return ccyPair;
	}
	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}
	public double getAmount2() {
		return amount2;
	}
	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	public String getPayCcy() {
		return payCcy;
	}
	public void setPayCcy(String payCcy) {
		this.payCcy = payCcy;
	}
	public float getPremium() {
		return premium;
	}
	public void setPremium(float premium) {
		this.premium = premium;
	}
	public String getPremiumCcy() {
		return premiumCcy;
	}
	public void setPremiumCcy(String premiumCcy) {
		this.premiumCcy = premiumCcy;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	
	public String getPremiumDate() {
		return premiumDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getExcerciseStartDate() {
		return excerciseStartDate;
	}
	public void setExcerciseStartDate(String excerciseStartDate) {
		this.excerciseStartDate = excerciseStartDate;
	}
	public void setPremiumDate(String premiumDate) {
		this.premiumDate = premiumDate;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getLegalEntity() {
		return legalEntity;
	}
	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	public List<ErrorDto> getListOfErrors() {
		return listOfErrors;
	}
	public void setListOfErrors(List<ErrorDto> listOfErrors) {
		this.listOfErrors = listOfErrors;
	}
	
	
	
	
	
	

}
