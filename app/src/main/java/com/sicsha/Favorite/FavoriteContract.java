package com.sicsha.Favorite;

import com.sicsha.Common.BasePresenter;
import com.sicsha.Common.BaseView;
import com.sicsha.Main.MainContract;

/**
 * Created by kiyoungLee on 2017-10-31.
 */

public interface FavoriteContract {

    interface FragmentView extends BaseView<MainContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
