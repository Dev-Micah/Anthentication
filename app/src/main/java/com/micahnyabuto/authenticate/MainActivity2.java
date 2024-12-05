package com.micahnyabuto.authenticate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private EditText ConfirmPassword;

    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Email=findViewById(R.id.et_email);
        Password=findViewById(R.id.et_password);
        ConfirmPassword=findViewById(R.id.et_confirm_password);
        Register=findViewById(R.id.btn_register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= Email.getText().toString().trim();
                String pass = Password.getText().toString().trim();
                String confirm =ConfirmPassword.getText().toString().trim();
                if(email.isEmpty()|| pass.isEmpty()){
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }else{
                    Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent2);
                }
            }
        });

    }
}