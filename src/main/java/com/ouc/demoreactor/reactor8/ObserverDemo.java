package com.ouc.demoreactor.reactor8;

import java.util.Observable;

/**
 * ClassName:ObserverDemo
 * Package:com.ouc.demoreactor.reactor8
 * Description:
 *
 * @author yangshouheng
 * @create 2022-01-10 16:18
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        observer.addObserver((o,arg)->{
            System.out.println("发生变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("手动被观察者通知，准备改变");
        });
        observer.setChanged();
        observer.notifyObservers();
    }
}
