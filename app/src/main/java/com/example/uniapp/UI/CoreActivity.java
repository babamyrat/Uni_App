package com.example.uniapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.uniapp.R;
import com.example.uniapp.adapter.UserAdapter;
import com.example.uniapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class CoreActivity extends AppCompatActivity {

    private List<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;
    private UserAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);
        recyclerView = findViewById(R.id.recyclerView2);


        unitLoading();
        setOnClickListener();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        UserAdapter adapter = new UserAdapter(userList, this, listener);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void setOnClickListener() {
        listener = (v, position) -> {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            intent.putExtra("Example Item", userList.get(position));
            startActivity(intent);
        };
    }

    private void unitLoading() {
        userList.add(new User("Interacting with Other Apps", "One of Android's most important features is an app's ability to send the user to another app based on an action it would like to perform.", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));
        userList.add(new User("Name", "text more view", R.drawable.ic_launcher_background));

    }

}