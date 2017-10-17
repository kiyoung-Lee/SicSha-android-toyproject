package com.sicsha.Common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

import static android.support.v4.util.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-06-20.
 */

public abstract class BaseRecyclerViewHolder<T,P> extends RecyclerView.ViewHolder {

    public Context context;
    public P presenter;

    public BaseRecyclerViewHolder(Context context, View itemView) {
        super(itemView);
        checkNotNull(context, "Context Is Null");
        this.context = context;
        ButterKnife.bind(this, itemView);
    }

    public void setPresenter(P presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = presenter;
    }

    public void bind(T data) {}

    public void bind(T data, int position) {}
}
