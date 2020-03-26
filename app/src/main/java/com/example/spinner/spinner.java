package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class spinner extends AppCompatActivity {
    private ArrayList<countryitem> mCountryList;
    private CountryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initList();
        Spinner spinnerCountries = findViewById(R.id.spinner_countries);

        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);
        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                countryitem clickedItem = (countryitem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(spinner.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new countryitem("India", R.drawable.india));
        mCountryList.add(new countryitem("USA", R.drawable.usaa));
        mCountryList.add(new countryitem("Germany", R.drawable.german));
        mCountryList.add(new countryitem("Albania", R.drawable.albania));
    }
}
