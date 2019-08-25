package com.dev.rj3.fantasma.reddit_api;

import com.dev.rj3.fantasma.reddit_api.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RedditAPI {

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<Feed> getData();
}