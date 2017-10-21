package com.example.hector.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView album1;
    private TextView album2;
    private TextView album3;
    private TextView album4;

    private int SUBACT_1=345;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void onClick(View v){

        switch (v.getId()){

            case R.id.album1:
                Intent intnt;
                intnt = new Intent(this,MainActivity.class);
                startActivity(intnt);
                break;

            case R.id.album2:
                Intent intnt2;
                intnt2 = new Intent(this,ActivityAlbum2.class);
                startActivity(intnt2);
                break;

            case R.id.album3:
                Intent intnt3;
                intnt3 = new Intent(this,ActivityAlbum3.class);
                startActivity(intnt3);
                break;

            case R.id.album4:
                Intent intnt4;
                intnt4 = new Intent(this,ActivityAlbum4.class);
                startActivity(intnt4);
                break;

        }
    }
}
