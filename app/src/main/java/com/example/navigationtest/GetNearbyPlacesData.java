package com.example.navigationtest;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetNearbyPlacesData extends AsyncTask<Object,String, String> {

    String googlePlacesdata;
    GoogleMap mMAP;
    String url;

    @Override
    protected String doInBackground(Object... objects) {
        mMAP = (GoogleMap) objects[0];
        url = (String) objects[1];
        DownloadUrl downloadUrl = new DownloadUrl();
        try {
            googlePlacesdata = downloadUrl.readurl(url);
        } catch (IOException e) {
            Log.d("GooglePlaceReadTask",e.toString());

        }
        return googlePlacesdata;
    }

    @Override
    protected void onPostExecute(String result) {
        Log.d("googleplacedata","onPostExute entered");
        List<HashMap<String,String>>nearbyplaceList = null;
        DataParser dataParser = new DataParser();
        nearbyplaceList = dataParser.parse(result);
        ShowNearbyPlaces(nearbyplaceList);

    }
    private void ShowNearbyPlaces(List<HashMap<String,String>>nearbyPlacesList){
        for (int i = 0;i<nearbyPlacesList.size();i++){
            MarkerOptions markerOptions = new MarkerOptions();
            HashMap<String,String>googlePlace = nearbyPlacesList.get(i);
            double lat = Double.parseDouble(googlePlace.get("lat"));
            double last = Double.parseDouble(googlePlace.get("last"));
            String placeName = googlePlace.get("placeName");
            String vicinity = googlePlace.get(" vicinity");
            LatLng latLng = new LatLng(lat,last);
            markerOptions.position(latLng);
            markerOptions.title(placeName +":"+vicinity);
            mMAP.addMarker(markerOptions);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            //move map camera
            mMAP.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMAP.animateCamera(CameraUpdateFactory.zoomTo(14));

        }
    }
}
