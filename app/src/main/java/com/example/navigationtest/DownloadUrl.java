package com.example.navigationtest;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadUrl {
    public String readurl(String strUrl) throws IOException{
        String data = "";
        InputStream istrem = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(strUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            istrem = urlConnection.getInputStream();
            BufferedReader brr = new BufferedReader(new InputStreamReader(istrem));
            StringBuffer sbr = new StringBuffer();
            String line = "";
            while ((line = brr.readLine())!=null){
                sbr.append(line);
            }
            data = sbr.toString();
            Log.d("DownloderUrl",data.toString());
            brr.close();
        }
        catch (Exception e){
            Log.d("EXPATION",e.toString());
        }finally {
            istrem.close();
            urlConnection.disconnect();
        }
        return data;
    }
}
