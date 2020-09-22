package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {
    private TextView tv_email;
    private TextView tv_pass;
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cargar();
    }
    public void cargar(){
        tv_email=findViewById(R.id.tv_user);
        tv_pass=findViewById(R.id.tv_password);
        String email;
        String password;
        sp =getSharedPreferences("datos",MODE_PRIVATE);
        email = sp.getString("email","");
        password=sp.getString("password","");
        tv_email.setText(email);
        tv_pass.setText(password);

    }
}