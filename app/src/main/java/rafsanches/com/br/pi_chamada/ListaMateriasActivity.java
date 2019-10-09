package rafsanches.com.br.pi_chamada;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rafsanches.com.br.pi_chamada.R;

public class ListaMateriasActivity extends AppCompatActivity {

    private ListView materiasListView;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lista_materias);
//        Intent origemIntent = getIntent();
//        String nomeFila = origemIntent.getStringExtra("nome_fila");
//        List <Chamado> chamados = buscaChamados(nomeFila);
//        chamadosListView = findViewById(R.id.chamadosListView);
//        /*ArrayAdapter <Chamado> adapter =
//                new ArrayAdapter<>(
//                        this,
//                        android.R.layout.simple_list_item_1,
//                        chamados);*/
//        ChamadoAdapter adapter = new ChamadoAdapter(this, chamados);
//        chamadosListView.setAdapter(adapter);
//        /*chamadosListView.setOnItemClickListener(
//                new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });*/
//        chamadosListView.setOnItemClickListener((
//                adapterView, view, position, id
//        ) -> {
//            Chamado chamadoSelecionado = chamados.get(position);
//            Intent intent
//                    = new Intent (this,
//                    DetalhesChamadoActivity.class);
//            intent.putExtra(
//                    "chamado_selecionado",
//                    chamadoSelecionado);
//            startActivity(intent);
//
//        });
//    }
//
//    public List <Chamado> geraListaChamados (){
//        List <Chamado> chamados = new ArrayList<>();
//        chamados.add(
//                new Chamado (
//                        new Fila ("Desktops",
//                                R.drawable.ic_computer_black_24dp),
//                        "Computador da secretária quebrado",
//                        new Date(),
//                        null,
//                        "Aberto"
//
//                )
//        );
//        chamados.add(new Chamado (
//                new Fila ("Telefonia",
//                        R.drawable. ic_phone_in_talk_black_24dp ),
//                "Telefone não funciona.",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Redes",
//                        R.drawable. ic_network_check_black_24dp ),
//                "Manutenção no proxy.",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Servidores", R.drawable. ic_poll_black_24dp ),
//                "Lentidão generalizada.",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Novos Projetos",
//                        R.drawable. ic_new_releases_black_24dp ),
//                "CRM",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Novos Projetos",
//                        R.drawable. ic_new_releases_black_24dp ),
//                "Gestão de Orçamento",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Redes",
//                        R.drawable. ic_network_check_black_24dp ),
//                "Internet com lentidão",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (
//                new Fila ("Novos Projetos",
//                        R.drawable. ic_new_releases_black_24dp ),
//                "Chatbot",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        chamados.add(new Chamado (new Fila ("Novos Projetos",
//                R.drawable. ic_new_releases_black_24dp ),
//                "Chatbot",
//                new Date(),
//                null,
//                "Aberto")
//        );
//        return chamados;
//    }

    public List<String> geraListaMaterias(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Sistemas Distribuídos e Computação em Nuvem");
        lista.add("Arquitetura de Sistemas e Soluções de Tecnologia da Informação");
        lista.add("Desenvolvimento Mobile e Internet das Coisas");
        lista.add("Projeto Interdisciplinar 3B");
        lista.add("Desenvolvimento Web");
        lista.add("Algorítimos e Estrutura de Dados");
        return lista;
    }

//    public List <Chamado> buscaChamados (String chave){
//        List <Chamado> resultado = new ArrayList<>();
//        if (chave == null || chave.isEmpty())
//            return resultado;
//        for (Chamado chamado: geraListaChamados()){
//            if (chamado.getFila().getNome().toLowerCase().contains(chave.toLowerCase()))
//                resultado.add(chamado);
//        }
//        return resultado;
//    }
}
