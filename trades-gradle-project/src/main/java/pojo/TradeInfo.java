package pojo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;


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
	private Date tradeDate;
	private double amount1;
	private double amount2;
	private String rate;
	private Date deliveryDate;
	private Date expiryDate;
	private Date excerciseStartDate;
	private String payCcy;
	private float premium;
	private String premiumCcy;
	private String premiumType;
	private Date premiumDate;
	private String valueDate;
	
	@Value("CS Zurich")
	private String legalEntity;
	private String trader;
	private ErrorDto errorObj;
	
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
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
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
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getExcerciseStartDate() {
		return excerciseStartDate;
	}
	public void setExcerciseStartDate(Date excerciseStartDate) {
		this.excerciseStartDate = excerciseStartDate;
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
	public Date getPremiumDate() {
		return premiumDate;
	}
	public void setPremiumDate(Date premiumDate) {
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
	public ErrorDto getErrorObj() {
		return errorObj;
	}
	public void setErrorObj(ErrorDto errorObj) {
		this.errorObj = errorObj;
	}
	
	
	
	

}
