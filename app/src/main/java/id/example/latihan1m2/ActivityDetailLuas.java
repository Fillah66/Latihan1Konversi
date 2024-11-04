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

public class ActivityDetailLuas extends AppCompatActivity {
    Spinner spLuas;
    EditText inputLuas;
    Button btnLuas;
    TextView txtHasilLuas;
    double hasilConversiLuas = 0;
    int posConversiLuas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_luas);

        spLuas = findViewById(R.id.spLuas);
        inputLuas = findViewById(R.id.inputLuas);
        btnLuas = findViewById(R.id.btnLuas);
        txtHasilLuas = findViewById(R.id.txtHasilLuas);

    String[] dataLuas = new String[] {"Km to M", "M to Cm", "Cm to Km", "Km to Cm"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataLuas);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spLuas.setAdapter(adapter);
    spLuas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posConversiLuas = position;
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
    btnLuas.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View view) {
                if (posConversiLuas==0){
                    hasilConversiLuas = (double) (Double.parseDouble(inputLuas.getText().toString())* 100 * 100 * 100);
                    txtHasilLuas.setText(""+hasilConversiLuas);
                } else if (posConversiLuas==1) {
                    hasilConversiLuas = (double) (Double.parseDouble(inputLuas.getText().toString())* 100 * 100);
                    txtHasilLuas.setText(""+hasilConversiLuas);
                } else if (posConversiLuas==2) {
                    hasilConversiLuas = (double) (Double.parseDouble(inputLuas.getText().toString())/ 100 / 100 / 100 /100 / 100);
                    txtHasilLuas.setText(""+hasilConversiLuas);
                } else if (posConversiLuas==3) {
                    hasilConversiLuas = (double) (Double.parseDouble(inputLuas.getText().toString())* 100 * 100 * 100 * 100 * 100);
                    txtHasilLuas.setText(""+hasilConversiLuas);
                }
        }
    });
    }
}

