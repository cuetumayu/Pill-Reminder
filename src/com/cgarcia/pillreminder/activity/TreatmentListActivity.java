package com.cgarcia.pillreminder.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import com.cgarcia.pillreminder.R;

public class TreatmentListActivity extends Activity implements
		OnItemClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.treatment_list);
	}

	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(getApplicationContext(), "Clicked element: " + position,
				Toast.LENGTH_SHORT).show();
	}
}