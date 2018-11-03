package com.androidkt.pagingwithrestapi.api;

/**
 * Created by brijesh on 20/9/17.
 */


import com.androidkt.pagingwithrestapi.vo.AlertsFeedMain;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubService {
    @GET("sn/member/feed")
    Call<AlertsFeedMain> getUser(@Query("fid") String fid, @Query("pid") String pid, @Query("latitude") String lat, @Query("longitude") String lng, @Query("offset") String offset, @Query("limit") String limit);
}
