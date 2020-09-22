package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private Button bt;

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button_1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar();


            }
        });
    }
    public void guardar(){
        Intent i = new Intent(this,home.class);

        et1= findViewById(R.id.edit_text_1);
        et2= findViewById(R.id.edit_text_2);
        String email =et1.getText().toString();
        String password =et2.getText().toString();

        sp=getSharedPreferences("datos",MODE_PRIVATE);
        editor=sp.edit();
        editor.putString("email",email);
        editor.putString("password",password);
        editor.apply();

        startActivity(i);

    }

}