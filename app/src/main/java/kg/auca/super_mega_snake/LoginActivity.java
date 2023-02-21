package kg.auca.super_mega_snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onSelectButtonClick(View view) {
        //TODO(Uncomment this part when MultiPlayerGameActivity will added.)
        //Intent intent = new Intent(this, MultiPlayerGameActivity.class);
        //startActivity(intent);

        //TODO(Remove this when MultiPlayerGameActivity will added.)
        Toast.makeText(this, "MultiPlayerGameActivity is not ready yet", Toast.LENGTH_SHORT).show();
    }

    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}