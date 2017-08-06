package com.beginner.iak.iakview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TransactionActivity extends AppCompatActivity {
    private TextView txtNama;
    private TextView txtJumlah;
    private TextView txtTotal;
    private TextView txtKonfirmasi;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnBuy;

    int harga = 50000, jumlah = 1, totalharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        txtNama = (TextView) findViewById(R.id.txt_nama);
        txtJumlah = (TextView) findViewById(R.id.txt_jumlah);
        txtTotal = (TextView) findViewById(R.id.txt_total);
        txtKonfirmasi = (TextView) findViewById(R.id.txt_konfirmasi);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnBuy = (Button) findViewById(R.id.btn_buy);

        //kondisi pada saat activity aktif
        txtJumlah.setText("" + jumlah);
        txtTotal.setText("Rp. " + harga + ",-");
        txtNama.setText(getIntent().getStringExtra("nama"));

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jumlah == 1){
                    Toast.makeText(getApplicationContext(), "Minimal 1 Tiket !", Toast.LENGTH_SHORT).show();
                } else {
                    jumlah = jumlah - 1;
                    totalharga = jumlah * harga;

                    txtJumlah.setText("" + jumlah);
                    txtTotal.setText("Rp. " + totalharga + ",-");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jumlah == 5){
                    Toast.makeText(getApplicationContext(), "Maksimal 5 Tiket !", Toast.LENGTH_SHORT).show();
                } else {
                    jumlah = jumlah + 1;
                    totalharga = jumlah * harga;

                    txtJumlah.setText("" + jumlah);
                    txtTotal.setText("Rp. " + totalharga + ",-");
                }
            }
        });

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKonfirmasi.setText(
                        "Jadwal pertandingan : " + txtNama.getText() +
                        "\nJumlah Tiket : " +  txtJumlah.getText() +
                        "\nTotal Harga : Rp. " + txtTotal.getText() + ",-"
                );
            }
        });

    }
}
