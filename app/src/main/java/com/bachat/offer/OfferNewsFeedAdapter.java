package com.bachat.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bachat.R;
import com.bachat.models.OfferItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by somesh.shrivastava on 04/10/14.
 */
public class OfferNewsFeedAdapter extends BaseAdapter {
    private List<OfferItem> offerItems = Collections.emptyList();
    private Context _context;
    public OfferNewsFeedAdapter(List<OfferItem> offers, Context context) {
        if(offers == null)return;
        _context = context;
        offerItems = new ArrayList<OfferItem>();
        for (int i = 0;i < offers.size();i++) {
            offerItems.add(offers.get(i));
        }
    }

    @Override
    public int getCount() {
        return offerItems.size();

    }

    @Override
    public Object getItem(int i) {
        return offerItems.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(_context).inflate(R.layout.offer_news_feed_list_item,parent,false);
        }
        //convertView = LayoutInflater.from(_context).inflate(R.layout.offer_news_feed_list_item,parent,false);

        TextView offerText =(TextView)convertView.findViewById(R.id.offer_news_feed_list_item_text);
        OfferItem item = (OfferItem)getItem(i);
        offerText.setText(item.getDescription());
        return convertView;
    }
}
