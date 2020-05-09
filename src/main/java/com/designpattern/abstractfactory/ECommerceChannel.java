package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECommerceChannel {

	static final Logger LOGGER = LoggerFactory.getLogger(ECommerceChannel.class);

	public Order getOrder(ProductType productType) {
		LOGGER.info("Start ECommerceChannel getOrder");
		if (productType == ProductType.ELECTRONIC) {
			return new ElectronicOrder(ChannelType.ECOMMERCE, productType);
		} else if (productType == ProductType.FURNITURE) {
			return new FurnitureOrder(ChannelType.ECOMMERCE, productType);
		}
		return new ToysOrder(ChannelType.ECOMMERCE, productType);
	}
}
