package es.ua.jtech.android.multimedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AudioActivity extends Activity {

    Button reproducir, pausa, detener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // TODO: inicializar el objeto MediaPlayer

        inicializarBotones();
    }

    private void inicializarBotones() {
        reproducir = (Button)findViewById(R.id.reproducir);
        pausa = (Button)findViewById(R.id.pausa);
        detener = (Button)findViewById(R.id.detener);

        reproducir.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO habilitar los botones Pausa y Detener, deshabilitar el botón Reproducir

                // TODO iniciar la reproducción del clip de audio

            }
        });

        pausa.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO pausar o reanudar la reproducción del audio
                // TODO cambiar el texto del botón a Reanudar o Pausa según corresponda

            }
        });

        detener.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO habilitar el botón Reproducir, deshabilitar los botones Pausa y Detener
                // TODO volver a poner como texto del botón de pausa la cadena Pausa
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // TODO liberar los recursos asociados al objeto MediaPlayer
    }
}
