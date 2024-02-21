package com.notification;

import java.util.ArrayList;

public class Observable {

    java.util.List<Observer> observers = new ArrayList<>();

    public void notifySubs() {
        for(Observer observer: observers) {observer.listen("Notified");
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
}
