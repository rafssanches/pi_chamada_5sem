package rafsanches.com.br.pi_chamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProfessorActivity extends AppCompatActivity {
    TextView professor_nomeTextView;
    TextView professor_matriculaTextView;
    TextView professor_dataTextView;
    CalendarView professor_dataCalendarView;
    Button btn_calendar, btn_listaAlunos, btn_listaMaterias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        btn_calendar = (Button) findViewById(R.id.professor_mostrarCalendarButton);
        btn_listaAlunos = (Button) findViewById(R.id.professor_listaAlunosButton);
        btn_listaMaterias = (Button) findViewById(R.id.professor_listaMateriasButton);
        professor_nomeTextView = (TextView) findViewById(R.id.professor_nomeTextView);
        professor_matriculaTextView = (TextView) findViewById(R.id.professor_matriculaTextView);
        professor_dataTextView = (TextView) findViewById(R.id.professor_dataTextView);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        professor_dataTextView.setText(currentDate);

    }

    public void turma (View view) {
        Intent intent = new Intent(this, ProfessorTurmaActivity.class);
        startActivity(intent);
    }

    public void geraQR (View view){
        Intent intent = new Intent (this, ProfessorQRCodeActivity.class);
        startActivity(intent);
    }

    public void sair (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void mostrarCalendar (View view) {
        Intent intent = new Intent(this, ProfessorActivity.class);
        professor_dataCalendarView = (CalendarView) findViewById(R.id.professor_dataCalendarView);
        professor_dataCalendarView.setVisibility(View.VISIBLE);

        professor_dataTextView = (TextView) findViewById(R.id.professor_dataTextView);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        professor_dataTextView.setText(currentDate);
        startActivity(intent);
    }

    public void telaCalendar (View view) {
        String professorNome = professor_nomeTextView.getText().toString();
        String professorMatricula = professor_matriculaTextView.getText().toString();
        Intent intent = new Intent(this, ProfessorCalendarActivity.class);
        intent.putExtra("professor_nome", professorNome);
        intent.putExtra("professor_matricula", professorMatricula);
        startActivity(intent);
    }
/*
    public void listaMaterias (View view) {
        Intent intent = new Intent(this, ListaMateriasActivity.class);
        startActivity(intent);
    }

    public void listaAlunos (View view) {
        Intent intent = new Intent(this, ItemAlunoActivity.class);
        startActivity(intent);
    }
 */
}
