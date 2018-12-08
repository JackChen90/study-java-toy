package indi.jackie.toy.designpattern.observer;

/**
 * @author jackie chen
 * @create 2018/11/23
 * @description IObserver
 */
public interface IObserver<T> {
    void update(T t);
}
