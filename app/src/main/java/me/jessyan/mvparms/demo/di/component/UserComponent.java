package me.jessyan.mvparms.demo.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;

import dagger.Component;
import me.jessyan.mvparms.demo.di.module.UserModule;
import me.jessyan.mvparms.demo.mvp.ui.fragment.UserFragment;

/**
 * Created by jess on 9/4/16 11:17
 * Contact with jess.yan.effort@gmail.com
 */
@FragmentScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {
    void inject(UserFragment fragment);
}
