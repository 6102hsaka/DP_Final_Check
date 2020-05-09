package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	List<INotificationObserver> observers = null;

	public NotificationService() {
		super();
		observers = new ArrayList<INotificationObserver>();
	}

	public void addObserver(INotificationObserver observer) {
		LOGGER.info("Start NotificationService addObserver");
		observers.add(observer);
		LOGGER.info("End NotificationService addObserver");
	}

	public void removeObserver(INotificationObserver observer) {
		LOGGER.info("Start NotificationService removeObserver");
		observers.remove(observer);
		LOGGER.info("End NotificationService removeObserver");
	}

	public void notifyObserver() {
		LOGGER.info("Start NotificationService notifyObserver");
		for (INotificationObserver observer : observers) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
		LOGGER.info("End NotificationService notifyObserver");
	}
}