package com.bachat.helper;

import com.bachat.models.NewsItem;
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
            offerItem.setProductName("Nike");
            offerItem.setDescription("Buy 1 get 1 free on Nike Shoes above 4000");
            offerItem.setEndTime(new Date());
            //offerItem.setShop(100);
            offerItemList.add(offerItem);
        }
        return offerItemList;
    }

    public static List<NewsItem> getOfferNewsItems(int maxNoOfOffer) {
        List<NewsItem> offerNewsFeedItemList = new ArrayList<NewsItem>();
        for (int i = 0; i < maxNoOfOffer; i++) {
            NewsItem offerNewsItem = new NewsItem();
            offerNewsItem.setProductName("Nike");
            offerNewsItem.setOfferDescription("Buy 1 get 1 free on Nike Shoes above 4000");
            offerNewsFeedItemList.add(offerNewsItem);
            offerNewsItem.setOfferId(i);
        }
        return offerNewsFeedItemList;
    }
}
