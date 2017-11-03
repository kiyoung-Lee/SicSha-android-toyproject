package com.sicsha.MyPage;

import com.sicsha.Common.BasePresenter;
import com.sicsha.Common.BaseView;
import com.sicsha.Main.MainContract;

/**
 * Created by kiyoungLee on 2017-10-31.
 */

public interface MyPageContract {

    interface FragmentView extends BaseView<MainContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
