package uk.co.render.ztrade.contribution;

import uk.co.render.ztrade.domain.ContributionStatus;

public interface Contributor {

	ContributionStatus contribute(final int securityId);
}
