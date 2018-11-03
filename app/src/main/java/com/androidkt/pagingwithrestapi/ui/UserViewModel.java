package com.androidkt.pagingwithrestapi.ui;

import com.androidkt.pagingwithrestapi.repository.NetworkState;
import com.androidkt.pagingwithrestapi.repository.inMemory.byItem.GitHubUserDataSourceFactory;
import com.androidkt.pagingwithrestapi.repository.inMemory.byItem.ItemKeyedUserDataSource;
import com.androidkt.pagingwithrestapi.vo.AlertsFeedDetailModel;
import com.androidkt.pagingwithrestapi.vo.User;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

/**
 * Created by brijesh on 18/9/17.
 */

public class UserViewModel extends ViewModel {

    public LiveData<PagedList<AlertsFeedDetailModel>> userList;
    public LiveData<NetworkState> networkState;
    Executor executor;
    LiveData<ItemKeyedUserDataSource> tDataSource;

    public UserViewModel() {
        executor = Executors.newFixedThreadPool(5);
        GitHubUserDataSourceFactory githubUserDataSourceFacteory = new GitHubUserDataSourceFactory(executor);

        tDataSource = githubUserDataSourceFacteory.getMutableLiveData();

        networkState = Transformations.switchMap(githubUserDataSourceFacteory.getMutableLiveData(), dataSource -> {
            return dataSource.getNetworkState();
        });

        PagedList.Config pagedListConfig =
                (new PagedList.Config.Builder()).setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(10)
                        .setPageSize(10).build();

        userList = (new LivePagedListBuilder(githubUserDataSourceFacteory, pagedListConfig))
                .build();
    }
}
