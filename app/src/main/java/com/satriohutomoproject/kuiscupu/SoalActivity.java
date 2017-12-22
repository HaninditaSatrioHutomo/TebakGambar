package com.satriohutomoproject.kuiscupu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aura comp on 4/27/2017.
 */

public class SoalActivity extends Activity {
    int a=0;
    int nilai=0;
    String nilaistring;
    String ambildata;
    int[] gambar={R.drawable.ayam, R.drawable.bebekwek, R.drawable.cicak, R.drawable.domba, R.drawable.elang,R.drawable.kosong};
    String[] jawab1={"AYAM","KUCING","TIKUS","MACAN","ELANG",""};
    String[] jawab2={"BERUANG","BEBEK","GAJAH","JERAPAH","KUDA",""};
    String[] jawab3={"SEMUT","ANJING","CICAK","SIPUT","HARIMAU",""};
    String[] jawab4={"IKAN","SAPI","KERBAU","DOMBA","KELINCI",""};
    private Button ButtonSoal;
    private Button ButtonOpsi1;
    private Button ButtonOpsi2;
    private Button ButtonOpsi3;
    private Button ButtonOpsi4;
    private TextView hasilnilai;
    private TextView perantaranama;
    private ImageView soalgambar;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        soalgambar=(ImageView)findViewById(R.id.soal_gambar);
        ButtonOpsi1= (Button)findViewById(R.id.jawab_a);
        ButtonOpsi2= (Button)findViewById(R.id.jawab_b);
        ButtonOpsi3= (Button)findViewById(R.id.jawab_c);
        ButtonOpsi4= (Button)findViewById(R.id.jawab_d);
        hasilnilai=(TextView)findViewById(R.id.simpan_nilai);
        perantaranama=(TextView)findViewById(R.id.tampil_nama);

        soalgambar.setImageDrawable(getResources().getDrawable(gambar[a]));
        ButtonOpsi1.setText(jawab1[a]);
        ButtonOpsi2.setText(jawab2[a]);
        ButtonOpsi3.setText(jawab3[a]);
        ButtonOpsi4.setText(jawab4[a]);

        nilaistring=String.valueOf(nilai);
        hasilnilai.setText(nilaistring);

        Intent intendata=getIntent();
        ambildata=intendata.getExtras().getString("key_nama");
        perantaranama.setText(ambildata);

        ButtonOpsi1.setOnClickListener(buttonopsi1);
        ButtonOpsi2.setOnClickListener(buttonopsi2);
        ButtonOpsi3.setOnClickListener(buttonopsi3);
        ButtonOpsi4.setOnClickListener(buttonopsi4);

    }

        View.OnClickListener buttonopsi1 = new View.OnClickListener() {

            public void onClick(View view) {
                    soalgambar.setImageDrawable(getResources().getDrawable(gambar[a+1]));
                    ButtonOpsi1.setText(jawab1[a+1]);
                    ButtonOpsi2.setText(jawab2[a+1]);
                    ButtonOpsi3.setText(jawab3[a+1]);
                    ButtonOpsi4.setText(jawab4[a+1]);


                a++;
                if (a==1||a==5)
                {
                    nilai=nilai+20;
                }
                nilaistring=String.valueOf(nilai);
                hasilnilai.setText(nilaistring);
                                if(a==5)
                {
                    gotohasil(nilaistring, ambildata);
                }
            }

        };

        View.OnClickListener buttonopsi2 = new View.OnClickListener() {

            public void onClick(View view) {
                soalgambar.setImageDrawable(getResources().getDrawable(gambar[a+1]));
                ButtonOpsi1.setText(jawab1[a+1]);
                ButtonOpsi2.setText(jawab2[a+1]);
                ButtonOpsi3.setText(jawab3[a+1]);
                ButtonOpsi4.setText(jawab4[a+1]);
                hasilnilai.setText(nilaistring);
                a++;
                if (a==2)
                {
                    nilai=nilai+20;
                }
                nilaistring=String.valueOf(nilai);
                hasilnilai.setText(nilaistring);
                if(a==5)
                {
                    gotohasil(nilaistring, ambildata);
                }
            }
        };
        View.OnClickListener buttonopsi3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soalgambar.setImageDrawable(getResources().getDrawable(gambar[a+1]));
                ButtonOpsi1.setText(jawab1[a+1]);
                ButtonOpsi2.setText(jawab2[a+1]);
                ButtonOpsi3.setText(jawab3[a+1]);
                ButtonOpsi4.setText(jawab4[a+1]);
                hasilnilai.setText(nilaistring);
                a++;
                if (a==3)
                {
                    nilai=nilai+20;
                }
                nilaistring=String.valueOf(nilai);
                hasilnilai.setText(nilaistring);
                if(a==5)
                {
                    gotohasil(nilaistring, ambildata);
                }
            }
        };
        View.OnClickListener buttonopsi4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soalgambar.setImageDrawable(getResources().getDrawable(gambar[a+1]));
                ButtonOpsi1.setText(jawab1[a+1]);
                ButtonOpsi2.setText(jawab2[a+1]);
                ButtonOpsi3.setText(jawab3[a+1]);
                ButtonOpsi4.setText(jawab4[a+1]);
                hasilnilai.setText(nilaistring);
                a++;
                if (a==4)
                {
                    nilai=nilai+20;
                }
                nilaistring=String.valueOf(nilai);
                hasilnilai.setText(nilaistring);
                if(a==5)
                {
                    gotohasil(nilaistring, ambildata);
                }
            }
        };

    private void gotohasil(String kirimnilai, String kirimnamakehasil) {
        Intent intenttohasil = new Intent(this, HasilActivity.class);
        intenttohasil.putExtra("key_nilai", kirimnilai);
        intenttohasil.putExtra("key_namauser",kirimnamakehasil);
        startActivity(intenttohasil);
        finish();
    }
}