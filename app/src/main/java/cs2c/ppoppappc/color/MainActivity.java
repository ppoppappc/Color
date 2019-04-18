package cs2c.ppoppappc.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txvR,txvG,txvB,txv;
    String text ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR = findViewById(R.id.textView2);
        txvG = findViewById(R.id.textView3);
        txvB = findViewById(R.id.textView4);
        txv = findViewById(R.id.textView5);

    }
}
