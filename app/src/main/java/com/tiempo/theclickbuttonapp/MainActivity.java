package com.tiempo.theclickbuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button upcounter;
    private TextView seecounter;
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcounter = (Button) findViewById(R.id.UpCounter);
        seecounter = (TextView) findViewById(R.id.SeeCounter);

        View.OnClickListener disparaOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked = numTimesClicked +1;
                String result ="The button got tapped "+ numTimesClicked+" time";
                if (numTimesClicked != 1){
                    result += "s";
                }
                seecounter.setText(result);
                /*
                String total = Integer.toString(numTimesClicked);
                if (numTimesClicked == 1){
                    seecounter.setText("El boton ha sido presionado "+ total + " ves.");
                }else{
                    seecounter.setText("El boton ha sido presionado "+ total + " veces.");
                }
                */
            }
        };

        upcounter.setOnClickListener(disparaOnClickListener);

    }
}
