package com.cs.android190620;

import android.view.View;
import android.widget.TextView;

public class ExternEventHandler implements View.OnClickListener {

    private TextView textView;

    // textView를 주입받기 위한 생성자
    // 주입 받고자 하는 Data를 생성자의 매개변수로 만들고,
    // 자신의 Instance 변수에 대입받은 매개변수를 주입
    public ExternEventHandler(TextView textView){
        this.textView = textView;
    }

    // textView에 대한 Property(getter & setter)
    public void setTextView(TextView textView){
        this.textView = textView;
    }

    @Override
    // 매개변수는 Event가 발생한 객체
    public void onClick(View v){
        textView.setText("Extern Class를 이용한 Event 처리");

    }

}
