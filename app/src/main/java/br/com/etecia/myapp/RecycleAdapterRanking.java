package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapterRanking extends RecyclerView.Adapter<RecycleAdapterRanking.ViewHolder> {
    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView idModeloTituloRank;
        TextView idModeloNumeracaoRank;
        ImageView idModeloImagemRank;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idModeloTituloRank = itemView.findViewById(R.id.idModeloTituloRank);
            idModeloImagemRank = itemView.findViewById(R.id.idModeloImagemRank);
            idModeloNumeracaoRank = itemView.findViewById(R.id.idModeloNumeracaoRank);
        }
    }
    //variaveis que representam a lista e o contexto
    private Context context;
    private List<top20> lsttop20;

    //crianco o construtor
    public RecycleAdapterRanking(Context context, List<top20> lsttop20) {
        this.context = context;
        this.lsttop20=lsttop20;
    }




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
        holder.idModeloTituloRank.setText(lsttop20.get(position).getTitulo());
        holder.idModeloImagemRank.setImageResource(lsttop20.get(position).getImagem());
        holder.idModeloNumeracaoRank.setText(lsttop20.get(position).getNumeracao());

    }

    @Override
    public int getItemCount() {
        return lsttop20.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        // Criando variavel que representa o xml no java
        CardView idModelosRank;
        ImageView idModeloImagemRank;
        TextView idModeloTituloRank;
        TextView idModeloNumeracaoRank;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //apresentando o java para o xml do modelo
            idModelosRank = itemView.findViewById(R.id.idModelosRank);
            idModeloImagemRank = itemView.findViewById(R.id.idModeloImagemRank);
            idModeloTituloRank = itemView.findViewById(R.id.idModeloTituloRank);
            idModeloNumeracaoRank = itemView.findViewById(R.id.idModeloNumeracaoRank);

        }
    }




}

