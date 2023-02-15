package br.com.etecia.digimonmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView idListaValores;

    String titulo[] = {"Agumon", "Patamon", "Piyomon", "Koromon"};
    String descricao[] = {"Agumon is a Reptile Digimon. It has grown up and become able to walk on two legs, and has an appearance like a tiny dinosaur",
    "Um Digimon Mamífero caracterizado pelas suas grandes orelhas. Consegue utilizá-as como asas e voar, mas, como só vai a uma velocidade de 1 km/h, diz-se que mais lhe vale andar.",
    "um digimon pintainho cujas asas se desenvolveram de modo a parecerem braços.", "Um pequeno Digimon que derramou a penugem que cobria a sua superfície e cujo corpo ficou maior. Ainda é incapaz de lutar."};
    int imagem[] = {R.drawable.agumon, R.drawable.patamon, R.drawable.piyomon, R.drawable.koromon};
    double rating[] = {0.4, 1.0, 2.0, 0.7};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idListaValores = findViewById(R.id.idListaValores);
        Adaptador adapter = new Adaptador();
        idListaValores.setAdapter(adapter);


    }
    public class Adaptador extends BaseAdapter {

        @Override
        public int getCount() {
            return imagem.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
        @SuppressLint("MissingInflatedId")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variaveis do modelo
            TextView DigimonTitulo, DigimonDescricao;
            RatingBar DigimonRating;
            ImageView DigimonImagem;

            //Ligando o modelo com o adaptador
            View v = getLayoutInflater().inflate(R.layout.modelo_digimon, null);


            //Apresentado as variavéis
            DigimonImagem = v.findViewById(R.id.MImagem);
            DigimonTitulo = v.findViewById(R.id.MTitulo);
            DigimonDescricao = v.findViewById(R.id.MDescricao);
            DigimonRating = v.findViewById(R.id.MRating);

            //Inserindo os valores das variáveis do Java
            DigimonTitulo.setText(titulo[i]);
            DigimonImagem.setImageResource(imagem[i]);
            DigimonDescricao.setText(descricao[i]);
            DigimonRating.setRating((float)rating[i]);

            return v;
        }
    }
}

