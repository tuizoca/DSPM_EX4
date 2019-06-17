package com.example.dspm_ex4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    int qtd=0;
    float prec = 3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener() {

    }
    public void adicionar(View view){
        TextView textView = findViewById(R.id.qdt);
        qtd++;
        float total=(qtd*prec);
        textView.setText(""+qtd);
        TextView textView1 = findViewById(R.id.tot);
        textView1.setText("Valor total:R$"+total);
    }

    public void remover(View view){
        TextView textView = findViewById(R.id.qdt);
        qtd--
        float total=(qtd*prec);
        textView.setText(""+qtd);
        TextView textView1 = findViewById(R.id.tot);
        textView1.setText("Valor total:R$"+total);
    }

    public void setpreco(View view){
        if(findViewById(R.id.caf1).isSelected() == true){
            prec = 3;
        }
        else if(findViewById(R.id.caf2).isSelected() == true){
            prec = 4;
        }
        else if(findViewById(R.id.caf3).isSelected() == true){
            prec = 5;
        }

    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);

                sendEmail.setType("text/plain");

                String[] addresses = {"cafe.do.ifc.concordia@gmail.com"};
                sendEmail.putExtra(Intent.EXTRA_EMAIL, addresses);


                sendEmail.putExtra(Intent.EXTRA_TEXT, "Olá, quero "+qtd+" café!");


                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Pedido Cafeteria!");

                // Verifica se existe algum app que resolve a intent
                if (sendEmail.resolveActivity(getPackageManager()) != null) {

                    // Inicia a intent
                    startActivity(sendEmail);

                    Log.i("E-mail", "Enviei o intent!");
                }
                Log.i("E-mail", "Botão pressionado!");

            }
        });


    }

}