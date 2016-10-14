package com.example.android.fuzzymaths;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**Created by Admin on 2016/10/12. */
public class quizz extends Activity {
    Button Interact;
    RadioGroup Rg;
    RadioButton rA,rB,rC;
    TextView xtra;
    int pos = 0;

    String opt[] = {"DenverSquare","Braamcenter","CenterField","8","6","3"};
    public static final String questions [] = {"What was the name of testing center?","How many learner's driving test did you take at this center"};
    public static final String answers []  = {"CenterField","3"};


    public static int RightAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizz);


      xtra  = (TextView) findViewById(R.id.Questions);
      Interact = (Button)findViewById(R.id.Interact);
      Rg = (RadioGroup) findViewById(R.id.Rg);

        rA = (RadioButton)findViewById(R.id.rA);
        rB = (RadioButton)findViewById(R.id.rB);
        rC = (RadioButton)findViewById(R.id.rC);
        //rD = (RadioButton)findViewById(R.id.rD);

        xtra.setText(questions[pos]);
        rA.setText(opt[pos]);
        rB.setText(opt[pos + 1]);
        rC.setText(opt[pos + 2]);
        //rD.setText(opt[pos + 3]);

       Interact.setOnClickListener(new View.OnClickListener(){;
         @Override
       public void onClick(View v) {
             RadioButton selectdradio = (RadioButton) findViewById(Rg.getCheckedRadioButtonId());
             String selectradioText = selectdradio.getText().toString();

           if(selectradioText == answers[pos]){
             RightAnswer++;

           }
          pos++;
             if(pos < questions.length){
                 xtra.setText(questions [pos]);
                 rA.setText(opt[pos* 3]);
                 rB.setText(opt[pos*3 + 1]);
                 rC.setText(opt[pos*3 + 2]);
                 //rD.setText(opt[pos*3 + 3]);
              }
                 else{
                Intent out = new Intent(quizz.this,results.class);
                startActivity(out);
             }
         }
      });
   }
}