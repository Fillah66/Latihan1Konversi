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

public class ActivityDetailJarak extends AppCompatActivity {
    Spinner spJarak;
    EditText inputJarak;
    Button btnJarak;
    TextView txtHasilJarak;
    double hasilConversiJarak = 0;
    int posConversiJarak = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jarak);

        spJarak = findViewById(R.id.spJarak);
        inputJarak = findViewById(R.id.inputJarak);
        btnJarak = findViewById(R.id.btnJarak);
        txtHasilJarak = findViewById(R.id.txtHasilJarak);

        String[] dataLuas = new String[] {"Km to M", "M to Cm", "Cm to Km", "Km to Cm"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataLuas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spJarak.setAdapter(adapter);
        spJarak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posConversiJarak = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnJarak.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (posConversiJarak==0){
                    hasilConversiJarak = (double) (Double.parseDouble(inputJarak.getText().toString())* 100 * 100 * 100);
                    txtHasilJarak.setText(""+hasilConversiJarak);
                } else if (posConversiJarak==1) {
                    hasilConversiJarak = (double) (Double.parseDouble(inputJarak.getText().toString())* 100 * 100);
                    txtHasilJarak.setText(""+hasilConversiJarak);
                } else if (posConversiJarak==2) {
                    hasilConversiJarak = (double) (Double.parseDouble(inputJarak.getText().toString())/ 100 / 100 / 100 /100 / 100);
                    txtHasilJarak.setText(""+hasilConversiJarak);
                } else if (posConversiJarak==3) {
                    hasilConversiJarak = (double) (Double.parseDouble(inputJarak.getText().toString())* 100 * 100 * 100 * 100 * 100);
                    txtHasilJarak.setText(""+hasilConversiJarak);
                }
            }
        });
    }
}
