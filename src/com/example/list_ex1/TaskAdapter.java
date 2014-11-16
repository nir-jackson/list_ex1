package com.example.list_ex1;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TaskAdapter extends BaseAdapter {

	private List<Task> myItems;
	private Context context;

	private class ViewHolder {
	
		TextView label;
		TextView text;
	
	}
	
	public TaskAdapter(Context context, List<Task> myItems) {
		super();
		this.myItems = myItems;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myItems.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return myItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@SuppressLint("InflateParams") @Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ViewHolder holder;
		
		if(convertView == null) {
			
			convertView = LayoutInflater.from(context).inflate(R.layout.task_layout, null);
			holder = new ViewHolder();
			holder.text = (TextView) convertView.findViewById(R.id.taskTextField);
			holder.label = (TextView) convertView.findViewById(R.id.taskLabel);
			convertView.setTag(holder);
		
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.label.setText("Task " + position);
		holder.text.setText(myItems.get(position).description);
		
		return convertView;
	}

	
	
}
