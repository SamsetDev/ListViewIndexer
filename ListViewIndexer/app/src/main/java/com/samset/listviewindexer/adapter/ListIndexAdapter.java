package com.samset.listviewindexer.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.List;

public class ListIndexAdapter extends ArrayAdapter<String> implements SectionIndexer {
	
	private List<String> listdata;
	private Context context;
	private static String sections = "abcdefghilmnopqrstuvz";
		
	public ListIndexAdapter(List<String> itemList, Context ctx) {
		super(ctx, android.R.layout.simple_list_item_1, itemList);
		this.listdata = itemList;
		this.context = ctx;		
	}
	
	public int getCount() {
		return listdata.size();
	}

	public String getItem(int position) {
		return listdata.get(position);
	}

	public long getItemId(int position) {
		return listdata.get(position).hashCode();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(android.R.layout.simple_list_item_1, null);
		}
		
		TextView text = (TextView) v.findViewById(android.R.id.text1);
		text.setText(listdata.get(position));
		
		return v;
		
	}

	@Override
	public int getPositionForSection(int section) {
		Log.d("ListView", "Get position for section");
		for (int i=0; i < this.getCount(); i++) {
			String item = this.getItem(i).toLowerCase();
			if (item.charAt(0) == sections.charAt(section))
				return i;
		}
		return 0;
	}

	@Override
	public int getSectionForPosition(int arg0) {
		Log.d("ListView", "Get section");
		return 0;
	}

	@Override
	public Object[] getSections() {
		Log.d("ListView", "Get sections");
		String[] sectionsArr = new String[sections.length()];
		for (int i=0; i < sections.length(); i++)
			sectionsArr[i] = "" + sections.charAt(i);
		
		return sectionsArr;
		
	}
	
	
	


}
