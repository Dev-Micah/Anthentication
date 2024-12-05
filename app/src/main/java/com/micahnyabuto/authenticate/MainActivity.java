package com.micahnyabuto.authenticate;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText Email;

    private EditText Password;

    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Email =findViewById(R.id.et_email);
        Password=findViewById(R.id.et_password);
        Login = findViewById(R.id.btn_login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                String email = Email.getText().toString().trim();
                String pwd = Password.getText().toString().trim();
                if (email.isEmpty() || pwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "All Field are required", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Proceed to Login", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}