package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderFactory {

	static final Logger LOGGER = LoggerFactory.getLogger(OrderFactory.class);

	public static Order getOrder(ChannelType channel, ProductType productType) {
		LOGGER.info("Start OrderFactory getOrder");
		if (channel == ChannelType.ECOMMERCE) {
			return new ECommerceChannel().getOrder(productType);
		}
		return new TeleCommunicationChannel().getOrder(productType);
	}
}
