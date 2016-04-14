package com.sourcey.materiallogindemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.FilterReader;



import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.drawable.Drawable.*;

public class LanjutActivity extends ActionBarActivity {
    ImageButton btn_read, btn_view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanjut);
        btn_read = (ImageButton) findViewById(R.id.btnRead);
        btn_view = (ImageButton) findViewById(R.id.btnView);


        btn_read.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(LanjutActivity.this,
                        ReadActivity.class);
                startActivity(myIntent);

            }
        });

        btn_view.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(LanjutActivity.this,
                        ViewActivity.class);
                startActivity(myIntent);

            }
        });
    }
}