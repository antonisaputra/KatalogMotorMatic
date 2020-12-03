package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class Katalog_yamaha extends AppCompatActivity {
    ImageButton btnFino,btnMioZ,btnMio,btnXride;
    public static final String JENIS_GALERI_KEY_YAMAHA = "JENIS_GALERI_YAMAHA";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_yamaha);


        btnFino = findViewById(R.id.tombol_fino);
        btnFino.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity Yamaha");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Fino");
            startActivity(intent);
        });
        btnMioZ = findViewById (R.id.tombo_mio_z);
        btnMioZ.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity Yamaha");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "MioZ");
            startActivity(intent);
        });
        btnMio = findViewById (R.id.tombol_mio_m3);
        btnMio.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity Yamaha");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Mio");
            startActivity(intent);
        });
        btnXride = findViewById (R.id.tombol_xride125);
        btnXride.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity Yamaha");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Xride");
            startActivity(intent);
        });
    }
}