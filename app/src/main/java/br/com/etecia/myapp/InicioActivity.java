package br.com.etecia.myapp;

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



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

    View view = inflater.inflate(R.layout.inicio_layout, container,false);
    idRecRank = view.findViewById(R.id.idRecRank);

        idRecRank = view.findViewById(R.id.idRecRank);

        //carregando os objetos na lista

        Lsttop20 = new ArrayList<>();
        Lsttop20.add(
                new InicioActivity("1","Michael Jordan", R.drawable.mjordan));
        new InicioActivity("2","LeBron James", R.drawable.lejames);
        new InicioActivity("3","Kareem Abdul-Jabbar", R.drawable.karem);
        new InicioActivity("4","Magic Johnson", R.drawable.magic_johnson);
        new InicioActivity("5","Wilt Chamberlain", R.drawable.with);
        new InicioActivity("6","Bill Russell", R.drawable.bill);
        new InicioActivity("7","Larry Bird", R.drawable.bird);
        new InicioActivity("8","Tim Duncan", R.drawable.duncam);
        new InicioActivity("9","Oscar Robertson", R.drawable.robertson);
        new InicioActivity("10","Kobe Bryant", R.drawable.kobe);
        new InicioActivity("11","Shaquille O’Neal", R.drawable.shaquille);
        new InicioActivity("12","Kevin Durant", R.drawable.bicicleta_amarela);
        new InicioActivity("13","Hakeem Olajuwon", R.drawable.bicicleta_vermelha);
        new InicioActivity("14","Julius Erving", R.drawable.bicicleta_preta);
        new InicioActivity("15","Moses Malone", R.drawable.bicicleta_azul);
        new InicioActivity("16","Stephen Curry", R.drawable.bicicleta_corrida);
        new InicioActivity("17","Dirk Nowitzki", R.drawable.bicicleta_excursao);
        new InicioActivity("18","Giannis Antetokounmpo", R.drawable.bicicleta_morrobaixo);
        new InicioActivity("19","Jerry West", R.drawable.bicicleta_passeio);
        new InicioActivity("20","Elgin Baylor", R.drawable.bicicleta_retro);


//carregando o adaptador
        RecycleAdapterRanking adapterBikeNovas = new RecycleAdapterRanking(getApplicationContext(), Lsttop20);

        idRecRank.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        idRecRank.setAdapter(adapterBikeNovas);


        return view;
    }
}