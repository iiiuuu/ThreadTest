package com.example.recyclerview;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThreadActivity extends AppCompatActivity {
    @BindView(R.id.start_btn)
    public Button startBtn;
    @BindView(R.id.number)
    public TextView textView;

    @OnClick(R.id.start_btn)
    void startTime() {
        startBtn.setEnabled(false);
        startBtn.setClickable(false);
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute(10);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        ButterKnife.bind(this);
    }

    public class MyAsyncTask extends AsyncTask<Integer, Integer, Integer> {


        @Override
        protected Integer doInBackground(Integer... params) {
            Integer count = params[0];
            for (int i = 0; i <= count; i++) {
                publishProgress(i);
                SystemClock.sleep(1000);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            String resultString = String.valueOf(values[0]);
            textView.setText(resultString);
        }

        @Override
        protected void onPostExecute(Integer result) {
            startBtn.setEnabled(true);
            startBtn.setClickable(true);
        }

    }
}