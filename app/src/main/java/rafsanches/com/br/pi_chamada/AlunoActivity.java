package rafsanches.com.br.pi_chamada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class AlunoActivity extends AppCompatActivity {

    Button presencaAlunoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        presencaAlunoBtn = (Button) findViewById(R.id.alunoPresencaButton);
        final Activity activity = this;

        presencaAlunoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats (IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt ("Camera Scan");
                integrator.setCameraId(0);
                integrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() != null) {
                alert (result.getContents());
            } else {
                alert ("Scan cancelado");
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    private void alert (String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    public void mostrarMaterias (View view) {
        Intent intent = new Intent(this, AlunoMateriasActivity.class);
        startActivity(intent);
    }

    public void mostrarCalendar (View view) {
        Intent intent = new Intent(this, AlunoCalendarActivity.class);
        startActivity(intent);
    }

    public void sair (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
