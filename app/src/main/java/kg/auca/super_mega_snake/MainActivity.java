package kg.auca.super_mega_snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSinglePlayerButtonClick(View view) {
        Intent intent = new Intent(this, SinglePlayerGameActivity.class);
        startActivity(intent);
    }

    public void onMultiPlayerButtonClick(View view) {
        Intent intent = new Intent(this, MultiPlayerGameActivity.class);
        startActivity(intent);
    }

    public void onHighScoreButtonClick(View view) {
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);
    }
}