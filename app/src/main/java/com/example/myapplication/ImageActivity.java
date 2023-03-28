package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {


    CheckBox cbSinging, cbDancing, cbTravelling, cbReading;
    AppCompatButton btnSubmit;
    String hobby = "",data;
    RadioGroup radiogroup;
    TextView txtNumber;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        initview();
    }

    private void initview() {
        cbSinging = findViewById(R.id.cbSinging);
        cbDancing = findViewById(R.id.cbDancing);
        cbTravelling = findViewById(R.id.cbTravelling);
        cbReading = findViewById(R.id.cbReading);
        btnSubmit = findViewById(R.id.btnSubmit);
        radiogroup = findViewById(R.id.radiogroup);
        seekbar = findViewById(R.id.seekbar);
        txtNumber = findViewById(R.id.txtNumber);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobby = "";
                if (cbSinging.isChecked()) {
                    hobby += cbSinging.getText().toString();
                    Toast.makeText(ImageActivity.this, hobby, Toast.LENGTH_SHORT).show();
                }
                if (cbDancing.isChecked()) {
                    hobby += cbDancing.getText().toString();
                    Toast.makeText(ImageActivity.this, hobby, Toast.LENGTH_SHORT).show();
                }
                if (cbTravelling.isChecked()) {
                    hobby += cbTravelling.getText().toString();
                    Toast.makeText(ImageActivity.this, hobby, Toast.LENGTH_SHORT).show();
                }
                if (cbReading.isChecked()) {
                    hobby += cbReading.getText().toString();
                    Toast.makeText(ImageActivity.this, hobby, Toast.LENGTH_SHORT).show();
                }

            }
        });


        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton radioButton = radioGroup.findViewById(id);

                if (radioButton.getText().toString().equals("Female")) {
                    Toast.makeText(ImageActivity.this, "Female", Toast.LENGTH_SHORT).show();
                } else if (radioButton.getText().toString().equals("Male")) {
                    Toast.makeText(ImageActivity.this, "Male", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ImageActivity.this, "Other", Toast.LENGTH_SHORT).show();

                }


            }
        });


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                  data= String.valueOf(i);
                txtNumber.setText(data);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(ImageActivity.this, "StartTrackingTouch", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(ImageActivity.this, "StopTrackingTouch"+data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}