package com.rabor.transitioneffectdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joy on 9/12/2015.
 */
public class BlueActivity extends Activity {

    private Button blueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);

        // Get references to the widget
        blueButton = (Button) findViewById(R.id.blueButton);

        // Screen Transition animation
        overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
    }

    public void blueButton(View view) {

        switch (view.getId()) {
            case R.id.blueButton:
                Intent i = new Intent(this, YellowActivity.class);
                startActivity(i);
        }

    }

}
