package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleriActivityYamaha extends AppCompatActivity {

    String jenisMotorYamaha;
    TextView txJenis,txTipe,txBuatan,txDeskripsi,txJudul;
    ImageView ivFotoYamaha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_yamaha);
        Intent intent = getIntent();
        jenisMotorYamaha = intent.getStringExtra(Katalog_yamaha.JENIS_GALERI_KEY_YAMAHA);
        if(jenisMotorYamaha.equalsIgnoreCase ("Fino")){
            inisialisasiView();
            txJenis.setText("Fino");
            txTipe.setText("FINO GRANDE");
            txBuatan.setText("Yamaha");
            txDeskripsi.setText("Tipe Mesin\tAir cooled, 4-stroke, SOHC\n" +
                    "Jumlah / Posisi Silinder\tSingle cylinder\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Volume Cylinder\t125 cc\n" +
                    "Perbandingan Kompresi\t9,5 : 1\n" +
                    "Daya Maksimum\t7.0 kW (9.52 PS) / 8000rpm\n" +
                    "Torsi Maksimum\t9.6 N.m (0,98 kgf.m) / 5500rpm\n" +
                    "Sistem Starter\tElektrik & kick starter\n" +
                    "Sistem Pelumasan\tBasah\n" +
                    "Kapasitas Oli Mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Sistem Bahan Bakar\tFuel Injection\n" +
                    "Tipe Kopling\tKering, sentrifugal Automatic\n" +
                    "Tipe Transmisi\tV-belt automatic");
            ivFotoYamaha.setImageResource (R.drawable.fino);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("MioZ")){
            inisialisasiView();
            txJenis.setText("MIO");
            txTipe.setText("MIO Z");
            txBuatan.setText("Yamaha");
            txDeskripsi.setText("TIPE MESIN\tAir cooled 4-stroke, SOHC\n" +
                    "SUSUNAN SILINDER\tSingle Cylinder\n" +
                    "DIAMETER X LANGKAH\t52,4 x 57,9 mm\n" +
                    "PERBANDINGAN KOMPRESI\t9,5 : 1\n" +
                    "VOLUME SILINDER\t125 cc\n" +
                    "DAYA MAKSIMUM\t7.0 kW / 8000 rpm\n" +
                    "TORSI MAKSIMUM\t9.6 Nm / 5500 rpm\n" +
                    "SISTEM STARTER\tElectric & kick starter\n" +
                    "SISTEM PELUMASAN\tWet sump\n" +
                    "KAPASITAS OLI MESIN\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "SISTEM BAHAN BAKAR\tFuel Injection\n" +
                    "TIPE KOPLING\tDry, Centrifugal Automatic\n" +
                    "TIPE TRANSMISI\tV-belt automatic");
            ivFotoYamaha.setImageResource (R.drawable.mio_z);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Mio")){
            inisialisasiView();
            txJenis.setText("MIO");
            txTipe.setText("MIO M3");
            txBuatan.setText("Yamaha");
            txDeskripsi.setText("Tipe mesin\tAir cooled 4-stroke, SOHC\n" +
                    "Kapasitas oli mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Susunan silinder\tSingle cylinder\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Perbandingan kompresi\t9,5 : 1\n" +
                    "Volume silinder\t125 cc\n" +
                    "Daya maksimum\t7 kW / 8000 rpm\n" +
                    "Torsi maksimum\t9.6 Nm / 5500 rpm\n" +
                    "Sistem starter\tElectric & kick starter\n" +
                    "Sistem pelumasan\tWet sump");
            ivFotoYamaha.setImageResource (R.drawable.mio_m3);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Xride")){
            inisialisasiView();
            txJenis.setText("Xride");
            txTipe.setText("Xride");
            txBuatan.setText("Yamaha");
            txDeskripsi.setText("TIPE MESIN\t4 Langkah, 2 Valve SOHC, Berpendingin Angin, Bluecore\n" +
                    "SUSUNAN SILINDER\tCylinder Tunggal\n" +
                    "DIAMETER X LANGKAH\t52,4 x 57,9 mm\n" +
                    "PERBANDINGAN KOMPRESI\t9,5 : 1\n" +
                    "VOLUME SILINDER\t125 cc\n" +
                    "DAYA MAKSIMUM\t7,0 Kw / 8000 rpm\n" +
                    "TORSI MAKSIMUM\t9,6 N.m / 5500 rpm\n" +
                    "SISTEM STARTER\tElectric Starter & kick starter\n" +
                    "SISTEM PELUMASAN\tWet sump\n" +
                    "KAPASITAS OLI MESIN\tTotal : 0,84 L ; Berkala : 0,80 L ; Ganti Filter Oli : 0,80 L\n" +
                    "SISTEM BAHAN BAKAR\tFuel Injection\n" +
                    "TIPE KOPLING\tDry Centrifugal Clucth\n" +
                    "TIPE TRANSMISI\tFull Automatic");
            ivFotoYamaha.setImageResource (R.drawable.xride125);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txTipe = findViewById(R.id.txtipe);
        txBuatan = findViewById(R.id.txPablik);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoYamaha = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis Motor Yamaha");
    }
}