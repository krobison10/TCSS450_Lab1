package edu.uw.tcss450.kylerr10.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

/**
 *
 * public class MainActivity extends AppCompatActivity
 *
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Callback for creation
     * @param savedInstanceState bundle to pass to super to initialize activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Must be called at end of method, R refers to resources xml for the activity
        setContentView(R.layout.activity_main);
        Log.v("Lifecycle Event", "Create");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Lifecycle Event", "Restart");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Lifecycle Event", "Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle Event", "Resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle Event", "Pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle Event", "Stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle Event", "Destroy");

    }
}