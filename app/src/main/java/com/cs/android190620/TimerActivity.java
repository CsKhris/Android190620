package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    private TextView numdisplay;
    private Button sttbtn;
    private Button stpbtn;

    //Index 변수
    private int idx;

    //Timer 변수
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        numdisplay = (TextView)findViewById(R.id.numdisplay);
        sttbtn = (Button)findViewById(R.id.sttbtn);
        stpbtn = (Button)findViewById(R.id.stpbtn);

        sttbtn.setOnClickListener((view) -> {
            timer = new CountDownTimer(10000, 100) {
                @Override
                public void onTick(long l) {
                    idx = idx + 1;
                    numdisplay.setText(idx + "");
                }
                @Override
                public void onFinish() {
                }
            };
            timer.start();
        });

        stpbtn.setOnClickListener((view) -> {
            if(timer != null){
                timer.cancel();
                timer = null;
            }
        });

        // 구문으로 볼 때는 1부터 10까지 1초 마다 Text View에 출력해야 하지만
        // 실제로는 출력하는 부분은 모두 모아서 한꺼번에 처리 합니다.
        // idx는 1초 마다 1씩 증가하지만 출력은 10초 후에 한꺼번에 10번을 수행합니다.
        // 화면 상에서는 10초 후에 10을 출력하는 것으로 보입니다.

        /*
        try{
            for(int i=0 ; i<10 ; i=i+1) {
                idx = idx + 1;
                Log.e("idx", idx+"");
                numdisplay.setText(idx + "");
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
        */

        /*
        //Timer를 이용
        CountDownTimer timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                idx = idx + 1;
                numdisplay.setText(idx + "");
            }

            @Override
            public void onFinish() {
            }
        };
        timer.start();
        */

    }
}
