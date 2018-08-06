package com.example.jinuk.ht_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class OneActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        setTitle("지역 선택");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng SEOUL = new LatLng(37.56, 126.97);
        mMap.addMarker(new MarkerOptions().position(SEOUL).title("한국의 수도"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_two:
                Toast.makeText(this, "2번쨰로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,TwoActivity.class);
                startActivity(intent);
                break;
            case R.id.action_three:
                Toast.makeText(this, "3번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,ThreeActivity.class);
                startActivity(intent);
                break;
            case R.id.action_four:
                Toast.makeText(this, "4번째로 이동", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,FourActivity.class);
                startActivity(intent);
                break;
        }
        this.finish();
        return true;
    }*/
}