package com.example.list_ex1;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	List<Task> myItems;
	
	public TaskList() {
		myItems = new ArrayList<Task>();
	}
	
	public List<Task> GetTasks() {	
		return myItems;
	}
	
	public void AddITemToList(Task newTask) {	
		myItems.add(newTask);
	}
	
}
