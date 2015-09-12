package com.rabor.transitioneffectdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joy on 9/12/2015.
 */
public class YellowActivity extends Activity {

    private Button yellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow);

        // Get references to the widget
        yellowButton = (Button) findViewById(R.id.yellowButton);

        // Screen Transition animation
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void yellowButton(View view) {

        switch (view.getId()) {
            case R.id.yellowButton:
                Intent i = new Intent(this, RedActivity.class);
                startActivity(i);
        }

    }

}
