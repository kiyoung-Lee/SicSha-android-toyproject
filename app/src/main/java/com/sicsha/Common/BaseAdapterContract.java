package com.sicsha.Common;

/**
 * Created by KiyoungLee on 2017-06-19.
 */

public interface BaseAdapterContract {

    interface View extends BaseView<BasePresenter> {
        void notifyAdapter();
    }

    interface Model<T>{
        void replaceData(T data);
    }
}
