package es.ua.jtech.android.video;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoActivity extends Activity {

	VideoView superficie;
	TextView tiempo;
	Button reproducir, detener;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		superficie = (VideoView)findViewById(R.id.superficie);
		tiempo = (TextView)findViewById(R.id.tiempo);
		reproducir = (Button)findViewById(R.id.reproducir);
		detener = (Button)findViewById(R.id.detener);
		tiempo.setText("Duración 0");

		reproducir.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Habilitar y deshabilitar botones

				// TODO Inicializar la reproducción de video

			}
		});

		// TODO Manejador del evento OnPreparedListener para comenzar
		// la reproducción y poder mostrar la duración del video

		detener.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Habilitar y deshabilitar botones

				// TODO Detener la ejecución del video

				tiempo.setText("Duración 0");
			}
		});
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}