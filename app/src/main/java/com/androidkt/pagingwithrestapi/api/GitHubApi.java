package com.androidkt.pagingwithrestapi.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubApi {

    public static GitHubService createGitHubService() {
        //-----OkHttp 3 client and intercept for logs and header authentication

        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();

        okHttpClientBuilder.addInterceptor(chain -> {
            Request original = chain.request();
            Request.Builder requestBuilder = original.newBuilder()
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("X-API-KEY", "fxY6ZM6iGsB2ULDyVb8IwhKnaLhyXd0vJmZgnMtg");
            Request request = requestBuilder.build();
            return chain.proceed(request);

        });
        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClientBuilder.build())
                .baseUrl("http://eme-staging.us-west-2.elasticbeanstalk.com/api/v4/");

        return builder.build().create(GitHubService.class);
    }
}
