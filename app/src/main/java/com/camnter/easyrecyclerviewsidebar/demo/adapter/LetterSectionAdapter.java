package com.camnter.easyrecyclerviewsidebar.demo.adapter;

import android.widget.TextView;
import com.camnter.easyrecyclerview.holder.EasyRecyclerViewHolder;
import com.camnter.easyrecyclerviewsidebar.demo.base.SectionAdapter;
import com.camnter.easyrecyclerviewsidebar.demo.bean.Contacts;

/**
 * Description：LetterSectionAdapter
 * Created by：CaMnter
 * Time：2016-04-12 23:00
 */
public class LetterSectionAdapter extends SectionAdapter {
    /**
     * Set header logic
     *
     * @param contacts contacts
     * @param headerTv headerTv
     * @param viewHolder viewHolder
     * @param position position
     */
    @Override
    public void setHeaderLogic(Contacts contacts, TextView headerTv, EasyRecyclerViewHolder viewHolder, int position) {
        if (position == 0) {
            this.setHeader(true, headerTv, contacts.getHeader());
        } else {
            Contacts pre = this.getItem(position - 1);
            if (!contacts.getHeader().equals(pre.getHeader())) {
                this.setHeader(true, headerTv, contacts.getHeader());
            } else {
                this.setHeader(false, headerTv, null);
            }
        }
    }
}