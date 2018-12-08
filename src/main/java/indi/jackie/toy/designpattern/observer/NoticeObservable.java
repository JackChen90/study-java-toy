package indi.jackie.toy.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable<T> implements IObservable<T> {
    /**
     * 观察者列表
     */
    private List<IObserver<T>> observers =new ArrayList<>();

    @Override
    public void notice(T t) {
        for (IObserver<T> observer : observers) {
            observer.update(t);
        }
    }

    @Override
    public void addObserver(IObserver<T> observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(IObserver<T> observer) {
        observers.remove(observer);
    }
}