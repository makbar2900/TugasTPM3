package com.example.kementrianindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
TextView list_nama,list_mentri,list_deskripsi;
ImageView list_gambar;
String nama,mentri,deskripsi;
int gambar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menusearch, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.cari){
                if(nama.equals("Kementerian Agama Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kemenag.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Agraria dan Tata Ruang Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.atrbpn.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals( "Kementerian Energi dan Sumber Daya Mineral Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.esdm.go.id//"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Ketenagakerjaan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kemnaker.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Kesehatan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kemkes.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals( "Kementerian Keuangan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kemenkeu.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Komunikasi dan Informatika Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kominfo.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Pendidikan dan Kebudayaan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.kemdikbud.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Perhubungan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.dephub.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Kelautan dan Perikanan Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kkp.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Pertanian Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("  http://www.pertanian.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Pekerjaan Umum dan Perumahan Rakyat Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pu.go.id/"));
                    startActivity(search);
                }
                else if (nama.equals("Kementerian Riset dan Teknologi Indonesia")){
                    Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ristekdikti.go.id/"));
                    startActivity(search);
                }

        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        list_gambar= findViewById(R.id.Iv_Kementrian);
        list_nama=findViewById(R.id.Tv_Kementrian);
        list_mentri=findViewById(R.id.Tv_mentri);
        list_deskripsi=findViewById(R.id.Tv_Deskripsi);

        gambar=getIntent().getIntExtra("Gambar",0);
        nama=getIntent().getStringExtra("Nama");
        mentri=getIntent().getStringExtra("Mentri");
        deskripsi=getIntent().getStringExtra("Deskripsi");

        list_gambar.setImageResource(gambar);
        list_nama.setText(nama);
        list_mentri.setText(mentri);
        list_deskripsi.setText(deskripsi);



    }
}
