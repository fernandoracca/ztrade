package uk.co.render.ztrade.market.bloomzerg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.render.ztrade.domain.Contribution;
import uk.co.render.ztrade.domain.ContributionStatus;
import uk.co.render.ztrade.market.MarketConnector;
import uk.co.render.ztrade.util.Zervice;

@Zervice("bloomzergMarketConnector")
public class BloomzergMarketConnector implements MarketConnector {

	private static final Logger log = LoggerFactory.getLogger(BloomzergMarketConnector.class);
	
	@Override
	public ContributionStatus publish(final Contribution contribution) {
		log.debug("Sending {}", contribution);
		return ContributionStatus.SUCCESS;
	}


}
