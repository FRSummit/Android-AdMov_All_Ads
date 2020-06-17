package com.example.coronavirus_howlongdoesittaketorecover;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Chapter1 extends Activity {

//    ListView listView_index;
//    String[] contentList = {
//            "Eastern European Newspapers",
//            "Northern European Newspapers",
//            "Southern European Newspapers",
//            "Western European Newspapers"
//    };

    TextView index_text;

    int[] images = {
            R.drawable.covid_virus,
            R.drawable.covid_virus,
            R.drawable.covid_virus,
            R.drawable.covid_virus
    };

    String[] title = {
            "About Coronavirus",
            "Dealing with Coronavirus",
            "Recover Time",
            "Way To Recover"
    };

    String[] subtitle = {
            "Coronavirus disease (COVID-19) outbreak",
            "How to Handle Coronavirus",
            "How long does it take to recover?",
            "Does it take too much time ?"
    };

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

//        ListAdapter europeanNewspapersListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
//                contentList);
//        listView_index = (ListView) findViewById(R.id.listView_index);
//        listView_index.setAdapter(europeanNewspapersListAdapter);

        index_text = (TextView) findViewById(R.id.index_text);
        index_text.setText("Coronavirus Index");

        lView = (ListView) findViewById(R.id.listView_index);
        lAdapter = new Chapter1_ListAdapter(Chapter1.this, title, subtitle, images);
        lView.setAdapter(lAdapter);
        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(Chapter1.this, title[i] + " " + subtitle[i], Toast.LENGTH_SHORT).show();
                switch (i) {
                    case 0:
                        Intent about_corona = new Intent(Chapter1.this, AboutCoronavirus.class);
                        startActivity(about_corona);
                        break;
                case 1:
                    Intent how_to_handle_corona = new Intent(Chapter1.this, HowToHandleCorona.class);
                    startActivity(how_to_handle_corona);
                    break;
                case 2:
                    Intent recover_time = new Intent(Chapter1.this, RecoverTime.class);
                    startActivity(recover_time);
                    break;
                case 3:
                    Intent recover = new Intent(Chapter1.this, Recover.class);
                    startActivity(recover);
                    break;
                }

            }
        });

    }
}
