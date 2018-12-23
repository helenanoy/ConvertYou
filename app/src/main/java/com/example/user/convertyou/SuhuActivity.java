package com.example.user.convertyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SuhuActivity extends AppCompatActivity {

    EditText celcius, kelvin, farenheit,reamur;
    Button convertbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        celcius = (EditText) findViewById(R.id.in_celcius);
        kelvin = (EditText) findViewById(R.id.in_kelvin);
        farenheit = (EditText) findViewById(R.id.in_fahrenheit);
        reamur = (EditText) findViewById(R.id.in_reamur);
        convertbtn = (Button) findViewById(R.id.convertbtn);
    }

    public void konversisuhu (View view){
        try{
            int xcelcius = Integer.parseInt(celcius.getText().toString());
            double xreamur = xcelcius*0.8;
            double xfarenheit = (xcelcius*1.8) + 32;
            double xkelvin = xcelcius+273;
            reamur.setText(String.valueOf(xreamur));
            farenheit.setText(String.valueOf(xfarenheit));
            kelvin.setText(String.valueOf(xkelvin));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
