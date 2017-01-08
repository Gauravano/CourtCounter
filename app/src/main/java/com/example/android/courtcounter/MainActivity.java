package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int scoreTeamA=0,scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void add2a(View view)
    {
            scoreTeamA+=2;
        displayA(scoreTeamA);
    }

    public void add3a(View view)
    {
            scoreTeamA+=3;
        displayA(scoreTeamA);
    }
    public void add1a(View view)
    {
            scoreTeamA+=1;
        displayA(scoreTeamA);
    }
    public void displayA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(" "+score);
    }

    public void add2b(View view)
    {
        scoreTeamB+=2;
        displayB();
    }

    public void add3b(View view)
    {
        scoreTeamB+=3;
        displayB();
    }
    public void add1b(View view)
    {
        scoreTeamB+=1;
        displayB();
    }
    public void displayB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayA(scoreTeamA);
        displayB();
    }
}
