package com.adilahmad.smashthem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    TextView count1, count2, count3, count4, textView;
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        textView = (TextView)findViewById(R.id.textView3);
        count1 = (TextView)findViewById(R.id.count1);
        count2 = (TextView)findViewById(R.id.count2);
        count3 = (TextView)findViewById(R.id.count3);
        count4 = (TextView)findViewById(R.id.count4);
        backbutton = (Button)findViewById(R.id.playagain);

        count1.setText(getIntent().getStringExtra("COUNT1"));
        count2.setText(getIntent().getStringExtra("COUNT2"));
        count3.setText(getIntent().getStringExtra("COUNT3"));
        count4.setText(getIntent().getStringExtra("COUNT4"));

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        int c1 = Integer.parseInt(count1.getText().toString());
        int c2 = Integer.parseInt(count2.getText().toString());
        int c3 = Integer.parseInt(count3.getText().toString());
        int c4 = Integer.parseInt(count4.getText().toString());

        if(c1>4 || c2>4 || c3>4 ||c4>4)
            textView.setText("SMASHED!");
        else
            textView.setText("Try to get a 5");
    }
}

