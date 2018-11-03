package com.example.lorrainegarcia.rein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.lorrainegarcia.rein.Network.ApiBuilder;
import com.example.lorrainegarcia.rein.Network.Preconfig;
import com.example.lorrainegarcia.rein.model.car;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceInstruction extends AppCompatActivity {

    TextView tv;
    TextView tv1;
    Button btn;
    Spinner spinner;

    Preconfig preconfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_instruction);
        preconfig = new Preconfig(this);
        tv = (TextView) findViewById(R.id.tvService);;

        tv.setText(getIntent().getStringExtra("SERVICE"));

        tv1 = (TextView) findViewById(R.id.txtService);
        btn = (Button) findViewById(R.id.btnInstructions);
        spinner = (Spinner) findViewById(R.id.spinner);
//        car cars = new car(176);
        Viewcar();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String country=   spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
                Toast.makeText(getApplicationContext(),country,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // DO Nothing here
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=tv.getText().toString();
                String instructions = tv1.getText().toString();
                Intent intent = new Intent(ServiceInstruction.this, ServiceLocation.class);
                Bundle extras = new Bundle();
                extras.putString("SERVICE", text);
                extras.putString("inst", instructions);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }

    public void Viewcar (){
        Call<List<car>> call = ApiBuilder.getApiObjects().Viewcar("Bearer " + preconfig.getToken(),Integer.parseInt(preconfig.getID()));
        Log.d("CARS", preconfig.getToken());
        call.enqueue(new Callback<List<car>>() {
            @Override
            public void onResponse(Call<List<car>> call, Response<List<car>> response) {

                Log.d("CARS", String.valueOf(response.body().size()));
                List<car> listcar = response.body();
                List<String> cars1 = new ArrayList<String>();
                for (int i = 0; i < listcar.size(); i++)
                {
                    cars1.add(response.body().get(i).getModel());
                }

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(ServiceInstruction.this
                        ,android.R.layout.simple_spinner_item, cars1);

                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Log.d("CARS", "2");

                spinner.setAdapter(dataAdapter);
                Log.d("CARS", "3");

            }

            @Override
            public void onFailure(Call<List<car>> call, Throwable t) {
                Log.d("CARS1", t.toString());
            }
        });

    }
}
