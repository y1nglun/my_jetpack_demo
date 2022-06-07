package com.android.my_jetpack_demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.my_jetpack_demo.databinding.ActivityMainBinding;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    List<User> userList;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.
                setContentView(this, R.layout.activity_main);
        User yinglun = new User(1, "yinglun", "20");
        activityMainBinding.setUser(yinglun);

        iniComponent();
    }

    private void iniComponent() {
//        UserViewModel userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
//        userViewModel.getListLiveData().observe(this, new Observer<List<User>>() {
//            @Override
//            public void onChanged(List<User> users) {
//                userList.clear();
//                userList.addAll(users);
//
//            }
//        });

    }
}
