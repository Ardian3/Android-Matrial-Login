package com.sourcey.materiallogindemo;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class ReadActivity extends AppCompatActivity {
    TextView txtContent,txtFileName;
    ImageView imgAssets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        txtContent = (TextView) findViewById(R.id.tv1);
        txtFileName = (TextView) findViewById(R.id.tv2);
        imgAssets = (ImageView) findViewById(R.id.iv);

        AssetManager assetManager = this.getAssets();

//        try {

//            String[] files=assetManager.list("Files");
//            for (int i = 0; i < files.length; i++) {
//                txtContent.append("\n Files=>" +i+"Name" + files);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        InputStream input;

        try {

            input=assetManager.open("text.txt");

            int size=input.available();

            byte [] buffer=new byte[size];
            input.read(buffer);
            input.close();

            String text=new String(buffer);
            txtFileName.setText(text);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            InputStream in=assetManager.open("love.png");
            Drawable d=Drawable.createFromStream(in, null);
            imgAssets.setImageDrawable(d);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
