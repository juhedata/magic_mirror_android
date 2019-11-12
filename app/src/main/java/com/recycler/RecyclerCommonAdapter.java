/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.recycler;

import android.content.Context;
import android.view.LayoutInflater;


import com.recycler.base.ItemViewDelegate;
import com.recycler.base.ViewHolder;

import java.util.List;

/**
 * Created by zhy on 16/4/9.
 */
public abstract class RecyclerCommonAdapter<T> extends MultiItemTypeAdapter<T> {
    protected Context mContext;
    protected int mLayoutId;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    protected  int mType;

    public RecyclerCommonAdapter(final Context context, final int layoutId, List<T> datas) {
        super(context, datas);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mLayoutId = layoutId;
        mDatas = datas;

        addItemViewDelegate(new ItemViewDelegate<T>() {
            @Override
            public int getItemViewLayoutId() {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position) {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position) {
                RecyclerCommonAdapter.this.convert(holder, t, position);
            }
        });
    }

    public RecyclerCommonAdapter(final Context context, final int layoutId, List<T> datas, int type) {
        super(context, datas,type);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mLayoutId = layoutId;
        mDatas = datas;
        mType=type;
        addItemViewDelegate(new ItemViewDelegate<T>() {
            @Override
            public int getItemViewLayoutId() {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position) {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position) {
                RecyclerCommonAdapter.this.convert(holder, t, position);
            }
        });
    }
    protected abstract void convert(ViewHolder holder, T t, int position);


}
