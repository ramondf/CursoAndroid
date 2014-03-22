package com.example.helloword;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onButtonClicked(View v) {

		new AlertDialog.Builder(this)
				.setTitle(R.string.hello_world)
				.setMessage("Mostrar?")
				.setNeutralButton("Mostrar",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								TextView text = (TextView) findViewById(R.id.textView1);
								if (text.getVisibility() == View.VISIBLE) {
									text.setVisibility(View.INVISIBLE);
								} else {
									text.setVisibility(View.VISIBLE);
								}
								Toast.makeText(MainActivity.this,
										R.string.hello_world,
										Toast.LENGTH_SHORT).show();

							}
						}).show();
	}
}
