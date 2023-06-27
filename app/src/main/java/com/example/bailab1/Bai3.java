package com.example.bailab1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Bai3 extends AppCompatActivity implements View.OnClickListener, Listener {
    private ImageView imgLoad;
    private TextView tvMsg;
    private Button btnLoadEx3;
    private static final String IMAGE_URL = "https://ap.poly.edu.vn/images/logo.png";
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        imgLoad = (ImageView) findViewById(R.id.imgLoad);
        tvMsg = (TextView) findViewById(R.id.tvMsg);
        btnLoadEx3 = (Button) findViewById(R.id.btnLoadEx3);

        btnLoadEx3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        new LoadImageTask(this, this).execute(IMAGE_URL);
    }

    @Override
    public void onImageLoaded(Bitmap bitmap) {
        imgLoad.setImageBitmap(bitmap);
        tvMsg.setText("Image Downloaded!");
    }

    @Override
    public void onError() {
        tvMsg.setText("Error download image!");
    }
}