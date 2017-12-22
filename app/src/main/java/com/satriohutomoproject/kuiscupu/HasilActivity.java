package com.satriohutomoproject.kuiscupu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by aura comp on 4/28/2017.
 */

public class HasilActivity extends Activity {
    TextView Score;
    TextView TulisanScore;
    Button ButtonHome;
    TextView NamaUser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Score=(TextView)findViewById(R.id.score);
        TulisanScore=(TextView)findViewById(R.id.TulisanScore);
        ButtonHome=(Button)findViewById(R.id.button_home);
        NamaUser=(TextView)findViewById(R.id.nama_user);

        Intent intendata=getIntent();
        String ambilnilai=intendata.getExtras().getString("key_nilai");
        String ambilnama=intendata.getExtras().getString("key_namauser");

        Score.setText(ambilnilai);
        NamaUser.setText(ambilnama);

        ButtonHome.setOnClickListener(ButtonHomeClicked);


    }
    View.OnClickListener ButtonHomeClicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotohome();
        }
    };

    private  void gotohome(){
        Intent intentohome=new Intent(this,MainActivity.class);
        startActivity(intentohome);
    }
}
