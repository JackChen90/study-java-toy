package indi.jackie.toy.designpattern.observer;

/**
 * @author jackie chen
 * @create 2018/11/23
 * @description IObservable
 */
public interface IObservable<T> {

    /**
     * 通知观察者
     *
     * @param t   通讯数据
     */
    void notice(T t);

    /**
     * 增加观察者
     *
     * @param observer 观察者
     */
    void addObserver(IObserver<T> observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    void delObserver(IObserver<T> observer);
}
