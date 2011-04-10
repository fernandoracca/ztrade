package uk.co.render.ztrade.contribution;

import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import uk.co.render.ztrade.domain.Contribution;
import uk.co.render.ztrade.domain.ContributionStatus;
import uk.co.render.ztrade.market.MarketConnector;

@RunWith(MockitoJUnitRunner.class)
public class InMemoryCacheContributionTest {

	@Mock private MarketConnector marketConnector;
	private InMemoryCacheContributor testObject;

	@Before
	public void setup(){
		testObject = new InMemoryCacheContributor(marketConnector);
	}

	@Test
	public void publish() {
		final Contribution contribution = testObject.buildContribution(123456);
		when(marketConnector.publish(contribution)).thenReturn(ContributionStatus.SUCCESS);

		final ContributionStatus status = testObject.contribute(123456);

		verify(marketConnector).publish(contribution);
		assertThat(status, is(equalTo(ContributionStatus.SUCCESS)));
	}

	@Test
	public void dontPublish() {
		final ContributionStatus status = testObject.contribute(654321);

		verify(marketConnector, never()).publish(any(Contribution.class));
		assertThat(status, is(equalTo(ContributionStatus.FAILURE)));
	}
}
