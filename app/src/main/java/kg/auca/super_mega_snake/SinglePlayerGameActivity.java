package kg.auca.super_mega_snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SinglePlayerGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_game);
    }

    //TODO: uncomment when DefeatActivity is created
//    public void navWhenLost(View view) {
//        finish();
//        Intent intent = new Intent(this, DefeatGameActivity.class);
//        startActivity(intent);
//    }
}