package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Objects;

public class Course1 extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button Done1, Done2, Done3, Done4, Done5, Done6, Done7, Done8, Done9, Done10, Done11, Done12, Done13, Done14, Done15;
    private TextView Class1, Class2, Class3, Class4, Class5, Class6, Class7, Class8, Class9, Class10, Class11, Class12, Class13, Class14, Class15;
    Integer  value,Progression;
    String date, time, session;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1);




        Done1 = findViewById(R.id.btnDone1);
        Done2 = findViewById(R.id.btnDone2);
        Done3 = findViewById(R.id.btnDone3);
        Done4 = findViewById(R.id.btnDone4);
        Done5 = findViewById(R.id.btnDone5);
        Done6 = findViewById(R.id.btnDone6);
        Done7 = findViewById(R.id.btnDone7);
        Done8 = findViewById(R.id.btnDone8);
        Done9 = findViewById(R.id.btnDone9);
        Done10 = findViewById(R.id.btnDone10);
        Done11 = findViewById(R.id.btnDone11);
        Done12 = findViewById(R.id.btnDone12);
        Done13 = findViewById(R.id.btnDone13);
        Done14 = findViewById(R.id.btnDone14);
        Done15 = findViewById(R.id.btnDone15);
        firebaseAuth = FirebaseAuth.getInstance();


        Done2.setEnabled(false);
        Done3.setEnabled(false);
        Done4.setEnabled(false);
        Done5.setEnabled(false);
        Done6.setEnabled(false);
        Done7.setEnabled(false);
        Done8.setEnabled(false);
        Done9.setEnabled(false);
        Done10.setEnabled(false);
        Done11.setEnabled(false);
        Done12.setEnabled(false);
        Done13.setEnabled(false);
        Done14.setEnabled(false);
        Done15.setEnabled(false);



        Done1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Done2.setEnabled(true);
                Done1.setEnabled(false);

                value = 2;

                sendProgressionData();



                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done3.setEnabled(true);
                Done2.setEnabled(false);

                value = 3;

                sendProgressionData();



                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done4.setEnabled(true);
                Done3.setEnabled(false);
                sendProgressionData();

                value = 4;

                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done5.setEnabled(true);
                Done4.setEnabled(false);
                sendProgressionData();

                value = 5;

                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done6.setEnabled(true);
                Done5.setEnabled(false);

                value = 6;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done7.setEnabled(true);
                Done6.setEnabled(false);

                value = 7;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done8.setEnabled(true);
                Done7.setEnabled(false);

                value = 8;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done9.setEnabled(true);
                Done8.setEnabled(false);

                value = 9;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done10.setEnabled(true);
                Done9.setEnabled(false);

                value = 10;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done11.setEnabled(true);
                Done10.setEnabled(false);

                value = 11;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done12.setEnabled(true);
                Done11.setEnabled(false);

                value = 12;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done13.setEnabled(true);
                Done12.setEnabled(false);

                value = 13;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done14.setEnabled(true);
                Done13.setEnabled(false);

                value = 14;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Done15.setEnabled(true);
                Done14.setEnabled(false);

                value = 15;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();

            }
        });

        Done15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Done15.setEnabled(false);

                value = 16;

                sendProgressionData();


                Toast.makeText(Course1.this, "Class Completed ",Toast.LENGTH_SHORT).show();
            }
        });





    }


    private void sendProgressionData(){

        time = "Progression";
        session = "session";

        Progression = value*100/15;

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("KEY", Progression);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = firebaseDatabase.getReference(Objects.requireNonNull(firebaseAuth.getUid()));
        Progression progression = new Progression(Progression);
        myRef.child(session).child(session).child(time).setValue(progression);

    }
}
