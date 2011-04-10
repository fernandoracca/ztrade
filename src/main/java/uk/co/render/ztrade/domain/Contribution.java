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
	
}
