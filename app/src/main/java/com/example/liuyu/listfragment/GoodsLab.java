package com.example.liuyu.listfragment;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Liuyu on 2016/3/19.
 */
public class GoodsLab {

    private  ArrayList<Goods> goodsInfo;
    private static GoodsLab glab;
    private Context mApplication;

    public GoodsLab(Context application){
        mApplication = application;
        goodsInfo = new ArrayList<Goods>();
        for(int i=0; i<20; i++){
            Goods g = new Goods();
            g.setName("Good#"+i);
            g.setPrice(i);
            goodsInfo.add(g);
        }
    }

    public ArrayList<Goods> getGoods(){return goodsInfo;}

    public Goods getGood(UUID id){
        for(Goods g : goodsInfo){
            if(g.getId().equals(id)){
                return g;
            }
        }
        return null;
    }

    public static GoodsLab get(Context c){
        if(glab == null){
            glab = new GoodsLab(c.getApplicationContext());
        }
        return glab;
    }
}
