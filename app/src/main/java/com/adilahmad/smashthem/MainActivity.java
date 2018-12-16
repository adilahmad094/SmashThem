package com.adilahmad.smashthem;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    ImageView button1, button2, button3, button4;
    Button statsButton;
    LottieAnimationView loading, confetti;
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statsButton = (Button)findViewById(R.id.statsButton);
        button1 = (ImageView)findViewById(R.id.button1);
        button2 = (ImageView)findViewById(R.id.button2);
        button3 = (ImageView)findViewById(R.id.button3);
        button4 = (ImageView)findViewById(R.id.button4);

        loading = (LottieAnimationView)findViewById(R.id.loading);
        confetti = (LottieAnimationView)findViewById(R.id.confetti);

        loading.setProgress(0f);

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                loading.setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                loading.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
            }
        }.start();

        final ImageView background = (ImageView)findViewById(R.id.background);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count1 = count1 + 1;
                if(count1 == 5) {
                    Toast.makeText(getApplicationContext(), "Clicked 5 times", Toast.LENGTH_SHORT).show();
                    confetti.setProgress(0f);
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            button1.setVisibility(View.INVISIBLE);
                            button2.setVisibility(View.INVISIBLE);
                            button3.setVisibility(View.INVISIBLE);
                            button4.setVisibility(View.INVISIBLE);
                            confetti.setVisibility(View.VISIBLE);
                            statsButton.setVisibility(View.INVISIBLE);

                        }

                        public void onFinish() {
                            button1.setVisibility(View.VISIBLE);
                            button2.setVisibility(View.VISIBLE);
                            button3.setVisibility(View.VISIBLE);
                            button4.setVisibility(View.VISIBLE);
                            confetti.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.VISIBLE);
                        }
                    }.start();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count2 = count2 + 1;
                if(count2 == 5) {
                    Toast.makeText(getApplicationContext(), "Clicked 5 times", Toast.LENGTH_SHORT).show();
                    confetti.setProgress(0f);
                    new CountDownTimer(2000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            button1.setVisibility(View.INVISIBLE);
                            button2.setVisibility(View.INVISIBLE);
                            button3.setVisibility(View.INVISIBLE);
                            button4.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.INVISIBLE);
                            confetti.setVisibility(View.VISIBLE);

                        }

                        public void onFinish() {
                            button1.setVisibility(View.VISIBLE);
                            button2.setVisibility(View.VISIBLE);
                            button3.setVisibility(View.VISIBLE);
                            button4.setVisibility(View.VISIBLE);
                            confetti.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.VISIBLE);
                        }
                    }.start();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count3 = count3 + 1;
                if(count3 == 5) {
                    confetti.setProgress(0f);
                    Toast.makeText(getApplicationContext(), "Clicked 5 times", Toast.LENGTH_SHORT).show();
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            button1.setVisibility(View.INVISIBLE);
                            button2.setVisibility(View.INVISIBLE);
                            button3.setVisibility(View.INVISIBLE);
                            button4.setVisibility(View.INVISIBLE);
                            confetti.setVisibility(View.VISIBLE);
                            statsButton.setVisibility(View.INVISIBLE);

                        }

                        public void onFinish() {
                            button1.setVisibility(View.VISIBLE);
                            button2.setVisibility(View.VISIBLE);
                            button3.setVisibility(View.VISIBLE);
                            button4.setVisibility(View.VISIBLE);
                            background.setImageResource(R.color.white);
                            confetti.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.VISIBLE);

                        }
                    }.start();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count4 = count4 + 1;
                if(count4 == 5) {
                    Toast.makeText(getApplicationContext(), "Clicked 5 times", Toast.LENGTH_SHORT).show();
                    confetti.setProgress(0f);
                    new CountDownTimer(10000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            button1.setVisibility(View.INVISIBLE);
                            button2.setVisibility(View.INVISIBLE);
                            button3.setVisibility(View.INVISIBLE);
                            button4.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.INVISIBLE);
                            confetti.setVisibility(View.VISIBLE);

                        }

                        public void onFinish() {
                            button1.setVisibility(View.VISIBLE);
                            button2.setVisibility(View.VISIBLE);
                            button3.setVisibility(View.VISIBLE);
                            button4.setVisibility(View.VISIBLE);
                            confetti.setVisibility(View.INVISIBLE);
                            statsButton.setVisibility(View.VISIBLE);
                        }
                    }.start();
                }
            }
        });

        statsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                confetti.setVisibility(View.INVISIBLE);
                loading.setVisibility(View.VISIBLE);
                loading.setProgress(0f);

                new Timer().schedule(
                        new TimerTask() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, StatsActivity.class);
                                intent.putExtra("COUNT1", Integer.toString(count1));
                                intent.putExtra("COUNT2", Integer.toString(count2));
                                intent.putExtra("COUNT3", Integer.toString(count3));
                                intent.putExtra("COUNT4", Integer.toString(count4));
                                startActivity(intent);
                            }
                        },
                        3000
                );
            }
        });
    }
}