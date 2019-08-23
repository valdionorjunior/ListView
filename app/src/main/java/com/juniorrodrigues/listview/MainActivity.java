package com.juniorrodrigues.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Felisburgo", "Guanabara", "Ilheus",
            "Florianopois", "Canadá", "Estados Unidos",
            "Japão", "Tokio", "China", "Hon-kong",
            "Miami", "Florida", "Espanha", "Santa Maria",
            "Rio Claro", "Maria Santissima", "LosAngeles",
            "Acapuco", "Mexico", "SantaCruz de la Maria",
            "OPA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listLocais = findViewById(R.id.listLocais);

        //criando o adapter para lista
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, //contexto, poderia ser o contexto da aplicação aqui
                android.R.layout.simple_list_item_1,//Layout que usaremos para repassar as informaçoes
                android.R.id.text1, //id de dentro do layout (id do textView)
                itens
        );

        //adicionando adaptador a lista
        listLocais.setAdapter(adapter);

        //Adicionando click para recuperrar o item clicado
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() { //criamos um evento de click  e instanciamos o evento de click do adapter dentro dele
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "Click in: "+listLocais.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
