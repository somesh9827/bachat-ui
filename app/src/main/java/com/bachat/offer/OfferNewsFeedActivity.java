package com.bachat.offer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bachat.R;
import com.bachat.helper.FactoryGirl;
import com.bachat.models.NewsItem;

import java.util.List;

/**
 * Created by somesh.shrivastava on 04/10/14.
 */
public class OfferNewsFeedActivity extends Activity {
    private ListView offerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_news_feed);
        offerList = (ListView)findViewById(R.id.offer_news_feed_list);
        offerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Intent intent = new Intent(adapterView.getContext(),OfferDetailActivity.class);
                intent.putExtra("offer_id",Long.toString(id));
                startActivity(intent);
            }
        });
        List<NewsItem> offersNewsItem = FactoryGirl.getOfferNewsItems(15);
        offerList.setAdapter(new OfferNewsFeedAdapter(offersNewsItem,this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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
