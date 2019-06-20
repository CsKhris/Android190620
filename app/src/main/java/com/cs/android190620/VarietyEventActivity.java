package com.cs.android190620;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VarietyEventActivity extends AppCompatActivity {

    private LinearLayout mainView;
    private TextView edit;
    private Button hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variety_event);

        mainView = (LinearLayout)findViewById(R.id.mainview);
        edit = (EditText)findViewById(R.id.edit);
        hide = (Button)findViewById(R.id.hide);

        // Keyboard 관리 객체 생성
        final InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        // Button을 눌렀을 때의 Event 처리
        hide.setOnClickListener((view)->{
            imm.hideSoftInputFromWindow(
                    edit.getWindowToken(), 0);
        });

        // Main View 영역을 Touch 했을 때 Event 처리
        mainView.setOnTouchListener((view, event) -> {
            imm.hideSoftInputFromWindow(
                    edit.getWindowToken(), 0);
            return true;
        });
    }
}
