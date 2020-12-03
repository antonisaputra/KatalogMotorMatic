package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class Katalog_suzuki extends AppCompatActivity {
    ImageButton tmblSuzukiAddress, tmblSuzukiAddressFi, tmblSuzukiNext;

    public static final String JENIS_GALERI_KEY_SUZUKI = "JENIS_GALERI_SUZUKI";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_suzuki);

        tmblSuzukiAddress = findViewById (R.id.tombol_suzuki_address);
        tmblSuzukiAddressFi = findViewById (R.id.tombol_suzuki_address_fi);
        tmblSuzukiNext = findViewById (R.id.tombol_suzuki_next);
        tmblSuzukiAddress.setOnClickListener (v -> GaleriSuzuki ("Suzuki Address"));
        tmblSuzukiAddressFi.setOnClickListener (v -> GaleriSuzuki ("Suzuki Address Fi"));
        tmblSuzukiNext.setOnClickListener (v -> GaleriSuzuki ("Suzuki Next"));
    }
    public void GaleriSuzuki(String jenisSuzuki){
    Log.d("MAIN","Buka activity Yamaha");
    Intent intent =new Intent (Katalog_suzuki.this,GaleriActivitiSuzuki.class);
            intent.putExtra(JENIS_GALERI_KEY_SUZUKI, jenisSuzuki);
    startActivity(intent);
    }
}