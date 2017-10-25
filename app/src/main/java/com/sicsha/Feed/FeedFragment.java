package com.sicsha.Feed;

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

public class FeedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.feed_frag, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
