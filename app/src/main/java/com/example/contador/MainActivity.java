package com.example.contador;

import android.os.Bundle;
import 	android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }

    //Method used to increase the counter

    public void increaseCounter(View View){

        counter++;
        showCount();
    }

    //Method used to decrease the counter

    public void decreaseCounter(View View){

        counter--;
        showCount();
    }

    //Method used to restart the counter

    public void resetCounter(View View){

        counter=0;
        showCount();
    }

    public void showCount(){

        TextView countText =(TextView)findViewById(R.id.counter);

        countText.setText("Contador: "+ Integer.toString(counter));
    }
}