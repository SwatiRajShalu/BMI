package com.s1613.bmi12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView res;
        res=findViewById(R.id.result);
        double bmi=getIntent().getDoubleExtra("bmi_value",0.0);

        res.setText(String.format("Your BMI : %.2f", bmi));
    }
}