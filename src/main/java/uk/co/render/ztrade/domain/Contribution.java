package uk.co.render.ztrade.domain;

import java.util.Date;

public class Contribution {

	private final int securityId;
	private final double askSize;
	private final double bidSize;
	private final double askPrice;
	private final double bidPrice;
	private final QuoteType quoteType;
	private final String ticker;
	private final Date maturity;

	public Contribution(int securityId, double askSize, double bidSize,
			double askPrice, double bidPrice, QuoteType quoteType,
			String ticker, Date maturity) {
		this.securityId = securityId;
		this.askSize = askSize;
		this.bidSize = bidSize;
		this.askPrice = askPrice;
		this.bidPrice = bidPrice;
		this.quoteType = quoteType;
		this.ticker = ticker;
		this.maturity = maturity;
	}
	
	
	public int getSecurityId() {
		return securityId;
	}

	public double getAskSize() {
		return askSize;
	}

	public double getBidSize() {
		return bidSize;
	}

	public double getAskPrice() {
		return askPrice;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public QuoteType getQuoteType() {
		return quoteType;
	}

	public String getTicker() {
		return ticker;
	}

	public Date getMaturity() {
		return maturity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contribution [securityId=").append(securityId)
				.append(", askSize=").append(askSize).append(", bidSize=")
				.append(bidSize).append(", askPrice=").append(askPrice)
				.append(", bidPrice=").append(bidPrice).append(", quoteType=")
				.append(quoteType).append(", ticker=").append(ticker)
				.append(", maturity=").append(maturity).append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Contribution that = (Contribution) o;

		if (Double.compare(that.askPrice, askPrice) != 0) return false;
		if (Double.compare(that.askSize, askSize) != 0) return false;
		if (Double.compare(that.bidPrice, bidPrice) != 0) return false;
		if (Double.compare(that.bidSize, bidSize) != 0) return false;
		if (securityId != that.securityId) return false;
		if (maturity != null ? !maturity.equals(that.maturity) : that.maturity != null) return false;
		if (quoteType != that.quoteType) return false;
		if (ticker != null ? !ticker.equals(that.ticker) : that.ticker != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = securityId;
		temp = askSize != +0.0d ? Double.doubleToLongBits(askSize) : 0L;
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = bidSize != +0.0d ? Double.doubleToLongBits(bidSize) : 0L;
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = askPrice != +0.0d ? Double.doubleToLongBits(askPrice) : 0L;
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = bidPrice != +0.0d ? Double.doubleToLongBits(bidPrice) : 0L;
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (quoteType != null ? quoteType.hashCode() : 0);
		result = 31 * result + (ticker != null ? ticker.hashCode() : 0);
		result = 31 * result + (maturity != null ? maturity.hashCode() : 0);
		return result;
	}
}
