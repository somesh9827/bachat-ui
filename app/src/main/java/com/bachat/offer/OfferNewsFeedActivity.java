package com.bachat.offer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        setContentView(R.layout.offer_news_feed);
        offerList = (ListView)findViewById(R.id.offer_news_feed_list);
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
