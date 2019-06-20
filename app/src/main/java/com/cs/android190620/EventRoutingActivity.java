package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventRoutingActivity extends AppCompatActivity {

    private TextView routeddisplay;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_routing);

        routeddisplay = (TextView)findViewById(R.id.routeddiaplay);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        //Event 처리 객체
        View.OnClickListener router =
                (view)->{
            //Event가 발생한 View를 구분하여 분기문 작성
                if (view == btn1){
                    routeddisplay.setText("Apple Apple");
                }else {
                    routeddisplay.setText("Google Google");
                }
        };
        // 2개의 View에 발생한 Event를 하나의 객체를 가지고 처리
        // 이것을 Event Routing 이라고 합니다.
        btn1.setOnClickListener(router);
        btn2.setOnClickListener(router);
    }
}
