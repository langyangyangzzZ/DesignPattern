package demo.ht.com.designpattern.ObserverMode;

import android.util.Log;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    public String mName;

    public MyObserver(String  string) {
        this.mName = string;
    }

    @Override
    public void update(Observable o, Object arg) {
        ObserverBean bean = (ObserverBean) arg;
        Log.i("szjjj",mName+"-->"+bean.getmName());
    }
}
