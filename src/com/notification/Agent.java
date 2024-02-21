package com.notification;
import java.util.List;

public class Agent {
    public static void main(String[] args) {
        Observer observer = new Observer();
        Observable notifier = new Observable();
        notifier.subscribe(observer);
        notifier.notifySubs();
    }
}
