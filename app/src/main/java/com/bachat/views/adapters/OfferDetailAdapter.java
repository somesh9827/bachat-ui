package com.bachat.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bachat.R;
import com.bachat.models.OfferItem;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by somesh.shrivastava on 15/10/14.
 */
public class OfferDetailAdapter extends BaseAdapter {
    private List<OfferItem> offersItems = Collections.emptyList();
    private Context _context;


   public  OfferDetailAdapter(Context context, List<OfferItem> offers){
        _context =  context;
        offersItems = new ArrayList<OfferItem>();
        for (int i = 0;i < offers.size();i++) {
            offersItems.add(offers.get(i));
        }
    }

    @Override
    public int getCount() {
        return offersItems.size();
    }

    @Override
    public Object getItem(int i) {
        return offersItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(_context).inflate(R.layout.offer_detail_list_item,parent,false);
        }
        TextView productName = (TextView)convertView.findViewById(R.id.offer_detail_item_product_name);
        TextView productDescription = (TextView)convertView.findViewById(R.id.offer_detail_item_product_description);
        TextView offerStartTime = (TextView)convertView.findViewById(R.id.offer_detail_item_start_time);
        TextView offerEndTime = (TextView)convertView.findViewById(R.id.offer_detail_item_end_time);
        OfferItem currentOffer = (OfferItem)getItem(i);
        productName.setText(currentOffer.getProductName());
        productDescription.setText(currentOffer.getDescription());
        DateFormat df = DateFormat.getDateTimeInstance();
        df.setTimeZone(TimeZone.getDefault());
        offerStartTime.setText("Offer Starts From : "+df.format(currentOffer.getStartTime()));
        offerEndTime.setText("Offer Valid Till : "+df.format(currentOffer.getEndTime()));

        return convertView;
    }
}
