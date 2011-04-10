package uk.co.render.ztrade;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.render.ztrade.contribution.Contributor;
import uk.co.render.ztrade.domain.ContributionStatus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext-test.xml"})
public class FullIntegrationTest {

	@Inject private Contributor contributor;
	
	@Test
	public void contributeToMarket()  {
		assertThat(contributor.contribute(123456), is(equalTo(ContributionStatus.SUCCESS)));
	}
	
	@Test
	public void failsToContribute()  {
		assertThat(contributor.contribute(654321), is(equalTo(ContributionStatus.FAILURE)));
	}
}
