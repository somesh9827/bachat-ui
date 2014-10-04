package com.bachat.helper;

import com.bachat.models.OfferItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by somesh.shrivastava on 04/10/14.
 */
public class FactoryGirl {

    public static List<OfferItem> getOffers(int maxNoOfOffers) {
        List<OfferItem> offerItemList = new ArrayList<OfferItem>();
        for(int i = 1; i<= maxNoOfOffers;i++) {
            OfferItem offerItem  = new OfferItem();
            offerItem.setId(i);
            offerItem.setStartTime(new Date());
            offerItem.setProduct_name("Nike");
            offerItem.setDescription("Buy 1 get 1 free on Nike Shoes above 4000");
            offerItem.setEndTime(new Date());
            offerItem.setShopOwnerId(100);
            offerItemList.add(offerItem);
        }
        return offerItemList;
    }
}
