package uk.co.render.ztrade.market;

import uk.co.render.ztrade.domain.Contribution;
import uk.co.render.ztrade.domain.ContributionStatus;

public interface MarketConnector {
	
	ContributionStatus publish(Contribution contribution);

}
