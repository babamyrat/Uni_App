package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.uniapp.UI.CoreActivity;
import com.example.uniapp.UI.ProfileActivity;
import com.example.uniapp.adapter.GroupAdapter;
import com.example.uniapp.adapter.UserAdapter;
import com.example.uniapp.model.Group;
import com.example.uniapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Group> groupList = new ArrayList<>();
    private GroupAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        unitLoad();
        setOnClickListener();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GroupAdapter adapter = new GroupAdapter(groupList, this,  listener);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = (v, position) -> {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
        };
    }

    private void unitLoad() {

        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));
        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));
        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));
        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));
        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));
        groupList.add(new Group("hello", "sdsdsd", R.drawable.ic_launcher_background));

    }

}