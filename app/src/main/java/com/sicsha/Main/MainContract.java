package com.sicsha.Main;

import com.sicsha.Common.BaseAdapter;
import com.sicsha.Common.BasePresenter;
import com.sicsha.Common.BaseView;

/**
 * Created by kiyoungLee on 2017-10-29.
 */

public interface MainContract {

    interface ActivityView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{

    }
}
