package com.example.bailab1;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public interface Listener {
    void onImageLoaded(Bitmap bitmap);

    void onError();
}
