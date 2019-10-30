package rafsanches.com.br.pi_chamada;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfessorListaMateriasActivity extends AppCompatActivity {

    private TextView professor_nomeTV;
    private Button btn_voltar, btn_inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_lista_materias);
        Intent origemIntent = getIntent();

        professor_nomeTV = findViewById(R.id.professor_nomeTextView);
        String professorNome = origemIntent.getStringExtra("professor_nome");
        professor_nomeTV.setText(professorNome);

        btn_voltar = findViewById(R.id.professor_voltarButton);
        btn_inicio = findViewById(R.id.professor_inicioButton);

    }

    public void voltar(View view) {
        finish();
    }

    public void inicio (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
