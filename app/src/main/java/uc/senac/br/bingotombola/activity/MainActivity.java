package uc.senac.br.bingotombola.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uc.senac.br.bingotombola.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoJogar = findViewById(R.id.jogarButton);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jogarIntent = new Intent(MainActivity.this, JogarActivity.class);
                startActivity(jogarIntent);
            }
        });
    }
}
