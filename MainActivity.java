package com.example.android.a7quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Answer = new ArrayList<String>();

    //This variable holds the total score of the user.
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This Method is to control RadioButtons in Question [1]
     * radioButton12 The button number2 in Question[1] ans 25.
     * Q1: boolean to concure whether answer of question true or false
     * */
    boolean Q1;

    public void radioButtonQ1(View view) {

        //If RadioButton(in Question[1]) was checked.
        RadioButton radioButton12 = (RadioButton) findViewById(R.id.rb_q12_25);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.rb_q11_13);
        RadioButton radioButton13 = (RadioButton) findViewById(R.id.rb_q13_20);

        switch (view.getId()) {
            case R.id.rb_q12_25:
                if (radioButton12.isChecked())
                    Q1 = true;
                break;

            case R.id.rb_q11_13:
                if (radioButton11.isChecked())
                    Q1 = false;
                break;
            case R.id.rb_q13_20:
                if (radioButton13.isChecked())
                    Q1 = false;
                break;
        }
    }

    /**
     * This Method is to control Radiobuttons in Question [2].
     * Q2: boolean to concure whether answer of question true or false.
     */
    boolean Q2;

    public void radioButtonQ2(View view) {

        //If RadioButton(in Question[2]) was Checked.
        RadioButton radioButton23 = (RadioButton) findViewById(R.id.rb_q23_1945);
        RadioButton radioButton21 = (RadioButton) findViewById(R.id.rb_q21_1939);
        RadioButton radioButton22 = (RadioButton) findViewById(R.id.rb_q22_1940);

        switch (view.getId()) {
            case R.id.rb_q23_1945:
                if (radioButton23.isChecked())
                    Q2 = true;
                break;
            case R.id.rb_q21_1939:
                if (radioButton21.isChecked())
                    Q2 = false;
                break;
            case R.id.rb_q22_1940:
                if (radioButton22.isChecked())
                    Q2 = false;
                break;
        }


    }

    /**
     * This Method is to control CheckBoxes in Question [3].
     * Q3: boolean to concure whether answer of question true or false.
     */
    boolean Q3;

    public void CheckBoxesQ3(View view) {

        //If the Right CheckBox(es) in Question[3] are checked.
        CheckBox checkBox31 = (CheckBox) findViewById(R.id.cb_q31_england);
        CheckBox checkBox32 = (CheckBox) findViewById(R.id.cb_q32_finland);
        CheckBox checkBox33 = (CheckBox) findViewById(R.id.cb_q33_scotland);
        CheckBox checkBox34 = (CheckBox) findViewById(R.id.cb_q34_wales);

        switch (view.getId()) {

            case R.id.cb_q31_england:
                if (checkBox31.isChecked()) {
                    Answer.add("England");
                } else if (checkBox31.isPressed()) {
                    Answer.remove("England");
                    checkBox31.setChecked(false);
                }
                break;
            case R.id.cb_q33_scotland:
                if (checkBox33.isChecked()) {
                    Answer.add("Scotland");
                } else if (checkBox33.isPressed()) {
                    Answer.remove("Scotland");
                    checkBox33.setChecked(false);
                }
                break;
            case R.id.cb_q34_wales:
                if (checkBox34.isChecked()) {
                    Answer.add("Wales");
                } else if (checkBox34.isPressed()) {
                    Answer.remove("Wales");
                    checkBox34.setChecked(false);
                }
                break;
            case R.id.cb_q32_finland:
                if (checkBox32.isChecked()) {
                    Answer.add("Finland");
                } else {
                    Answer.remove("Finland");
                    checkBox32.setChecked(false);
                }
                break;
        }
        if (Answer.contains("Finland")) {
            Q3 = false;
        } else if (Answer.contains("England") && Answer.contains("Scotland") && Answer.contains("Wales") && !Answer.contains("Finland")) {
            Q3 = true;
        }


    }

    /**
     * This Method is to control RadioButtons in Question [4].
     * Q4: boolean to concure whether answer of question true or false.
     */
    boolean Q4;

    public void RadioButtonQ4(View view) {

        //If RadioButton(2) was checked.
        RadioButton raidoButton42 = (RadioButton) findViewById(R.id.rb_q42_LasseHallstrom);
        RadioButton radioButton41 = (RadioButton) findViewById(R.id.rb_q41_richardGere);

        switch (view.getId()) {
            case R.id.rb_q42_LasseHallstrom:
                if (raidoButton42.isChecked())
                    Q4 = true;
                break;
            case R.id.rb_q41_richardGere:
                if (radioButton41.isChecked())
                    Q4 = false;
                break;
        }
    }

    /**
     * This Method is to control RadioButtons in Question [5].
     * Q5: boolean to concure whether answer of question true or false.
     */
    boolean Q5;

    public void RadioButtonQ5(View view) {

        //If RadioButton(2) was checked.
        RadioButton radioButton52 = (RadioButton) findViewById(R.id.rb_q52_okay);
        RadioButton radioButton51 = (RadioButton) findViewById(R.id.rb_q51_always);
        switch (view.getId()) {
            case R.id.rb_q52_okay:
                if (radioButton52.isChecked())
                    Q5 = true;
                break;
            case R.id.rb_q51_always:
                if (radioButton51.isChecked()) {
                    Q5 = false;
                }
                break;
        }

    }

    /**
     * This Method is to control RadioButtons in Question [6].
     * Q6: boolean to concure whether answer of question true or false.
     */
    boolean Q6;

    public void RadioButtonQ6(View view) {

        //If RadioButton(1) was checked.
        RadioButton radioButton61 = (RadioButton) findViewById(R.id.rb_q61_nicholas);
        RadioButton radioButton62 = (RadioButton) findViewById(R.id.rb_q62_John);

        switch (view.getId()) {
            case R.id.rb_q61_nicholas:
                if (radioButton61.isChecked())
                    Q6 = true;
                break;
            case R.id.rb_q62_John:
                if (radioButton62.isChecked())
                    Q6 = false;
        }

    }

    /**
     * This Method is to control RadioButtons in Question [7].
     * Q7: boolean to concure whether answer of question true or false.
     */
    boolean Q7;

    public void RadioButtonQ7(View view) {

        //If RadioButton(2) was checked.
        RadioButton radioButton72 = (RadioButton) findViewById(R.id.rb_q72_samShepard);
        RadioButton radioButton71 = (RadioButton) findViewById(R.id.rb_q71_AndrewGarfield);

        switch (view.getId()) {
            case R.id.rb_q72_samShepard:
                if (radioButton72.isChecked())
                    Q7 = true;
                break;
            case R.id.rb_q71_AndrewGarfield:
                if (radioButton71.isChecked())
                    Q7 = false;
        }
    }

    /**
     * This Method is called when Submit Button is clicked and shows the user's Result.
     */
    public void submitAnswer(View view) {
        Button submit = (Button) findViewById(R.id.btn_submit);
        EditText editText = (EditText) findViewById(R.id.UserName);
        String name = editText.getText().toString();

        if (Q1 == true)
            score++;
        if (Q2 == true)
            score++;
        if (Q3 == true)
            score++;
        if (Q4 == true)
            score++;
        if (Q5 == true)
            score++;
        if (Q6 == true)
            score++;
        if (Q7 == true)
            score++;

        Context context = getApplicationContext();
        CharSequence grade = name + ", You Got " + score + "/7";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, grade, duration);
        toast.show();

        // disable the ability to click the Submit Button
        submit.setClickable(false);
    }

}
