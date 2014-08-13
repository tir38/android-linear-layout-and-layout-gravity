package com.tir38.android.gravityTestProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button verticalButton = (Button) findViewById(R.id.vertical_layout_button);
        verticalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, VerticalLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button horizontalButton = (Button) findViewById(R.id.horizontal_layout_button);
        horizontalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, com.tir38.android.gravityTestProject.HorizontalLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button horizontalButtonWithLeftRight = (Button) findViewById(R.id.horizontal_layout_with_left_and_right_layout_gravity_button);
        horizontalButtonWithLeftRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, com.tir38.android.gravityTestProject.HorizontalLayoutWithLeftRightActivity.class);
                startActivity(intent);
            }
        });
    }
}

