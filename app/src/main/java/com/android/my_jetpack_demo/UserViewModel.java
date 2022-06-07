package com.android.my_jetpack_demo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    private MyDataBase myDataBase;
    private LiveData<List<User>> listLiveData;

    public UserViewModel(@NonNull Application application) {
        super(application);
        myDataBase=MyDataBase.getInstance(application);
        listLiveData=myDataBase.userDao().getUserList();
    }

    public LiveData<List<User>> getListLiveData(){
        return listLiveData;
    }
}
