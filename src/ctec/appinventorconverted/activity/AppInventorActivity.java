package ctec.appinventorconverted.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class AppInventorActivity extends Activity
{
	public final static String EXTRA_MESSAGE = "ctec.appinventorconverted.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_inventor);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		button.setOnClickListener(new View.OnClickListener()
		)
	}
	
	public void changeClimbing (View climbingView)
	{
		Intent climbingIntent = new Intent(this, DisplayMessageActivity.class);
		EditText climbingText = (EditText) findViewById(R.id);
		String message = editText.getText().toString();
		climbingIntent.putExtra(EXTRA_MESSAGE, message);
		startActivity(climbingIntent);
	}
	
	public void changeAboutMe (View aboutMeView)
	{
		Intent aboutMeIntent = new Intent(this, DisplayMessageActivity.class);
		EditText aboutMeText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(aboutMeIntent);
	}
	
	public void changeTrave (View travelView)
	{
		Intent travelIntent = new Intent(this, DisplayMessageActivity.class);
		EditText travelText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(travelIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_inventor, menu);
		return true;
	}

}
