package id.example.latihan1m2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cdTemp;
    CardView cdMass;
    CardView cdLuas;
    CardView cdJarak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       cdTemp = findViewById(R.id.cdTemp);
       cdMass = findViewById(R.id.cdMass);
       cdLuas = findViewById(R.id.cdLuas);
       cdJarak = findViewById(R.id.cdJarak);
       cdTemp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, ActivityDetailSuhu.class));
           }
            });

       cdMass.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, ActivityDetailMasa.class));
           }
             });

       cdLuas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, ActivityDetailLuas.class));
           }
            });

       cdJarak.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, ActivityDetailJarak.class));
           }
       });
        }
    }