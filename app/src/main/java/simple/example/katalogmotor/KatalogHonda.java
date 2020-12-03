package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.widget.ImageButton;

public class KatalogHonda extends AppCompatActivity {
    ImageButton btnHondaStreet, btnVario150,btnVario125,btnVario;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI_HONDA";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_honda);

        btnHondaStreet = findViewById(R.id.tombol_beat_Strett);
        btnHondaStreet.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity beat");
            Intent beat =new Intent (KatalogHonda.this,GaleriActivityHonda.class);
            beat.putExtra(JENIS_GALERI_KEY, "Beat");
            startActivity(beat);
        });


        btnVario150 = findViewById(R.id.tombo_vario_150);
        btnVario150.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity vario150");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "Vario150");
            startActivity(intent);
        });

        btnVario125 = findViewById(R.id.tombol_vario125);
        btnVario125.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity vario125");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "Vario125");
            startActivity(intent);
        });


        btnVario = findViewById(R.id.tombol_Vario);
        btnVario.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity vario");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "Vario");
            startActivity(intent);
        });
    }
}