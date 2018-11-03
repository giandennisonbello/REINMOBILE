package com.example.lorrainegarcia.rein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lorrainegarcia.rein.Network.ApiBuilder;
import com.example.lorrainegarcia.rein.Network.Preconfig;
import com.example.lorrainegarcia.rein.model.user;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    private TextView Reg, forgotPass;
    private Button Login;
    private EditText Email, password;
    private Preconfig preconfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        preconfig = new Preconfig(this);
        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        Reg = findViewById(R.id.txtSignUp);
        Reg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });

        forgotPass = findViewById(R.id.txtForgotPass);
        forgotPass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i  = new Intent(Login.this, ForgotPassword.class);
                startActivity(i);




            }
        });


        Login = findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email.getText().toString();
                String email =  Email.getText().toString();
                String passwords = password.getText().toString();

                user user = new user(email, passwords);

                dologin(user);
                Log.d("true","success");
            }
        });


    }
    private void dologin(user user) {
        Call<user> call = ApiBuilder.getApiObjects().login(user);



        call.enqueue(new Callback<user>() {
            @Override
            public void onResponse(Call<user> call, Response<user> response) {
                Toast.makeText(Login.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("success", String.valueOf(response.body().getId()));
                preconfig.saveID(String.valueOf(response.body().getId()));

                preconfig.saveToken(response.body().getToken());

                Log.d("success token", preconfig.getToken());
                startActivity(new Intent(Login.this, ServiceLocation.class)); //request = homepage
                finish();
            }

            @Override
            public void onFailure(Call<user> call, Throwable t) {
                Log.d("Hello", t.getLocalizedMessage());
            }

        });

    }




}
