package com.bachat.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.bachat.R;
import com.bachat.helpers.FactoryGirl;
import com.bachat.models.OfferItem;
import com.bachat.views.adapters.OfferDetailAdapter;

import java.util.List;

public class OfferDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String offer_id = intent.getStringExtra("offer_id");
        Toast.makeText(OfferDetailActivity.this,offer_id,Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_offer_detail);
        ListView offerList = (ListView)findViewById(R.id.offer_detail_list);
        List<OfferItem> offers = FactoryGirl.getOffers(4);
        offerList.setAdapter(new OfferDetailAdapter(this,offers));
    }

    private  void makeHeader(){

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.offer_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
