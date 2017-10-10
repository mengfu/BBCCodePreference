package com.jxkj.bbccode.bbccodepreference.adapter;

import android.media.audiofx.BassBoost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jxkj.bbccode.bbccodepreference.R;
import com.jxkj.bbccode.bbccodepreference.application.GlobalApplication;
import com.jxkj.bbccode.bbccodepreference.entity.SettingsItemMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2017/10/5.
 */

public class ItemMenuAdapter extends BaseAdapter {
    public LayoutInflater mInflater;
    private List<SettingsItemMenu> itemMenus;
    public ItemMenuAdapter(){
        mInflater=LayoutInflater.from(GlobalApplication.getInstance());
        itemMenus= this.getItemMenus();
    }
    @Override
    public int getCount() {
        return itemMenus!=null?itemMenus.size():0;
    }
    @Override
    public Object getItem(int position) {
        return itemMenus.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder _Holder=null;
        if(convertView==null){
            _Holder=new Holder();
            convertView=mInflater.inflate(R.layout.item_menu_layout,null);
            _Holder.item_left_view_img=(ImageView)convertView.findViewById(R.id.item_left_view_img);
            _Holder.item_left_view_title=(TextView)convertView.findViewById(R.id.item_left_view_title);
            convertView.setTag(_Holder);
        }else{
            _Holder=(Holder)convertView.getTag();
        }
        _Holder.item_left_view_img.setImageResource(itemMenus.get(position).getLeftIcon());
        _Holder.item_left_view_title.setText(itemMenus.get(position).getTitle());
        return convertView;
    }
    private static class Holder{
        ImageView item_left_view_img;
        TextView item_left_view_title;
    }
    public  List<SettingsItemMenu> getItemMenus(){
        List<SettingsItemMenu> menus=new ArrayList<SettingsItemMenu>();
        menus.add(new SettingsItemMenu(R.drawable.icon_zhanghaoxinxi,"账号信息"));
        menus.add(new SettingsItemMenu(R.drawable.icon_wodeguanzhu,"我的关注"));
        menus.add(new SettingsItemMenu(R.drawable.icon_shoucang,"我的收藏"));
        menus.add(new SettingsItemMenu(R.drawable.icon_yijianfankui,"意见反馈"));
        menus.add(new SettingsItemMenu(R.drawable.icon_shezhi,"设置"));
        return  menus;
    }
}
