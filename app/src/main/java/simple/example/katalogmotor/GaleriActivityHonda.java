package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class GaleriActivityHonda extends AppCompatActivity {

    String jenisMotor;
    TextView txJenis,txTipe,txBuatan,txDeskripsi,txJudul;
    ImageView ivFotoHonda;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_honda);
        Intent intent = getIntent();
        jenisMotor = intent.getStringExtra(KatalogHonda.JENIS_GALERI_KEY);
        inisialisasiView();
        if(jenisMotor.equalsIgnoreCase ("Beat")){
            txJenis.setText("Beat");
            txTipe.setText("Vario 150");
            txBuatan.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Volume Langkah\t109.5cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi (PGM-FI)\n" +
                    "Diameter X Langkah\t47.0 x 63.1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t10.0 : 1\n" +
                    "Daya Maksimum\t6.6 kW (9.0 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9.3 N.m (0.95 kgf.m)/ 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering");
            ivFotoHonda.setImageResource (R.drawable.img1);
        }
        else if(jenisMotor.equalsIgnoreCase ("Vario150")){
            txJenis.setText("Vario 150");
            txTipe.setText("Vario 150");
            txBuatan.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4 langkah, SOHC, eSP, Pendingin Cairan\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t57,3 x 57,9 mm\n" +
                    "Tipe Tranmisi\tOtomatic, V-matic\n" +
                    "Rasio Kompresi\t10,6 : 1\n" +
                    "Daya Maksimum\t9.7 kW (13.1 PS) / 8500 rpm\n" +
                    "Torsi Maksimum\t13.4 Nm (1.37 kgf.m) / 5000 rpm\n" +
                    "Tipe Starter\tElektrik\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type");
            ivFotoHonda.setImageResource (R.drawable.img2);
        }
        else if (jenisMotor.equalsIgnoreCase ("Vario125")){
            txJenis.setText("Vario 125");
            txTipe.setText("Vario 125");
            txBuatan.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4-Langkah, SOHC, eSP, Pendinginan Cairan\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Tipe Tranmisi\tOtomatic , V - Matic\n" +
                    "Daya Maksimum\t8,2 kW (11,1 PS) / 8.500 rpm\n" +
                    "Torsi Maksimum\t10,8 Nm (1,1 kgf.m) / 5.000 rpm\n" +
                    "Tipe Starter\tElektrik\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type");
            ivFotoHonda.setImageResource (R.drawable.img3);
        }
        else if (jenisMotor.equalsIgnoreCase ("Vario")){
            txJenis.setText("Vario");
            txTipe.setText("Vario");
            txBuatan.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Volume Langkah\t109.5cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi (PGM-FI)\n" +
                    "Diameter X Langkah\t47.0 x 63.1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t10.0 : 1\n" +
                    "Daya Maksimum\t6.6 kW (9.0 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9.3 N.m (0.95 kgf.m)/ 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering");
            ivFotoHonda.setImageResource (R.drawable.img4);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txTipe = findViewById(R.id.txtipe);
        txBuatan = findViewById(R.id.txPablik);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHonda = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis Motor Honda");
    }


}