package com.example.payroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        EditText etID = findViewById(R.id.etID);
        EditText etName = findViewById(R.id.etName);
        Spinner spinnerEmpType = findViewById(R.id.spinnerEmpType);
        EditText etWorkHours = findViewById(R.id.etWorkhours);
        EditText etWorkDays = findViewById(R.id.etWorkdays);

    }
}