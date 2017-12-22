package com.satriohutomoproject.kuiscupu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button ButtonPlay;
    private EditText EditTextNama;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextNama=(EditText)findViewById(R.id.masukan_nama);
        ButtonPlay= (Button)findViewById(R.id.button_play);

        ButtonPlay.setOnClickListener(buttonplayclicked);
    }


    View.OnClickListener buttonplayclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            username = EditTextNama.getText().toString();
            gotosoal(username);
        }
    };

    private void gotosoal(String kirimnamakesoal) {
        Intent intenttosoal = new Intent(this, SoalActivity.class);
        intenttosoal.putExtra("key_nama",kirimnamakesoal);
        startActivity(intenttosoal);
        finish();
    }
}

