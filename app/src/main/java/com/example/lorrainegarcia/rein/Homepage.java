package com.example.lorrainegarcia.rein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.GridLayout;
import android.support.v7.widget.CardView;

public class Homepage extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        GridLayout mainGrid = findViewById(R.id.mainGrid);


        //Toggle event
        //SetToggleEvent(mainGrid);
        SetSingleEvent(mainGrid);

    }

    private void SetSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "FlatTire");
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "Jumpstart");
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "EngineProblem");
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "TowTruck");
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "Overheat");
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(Homepage.this, ServiceInstruction.class);
                        intent.putExtra("SERVICE", "Other");
                        startActivity(intent);
                    }
                }
            });

        }

    }


}
