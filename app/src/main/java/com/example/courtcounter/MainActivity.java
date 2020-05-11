package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A scoring methods
     */

    int scoreA;
    int scoreB;
    int foulA;
    int foulB;

    public void plusFoulA(View view){
        ++foulA;
        displayFoulTeamA(foulA);
    }

    public void goalA(View view){
        ++scoreA;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Fouls for team B
     */
    private void displayFoulTeamA(int foulA){
        TextView foulView = findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(foulA));
    }


    /**
     * Team B scoring methods
     */

    public void plusFoulB(View view){
        ++foulB;
        displayFoulTeamB(foulB);
    }

    public void goalB(View view){
        ++scoreB;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Fouls for team B
     */
    private void displayFoulTeamB(int foulB){
        TextView foulView = findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foulB));
    }

    /**
     * Reset Button
     */

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        foulA = 0;
        foulB = 0;
        TextView scoreViewA = findViewById(R.id.team_a_score);
        TextView scoreViewB = findViewById(R.id.team_b_score);
        TextView foulViewA = findViewById(R.id.team_a_fouls);
        TextView foulViewB = findViewById(R.id.team_b_fouls);
        scoreViewA.setText(String.valueOf(scoreA));
        scoreViewB.setText(String.valueOf(scoreB));
        foulViewA.setText(String.valueOf(foulA));
        foulViewB.setText(String.valueOf(foulB));
    }
}
