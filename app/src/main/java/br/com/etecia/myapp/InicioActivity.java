package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InicioActivity extends AppCompatActivity {

    private String titulo;
    private String numeracao;
    private int imagem;

    public InicioActivity(String numeracao, String titulo, int imagem ){
        this.titulo = titulo;
        this.imagem = imagem;
        this.numeracao = numeracao;
}
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNumeracao(){
        return numeracao;
    }

    public void setNumeracao(String numeracao){
        this.numeracao = numeracao;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inicio_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private List<InicioActivity> LstRanking;
    RecyclerView idRecRank;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.inicio_layout, container, false);

        idRecRank = view.findViewById(R.id.idRecRank);

        //carregando os objetos na lista

        LstRanking = new ArrayList<>();
        LstRanking.add(
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



        RecycleAdapterRanking adapterBikeNovas = new RecycleAdapterRanking(getContext(), LstRanking);

        idRecRank.setLayoutManager(new GridLayoutManager(getContext(), 3));

        idRecRank.setAdapter(adapter);


        return view;
    }
}