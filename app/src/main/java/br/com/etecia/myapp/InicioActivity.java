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


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

    View view = inflater.inflate(R.layout.inicio_layout, container,false);
    idRecRank = view.findViewById(R.id.idRecRank);

        idRecRank = view.findViewById(R.id.idRecRank);

        //carregando os objetos na lista

        Lsttop20 = new ArrayList<>();
        Lsttop20.add(
                new InicioActivity("1", "Mobilete", R.drawable.mjordan));
        new InicioActivity("2","Da cor Amarela", R.drawable.bicicleta_amarela);
        new InicioActivity("3","Da cor Vermelha", R.drawable.bicicleta_vermelha);
        new InicioActivity("4","Da cor Preta", R.drawable.bicicleta_preta);
        new InicioActivity("5","Da cor Azul", R.drawable.bicicleta_azul);
        new InicioActivity("6","Para Corrida", R.drawable.bicicleta_corrida);
        new InicioActivity("7","De excursão", R.drawable.bicicleta_excursao);
        new InicioActivity("8","Para Morro Baixo", R.drawable.bicicleta_morrobaixo);
        new InicioActivity("9","Para Passeio", R.drawable.bicicleta_passeio);
        new InicioActivity("10","Estilo Retrô", R.drawable.bicicleta_retro);
        new InicioActivity("11","Mobilete", R.drawable.mobilete));
        new InicioActivity("12","Da cor Amarela", R.drawable.bicicleta_amarela);
        new InicioActivity("13","Da cor Vermelha", R.drawable.bicicleta_vermelha);
        new InicioActivity("14","Da cor Preta", R.drawable.bicicleta_preta);
        new InicioActivity("15","Da cor Azul", R.drawable.bicicleta_azul);
        new InicioActivity("16","Para Corrida", R.drawable.bicicleta_corrida);
        new InicioActivity("17","De excursão", R.drawable.bicicleta_excursao);
        new InicioActivity("18","Para Morro Baixo", R.drawable.bicicleta_morrobaixo);
        new InicioActivity("19","Para Passeio", R.drawable.bicicleta_passeio);
        new InicioActivity("20","Estilo Retrô", R.drawable.bicicleta_retro);


//carregando o adaptador
        RecycleAdapterRanking adapterBikeNovas = new RecycleAdapterRanking(getApplicationContext(), Lsttop20);

        idRecRank.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        idRecRank.setAdapter(adapterBikeNovas);


        return view;
    }
}