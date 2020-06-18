package youtube.com.vidhvan.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCountDown(View view) {
        EditText editText = findViewById(R.id.sec);
        int seconds = Integer.parseInt(editText.getText().toString());
        Intent countdown_intent = new Intent(AlarmClock.ACTION_SET_TIMER);
        countdown_intent.putExtra(AlarmClock.EXTRA_MESSAGE,"Countdown started");
        countdown_intent.putExtra(AlarmClock.EXTRA_LENGTH,seconds);
        countdown_intent.putExtra(AlarmClock.EXTRA_SKIP_UI,true);

        startActivity(countdown_intent);
    }
}