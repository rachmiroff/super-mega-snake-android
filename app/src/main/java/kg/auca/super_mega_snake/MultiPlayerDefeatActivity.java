package kg.auca.super_mega_snake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MultiPlayerDefeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player_defeat);
    }

    public void onPlayAgainButtonClick(View view) {
        Intent intent = new Intent(this, MultiPlayerGameActivity.class);
        startActivity(intent);
    }

    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
