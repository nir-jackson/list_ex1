package com.example.list_ex1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

	private AppLogic controller;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button myB = (Button)findViewById(R.id.button1);
        TextView myT = (TextView) findViewById(R.id.editText1);
        myT.setVisibility(View.INVISIBLE);
        ListView myL = (ListView) findViewById(R.id.listView1);
        
        controller = new AppLogic(myB, myT, new TaskList());
        myL.setAdapter(new TaskAdapter(this, controller.GetList()));
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void CreateNewListObj(){
  
    
    }
}
