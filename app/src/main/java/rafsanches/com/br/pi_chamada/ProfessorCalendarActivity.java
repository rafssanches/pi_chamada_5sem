package rafsanches.com.br.pi_chamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfessorCalendarActivity extends AppCompatActivity {
    TextView professor_nomeTextView;
    TextView professor_matriculaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_calendar);
        professor_nomeTextView = (TextView) findViewById(R.id.professor_nomeTextView);
        professor_matriculaTextView = (TextView) findViewById(R.id.professor_matriculaTextView);

        Intent origemIntent = getIntent();
        String professorNome = origemIntent.getStringExtra("professor_nome");
        String professorMatricula = origemIntent.getStringExtra("professor_matricula");
        professor_nomeTextView.setText(professorNome);
        professor_matriculaTextView.setText(professorMatricula);
    }
}
