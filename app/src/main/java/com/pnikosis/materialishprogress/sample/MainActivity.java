package com.pnikosis.materialishprogress.sample;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.pnikosis.materialishprogress.ProgressWheel;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressWheel progressWheel = (ProgressWheel) findViewById(R.id.progress_wheel);
        final ProgressWheel progressWheelInterpolated = (ProgressWheel) findViewById(R.id.interpolated);
        final ProgressWheel progressWheelLinear = (ProgressWheel) findViewById(R.id.linear);

        Spinner spinnerOptions = (Spinner) findViewById(R.id.spinner_options);
        spinnerOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        progressWheelLinear.setProgress(0.0f);
                        progressWheelInterpolated.setProgress(0.0f);
                        break;
                    case 1:
                        progressWheelLinear.setProgress(0.1f);
                        progressWheelInterpolated.setProgress(0.1f);
                        break;
                    case 2:
                        progressWheelLinear.setProgress(0.25f);
                        progressWheelInterpolated.setProgress(0.25f);
                        break;
                    case 3:
                        progressWheelLinear.setProgress(0.5f);
                        progressWheelInterpolated.setProgress(0.5f);
                        break;
                    case 4:
                        progressWheelLinear.setProgress(0.75f);
                        progressWheelInterpolated.setProgress(0.75f);
                        break;
                    case 5:
                        progressWheelLinear.setProgress(1.0f);
                        progressWheelInterpolated.setProgress(1.0f);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final int defaultBarColor = progressWheel.getBarColor();
        final int defaultWheelColor = progressWheel.getRimColor();

        Spinner colorOptions = (Spinner) findViewById(R.id.spinner_options_color);
        colorOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        progressWheel.setBarColor(defaultBarColor);
                        progressWheelInterpolated.setBarColor(defaultBarColor);
                        progressWheelLinear.setBarColor(defaultBarColor);
                        break;
                    case 1:
                        progressWheel.setBarColor(Color.RED);
                        progressWheelInterpolated.setBarColor(Color.RED);
                        progressWheelLinear.setBarColor(Color.RED);
                        break;
                    case 2:
                        progressWheel.setBarColor(Color.MAGENTA);
                        progressWheelInterpolated.setBarColor(Color.MAGENTA);
                        progressWheelLinear.setBarColor(Color.MAGENTA);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner wheelColorOptions = (Spinner) findViewById(R.id.spinner_options_rim_color);
        wheelColorOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        progressWheel.setRimColor(defaultWheelColor);
                        progressWheelInterpolated.setRimColor(defaultWheelColor);
                        progressWheelLinear.setRimColor(defaultWheelColor);
                        break;
                    case 1:
                        progressWheel.setRimColor(Color.LTGRAY);
                        progressWheelInterpolated.setRimColor(Color.LTGRAY);
                        progressWheelLinear.setRimColor(Color.LTGRAY);
                        break;
                    case 2:
                        progressWheel.setRimColor(Color.GRAY);
                        progressWheelInterpolated.setRimColor(Color.GRAY);
                        progressWheelLinear.setRimColor(Color.GRAY);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}
