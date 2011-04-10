package uk.co.render.ztrade.contribution;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.inject.Inject;
import javax.inject.Named;

import uk.co.render.ztrade.domain.Contribution;
import uk.co.render.ztrade.domain.ContributionStatus;
import uk.co.render.ztrade.domain.QuoteType;
import uk.co.render.ztrade.market.MarketConnector;
import uk.co.render.ztrade.util.Zervice;

@Zervice
public class InMemoryCacheContributor implements Contributor {

	private final MarketConnector marketConnector;
	
	@Inject
	public InMemoryCacheContributor(@Named("bloomzergMarketConnector") final MarketConnector marketConnector){
		this.marketConnector = marketConnector;
	}
	
	@Override
	public ContributionStatus contribute(int securityId) {
		if ( 123456 == securityId) {
			return marketConnector.publish(buildContribution(securityId));
		} else { 
			return ContributionStatus.FAILURE;
		}
	}
	
	protected Contribution buildContribution(final int securityId) {
		final double askSize = 10000;
		final double bidSize = 8000;
		final double askPrice = 100;
		final double bidPrice = 99;
		final QuoteType quoteType = QuoteType.PRICE;
		final String ticker = "JPM 3 1/2 12-18";
		final Date maturity = getTime(2018,12,1);
		return new Contribution(securityId, askSize, bidSize, askPrice, bidPrice, quoteType, ticker, maturity);
	}
	
	protected Date getTime(int year, int month, int day){
		return new GregorianCalendar(year, month, day).getTime();
	}
}
