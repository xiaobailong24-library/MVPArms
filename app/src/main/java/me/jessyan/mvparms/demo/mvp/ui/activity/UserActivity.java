package me.jessyan.mvparms.demo.mvp.ui.activity;

import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;

import butterknife.BindView;
import me.jessyan.mvparms.demo.R;
import me.jessyan.mvparms.demo.mvp.ui.fragment.UserFragment;


public class UserActivity extends BaseActivity {


    @BindView(R.id.user_layout)
    FrameLayout mUserLayout;

    @Override
    public void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public int initView() {
        return R.layout.activity_user;
    }

    @Override
    public void initData() {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.user_layout, UserFragment.newInstance()).commit();

    }

}
