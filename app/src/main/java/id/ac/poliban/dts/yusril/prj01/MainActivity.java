package id.ac.poliban.dts.yusril.prj01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasikan Variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variable Berdasarkan id
        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil=(TextView)findViewById(R.id.Lbl_Nama);

    }
    //Buat Method TampilNama Sesuai Property Onclick pada button
    public void TampilNama(View view){
        Hasil.setText("Nama Anda: "+TextNama.getText());

    }
}



