package kg.auca.super_mega_snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SinglePlayerAdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_ad);
    }

    public void onCloseAdButtonClick(View view) {
        Intent intent = new Intent(this, SinglePlayerGameActivity.class);
        startActivity(intent);
    }
}