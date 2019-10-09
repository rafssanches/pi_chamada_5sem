package rafsanches.com.br.pi_chamada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.journeyapps.barcodescanner.ViewfinderView;

public class MainActivity extends AppCompatActivity {

    private LocationManager locationManager;
    private LocationListener locationListener;

    private static final int REQUEST_CODE_GPS_PERMISSION = 1001;

    EditText et_user, et_pswd;
    Button btn_login, btn_forgot_pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = (Button) findViewById(R.id.loginButton);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged (Location location) {

            }
            @Override
            public void onStatusChanged (String provider, int status, Bundle extras) {

            }
            @Override
            public void onProviderEnabled (String provider) {

            }
            @Override
            public void onProviderDisabled (String provider) {

            }
        };

    }

    @Override
    protected void onStart() {
        super.onStart();
        //a permissão já foi dada?
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            //somente ativa
            //a localização é obtida via hardware, intervalo de 0 segundos e 0 metros entre atualização
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }
        else {
            //permissão ainda não foi dada, solicite ao usuário
            //quando o usuário responder, o método onRequestPermissionResult será chamado
            ActivityCompat.requestPermissions(this, new String []{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_CODE_GPS_PERMISSION);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == REQUEST_CODE_GPS_PERMISSION){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                //permissão concedida, ativar GPS
                if (ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                            0, 0, locationListener);
                }
            }
            else {
                //usuário negou, não ativar GPS
                Toast.makeText(this, getString(R.string.sem_gps), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        locationManager.removeUpdates(locationListener);
    }


    // será chamado ao clicar em Entrar
    public void validar (View view) {
        et_user = (EditText) findViewById(R.id.userEditText);
        et_pswd = (EditText) findViewById(R.id.pswdEditText);
        String user = et_user.getText().toString();
        String pswd = et_pswd.getText().toString();

        Usuario usuario = new Usuario(user, pswd, true);
        //Usuario usuario = new Usuario(user, pswd, false);
        //Usuario usuario = null;

        if (usuario == null){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Usuário ou senha inválido", Toast.LENGTH_SHORT).show();
        }
        else if (usuario.isProfessor()){
            Intent intent = new Intent(this, ProfessorActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Professor reconhecido", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent2 = new Intent(this, AlunoActivity.class);
            startActivity(intent2);
            Toast.makeText(this, "Aluno reconhecido", Toast.LENGTH_SHORT).show();
        }
        System.out.println("user: " + user + "\npswd: " + pswd);
    }
}
