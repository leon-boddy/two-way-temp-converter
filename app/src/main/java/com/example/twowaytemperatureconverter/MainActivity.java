package com.example.twowaytemperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Widgets
    EditText etInputTemp;
    TextView tvOutputTemp;
    Button btnConvert;
    RadioButton radCToF;
    Button switchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                //Convert C to F
                outputTemp = inputTemp * 9/5 +32;

                //Output temperature
                tvOutputTemp.setText(outputTemp.toString());

            }
        });
    }

    // This method is called when the "Open Addition" button is clicked
    public void openAdditionalActivity(View view) {
        Intent intent = new Intent(this, AdditionalActivity.class);
        startActivity(intent);
    }
}