package com.example.twowaytemperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class AdditionalActivity extends AppCompatActivity {

    //Widgets Woo
    EditText etInputTemp;
    TextView tvOutputTemp;
    Button btnConvert;
    Button switchView;
    RadioButton radCToF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.additional_activity);

        //Find widgets
        etInputTemp = findViewById(R.id.etInputTemp);
        tvOutputTemp = findViewById(R.id.tvOutputTemp);
        btnConvert = findViewById(R.id.btnConvert);
        switchView = findViewById(R.id.button_to_addition);

        btnConvert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Float inputTemp, outputTemp;
                inputTemp = Float.valueOf(etInputTemp.getText().toString());

                //Convert F to C
                outputTemp = (inputTemp - 32) * 5/9;


                //Output temperature
                tvOutputTemp.setText(outputTemp.toString());

            }
        });
    }

    // This method is called when the "Open Addition" button is clicked
    public void openMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}