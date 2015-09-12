package com.rabor.transitioneffectdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class RedActivity extends ActionBarActivity {

    private Button redButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

        // Get references to the widget
        redButton = (Button) findViewById(R.id.redButton);

        // Screen Transition animation
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void redButton(View view) {

        switch (view.getId()) {
            case R.id.redButton:
                Intent i = new Intent(this, BlueActivity.class);
                startActivity(i);
        }

    }
}
