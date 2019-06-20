package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InnerClassActivity extends AppCompatActivity {

    private TextView innerdisplay;
    private Button innerbtn;

    //내부 Class(Inner Class)를 만들면 외부 Class(Extern Class)의 Instance 변수를 사용 가능 합니다.
    class InnerEventHandler implements View.OnClickListener{
        public void onClick(View v){
            innerdisplay.setText("Inner Class를 이용한 Event 처리");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);

        innerdisplay = (TextView)findViewById(R.id.innerdiplay);
        innerbtn = (Button)findViewById(R.id.innerbtn);

        InnerEventHandler eventHandler = new InnerEventHandler();
        innerbtn.setOnClickListener(eventHandler);
    }
}
