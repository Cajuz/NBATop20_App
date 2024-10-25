package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapterRanking extends RecyclerView.Adapter<RecycleAdapterRanking.ViewHolder> {
    private Context context;
    private List<InicioActivity> lstranking;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_top20,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloTituloRank.setText(lstranking.get(position).getTitulo());
        holder.idModeloImagemRank.setImageResource(lstranking.get(position).getImagem());
        holder.idModeloNumeracaoRank.setImageResource(lstranking.get(position).getNumeracao());

    }

    @Override
    public int getItemCount() {
        return lstranking.size();
    }


    idModeloTituloRank = itemView.findViewById(R.id.idModeloTituloRank;
    idModeloImagemRank = itemView.findViewById(R.id.idModeloImagemRank);
    idModeloNumeracaoRank = itemView.findViewById(R.id.idModeloNumeracaoRank);

}

