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

public class ActivityDetailSuhu extends AppCompatActivity {
    Spinner spSuhu;
    EditText editInputSuhu;
    TextView txtHasilSuhu;
    Button tbHitung;
    float hasilConversi = 0;
    int posConversi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_detail_suhu);

        editInputSuhu = findViewById(R.id.editInputSuhu);
        txtHasilSuhu = findViewById(R.id.txtHasilSuhu);
        spSuhu = findViewById(R.id.spSuhu);
        tbHitung  = findViewById(R.id.tbHitung);

        String[] dataSuhu = new String[] {"Cel to Re", "Cel to  Far", "Re to Cel", "Re to Far"};
        ArrayAdapter<String>adapter  = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataSuhu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSuhu.setAdapter(adapter);
        spSuhu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posConversi = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        tbHitung.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(posConversi==0){
                    hasilConversi = (float) (Integer.parseInt(editInputSuhu.getText().toString())* 4)/5;
                    txtHasilSuhu.setText(""+hasilConversi);
                } else if (posConversi==1) {
                    hasilConversi = (float) (Integer.parseInt(editInputSuhu.getText().toString())* 9)/5 + 32;
                    txtHasilSuhu.setText(""+hasilConversi);
                } else if (posConversi==2) {
                    hasilConversi = (float) (Integer.parseInt(editInputSuhu.getText().toString())* 5)/4;
                    txtHasilSuhu.setText(""+hasilConversi);
                } else if (posConversi==3) {
                    hasilConversi = (float) (Integer.parseInt(editInputSuhu.getText().toString())* 9)/4 + 32;
                    txtHasilSuhu.setText(""+hasilConversi);
                }
            }
        });
    }
}