package rafsanches.com.br.pi_chamada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MateriaAdapter extends RecyclerView.Adapter <MateriaViewHolder> {
    private Context context;
    private List<Materia> materias;

    // construtor
    public MateriaAdapter(Context context, List<Materia> materias) {
        this.context = context;
        this.materias = materias;
    }

    public MateriaViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View raiz = inflater.inflate(
                R.layout.professor_lista_materia,
                parent,
                false
        );
        return new MateriaViewHolder(raiz);
    }
    public void onBindViewHolder (@NonNull MateriaViewHolder holder, int position) {
        Materia materia = this.materias.get(position);
        holder.professor_materiaTV.setText(materia.getNome());
        holder.professor_salaTV.setText(materia.getSala());
        holder.professor_qtdeAlunoTV.setText((materia.getQtdeAluno()));
//        holder.professor_qtdeAlunoTV.setText(materia.getAlunos().size());
        holder.professor_turmasTV.setText(materia.getTurma());
    }
    public int getItemCount() {
        return materias.size();
    }
}
