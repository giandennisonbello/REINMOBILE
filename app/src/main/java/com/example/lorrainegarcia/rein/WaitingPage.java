package com.example.lorrainegarcia.rein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaitingPage extends AppCompatActivity {

    Button CancelBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_page);


        CancelBooking = findViewById(R.id.login);
        CancelBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WaitingPage.this, CancelConfirmation.class);
                startActivity(intent);
            }
        });



    }
}
