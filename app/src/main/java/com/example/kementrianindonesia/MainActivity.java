package com.example.kementrianindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String list_nama[] = {
            "Kementerian Agama Indonesia",
            "Kementerian Agraria dan Tata Ruang Indonesia",
            "Kementerian Energi dan Sumber Daya Mineral Indonesia",
            "Kementerian Ketenagakerjaan Indonesia",
            "Kementerian Kesehatan Indonesia",
            "Kementerian Keuangan Indonesia",
            "Kementerian Komunikasi dan Informatika Indonesia",
            "Kementerian Pendidikan dan Kebudayaan Indonesia",
            "Kementerian Perhubungan Indonesia",
            "Kementerian Kelautan dan Perikanan Indonesia",
            "Kementerian Pertanian Indonesia",
            "Kementerian Pekerjaan Umum dan Perumahan Rakyat Indonesia",
            "Kementerian Riset dan Teknologi Indonesia"

    };

    String list_deskripsi[] = {
            "Kementerian Agama Republik Indonesia (disingkat Kemenag RI, dahulu Departemen Agama Republik Indonesia, disingkat Depag RI) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan agama. Kementerian Agama dipimpin oleh seorang Menteri Agama (Menag) yang sejak tanggal 22 Oktober 2019 dijabat oleh Jenderal Purn Fachrul Razi.",
            "Kementerian Agraria dan Tata Ruang Republik Indonesia adalah kementerian yang mempunyai tugas menyelenggarakan urusan di bidang agraria/pertanahan dan tata ruang dalam pemerintahan untuk membantu Presiden dalam menyelenggarakan pemerintahan negara. Kementerian Agraria dan Tata Ruang berada di bawah dan bertanggung jawab kepada Presiden. Kementerian Agraria dan Tata Ruang Republik Indonesia dijabat oleh seorang menteri yang juga menjabat sebagai Kepala Badan Pertanahan Nasional. Sejak 27 Juli 2016 Kementerian Agraria dan Tata Ruang Republik Indonesia dipimpin oleh Sofyan Djalil.",
            "Kementerian Energi dan Sumber Daya Mineral Republik Indonesia (Kementerian ESDM RI) adalah Kementerian dalam Pemerintah Indonesia yang bergerak di bidang energi, dan sumber daya mineral. Kementerian ESDM dipimpin oleh seorang Menteri Energi dan Sumber Daya Mineral (Menteri ESDM) yang sejak tanggal 23 Oktober 2019 dijabat oleh Arifin Tasrif.",
            "Kementerian Ketenagakerjaan Republik Indonesia atau Kemnaker (dahulu Kementerian Tenaga Kerja dan Transmigrasi, disingkat Kemnakertrans) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan ketenagakerjaan. Kementerian Ketenagakerjaan berada di bawah dan bertanggung jawab kepada Presiden. Kementerian Ketenagakerjaan dipimpin oleh seorang Menteri Ketenagakerjaan (Menaker) yang sejak 23 Oktober 2019 dijabat oleh Ida Fauziah.",
            "Kementerian Kesehatan Republik Indonesia (Kemenkes RI) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan kesehatan. Kementerian Kesehatan berada di bawah dan bertanggung jawab kepada Presiden. Kementerian Kesehatan dipimpin oleh seorang Menteri Kesehatan (Menkes) yang sejak 23 Oktober 2019 dijabat oleh Letjen TNI (Purn) Dr. dr. Terawan Agus Putranto, Sp. Rad. (K) RI.",
            "Kementerian Keuangan Republik Indonesia (disingkat Kemenkeu RI) adalah kementerian negara di lingkungan Pemerintah Indonesia yang membidangi urusan keuangan dan kekayaan negara, Kementerian Keuangan berkedudukan di bawah dan bertanggungjawab kepada Presiden. Kementerian Keuangan dipimpin oleh seorang Menteri Keuangan (Menkeu) yang sejak tanggal 27 Juli 2016 dijabat oleh Sri Mulyani",
            "Kementerian Komunikasi dan Informatika Republik Indonesia (Kemkominfo RI) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan komunikasi dan informatika.Kementerian Komunikasi dan Informatika dipimpin oleh seorang Menteri Komunikasi dan Informatika (Menkominfo) yang sejak tanggal 23 Oktober 2019 dijabat oleh Johnny G. Plate.",
            "Kementerian Pendidikan dan Kebudayaan Republik Indonesia (disingkat: Kemendikbud atau Kemdikbud) adalah kementerian dalam Pemerintah Indonesia yang menyelenggarakan urusan di bidang pendidikan anak usia dini, pendidikan dasar, pendidikan menengah, dan pendidikan masyarakat, serta pengelolaan kebudayaan. Kementerian Pendidikan dan Kebudayaan berada di bawah dan bertanggung jawab kepada Presiden.Kementerian Pendidikan dan Kebudayaan dipimpin oleh seorang Menteri Pendidikan dan Kebudayaan (Mendikbud).",
            "Kementerian Perhubungan Republik Indonesia (disingkat Kemenhub RI) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan transportasi. Kemenhub dipimpin oleh seorang Menteri Perhubungan (Menhub) yang sejak tanggal 27 Juli 2016 dijabat oleh Budi Karya Sumadi.",
            "Kementerian Kelautan dan Perikanan (disingkat KKP) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan kelautan dan perikanan. Kementerian Kelautan dan Perikanan dipimpin oleh seorang Menteri Kelautan dan Perikanan yang pertama kali dijabat oleh Sarwono Kusumaatmadja dan sejak 23 Oktober 2019 dijabat oleh Edhy Prabowo.",
            "Kementerian Pertanian Republik Indonesia (disingkat Kementan RI) adalah adalah kementerian negara di lingkungan Pemerintah Indonesia yang membidangi urusan pertanian. Kementerian Pertanian Republik Indonesia dipimpin oleh seorang Menteri Pertanian.[1] Sejak 23 Oktober 2019, Menteri Pertanian dijabat oleh Syahrul Yasin Limpo.",
            "Kementerian Pekerjaan Umum dan Perumahan Rakyat Republik Indonesia (disingkat Kemen PUPR RI) adalah kementerian dalam Pemerintah Indonesia yang membidangi urusan pekerjaan umum dan perumahan rakyat.  Kementerian Pekerjaan Umum dan Perumahan Rakyat berada di bawah dan bertanggung jawab kepada Presiden. Kemenpupera dipimpin oleh seorang Menteri Pekerjaan Umum dan Perumahan Rakyat yang sejak tanggal 27 Oktober 2014 dijabat oleh Basuki Hadimuljono.",
            "Kementerian Riset dan Teknologi / Badan Riset dan Inovasi Nasional Republik Indonesia (dahulu Kementerian Riset, Teknologi dan Pendidikan Tinggi, disingkat Kemenristekdikti) adalah kementerian dalam Pemerintah Indonesia yang menyelenggarakan urusan di bidang riset, teknologi, dan inovasi. Kementerian Riset dan Teknologi berada di bawah dan bertanggung jawab kepada Presiden.[1] Kemenristek/BRIN dipimpin oleh seorang Menteri Riset dan Teknologi merangkap sebagai Kepala Badan Riset dan Inovasi Indonesia (Menristek/Kepala BRIN) yang sejak tanggal 23 Oktober 2019 dijabat oleh Bambang Brodjonegoro."

    };

    String list_mentri[] = {
            "Fachrul Razi",
            "Sofyan Djalil",
            "Arifin Tasrif",
            "Ida Fauziyah",
            "Terawan Agus Putranto",
            "Sri Mulyani",
            "Johnny G. Plate",
            "Nadiem Makarim",
            "Budi Karya Sumadi",
            "Edhy Prabowo",
            "Syahrul Yasin Limpo",
            "Basuki Hadimuljono",
            "Bambang Brodjonegoro"
    };



    int list_gambar[] = {
            R.drawable.agama,
            R.drawable.agraria,
            R.drawable.esdm,
            R.drawable.kemnaker,
            R.drawable.kesehatan,
            R.drawable.keuangan,
            R.drawable.kominfo,
            R.drawable.pendidikan,
            R.drawable.perhubungan,
            R.drawable.perikanan,
            R.drawable.pertanian,
            R.drawable.pu,
            R.drawable.ristekdikti

    };

    ListView LvKementrian;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profile){
           Intent p = new Intent(this,Profile.class);
           startActivity(p);
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvKementrian = findViewById(R.id.LvKementrian);
        AdapterKementrian adapter = new AdapterKementrian(this, list_nama,list_gambar, list_mentri, list_deskripsi);
        LvKementrian.setAdapter(adapter);
        LvKementrian.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getApplicationContext(), Details.class);
                a.putExtra("Nama", list_nama[position]);
                a.putExtra("Gambar", list_gambar[position]);
                a.putExtra("Mentri", list_mentri[position]);
                a.putExtra("Deskripsi", list_deskripsi[position]);

                startActivity(a);



            }
        });



    }


    private class AdapterKementrian extends  ArrayAdapter {
        String list_nama[];
        int list_gambar[];

        Activity activity;


        public AdapterKementrian(MainActivity mainActivity, String[] list_nama, int[] list_gambar, String[] list_mentri, String[] list_deskripsi) {
            super(mainActivity,R.layout.list_kementrian,list_nama);

            this.list_nama=list_nama;
            this.list_gambar=list_gambar;
            activity=mainActivity;

        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater) activity.getLayoutInflater();
            View v = inflater.inflate(R.layout.list_kementrian, null);
            ImageView gambar;
            TextView nama;

            gambar = v.findViewById(R.id.Iv_Kementrian);
            nama = v.findViewById(R.id.Tv_Kementrian);
            gambar.setImageResource(list_gambar[position]);
            nama.setText(list_nama[position]);



            return v;
        }
    }



}




