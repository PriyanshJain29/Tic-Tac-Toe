package com.codewithpriyansh.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayerss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_playerss);

        final EditText playerOne = findViewById(R.id.PlayerOneName);
        final EditText playerTwo = findViewById(R.id.PlayerTwoName);
        final Button startGameButton = findViewById(R.id.StartGameBtn);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOneName = playerOne.getText().toString();
                final String getPlayerTwoName = playerTwo.getText().toString();

                if(getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty())
                {
                    Toast.makeText(getApplication(), "Please enter The Players Name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(AddPlayerss.this, MainActivity.class);
                    intent.putExtra("playerOne", getPlayerOneName);
                    intent.putExtra("playerTwo", getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });


    }
}