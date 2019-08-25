package com.gmail.listview01;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 31; i++){
            list.add("listView-"+i);

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l , View v , int position , long id){
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, "selected", Toast.LENGTH_LONG).show();
    }
}
