package edu.ucsd.opera.officecrime;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class CrimeActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime);

		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.container);
		
		if (fragment == null) {
			fragment = new CrimeFragment(); 
			fm.beginTransaction().add(R.id.container, fragment).commit();
		}
	}


}
