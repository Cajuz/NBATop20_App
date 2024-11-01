package br.com.etecia.myapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InicioActivity extends AppCompatActivity {
    private List<top20> Lsttop20;
    RecyclerView idRecRank;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //carregando os objetos na lista

        Lsttop20 = new ArrayList<>();
        Lsttop20.add( new top20("1","Michael Jordan", R.drawable.mjordan));
        new top20("2","LeBron James", R.drawable.lejames);
        new top20("4","Magic Johnson", R.drawable.magic_johnson);
        new top20("5","Wilt Chamberlain", R.drawable.with);
        new top20("6","Bill Russell", R.drawable.bill);
        new top20("7","Larry Bird", R.drawable.bird);
        new top20("8","Tim Duncan", R.drawable.duncam);
        new top20("9","Oscar Robertson", R.drawable.robertson);
        new top20("10","Kobe Bryant", R.drawable.kobe);
        new  top20("11","Shaquille O’Neal", R.drawable.shaquille);
        new  top20("12","Kevin Durant", R.drawable.durant);
        new  top20("13","Hakeem Olajuwon", R.drawable.olajuwon);
        new  top20("14","Julius Erving", R.drawable.erving);
        new  top20("15","Moses Malone", R.drawable.malone);
        new  top20("16","Stephen Curry", R.drawable.curry);
        new  top20("17","Dirk Nowitzki", R.drawable.nowitizli);
        new  top20("18","Giannis Antetokounmpo", R.drawable.giannis);
        new  top20("19","Jerry West", R.drawable.west);
        new  top20("20","Elgin Baylor", R.drawable.elgin_baylor);
        new  top20("3","Kareem Abdul-Jabbar", R.drawable.karem);
        idRecRank= findViewById(R.id.idRecRank);

//carregando o adaptador
        RecycleAdapterRanking adapterBikeNovas = new RecycleAdapterRanking(getApplicationContext(), Lsttop20);

        idRecRank.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
      idRecRank.setAdapter(adapterBikeNovas);
idRecRank.hasFixedSize();


    }
}