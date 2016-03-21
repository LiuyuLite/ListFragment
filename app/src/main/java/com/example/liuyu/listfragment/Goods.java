package com.example.liuyu.listfragment;

import java.util.UUID;

/**
 * Created by Liuyu on 2016/3/19.
 */
public class Goods {
    private String gName;
    private int gPrice;
    private UUID uuid;

    public Goods(){
        gName="Unk";
        gPrice = 0;
        uuid = UUID.randomUUID();
    }

    public UUID getId(){
        return uuid;
    }
    public void setName(String name){
        gName = name;
    }
    public void setPrice(int price){
        gPrice = price;
    }

    public String getName(){
        return gName;
    }
    public int getPrice(){
        return gPrice;
    }
}
