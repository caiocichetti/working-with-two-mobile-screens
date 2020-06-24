package com.example.duastelas;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    //Avatares
    Button btok,btcancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Associar
        btok=(Button)findViewById(R.id.btok);
        btcancel=(Button)findViewById(R.id.btCancel);
        //Escuta dos eventos
        btok.setOnClickListener(this);
        btcancel.setOnClickListener(this);
        String algodascaolinha = this.getIntent().getStringExtra("nomebonito");
        btok.setText(algodascaolinha);
    }
    @Override
    public void onClick(View v) {
        String oquestanobotao = ((Button)v).getText().toString();
        Intent sacolaretorno = new Intent();
        sacolaretorno.putExtra("nomefeio",oquestanobotao);
        setResult(RESULT_OK,sacolaretorno);
        finish();
    }
}