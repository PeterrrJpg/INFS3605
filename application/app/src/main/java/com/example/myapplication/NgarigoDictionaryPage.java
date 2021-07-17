package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;

public class NgarigoDictionaryPage extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    private DictionaryAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngarigo_dictionary_page);

        mRecyclerview = findViewById(R.id.rvNgarigoDictionary);
        mRecyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(layoutManager);

        mAdapter = new DictionaryAdapter(new ArrayList<>());
        mRecyclerview.setAdapter(mAdapter);
        mAdapter.setData(Dictionary.getNgarigo());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                mAdapter.getFilter().filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                mAdapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort_alphabet:
                mAdapter.sort(1);
                return true;
            case R.id.sort_category:
                mAdapter.sort(2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}