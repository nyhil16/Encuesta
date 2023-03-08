package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton rb1, rb2, rb3, rb4;
    private ImageButton ib;
    private TextView tv1, tv2, tv3, tv4;

    int votoWindows, votoLinux, votoIos, votoAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.rbGroup);

        rb1 = (RadioButton) findViewById(R.id.rbWindows);
        rb2 = (RadioButton) findViewById(R.id.rbLinux);
        rb3 = (RadioButton) findViewById(R.id.rbIOS);
        rb4 = (RadioButton) findViewById(R.id.rbAndroid);

        tv1 = (TextView) findViewById(R.id.txtResWindows);
        tv2 = (TextView) findViewById(R.id.txtResLinux);
        tv3 = (TextView) findViewById(R.id.txtResIos);
        tv4 = (TextView) findViewById(R.id.txtResAndroid);

        ib = (ImageButton) findViewById(R.id.imgBtn);
    }

    public void votar(View view) {
        String msg;
        switch(rg.getCheckedRadioButtonId()) {
            case R.id.rbWindows:
                votoWindows++;
                tv1.setText(String.valueOf(votoWindows));
                msg = "Gracias por votar " + rb1.getText();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbLinux:
                votoLinux++;
                tv2.setText(String.valueOf(votoLinux));
                msg = "Gracias por votar " + rb2.getText();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbIOS:
                votoIos++;
                tv3.setText(String.valueOf(votoIos));msg = "Gracias por votar " + rb3.getText();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbAndroid:
                votoAndroid++;
                tv4.setText(String.valueOf(votoAndroid));
                msg = "Gracias por votar " + rb4.getText();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rg.getCheckedRadioButtonId());
        }
    }
}