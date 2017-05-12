package com.example.heiderlopes.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "CicloDeVida";

    private final String PLACAR_CASA = "placarcasa";
    private final String PLACAR_VISITANTE = "placarvisitante";

    private TextView tvPlacarCasa;
    private TextView tvPlacarVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPlacarCasa = (TextView) findViewById(R.id.tvPlacarCasa);
        tvPlacarVisitante = (TextView) findViewById(R.id.tvPlacarVisitante);

        if(savedInstanceState != null) {
            tvPlacarVisitante.setText(savedInstanceState.getString(PLACAR_VISITANTE));
            tvPlacarCasa.setText(savedInstanceState.getString(PLACAR_CASA));
        }
    }

    public void golCasa(View v) {
        int placarAtual = Integer.parseInt(tvPlacarCasa.getText().toString());
        placarAtual++;
        tvPlacarCasa.setText(String.valueOf(placarAtual));;
    }

    public void golVisitante(View v){
        int placarAtual = Integer.parseInt(tvPlacarVisitante.getText().toString());
        placarAtual++;
        tvPlacarVisitante.setText(String.valueOf(placarAtual));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Método OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Método OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Método OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Método OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Método OnDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Método onSaveInstanceState()");
        outState.putString(PLACAR_CASA, (String) tvPlacarCasa.getText());
        outState.putString(PLACAR_VISITANTE, (String) tvPlacarVisitante.getText());
    }
}
