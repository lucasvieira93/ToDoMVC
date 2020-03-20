package com.lucasvieira93.todomvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.campoTexto = findViewById(R.id.campoTextoId);
        this.mViewHolder.titulo = findViewById(R.id.titleId);
        this.clearValues();

    }

    private static class ViewHolder {
        EditText campoTexto;
        TextView titulo;
    }

    private void clearValues(){
        this.mViewHolder.campoTexto.setText("");
    }
}
