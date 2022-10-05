package com.example.app0410;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecinarFrase(View v) {

        TextView frase = findViewById(R.id.textViewFrase);

        String[] frases = {
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",

                "Imagine uma nova história para sua vida e acredite nela.",

                "A amizade desenvolve a felicidade e reduz o sofrimento, duplicando a nossa alegria e dividindo a nossa dor.",
                "Nunca deixe ninguém te dizer que não pode fazer alguma coisa. Se você tem um sonho tem que correr atrás dele. " +
                        "As pessoas não conseguem vencer e dizem que você também não vai vencer. Se você quer uma coisa corre atrás.",

                "Saber encontrar a alegria na alegria dos outros é o segredo da felicidade."
        };
        Random gerador = new Random();
        int indice = gerador.nextInt(frases.length);
        frase.setText(frases[indice]);
    }
}
