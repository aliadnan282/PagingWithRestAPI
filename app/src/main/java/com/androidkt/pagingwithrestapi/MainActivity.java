package com.androidkt.pagingwithrestapi;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import com.androidkt.pagingwithrestapi.ui.UserAdapter;
import com.androidkt.pagingwithrestapi.ui.UserViewModel;
import com.androidkt.pagingwithrestapi.util.ListItemClickListener;

public class MainActivity extends AppCompatActivity implements ListItemClickListener {

    private UserViewModel viewModel;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.userList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel = ViewModelProviders.of(this).get(UserViewModel.class);

        final UserAdapter userUserAdapter = new UserAdapter(this);

        viewModel.userList.observe(this, pagedList -> {
            userUserAdapter.submitList(pagedList);
        });

        viewModel.networkState.observe(this, networkState -> {
            userUserAdapter.setNetworkState(networkState);
            Log.d(TAG, "Network State Change");
        });

        recyclerView.setAdapter(userUserAdapter);

    }

    @Override
    public void onRetryClick(View view, int position) {
        Log.d(TAG, "Position " + position);
    }
}

