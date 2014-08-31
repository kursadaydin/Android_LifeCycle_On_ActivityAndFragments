package com.example.test_activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("MESSAGE TO ACTÝVÝTY", "OnCreate method is called");
		
					
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnStart method is called");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnResume method is called");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnPause method is called");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnStop method is called");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnRestart method is called");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("MESSAGE TO ACTÝVÝTY", "OnDestroy method is called");
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Log.d("MESSAGE TO ACTÝVÝTY", "Onback button is called");

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub

		String action = event.keyCodeToString(keyCode);

		switch (keyCode) {

		case KeyEvent.KEYCODE_VOLUME_UP:

			Log.d("MESSAGE TO ACTÝVÝTY", " " + action + ": Key Down Button is pressed...");

			break;

		case KeyEvent.KEYCODE_VOLUME_DOWN:

			Log.d("MESSAGE TO ACTÝVÝTY", " " + action + ": Key Up Button is pressed...");

			break;

		
		case KeyEvent.KEYCODE_MENU:

			Log.d("MESSAGE TO ACTÝVÝTY", " " + action + ": Key Menu Button is pressed...");

			break;
			
		
		default:
			break;
		}

		return super.onKeyDown(keyCode, event);
		
		
	}
	

}
