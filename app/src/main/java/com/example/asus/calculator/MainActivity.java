package com.example.asus.calculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, divition, multi, minus, plus, equal, clear;
    EditText tx1;
    int a, b, c, d;
    int k ,k1=0,k2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        zero = (Button) findViewById(R.id.btn0);
        divition = (Button) findViewById(R.id.btnD);
        multi = (Button) findViewById(R.id.btnM);
        minus = (Button) findViewById(R.id.btnS);
        plus = (Button) findViewById(R.id.btnA);
        equal = (Button) findViewById(R.id.btnE);
        clear = (Button) findViewById(R.id.btnC);
        tx1 = (EditText) findViewById(R.id.tx);

            one.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("1");

                }
            });
            two.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("2");

                }
            });
            three.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("3");

                }
            });
            four.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("4");

                }
            });
            five.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("5");

                }
            });
            six.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("6");

                }
            });
            seven.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("7");

                }
            });
            eight.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("8");

                }
            });
            nine.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("9");

                }
            });
            zero.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tx1.append("0");
                }

            });

            plus.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    try {
                        a = 1;
                        if (a == 1) {
                            k1 = Integer.parseInt((String.valueOf(tx1.getText())));
                        }
                        tx1.setText("+");
                        tx1.setText("");
                    }
                    catch (Exception e1){
                        tx1.setText("Math Error Press C");
                    }

                }

            });
            minus.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    try {
                        b = 1;
                        if (b == 1) {
                            k1 = Integer.parseInt((String.valueOf(tx1.getText())));
                        }
                        tx1.setText("-");
                        tx1.setText("");
                    }
                    catch(Exception e2){
                        tx1.setText("Math Error Press C");
                    }

                }

            });

             multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    c = 1;
                    if (c == 1) {
                        k1 = Integer.parseInt((String.valueOf(tx1.getText())));
                    }
                    tx1.setText("*");
                    tx1.setText("");
                }
                catch(Exception e3){
                    tx1.setText("Math Error Press C");
                }

            }

        });
            divition.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    d = 1;
                    if (d == 1) {
                        k1 = Integer.parseInt((String.valueOf(tx1.getText())));
                    }
                    tx1.setText("/");
                    tx1.setText("");
                }
                catch(Exception e4){
                    tx1.setText("Math Error Press C");
                }

            }

        });

            clear.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    k1 = 0;
                    k2 = 0;
                    a = 0;
                    b = 0;
                    c = 0;
                    d = 0;
                    tx1.setText("");

                }

            });

            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    int s = 1;
                    try {
                        if (s == 1 && a == 1) {
                            k2 = Integer.parseInt(String.valueOf((tx1.getText())));
                            k = k1 + k2;
                            tx1.setText(k1 + " " + "+" + " " + k2 + " = " + k);
                            Toast.makeText(MainActivity.this, "Result is::" + " " + (k), Toast.LENGTH_SHORT).show();

                        }
                        else if (s == 1 && b == 1) {
                            k2 = Integer.parseInt(String.valueOf((tx1.getText())));
                            k = k1 - k2;
                            if (k == 0) {
                                tx1.setText(k1 + " " + "-" + " " + k2 + " = " + k);
                            } else if (k < 0) {
                                tx1.setText(k1 + " " + "-" + " " + k2 + " = " + "-" + k);
                            } else {
                                tx1.setText(k1 + " " + "-" + " " + k2 + " = " + k);
                            }
                            Toast.makeText(MainActivity.this, "Result is::" + " " + (k), Toast.LENGTH_SHORT).show();


                        } else if (s == 1 && c == 1) {
                            k2 = Integer.parseInt(String.valueOf((tx1.getText())));
                            k = k1 * k2;
                            if (k == 0) {
                                tx1.setText(k1 + " " + "*" + " " + k2 + " = " + k);
                            } else {
                                tx1.setText(k1 + " " + "*" + " " + k2 + " = " + k);
                            }
                            Toast.makeText(MainActivity.this, "Result is::" + " " + (k), Toast.LENGTH_SHORT).show();

                        }

                        else if (s == 1 && d == 1) {
                                k2 = Integer.parseInt(String.valueOf((tx1.getText())));
                                k = k1 / k2;
                                if (k == 0) {
                                    tx1.setText(k1 + " " + "/" + " " + k2 + " = " + k);
                                } else {
                                    tx1.setText(k1 + " " + "/" + " " + k2 + " = " + k);
                                }
                                Toast.makeText(MainActivity.this, "Result is::" + " " + (k), Toast.LENGTH_SHORT).show();

                            }

                    }
                    catch(ArithmeticException e1){
                        tx1.setText("Math Error");
                        Toast.makeText(MainActivity.this, "Because::" + k1 + "/0", Toast.LENGTH_SHORT).show();
                    }
                    catch (Exception e) {
                        tx1.setText("Math Error");

                    }
                }
            });
    }
}
