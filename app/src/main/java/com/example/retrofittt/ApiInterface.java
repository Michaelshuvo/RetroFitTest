package com.example.retrofittt;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("/todos")
    Call<List<Todo>> getTodos();

    @GET("/todos/{id}")
    Call<Todo>  getTodo(@Path("id") int id);
}
