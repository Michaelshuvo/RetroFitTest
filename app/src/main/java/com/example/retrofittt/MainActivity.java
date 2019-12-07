package com.example.retrofittt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface=ApiClient.getClient().create(ApiInterface.class);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                apiInterface.getTodos().enqueue(new Callback<List<Todo>>() {
                    @Override
                    public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                        Log.e("data",response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<List<Todo>> call, Throwable t) {

                    }
                });
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiInterface.getTodo(5).enqueue(new Callback<Todo>() {
                    @Override
                    public void onResponse(Call<Todo> call, Response<Todo> response) {
                        Log.e("data",response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<Todo> call, Throwable t) {

                    }
                });
            }
        });

    }
}
