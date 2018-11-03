package com.example.lorrainegarcia.rein;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;


public class Registration extends AppCompatActivity {

    Spinner citySpinner, carSpinner;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        //Spinner for Cities
        citySpinner = findViewById(R.id.CitySpinner);

        List<String> cities = new ArrayList<>();
        cities.add(0, "Cities");
        cities.add("Caloocan");
        cities.add("Las Pinas");
        cities.add("Makati");
        cities.add("Malabon");
        cities.add("Manila");
        cities.add("Marikina");
        cities.add("Muntinlupa");
        cities.add("Navotas");
        cities.add("Paranaque");
        cities.add("Pasay");
        cities.add("Pasig");
        cities.add("Pateros");
        cities.add("Quezon City");
        cities.add("San Juan");
        cities.add("Taguig");
        cities.add("Valenzuela");

        //Style
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cities);

        //Dropdown layout
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching adapter to spinner
        citySpinner.setAdapter(dataAdapter);

        //Spinner for Car Types
        carSpinner = findViewById(R.id.CarSpinner);
        List<String> carTypes = new ArrayList<>();
        carTypes.add(0, "Car Type");
        carTypes.add("Hatchback");
        carTypes.add("Sedan");
        carTypes.add("MPV");
        carTypes.add("SUV");
        carTypes.add("Crossover");
        carTypes.add("Coupe");
        carTypes.add("Convertible");
        carTypes.add("Van");
        carTypes.add("RVs");

         //Style
        ArrayAdapter<String> dataAdapterCar;
        dataAdapterCar = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, carTypes);

        //Dropdown layout
        dataAdapterCar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching adapter to spinner
        carSpinner.setAdapter(dataAdapterCar);

        //ON ITEM SELECT FOR SPINNERS
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);



                if (parent.getItemAtPosition(position).equals("Cities")){

                    ((TextView) parent.getChildAt(0)).setTextColor(Color.GRAY);



                }else {
                    //on selected item
                    String item = parent.getItemAtPosition(position).toString();
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        carSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);



                if (parent.getItemAtPosition(position).equals("Car Type")){
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.GRAY);


                }else {
                    //on selected item
                    String item = parent.getItemAtPosition(position).toString();
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        register = findViewById(R.id.btnToHomepage);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i  = new Intent(Registration.this, Homepage.class);
                startActivity(i);
            }
        });





    }


}
