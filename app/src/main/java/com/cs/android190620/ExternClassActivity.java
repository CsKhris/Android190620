package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ExternClassActivity extends AppCompatActivity {

    private TextView display;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extern_class);

        // View 찾아오기
        display = (TextView)findViewById(R.id.display);
        btn = (Button)findViewById(R.id.btn);

        // Button의 Event 처리 객체를 생성
        ExternEventHandler eventHandler = new ExternEventHandler(display);

        // Event 처리 위임
        btn.setOnClickListener(eventHandler);

    }
}
