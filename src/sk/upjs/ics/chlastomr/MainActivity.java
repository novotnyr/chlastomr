package sk.upjs.ics.chlastomr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onPreviestClick(View v) {
		EditText percentaEditText = (EditText) findViewById(R.id.percentaEditText);
		String percenta = percentaEditText.getText().toString();
		int perc = Integer.parseInt(percenta);
		
		int proof = perc * 2;
		
		EditText proofEditText = (EditText) findViewById(R.id.proofEditText);
		proofEditText.setText("" + proof);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
