package com.indyukov.piano.http.requests;

import com.indyukov.piano.http.model.Page;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetPage {

    @GET("/2.2/search/excerpts/")
    Call<Page> get(@Query("page") int page, @Query("title") String title, @Query("site") String site);
}
