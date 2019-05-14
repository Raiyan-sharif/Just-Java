package android.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore=0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void TeamApoint3(View view){
        teamAscore+=3;
        displayForTeamA(teamAscore);
    }
    public void TeamApoint2(View view){
        teamAscore+=2;
        displayForTeamA(teamAscore);
    }
    public void TeamAfreeThrow(View view){
        teamAscore +=1;
        displayForTeamA(teamAscore);
    }


    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void TeamBpoint3(View view){
        teamBScore+=3;
        displayForTeamB(teamBScore);
    }
    public void TeamBpoint2(View view){
        teamBScore+=2;
        displayForTeamB(teamBScore);
    }
    public void TeamBfreeThrow(View view){
        teamBScore +=1;
        displayForTeamB(teamBScore);
    }

    public void scoreReset(View view){
        teamAscore=0;
        teamBScore=0;
        displayForTeamA(teamAscore);
        displayForTeamB(teamBScore);
    }

}
