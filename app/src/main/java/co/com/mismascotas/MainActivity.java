package co.com.mismascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void playCerdo(View view) {
        playSound(R.raw.cerdo);
    }

    public void playGato(View view) {
        playSound( R.raw.gato);
    }

    private void playSound(int resource){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,resource);
        mediaPlayer.start();
    }
}