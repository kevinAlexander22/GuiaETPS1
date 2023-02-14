package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etVal1;
    Button btnCalculo;
   TextView twIncremento,twDecremento,twDuplicado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etVal1=findViewById(R.id.edtValor1);
        twIncremento=findViewById(R.id.txvIncremento);
        twDecremento=findViewById(R.id.txvDecre);
        twDuplicado=findViewById(R.id.txvDuplicado);
    }
    public void Operaciones(View view)
    {
        int dato1,r1,r2,r3;
        dato1=Integer.parseInt(etVal1.getText().toString());
        r1=dato1+77;
        r2=r1-3;
        r3=r2*2;

        twIncremento.setText("El incremento es: "+String.valueOf(r1));
        twDecremento.setText("El Decremento es: "+String.valueOf(r2));
        twDuplicado.setText("El Duplicado es: "+String.valueOf(r3));

    }
}