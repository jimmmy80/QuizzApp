package com.example.android.fuzzymaths;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Admin on 2016/10/13.
 */
public class results extends Activity  {
    TextView bn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.result);
        bn = (TextView) findViewById(R.id.results);
        bn.setText("The final results is " + quizz.RightAnswer + "\n " + " Öut of "  + quizz.questions.length);

    }
}
