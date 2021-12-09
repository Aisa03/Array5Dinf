package com.example.array5dinfaisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] nazioni = {"italia","olanda","francia"};
    ListView listaStati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEsegui = (Button)findViewById(R.id.btnEsegui);

        btnEsegui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //azione
                Toast.makeText(getApplicationContext(),"hai premuto il tasto",Toast.LENGTH_LONG).show();
            }
        });

        listaStati = (ListView) findViewById(R.id.lvstati);
        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nazioni);
        listaStati.setAdapter(aaStati);
    }
}