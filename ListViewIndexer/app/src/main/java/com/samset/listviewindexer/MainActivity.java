package com.samset.listviewindexer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.samset.listviewindexer.adapter.ListIndexAdapter;
import com.samset.listviewindexer.utility.Constants;
import com.samset.listviewindexer.utility.IndexerFastListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private IndexerFastListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (IndexerFastListView) findViewById(R.id.listview);
        ListIndexAdapter sa = new ListIndexAdapter(Constants.getData(), this);
        listView.setAdapter(sa);
        listView.setFastScrollEnabled(true);
    }
}
