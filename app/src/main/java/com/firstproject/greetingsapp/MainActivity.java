package com.firstproject.greetingsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button mybtn;
    TextView title;


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

        editText = findViewById(R.id.edittext);
        mybtn = findViewById(R.id.btn);
        title = findViewById(R.id.title);


        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = editText.getText().toString();

                Toast.makeText(
                        MainActivity.this,
                        "Welcome"+inputName + "to our App",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}