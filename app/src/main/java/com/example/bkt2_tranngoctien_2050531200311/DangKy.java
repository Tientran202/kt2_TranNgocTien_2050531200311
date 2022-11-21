package com.example.bkt2_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DangKy extends AppCompatActivity {
    TextView daCotaiKhoan;
    FirebaseFirestore firestore;
    CollectionReference cx ;
    private String ten,tuoi,tendangnhap,matkhau,nhaplaimatkhua;
    taiKhoan taikhoan;
    EditText t,tu,tdn,mk,nlmk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        // anh xa
        daCotaiKhoan= (TextView) findViewById(R.id.daCoTaiKhoannDk);

        daCotaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DangKy.this,MainActivity.class);
                startActivity(i);
            }
        });

        //anh xa 2
        t = (EditText) findViewById(R.id.tenDk);
        tu = (EditText) findViewById(R.id.tuoiDangKy);
        tdn = (EditText)findViewById(R.id.tenDangNhapDK);
        mk = (EditText) findViewById(R.id.matKhauDK);
        nlmk = (EditText) findViewById(R.id.nhapLaiMatKhauDK);


        //
        ten = t.getText().toString();
        tuoi = tu.getText().toString();
        tendangnhap= tdn.getText().toString();
        matkhau = mk.getText().toString();
        nhaplaimatkhua = mk.getText().toString();

        taikhoan = new taiKhoan (ten,tuoi,tendangnhap,matkhau,nhaplaimatkhua);



    }
}