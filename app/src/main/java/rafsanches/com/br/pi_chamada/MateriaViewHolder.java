package rafsanches.com.br.pi_chamada;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import me.dm7.barcodescanner.core.IViewFinder;

public class MateriaViewHolder extends RecyclerView.ViewHolder {
    public TextView professor_materiaTV;
    public TextView professor_salaTV;
    public TextView professor_qtdeAlunoTV;
    public TextView professor_turmasTV;

    public MateriaViewHolder (View raiz) {
        super (raiz);
        this.professor_materiaTV = raiz.findViewById(R.id.professor_materiaTextView);
        this.professor_salaTV = raiz.findViewById(R.id.professor_salaTextView);
        this.professor_qtdeAlunoTV = raiz.findViewById(R.id.professor_qtdeAlunoTextView);
        this.professor_turmasTV = raiz.findViewById(R.id.professor_turmasTextView);
    }

}
