package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity  implements View.OnClickListener {

    Button btnActOne;
    Button btnActTwo;
    Button btnActFour;
    TextView tvView;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActOne = findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btnActFour = findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);

        tvView = findViewById(R.id.name);
        Intent intentName = getIntent();
        String name = intentName.getStringExtra("name");
        tvView.setText("Your name is: " + name);

        Log.d(TAG, "ThirdActivity: onCreate()");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actOne:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.actTwo:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                startActivity(intent2);
                break;
            case R.id.actThree:
                Intent intent3 = new Intent(this, ActivityThree.class);
                startActivity(intent3);
                break;
            case R.id.actFour:
                Intent intent4 = new Intent(this, ActivityFour.class);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnActTwo:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                startActivity(intent2);
                break;
            case R.id.btnActFour:
                Intent intent3 = new Intent(this, ActivityFour.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}
