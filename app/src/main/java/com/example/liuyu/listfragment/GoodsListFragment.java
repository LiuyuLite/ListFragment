package com.example.liuyu.listfragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Liuyu on 2016/3/19.
 */
public class GoodsListFragment extends ListFragment {

    public void onCreate(Bundle saveInstanceSate){
        super.onCreate(saveInstanceSate);
        getActivity().setTitle("Goods Information");

        goodsInfo = GoodsLab.get(getActivity()).getGoods();

        GoodsAdapter adapter = new GoodsAdapter(goodsInfo);
        setListAdapter(adapter);

    }

    public class GoodsAdapter extends ArrayAdapter<Goods>{
        public GoodsAdapter(ArrayList<Goods> goods){
            super(getActivity(),0,goods);
        }

        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.goodslayout,null);
            }
            Goods g = getItem(position);

            TextView titleTextView = (TextView)convertView.findViewById(R.id.goodstitle);
            titleTextView.setText(g.getName());

            TextView priceTextView = (TextView)convertView.findViewById(R.id.goodsprice);
            priceTextView.setText(" "+g.getPrice());

            Button buyButton = (Button)convertView.findViewById(R.id.confirm);
            buyButton.setEnabled(false);
            return convertView;
        }
    }
    private ArrayList<Goods> goodsInfo;
}
