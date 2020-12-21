package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
public final static String EXTRA_REPLY="com.example.twoactivities.extra.Reply";
public EditText mreply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Extra_Message);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
        mreply = findViewById(R.id.editText_second);
    }

    public void returnReply(View view) {
        String reply = mreply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra("EXTRA_REPLY","reply");
        setResult(RESULT_OK,replyIntent);
        finish();

    }
}