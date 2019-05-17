package com.ninosano.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.ninosano.Adapters.AdapterBaby;
import com.ninosano.Models.Baby;
import com.ninosano.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterBaby mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        recyclerView.setHasFixedSize(true);

        List<Baby> items = new ArrayList<>();
        items.add(new Baby(1, "Edrick", "Suclupe", "16/05/2018", true));
        items.add(new Baby(1, "Karen", "Sanchez", "25/12/2016", false));

        mAdapter = new AdapterBaby(getApplicationContext(), items);
        recyclerView.setAdapter(mAdapter);
    }
}
