package com.example.contador;

import android.content.res.Configuration;
import android.os.Bundle;
import 	android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Switch;
import 	android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;

    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView countText = (TextView) findViewById(R.id.counter);
    }

    //Method used to manage the orientation change

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    //Method used to increase the counter

    public void increaseCounter(View View) {

        counter++;
        showCount();
    }

    //Method used to decrease the counter

    public void decreaseCounter(View View) {

        counter--;

        Switch switchControl = (Switch) findViewById(R.id.allowNeg);

        boolean allowNegative = switchControl.isChecked();

        if (allowNegative || counter > 0) {

            counter--;

        } else {

            counter = 0;
        }

        showCount();
    }

    //Method used to restart the counter

    public void resetCounter(View View) {

        EditText resetNumber = (EditText) findViewById(R.id.resetNumberInput);

        if (resetNumber.getText().toString().isEmpty()) {
            counter = 0;
        } else {
            counter = Integer.parseInt(resetNumber.getText().toString());
            resetNumber.setText("");

            showCount();

        }
    }
        // Method used to show the count

    public void showCount() {

            TextView countText = (TextView) findViewById(R.id.counter);

            countText.setText(Integer.toString(counter));

    }
}
