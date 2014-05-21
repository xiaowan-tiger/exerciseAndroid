package com.dorian.list;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class adapterList extends Activity {
	
	private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<String> listData = new ArrayList<String>();
        listData.add("Test Data1");
        listData.add("Test Data2");
        listData.add("Test Data3");
        listData.add("Test Data4");
        
        lv = new ListView(this);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listData);
        lv.setAdapter(adapter);
        
		setContentView(lv);
	}
}
