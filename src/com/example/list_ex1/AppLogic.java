package com.example.list_ex1;

import java.util.List;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppLogic {
	
	private Button myButton;
	private TextView myDescription;
	// private ListView myList;
	private TaskList myList;
	

	public AppLogic(Button myTaskButton, TextView myDescription, TaskList myList) {
		super();
		this.myButton = myTaskButton;
		this.myDescription = myDescription;
		this.myList = myList;
		
		this.myButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				NewTaskButtonClicked();
			}
		});
	
		this.myDescription.setOnEditorActionListener(new TextView.OnEditorActionListener() {
			
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				// TODO Auto-generated method stub
				Log.println(Log.INFO, "VicTagging", v.getText().toString());
				DescriptionEntered(v.getText().toString());
				v.setText("");
				return false;
			}
		});
	}
	
	public void NewTaskButtonClicked() {
		myButton.setVisibility(View.INVISIBLE);
		myDescription.setVisibility(View.VISIBLE);
	}
	
	public void DescriptionEntered(String text) {
		
		myList.AddITemToList(new Task(text));
		myButton.setVisibility(View.VISIBLE);
		myDescription.setVisibility(View.INVISIBLE);
		
	}
	
	public List<Task> GetList() {
		return myList.GetTasks();
	}
	
}
