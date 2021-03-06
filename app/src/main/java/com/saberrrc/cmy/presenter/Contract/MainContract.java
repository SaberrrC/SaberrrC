package com.saberrrc.cmy.presenter.Contract;


import com.saberrrc.cmy.common.base.BasePresenter;
import com.saberrrc.cmy.common.base.BaseView;

public interface MainContract {
    interface View extends BaseView {
    }

    interface Presenter extends BasePresenter<View> {
    }
}
