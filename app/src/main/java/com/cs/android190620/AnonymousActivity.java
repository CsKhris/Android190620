package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnonymousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anonymous);

        final TextView display = (TextView) findViewById(R.id.anonydiplay);
        Button btn = (Button) findViewById(R.id.anonybtn);

        /*
        View.OnClickListener eventHandler = new View.OnClickListener(){
            @Override
            public void onClick(View view){
            display.setText("Anonymous Class를 이용한 Event 처리");
            }
        };
        */

        View.OnClickListener eventHandler = (View) -> {
            display.setText("Lambda식을 이용한 Event 처리");
        };
        btn.setOnClickListener(eventHandler);
    }
}
