package uc.senac.br.bingotombola.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

import uc.senac.br.bingotombola.R;
import uc.senac.br.bingotombola.entities.Cartela;

public class JogarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogar);

        Cartela cartela = sorteiaCartela();

        System.out.println(cartela);
    }

    private Cartela sorteiaCartela() {

        ArrayList<Integer> numerosSorteados = new ArrayList<>();

        while (numerosSorteados.size() < 24){
            Random gerador = new Random();

            Integer numSorteado = (gerador.nextInt(75) + 1);

            if(!numerosSorteados.contains(numSorteado)){
                numerosSorteados.add(numSorteado);
            }
        }

        return new Cartela(numerosSorteados);
    }
}
