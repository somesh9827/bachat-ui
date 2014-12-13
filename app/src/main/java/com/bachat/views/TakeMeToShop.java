package com.bachat.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.bachat.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TakeMeToShop extends Activity {

    private GoogleMap map;

    private static final LatLng CURRENT_LOCATION = new LatLng(12.90000920,
            77.65909080);

    private static final LatLng SHOP_LOCATION = new LatLng(12.90000920,
            77.65909080);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_me_to_shop);
        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        if (map != null) {
            MarkerOptions option = new MarkerOptions();
            option.position(SHOP_LOCATION);
            map.addMarker(new MarkerOptions().position(SHOP_LOCATION).title("Savi Palace"));
            //map.addMarker(new MarkerOptions().position(BROOKLYN_BRIDGE).title("Brooklyn Bridge"));
            map.moveCamera(CameraUpdateFactory.newLatLng(SHOP_LOCATION));
            map.animateCamera(CameraUpdateFactory.zoomTo(14), 400, null);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.take_me_to_shop, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
