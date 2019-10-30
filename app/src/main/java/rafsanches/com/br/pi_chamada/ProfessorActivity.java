package rafsanches.com.br.pi_chamada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ProfessorActivity extends AppCompatActivity {
    private TextView professor_nomeTextView;
    private TextView professor_matriculaTextView;
    private TextView professor_dataTextView;
    private CalendarView professor_dataCalendarView;
    private Button btn_calendar, btn_listarMaterias, btn_sair;

    private RecyclerView materiasRecyclerView;
    private MateriaAdapter adapter;
    private List<Materia> materias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        Intent origemIntent = getIntent();

        professor_nomeTextView = findViewById(R.id.professor_nomeTextView);
        String professorNome = origemIntent.getStringExtra("professor_nome");
        professor_nomeTextView.setText(professorNome);

        btn_sair = findViewById(R.id.professor_sairButton);

        professor_matriculaTextView = findViewById(R.id.professor_matriculaTextView);
        String professorMatricula = origemIntent.getStringExtra("professor_matricula");
        professor_matriculaTextView.setText(professorMatricula);

        professor_dataTextView = findViewById(R.id.professor_dataTextView);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        professor_dataTextView.setText(currentDate);

        materiasRecyclerView = findViewById(R.id.materiasRecyclerView);
        geraListaMaterias();
        materias = new ArrayList<>();
        adapter = new MateriaAdapter(this, materias);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        materiasRecyclerView.setAdapter(adapter);
        materiasRecyclerView.setLayoutManager(llm);

//        materiasRecyclerView.addOnItemTouchListener();


        btn_calendar = findViewById(R.id.professor_mostrarCalendarButton);
        btn_listarMaterias = findViewById(R.id.professor_listaMateriasButton);

    }



    public List <Materia> geraListaMaterias () {
        List<Materia> materias = new ArrayList<>();
        materias.add(
                new Materia(
                        "Arquitetura de Sistemas e Soluções de Tecnologia da Informação",
                        "i03-H",
                        "54 alunos",
                        "CCP3BN-MCB"
                )
        );
        materias.add(
                new Materia(
                        "Desenvolvimento Mobile",
                        "207-C",
                        "30 alunos",
                        "CCP3BN-MCA"
                )
        );
        return materias;
    }





    public void sair (View view) {
        finish();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    }

//    public void mostrarCalendar (View view) {
//        Intent intent = new Intent(this, ProfessorActivity.class);
//        professor_dataCalendarView = (CalendarView) findViewById(R.id.professor_dataCalendarView);
//        professor_dataCalendarView.setVisibility(View.VISIBLE);
//
//        professor_dataTextView = (TextView) findViewById(R.id.professor_dataTextView);
//        Calendar calendar = Calendar.getInstance();
//        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
//
//        professor_dataTextView.setText(currentDate);
//        startActivity(intent);
//    }
/*
    public void nomeEmatricula (String targetClass) throws ClassNotFoundException {
        String professorNome = professor_nomeTextView.getText().toString();
        String professorMatricula = professor_matriculaTextView.getText().toString();
        targetClass = "";
        Intent intent = new Intent(this, Class.forName(targetClass));
        intent.putExtra("professor_nome", professorNome);
        intent.putExtra("professor_matricula", professorMatricula);
    }

 */
    public void mostrarCalendar (View view) throws ClassNotFoundException {
        String professorNome = professor_nomeTextView.getText().toString();
        String professorMatricula = professor_matriculaTextView.getText().toString();
        Intent intent = new Intent(this, ProfessorCalendarActivity.class);
        intent.putExtra("professor_nome", professorNome);
        intent.putExtra("professor_matricula", professorMatricula);
//        nomeEmatricula("ProfessorCalendarActivity");
        startActivity(getIntent());
    }

    public void listarMaterias (View view) {
        String professorNome = professor_nomeTextView.getText().toString();
        String professorMatricula = professor_matriculaTextView.getText().toString();
        Intent intent = new Intent(this, ProfessorListaMateriasActivity.class);
        intent.putExtra("professor_nome", professorNome);
        intent.putExtra("professor_matricula", professorMatricula);
        startActivity(intent);
    }
}
