package com.androidkt.pagingwithrestapi.repository.inMemory.byItem;

import android.util.Log;

import com.androidkt.pagingwithrestapi.api.GitHubApi;
import com.androidkt.pagingwithrestapi.api.GitHubService;
import com.androidkt.pagingwithrestapi.repository.NetworkState;
import com.androidkt.pagingwithrestapi.repository.Status;
import com.androidkt.pagingwithrestapi.vo.AlertsFeedDetailModel;
import com.androidkt.pagingwithrestapi.vo.AlertsFeedMain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.ItemKeyedDataSource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by brijesh on 20/9/17.
 */

public class ItemKeyedUserDataSource extends ItemKeyedDataSource<Long, AlertsFeedDetailModel> {
    public static final String TAG = "ItemKeyedUserDataSource";
    GitHubService gitHubService;
    LoadInitialParams<Long> initialParams;
    LoadParams<Long> afterParams;
    private MutableLiveData<NetworkState> networkState;
    private MutableLiveData<NetworkState> initialLoading;
    private Executor retryExecutor;
    long pageSize=0l;

    public ItemKeyedUserDataSource(Executor retryExecutor) {
        gitHubService = GitHubApi.createGitHubService();
        networkState = new MutableLiveData<>();
        initialLoading = new MutableLiveData<>();
        this.retryExecutor = retryExecutor;
    }


    public MutableLiveData<NetworkState> getNetworkState() {
        return networkState;
    }

    public MutableLiveData<NetworkState> getInitialLoading() {
        return initialLoading;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Long> params, @NonNull LoadInitialCallback<AlertsFeedDetailModel> callback) {
        Log.i(TAG, "Loading Rang " + 1 + " Count " + params.requestedLoadSize);
        List<AlertsFeedDetailModel> gitHubUser = new ArrayList<>();
        initialParams = params;
        initialLoading.postValue(NetworkState.LOADING);
        networkState.postValue(NetworkState.LOADING);
        gitHubService.getUser("1231", "47", "31.4163", "74.2686", String.valueOf(pageSize), String.valueOf(params.requestedLoadSize)).enqueue(new Callback<AlertsFeedMain>() {
            @Override
            public void onResponse(Call<AlertsFeedMain> call, Response<AlertsFeedMain> response) {
                if (response.isSuccessful() && response.code() == 200) {
                    gitHubUser.addAll(response.body().getSafetyFeedData().getSafetyFeedList());
                    callback.onResult(gitHubUser);
                    initialLoading.postValue(NetworkState.LOADED);
                    networkState.postValue(NetworkState.LOADED);
                    initialParams = null;
                    pageSize+=10;
                } else {
                    Log.e("API CALL", response.message());
                    initialLoading.postValue(new NetworkState(Status.FAILED, response.message()));
                    networkState.postValue(new NetworkState(Status.FAILED, response.message()));
                }
            }

            @Override
            public void onFailure(Call<AlertsFeedMain> call, Throwable t) {
                String errorMessage;
                errorMessage = t.getMessage();
                if (t == null) {
                    errorMessage = "unknown error";
                }
                networkState.postValue(new NetworkState(Status.FAILED, errorMessage));
            }

        });

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Long> params, @NonNull LoadCallback<AlertsFeedDetailModel> callback) {
        Log.i(TAG, "Loading Rang " + params.key + " Count " + params.requestedLoadSize);
        List<AlertsFeedDetailModel> gitHubUser = new ArrayList<>();
        afterParams = params;

        networkState.postValue(NetworkState.LOADING);
        gitHubService.getUser("1231", "47", "31.4163", "74.2686", String.valueOf(params.key), String.valueOf(params.requestedLoadSize)).enqueue(new Callback<AlertsFeedMain>() {


            @Override
            public void onResponse(Call<AlertsFeedMain> call, Response<AlertsFeedMain> response) {
                if (response.isSuccessful()) {
                    gitHubUser.addAll(response.body().getSafetyFeedData().getSafetyFeedList());
                    callback.onResult(gitHubUser);
                    networkState.postValue(NetworkState.LOADED);
                    afterParams = null;
              pageSize+=10;
                } else {
                    networkState.postValue(new NetworkState(Status.FAILED, response.message()));
                    Log.e("API CALL", response.message());
                }
            }

            @Override
            public void onFailure(Call<AlertsFeedMain> call, Throwable t) {
                String errorMessage;
                errorMessage = t.getMessage();
                if (t == null) {
                    errorMessage = "unknown error";
                }
                networkState.postValue(new NetworkState(Status.FAILED, errorMessage));
            }
        });

    }

    @Override
    public void loadBefore(@NonNull LoadParams<Long> params, @NonNull LoadCallback<AlertsFeedDetailModel> callback) {

    }

    @NonNull
    @Override
    public Long getKey(@NonNull AlertsFeedDetailModel item) {
        return pageSize;
    }


}
