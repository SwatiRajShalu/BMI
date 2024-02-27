package com.s1613.bmi12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText height_v,weight_v;
        Button btn;
        TextView res;

        height_v=findViewById(R.id.height_value);
        weight_v=findViewById(R.id.weight_value);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int height=Integer.parseInt(height_v.getText().toString());
                 int weight=Integer.parseInt(weight_v.getText().toString());
                 double newheight=height/100.0;
                 double bmi=weight/(newheight*newheight);

                 if(bmi>25){
                     openActivitythird(bmi);
                 }else if(bmi<18){
                     openActivityforth(bmi);
                 }else{
                     openActivitySecond(bmi);
                 }
            }
        });
    }
    public void openActivitySecond(double bmi){
        Intent intent= new Intent(this,MainActivity2.class);
        intent.putExtra("bmi_value",bmi);
        startActivity(intent);
    }
    public void openActivitythird(double bmi){
        Intent intent= new Intent(this,MainActivity3.class);
        intent.putExtra("bmi_value",bmi);
        startActivity(intent);
    }
    public void openActivityforth(double bmi){
        Intent intent= new Intent(this,MainActivity4.class);
        intent.putExtra("bmi_value",bmi);
        startActivity(intent);
    }
}