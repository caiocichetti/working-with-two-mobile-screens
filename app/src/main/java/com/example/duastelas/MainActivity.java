package com.example.duastelas;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //AVATARES
    Button outra;
    EditText algo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Associar
        outra = (Button)findViewById(R.id.chamaOutra);
        algo = (EditText)findViewById(R.id.algo);
        //Definir eventos de escuta
        outra.setOnClickListener(this);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1)
        {
            if (resultCode==RESULT_OK)
            {
                if (data!=null)
                {
                    String retorno = data.getStringExtra("nomefeio");
                    algo.setText(retorno);
                }
            }
        }
    }
    @Override
    public void onClick(View v) {
        Intent novatela = new Intent(this,Main2Activity.class);
        String algumacoisa = algo.getText().toString();
        novatela.putExtra("nomebonito",algumacoisa);
        startActivityForResult(novatela,1);
    }
}