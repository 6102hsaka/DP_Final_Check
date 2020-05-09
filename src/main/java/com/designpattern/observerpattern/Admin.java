package com.designpattern.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Admin extends INotificationObserver {

	static final Logger LOGGER = LoggerFactory.getLogger(Admin.class);

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		LOGGER.info("Start Admin Notification");
		LOGGER.debug("Hello " + name + " .");
		LOGGER.debug("Your Event will start soon...");
		LOGGER.info("End Admin Notification");
	}

}
