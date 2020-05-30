package demo.ht.com.designpattern.ObserverMode;

import java.util.Observable;

public class MyObservable extends Observable {

    public void sendChandMessage(ObserverBean bean){
        //方法继承自Observable，表示当前状态发生改变
        setChanged();
        //方法继承自Observable，通知所有观察者，最后会调用每个Observer的update方法
        notifyObservers(bean);
    }
}
