package com.example.myapplication;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    private Button Logout;
    private TextView Course1, Percentatge;
    private FirebaseAuth firebaseAuth;
    DatabaseReference reff;
    String date, time, session, percent;
    Integer progress;
    private ProgressBar prg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Logout = findViewById(R.id.btnLogout);
        Course1 = findViewById(R.id.tvCourse1);
        prg = findViewById(R.id.prgProgress);
        Percentatge = findViewById(R.id.tvPercentage);
        firebaseAuth = FirebaseAuth.getInstance();

        reff = FirebaseDatabase.getInstance().getReference(firebaseAuth.getUid()).child("session").child("session").child("Progression");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                progress = dataSnapshot.child("progreesion").getValue(Integer.class);
                //Toast.makeText(SecondActivity.this, "here " + progress, Toast.LENGTH_SHORT).show();

                prg.setProgress(progress);

                Percentatge.setText(progress.toString() + "% Completed");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });







        Course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Course1.class);
                startActivity(intent);
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendLogoutData();

            }
        });
    }


    private void Logout(){

        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this, MainActivity.class));

    }

    private void sendLogoutData(){

        date = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        //Intent intent = getIntent();

        time= "Logout Time";
        //time = intent.getStringExtra("TIME");
        session = "session";


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = firebaseDatabase.getReference(Objects.requireNonNull(firebaseAuth.getUid()));
        LogoutTime logoutTime = new LogoutTime(date);
        myRef.child(session).child(date).setValue(logoutTime);

        Logout();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.logoutMenu:
                sendLogoutData();

        }
        return super.onOptionsItemSelected(item);
    }
}
