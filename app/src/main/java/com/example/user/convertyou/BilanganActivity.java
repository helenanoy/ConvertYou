package com.example.user.convertyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BilanganActivity extends AppCompatActivity {
    EditText decimal,octal;
    Button cbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilangan);

        decimal = (EditText) findViewById(R.id.in_decimal);
        octal = (EditText) findViewById(R.id.in_octal);
        cbutton = (Button) findViewById(R.id.cbutton);
        cbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int inputdecimal = Integer.parseInt(decimal.getText().toString());
                    int i=0, hasil =0;
                    int []oct = new int[9];
                    String hasiloctal="";
                    i = 9;
                    while (inputdecimal > 0){
                        hasil = inputdecimal %8;
                        inputdecimal= (inputdecimal - hasil)/8;
                        i--;
                        oct [i]= hasil;
                        hasiloctal = oct[i]+ hasiloctal;

                    }
                    octal.setText(hasiloctal);
                }
            });
        }
}
