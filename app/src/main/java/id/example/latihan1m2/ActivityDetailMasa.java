package id.example.latihan1m2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDetailMasa extends AppCompatActivity {
    Spinner spMas;
    EditText inputMas;
    TextView txtHasilMas;
    Button btnMas;
    float hasilConverse = 0;
    int posConverse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masa);

        spMas = findViewById(R.id.spMas);
        inputMas = findViewById(R.id.inputMas);
        txtHasilMas = findViewById(R.id.txtHasilMas);
        btnMas = findViewById(R.id.btnMas);

    String[] dataMasa = new String[] {"Kg to Hg", "Kg to Dag", "Hg to Kg", "Dag to Kg"};
    spMas = findViewById(R.id.spMas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataMasa);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMas.setAdapter(adapter);
        spMas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posConverse = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (posConverse==0){
                    hasilConverse = (float) (Integer.parseInt(inputMas.getText().toString())* 10);
                    txtHasilMas.setText(""+hasilConverse);
                } else if (posConverse==1) {
                    hasilConverse = (float) (Integer.parseInt(inputMas.getText().toString())* 10 * 10);
                    txtHasilMas.setText(""+hasilConverse);
                } else if (posConverse==2) {
                    hasilConverse = (float) (Integer.parseInt(inputMas.getText().toString())/ 10);
                    txtHasilMas.setText(""+hasilConverse);
                } else if (posConverse==3) {
                    hasilConverse = (float) (Integer.parseInt(inputMas.getText().toString())/ 10 / 10);
                    txtHasilMas.setText(""+hasilConverse);
                }
            }
        });
    }
}
