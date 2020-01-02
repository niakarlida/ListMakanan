package id.ac.poliban.mi.nia.listmakanan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makanan = new ArrayList<>();
    private ListView lvMakanan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMakanan = findViewById(R.id.listview);


        makanan.addAll(DataMakanan.getAMakanans());
        adapter = new MakananAdapter(makanan);

        lvMakanan.setAdapter(adapter);

        lvMakanan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Makanan yang anda Pilih ")
                    .setMessage("Anda Memilih : " + makanan.get(position).getNamaMakanan())
                    .setPositiveButton("OK", null).show();
        });

    }
}
