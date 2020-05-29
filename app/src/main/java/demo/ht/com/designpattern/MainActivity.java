package demo.ht.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import demo.ht.com.designpattern.factoryMethod.FactoryMethodMessage;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btFactoryMethod(View view) {
        String a = FactoryMethodMessage.getInstance().getFactryMethod("b");
        Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
    }
}
