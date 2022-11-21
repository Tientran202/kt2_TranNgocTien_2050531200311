package com.example.bkt2_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    TextView chuaCoTaiKhoan;

    FirebaseFirestore firestore;
    CollectionReference cx ;
    cayXanh cayXanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        chuaCoTaiKhoan = (TextView) findViewById(R.id.chuaCotaiKhoanDN);
        chuaCoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DangKy.class);
                startActivity(i);
            }
        });
    }
}