package com.example.test_activity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnAttach method is called");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnCreate method is called");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("MESSAGE TO FRAGMENT", "OnCreateView method is called");
		// TODO Auto-generated method stub

		return inflater.inflate(R.layout.fragment_main, container, false);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnActivityCreated method is called");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnStart method is called");
		super.onStart();
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnResume method is called");
		super.onResume();
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnPause method is called");
		super.onPause();
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnStop method is called");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnDestroyView method is called");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnDestroy method is called");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		Log.d("MESSAGE TO FRAGMENT", "OnDetach method is called");
		super.onDetach();
	}

}
