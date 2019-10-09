package rafsanches.com.br.pi_chamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlunoCalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno_calendar);
    }

    public void sair (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void voltar (View view) {
        Intent intent = new Intent(this, AlunoActivity.class);
        startActivity(intent);
    }
}
