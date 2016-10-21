package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Tlogin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tlogin);
	}
	public void tsign(View v)
	{
		Intent i=new Intent(getApplicationContext(),Tsignup.class);
		startActivity(i);
	}
	public void tutors(View v)
	{
		Intent i=new Intent(getApplicationContext(),Ptutor.class);
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tlogin, menu);
		return true;
	}

}
