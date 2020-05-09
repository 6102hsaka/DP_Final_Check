package com.designpattern.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}

	static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Start main");

		// Instantiating Notification Service
		INotificationService service = new NotificationService();

		// Instantiating Admins
		INotificationObserver admin1 = new Admin(service, "Akash", 102);
		INotificationObserver admin2 = new Admin(service, "Samir", 110);
		INotificationObserver admin3 = new Admin(service, "Aadityash", 98);

		// Admin Subscribing Service
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);

		// Sending Notification to Admin of Events with more than 100 Sold Ticket
		service.notifyObserver();
		LOGGER.info("End main");
	}
}