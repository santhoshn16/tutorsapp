package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void tlogin(View v)
    {
    	Intent i=new Intent(getApplicationContext(), Tlogin.class);
    	startActivity(i);
    }
    public void plogin(View v)
    {
    	Intent i=new Intent(getApplicationContext(),Plogin.class);
    	startActivity(i);
    }
    public void psign(View v)
    {
    	Intent i=new Intent(getApplicationContext(), Psignup.class);
    	startActivity(i);
        
    }

    public void tsign(View v)
    {
	Intent i=new Intent(getApplicationContext(), Tsignup.class);
	startActivity(i);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
