package BEHAVIOURALPATTERN.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject{
    private String name;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Connection(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(name, status);
        }
    }
}
