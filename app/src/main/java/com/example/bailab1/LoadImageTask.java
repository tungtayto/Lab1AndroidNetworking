package com.example.bailab1;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class LoadImageTask extends AsyncTask<String, Void, Bitmap> {
    private Listener mListener;
    private ProgressDialog progressDialog1;

    public LoadImageTask(Listener listener, Context context){
        mListener = listener;
        progressDialog1 = new ProgressDialog(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog1.setMessage("Downloading Image ...");
        progressDialog1.show();
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        if (progressDialog1.isShowing()){
            progressDialog1.dismiss();
        }

        if (bitmap != null) {
            mListener.onImageLoaded(bitmap);
        } else {
            mListener.onError();
        }
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        try {
            return BitmapFactory.decodeStream((InputStream) new URL(params[0]).getContent());
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
