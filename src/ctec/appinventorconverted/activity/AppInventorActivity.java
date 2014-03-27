package ctec.appinventorconverted.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AppInventorActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_inventor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_inventor, menu);
		return true;
	}

}
