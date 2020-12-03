package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleriActivitiSuzuki extends AppCompatActivity {

    String jenisMotor;
    TextView txJenis,txTipe,txBuatan,txDeskripsi,txJudul;
    ImageView ivFotoSuzuki;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_galeri_activiti_suzuki);

        Intent intent = getIntent();
        jenisMotor = intent.getStringExtra(Katalog_suzuki.JENIS_GALERI_KEY_SUZUKI);
        inisialisasiView();
        if(jenisMotor.equalsIgnoreCase ("Suzuki Address")){
            txJenis.setText("Address");
            txTipe.setText("Suzuki Address");
            txBuatan.setText("Suzuki");
            txDeskripsi.setText("Dimensi\t1.855 mm x 655 mm x 1.095 mm\n" +
                    "Berat\t97 kg\n" +
                    "Tipe Mesin\t4-stroke, 1 cylinder, air-cooled, SOCH\n" +
                    "Kapasitas Mesin\t113 cc\n" +
                    "Sistem Pembakaran\tInjection\n" +
                    "Sistem Transmisi\tFuel Injection\n" +
                    "Suspensi Depan\tTelescopic, coil spring, oil damped\n" +
                    "Suspensi Belakang\tSwingarm type, coil spring, oil damped\n" +
                    "Rem dan Ban Depan\tDisc brake (80/90-14 M/C 40P)\n" +
                    "Rem dan Ban Belakang\tDrum brake (90/90-14 M/C 46P)\n" +
                    "Tangki\t5.2 L");
            ivFotoSuzuki.setImageResource (R.drawable.suzuku_address);
        }
        else if(jenisMotor.equalsIgnoreCase ("Suzuki Address Fi")){
            txJenis.setText("Address FI");
            txTipe.setText("Suzuki Address FI");
            txBuatan.setText("Suzuki");
            txDeskripsi.setText("Dimensi\t1.845 mm x 665 mm x 1.095 mm\n" +
                    "Berat\t95 kg\n" +
                    "Tipe Mesin\t4-stroke, 1 cylinder, air-cooled, SOCH\n" +
                    "Kapasitas Mesin\t113 cc\n" +
                    "Sistem Pembakaran\tFuel Injection\n" +
                    "Sistem Transmisi\tCVT\n" +
                    "Suspensi Depan\tTelescopic, coil spring, oil damped\n" +
                    "Suspensi Belakang\tSwingarm type, coil spring, oil damped\n" +
                    "Rem dan Ban Depan\tDisc brake (80/90-14 M/C 40P)\n" +
                    "Rem dan Ban Belakang\tDrum brake (90/90-14 M/C 46P)\n" +
                    "Tangki\t5.2 L");
            ivFotoSuzuki.setImageResource (R.drawable.suzuki_address_fi);
        }

        else if(jenisMotor.equalsIgnoreCase ("Suzuki Next")){
            txJenis.setText("Address FI");
            txTipe.setText("Suzuki Next");
            txBuatan.setText("Suzuki");
            txDeskripsi.setText("Dimensi\t1.850 mm x 665 mm x 1.035 mm\n" +
                    "Berat\t90 kg\n" +
                    "Tipe Mesin\t4-stroke, 1 cylinder, air-cooled, SOCH\n" +
                    "Kapasitas Mesin\t113 cc\n" +
                    "Sistem Pembakaran\tFuel Injection\n" +
                    "Sistem Transmisi\tCVT\n" +
                    "Suspensi Depan\tTelescopic, coil spring, oil damped\n" +
                    "Suspensi Belakang\tSwingarm type, coil spring, oil damped\n" +
                    "Rem Depan\tDisc brake\n" +
                    "Rem Belakang\tDrum brake\n" +
                    "Tangki\t3.5 L");
            ivFotoSuzuki.setImageResource (R.drawable.suzuki_next_fi);
        }
    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txTipe = findViewById(R.id.txtipe);
        txBuatan = findViewById(R.id.txPablik);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoSuzuki = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis Motor Honda");
    }

}