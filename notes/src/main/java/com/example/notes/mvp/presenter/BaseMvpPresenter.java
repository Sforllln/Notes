package com.example.notes.mvp.presenter;

import com.example.notes.mvp.view.BaseMvpView;

/**
 * Created by wuming on 16/10/20.
 */

public abstract class BaseMvpPresenter<V extends BaseMvpView> {

    V view;

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        view = null;
    }
}
