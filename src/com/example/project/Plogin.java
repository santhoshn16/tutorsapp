package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Plogin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plogin);
	}
    public void next(View v)
    {
    	Intent i=new Intent(getApplicationContext(),Parents.class);
    	startActivity(i);
    }
    public void psign(View v)
    {
    	Intent i=new Intent(getApplicationContext(),Psignup.class);
    	startActivity(i);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.plogin, menu);
		return true;
	}

}
