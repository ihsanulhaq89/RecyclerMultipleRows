package com.mac.recyclermultiplerows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        List<String> dataList = new ArrayList<>();
        int i=0;
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        dataList.add("Item " + i++);
        MyAdapter mAdapter = new MyAdapter(this, dataList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
