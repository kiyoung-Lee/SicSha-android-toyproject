package com.sicsha.Favorite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sicsha.R;

import butterknife.ButterKnife;

/**
 * Created by kiyoungLee on 2017-10-16.
 */

public class FavoriteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.favorite_frag, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
