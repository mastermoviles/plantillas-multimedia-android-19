package es.ua.eps.video;

import java.io.IOException;

import android.app.Activity;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// TODO: añadir los permisos en el Manifest

// TODO: la clase debe implementar la interfaz SurfaceHolder.Callback
public class VideoActivity extends Activity {

	SurfaceView superficie;
	Button parar, grabar;
	SurfaceHolder m_holder;

	boolean preparado = false;

	// TODO: añadimos un objeto privado MediaRecorder

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		inicializarInterfaz();

		// TODO: inicializamos el objeto mediaRecorder

		// TODO: obtenemos el holder de la superficie y añadimos el manejador

	}

	private void inicializarInterfaz() {
		superficie = (SurfaceView)findViewById(R.id.superficie);
		parar = (Button)findViewById(R.id.parar);
		grabar = (Button)findViewById(R.id.grabar);

		grabar.setOnClickListener(new ManejadorBotonGrabar());
		parar.setOnClickListener(new ManejadorBotonParar());
	}

	private class ManejadorBotonParar implements OnClickListener {
		public void onClick(View v) {
			parar.setEnabled(false);
			grabar.setEnabled(true);

			// TODO: detener la grabación
		}
	};

	private class ManejadorBotonGrabar implements OnClickListener {
		public void onClick(View v) {

			if (preparado) {
				parar.setEnabled(true);
				grabar.setEnabled(false);

				// TODO: iniciar la grabación
			}
		}
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
							   int height) {
	}

	private void configurar(SurfaceHolder holder) {
		// TODO: configurar mediaRecorder
	}

}