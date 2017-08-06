package com.beginner.iak.iakview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by santoso on 8/6/17.
 */

public class CustomList extends ArrayAdapter<String>{
    private final Activity con;
    private final String[] nama;
    private final Integer[] imgId;

    public CustomList(Activity con, String[] nama, Integer[] imgId) {
        super(con, R.layout.txt_label, nama);
        this.con = con;
        this.nama = nama;
        this.imgId = imgId;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = con.getLayoutInflater();
        View abc = inflater.inflate(R.layout.txt_label, null);

        ImageView img = (ImageView)abc.findViewById(R.id.gambar);
        TextView txt = (TextView)abc.findViewById(R.id.txt_nama);

        img.setImageResource(imgId[position]);
        txt.setText(nama[position]);

        return abc;
    }

}
