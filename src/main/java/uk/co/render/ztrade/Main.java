package uk.co.render.ztrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import uk.co.render.ztrade.contribution.Contributor;
import uk.co.render.ztrade.domain.ContributionStatus;
import uk.co.render.ztrade.market.bloomzerg.BloomzergMarketConnector;

public class Main {

	private static final Logger log = LoggerFactory.getLogger(BloomzergMarketConnector.class);

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class.getPackage().getName());
		final Contributor contributor = context.getBean(Contributor.class);
		final ContributionStatus status = contributor.contribute(123456);
		log.info("Status: {}", status);
	}
}
