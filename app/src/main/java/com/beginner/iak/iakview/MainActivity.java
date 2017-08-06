package com.beginner.iak.iakview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView list;

    String[] nama = {
            "Real Madrid vs Barcelona",
            "MU vs Chelsea",
            "AC Milan vs Inter Milan"
    };

    Integer[] imgId = {
            R.drawable.laliga,
            R.drawable.bpl,
            R.drawable.seria
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList customList = new CustomList(this, nama, imgId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(customList);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String a = nama[+i];

                Intent intent = new Intent(MainActivity.this, TransactionActivity.class);
                intent.putExtra("nama", a);
                startActivity(intent);

            }
        });
    }
}
