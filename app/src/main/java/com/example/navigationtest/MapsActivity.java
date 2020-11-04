package com.example.navigationtest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {


    private GoogleMap mMap;
    Double latitude;
    Double longitude;
    private int PROXIMIT_RADIUS = 3000;
    GoogleApiClient mgoogleApiClient;
    Location mLastloccation;
    Marker mCurrLocationMarker;
    LocationRequest mLocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            checkLocationPermission();
        }
        if (!CheckGooglePlayServices()){
            Log.d("onCreate","Finishing test case singe Google  Play Services are not available");
            finish();
        }
        else {
            Log.d("onCreate","Google Play Services available.");
        }
        SupportMapFragment mapFragment1 = (SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Toast.makeText(MapsActivity.this,"my map is ready",Toast.LENGTH_SHORT).show();



    }


    private boolean CheckGooglePlayServices(){
        GoogleApiAvailability googleApi = GoogleApiAvailability.getInstance();
        int result = googleApi.isGooglePlayServicesAvailable(this);
        if (result != ConnectionResult.SUCCESS){
            if (googleApi.isUserResolvableError(result)){
                googleApi.getErrorDialog(this,result,0).show();
            }
            return false;
        }
        return true;
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED){
                buildGoogleApiClient();
                mMap.setMyLocationEnabled(true);
            }
        }
        else {
            buildGoogleApiClient();
            mMap.setMyLocationEnabled(true);
        }
        Button btnmosjid = findViewById(R.id.mocc);
        btnmosjid.setOnClickListener(new View.OnClickListener() {
            String mosque = "mosque";
            @Override
            public void onClick(View v) {
                Log.d("onClick","Button is Click");
                mMap.clear();
                String url = getUrl(latitude,longitude,mosque);
                Object[]DataTransfer = new Object[2];
                DataTransfer[0] = mMap;
                DataTransfer[1] = url;

                GetNearbyPlacesData getNearbyPlacesData = new GetNearbyPlacesData();
                getNearbyPlacesData.execute(DataTransfer);
                Toast.makeText(MapsActivity.this,"asdlkfjfh",Toast.LENGTH_LONG).show();
            }
        });
        Button btnhospital = findViewById(R.id.Hospitals);
        btnhospital.setOnClickListener(new View.OnClickListener() {
            String hospital= "hospital";
            @Override
            public void onClick(View v) {
                Log.d("onClick","Button is Click");
                mMap.clear();
                String url = getUrl(latitude,longitude,hospital);
                Object[]DataTransfer = new Object[2];
                DataTransfer[0] = mMap;
                DataTransfer[1] = url;
                Log.d("onClick",url);
                GetNearbyPlacesData getNearbyPlacesData = new GetNearbyPlacesData();
                getNearbyPlacesData.execute(DataTransfer);
            }
        });

    }
    protected synchronized void buildGoogleApiClient(){
        mgoogleApiClient = new GoogleApiClient.Builder(this)
        .addConnectionCallbacks(this)
        .addOnConnectionFailedListener(this)
        .addApi(LocationServices.API)
        .build();
        mgoogleApiClient.connect();

    }

    @Override
    public void onLocationChanged(Location location) {
        Log.d("onLocationChanged","entared");
        mLastloccation = location;
        if (mCurrLocationMarker != null){
            mCurrLocationMarker.remove();
        }
        //place Current locatoin marker
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        LatLng latLng = new LatLng(location.getLatitude(),location.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Current position");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mCurrLocationMarker = mMap.addMarker(markerOptions);


       // move map camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        Toast.makeText(MapsActivity.this,"your Current location",Toast.LENGTH_SHORT).show();

        Log.d("onLocation Changed",String.format("latitute:%.3f Location ",latitude,longitude));

        //Stop location updetes
        if (mgoogleApiClient != null){
            LocationServices.FusedLocationApi.removeLocationUpdates(mgoogleApiClient, this);
            Log.d("onLocationupdeteschange","removing location updetes changde");
        }
        Log.d("onLocationChange","Exit");



    }
    @Override
    public void onConnected(@Nullable Bundle bundle) {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(1000);
        mLocationRequest.setFastestInterval(1000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) ==PackageManager.PERMISSION_GRANTED){
            LocationServices.FusedLocationApi.requestLocationUpdates(mgoogleApiClient,mLocationRequest, (com.google.android.gms.location.LocationListener) this);

        }

    }
    private String getUrl(double latitude,double longitude,String nearbyplace){
        StringBuilder googlemapPlaceUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
        googlemapPlaceUrl.append("location="+latitude+","+longitude);
        googlemapPlaceUrl.append("&radius="+PROXIMIT_RADIUS);
        googlemapPlaceUrl.append("&type="+nearbyplace);
        googlemapPlaceUrl.append("&sensor=true");
        googlemapPlaceUrl.append("&key="+"AIzaSyCCsATWo6oHft4JE57FSjlSFRVZ0piZZ40");
        Log.d("getUrl", googlemapPlaceUrl.toString());
        return (googlemapPlaceUrl.toString());
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }
    public static final int MY_PERMISSION_REQUEST_LOCATION =99;
    public boolean checkLocationPermission(){
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
        !=PackageManager.PERMISSION_GRANTED){

            // Asking user if explanation is needed
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)){


                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

                //Prompt the user once explanation has been shown
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSION_REQUEST_LOCATION);
            }
            else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSION_REQUEST_LOCATION);
                Toast.makeText(this,"vule dorte hobe",Toast.LENGTH_LONG).show();
            }
            return false;
        }
            return true;

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case MY_PERMISSION_REQUEST_LOCATION:{
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length>0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            ==PackageManager.PERMISSION_GRANTED){
                        if (mgoogleApiClient == null){
                            buildGoogleApiClient();
                        }
                        mMap.setMyLocationEnabled(true);
                    }
                    else {
                        // Permission denied, Disable the functionality that depends on this permission.
                        Toast.makeText(this,"permission dinaied",Toast.LENGTH_SHORT).show();
                    }
                    return;
                    // other 'case' lines to check for other permissions this app might request.
                    // You can add here other case statements according to your requirement.
                }
            }
        }
    }
}
