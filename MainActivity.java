package com.example.materialcalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // output text
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;
    private TextView mTextView8;
    private TextView mTextView9;
    private TextView mTextView10;
    private TextView mTextView11;
    private TextView mTextView12;
    private TextView mTextView13;
    private TextView mTextView14;
    private TextView mTextView15;
    private TextView mTextView16;
    private TextView mTextView17;
    private TextView mTextView18;
    private TextView mTextView19;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edittext_text_1);
        mEditText2 = findViewById(R.id.edittext_text_2);
        mEditText3 = findViewById(R.id.edittext_number_1);
        mTextView1 = findViewById(R.id.textview_result1);
        mTextView2 = findViewById(R.id.textview_result2);
        mTextView3 = findViewById(R.id.textview_result3);
        mTextView4 = findViewById(R.id.textview_result4);
        mTextView5 = findViewById(R.id.textview_result5);
        mTextView6 = findViewById(R.id.textview_result6);
        mTextView7 = findViewById(R.id.textview_result7);
        mTextView8 = findViewById(R.id.textview_result8);
        mTextView9 = findViewById(R.id.textview_result9);
        mTextView10 = findViewById(R.id.textview_result10);
        mTextView11 = findViewById(R.id.textview_result11);
        mTextView12 = findViewById(R.id.textview_result12);
        mTextView13 = findViewById(R.id.textview_result13);
        mTextView14 = findViewById(R.id.textview_result14);
        mTextView15 = findViewById(R.id.textview_result15);
        mTextView16 = findViewById(R.id.textview_result16);
        mTextView17 = findViewById(R.id.textview_result17);
        mTextView18 = findViewById(R.id.textview_result18);
        mTextView19 = findViewById(R.id.textview_result19);



        //TextView mTextViewResult = findViewById(R.id.textview_result);
        final Button mButtonCalculate = findViewById(R.id.button_calculate);


        mButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                //variables
                EditText customer = mEditText1;
                EditText board = mEditText2;
                //int sets = Integer.parseInt(mEditText3.getText().toString());
                TextView mTextViewResult = mTextView1;
                String strCustomer = null;
                String strBoard = null;



                // === validate blank inputs =======================================================
                if(mEditText1.length() == 0) {
                    mEditText1.setError("customer name required!");
                }
                if(mEditText2.getText().toString().length() == 0) {
                    mEditText2.setError("board type required!");
                }
               if(mEditText3.getText().length() == 0){
                    mEditText3.setError("incorrect value, try again!");
                    mEditText3.setText("0");
                }
               // === end of validate blank inputs =================================================

                //customer edit text, catches blank error
                if(!(mEditText1.getText().toString().equals("tms"))
                        && (!(mEditText1.getText().toString().equals("set"))
                        && (!(mEditText1.getText().toString().equals("tci"))
                        && (!(mEditText1.getText().toString().equals("toc"))
                        || (mEditText1.getText().toString().length() == 0))))) {
                    mEditText1.setError("customer name required!");
                  //  mEditText1.setText(" ");
                }
                //board type edit text, catches blank error
                if(!(mEditText2.getText().toString().equals("limited")
                || (mEditText2.getText().toString().length() == 0)))
                {
                    mEditText2.setError("board type required!");
                   // mEditText2.setText(" ");

                }

                // amount of sets, catches blank error
                int sets = Integer.parseInt(mEditText3.getText().toString()); //this code helps catch the blank
               if(sets >= 201 || sets <= 0 || mEditText3.getText().length() == 0) {
                   mEditText3.setError("incorrect value, try again!");
                   mEditText3.setText("0");
               }
               if(v.getId() == mButtonCalculate.getId()){
                   strCustomer = mEditText1.getText().toString().toUpperCase();
                  // strCustomer = strCustomer.toUpperCase();
                   strBoard = mEditText2.getText().toString().toUpperCase();
                 //  strBoard = strBoard.toUpperCase();
               }

               // EditText customer = mEditText1;
                //EditText board = mEditText2;


                // === Function calls ==============================================================
                // === for customer and part decision making ======================================
                if((strCustomer.equals("TMS")) && (strBoard.equals("LIMITED"))){

                        TmsLimited(sets);
                }





            }
            void TmsLimited(int numOfSets){
                int       C1424BOX = 22; // endcaps per box
                int       C1431BOX = 20; // sp per box
                int       BUCKETLIMIT = 25; // brackets per bucket
                int       totalRear; // total pieces
                int       totalBoxes; // C1424Box
                int       totalFront; // total pieces
                int       totalSantopreme; //total santopreme
                int       totalSpBoxes; // total boxes of sp
                int	      partialSp; // partial santopreme // previous data type double
                int       totalFrontBuckets; // total buckets  previous data type double
                int       decimalFront; // partial in decimal form // previous data type double
                int       totalRearBuckets; // total bucket // previous data type double
                int       decimalRear; // partial in decimal form // previous data type double
                int       totalEndCaps;
                int       partialEndCaps; //previous data type double
              //  TextView mTextViewResult = mTextView1;
                mTextView1 =  (TextView) findViewById(R.id.textview_result1);
                mTextView2 =  (TextView) findViewById(R.id.textview_result2);
                mTextView3 =  (TextView) findViewById(R.id.textview_result3);
                mTextView4 =  (TextView) findViewById(R.id.textview_result4);
                mTextView5 =  (TextView) findViewById(R.id.textview_result5);
                mTextView6 =  (TextView) findViewById(R.id.textview_result6);
                mTextView7 =  (TextView) findViewById(R.id.textview_result7);
                mTextView8 =  (TextView) findViewById(R.id.textview_result8);
                mTextView9 =  (TextView) findViewById(R.id.textview_result9);
                mTextView10 = (TextView) findViewById(R.id.textview_result10);
                mTextView11 = (TextView) findViewById(R.id.textview_result11);
                mTextView12 = (TextView) findViewById(R.id.textview_result12);
                mTextView13 = (TextView) findViewById(R.id.textview_result13);
                mTextView14 = (TextView) findViewById(R.id.textview_result14);
                mTextView15 = (TextView) findViewById(R.id.textview_result15);
                mTextView16 = (TextView) findViewById(R.id.textview_result16);
                mTextView17 = (TextView) findViewById(R.id.textview_result17);
                mTextView18 = (TextView) findViewById(R.id.textview_result18);
                mTextView19 = (TextView) findViewById(R.id.textview_result19);


                //Calculates total santopreme

                totalSantopreme = 2 * numOfSets; // calculates total sp in pieces
                totalSpBoxes = totalSantopreme / C1431BOX; // calculates santopreme in full boxes
                partialSp = totalSantopreme % C1431BOX; // calculates partial santopreme

                //prints santopreme
                mTextView1.setText("Santopreme Part Number: C1431");
                mTextView2.setText("Total Santopreme: " + totalSantopreme + " pieces");
                mTextView3.setText("Total Santopreme Boxes: " + String.valueOf(totalSpBoxes));
                mTextView4.setText("Partial Box: " + String.valueOf(partialSp));



                // calculates end caps
                totalEndCaps = 4 * numOfSets; // calculates total end caps
                totalBoxes = totalEndCaps / C1424BOX; // calculates end caps in full boxes
                partialEndCaps = totalEndCaps % C1424BOX; // calculates partial end caps

                // prints end caps
                mTextView5.setText("End Cap Part Number: C1424");
                mTextView6.setText("Total End Caps: " + String.valueOf(totalEndCaps));
                mTextView7.setText("Full Boxes: " + String.valueOf(totalBoxes));
                mTextView8.setText("Partial Box: " + String.valueOf(partialEndCaps));


                //Front bracket calculations
                totalFront = 2 * numOfSets; // calculates total rear pieces
                totalFrontBuckets = totalFront / BUCKETLIMIT; // gets total front buckets
                decimalFront = totalFront % BUCKETLIMIT; // gets the partial bucket

                // Prints front brackets
                mTextView9.setText("Bracket Part Nummber: C1420S");
                mTextView10.setText("Total Front Brackets: " + String.valueOf(totalFront));
                mTextView11.setText("Total Front Buckets: " + String.valueOf(totalFrontBuckets) + " Buckets of " + String.valueOf(BUCKETLIMIT));
                mTextView12.setText("Partial Front Bucket: " + String.valueOf(decimalFront));

                //Rear bracket calculations
                totalRear = 4 * numOfSets; // calculates total rear pieces
                totalRearBuckets = totalRear / BUCKETLIMIT; // gets total rear buckets
                decimalRear = totalRear % BUCKETLIMIT; // gets the partial bucket

                //Prints rear brackets
                mTextView13.setText("Total Rear Brackets: " + String.valueOf(totalRear));
                mTextView14.setText("Total Rear Buckets: " + String.valueOf(totalRearBuckets) + " Buckets of " + String.valueOf(BUCKETLIMIT));
                mTextView15.setText("Partial Rear Bucket: " + String.valueOf(decimalRear));
            }


                // turns string to int for computations
               // int num1 = Integer.parseInt(mEditText1.getText().toString());
               // int num2 = Integer.parseInt(mEditText2.getText().toString());

                //calculates
               // int sum= num1 + num2;

                // turns int to a string for display
               // mTextViewResult.setText(String.valueOf(sum));


        });


    }



}
