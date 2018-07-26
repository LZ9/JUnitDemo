package com.lodz.android.junitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mResultTv;

    private EditText mInputEdit;

    private Button mOkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputEdit = findViewById(R.id.input_edit);
        mOkBtn = findViewById(R.id.ok_btn);
        mResultTv = findViewById(R.id.result_tv);

        mOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mResultTv.setText("result : " + mInputEdit.getText());
            }
        });
    }

}
