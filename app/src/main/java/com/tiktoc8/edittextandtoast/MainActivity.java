package com.tiktoc8.edittextandtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEt;
    Button  ShowEtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEt = (EditText)findViewById(R.id.name_et);

        ShowEtText = (Button)findViewById(R.id.click_me);

        ShowEtText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameText = nameEt.getText().toString();
                Toast.makeText(MainActivity.this,nameText,Toast.LENGTH_LONG).show();
            }
        });


    }
}

