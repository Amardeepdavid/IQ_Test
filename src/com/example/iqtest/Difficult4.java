package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Difficult4 extends Activity {

	RadioButton rb1;
	RadioButton rb2;
	RadioButton rb3;
	RadioButton rb4;
	Button db45;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_difficult4);
		db45=(Button)findViewById(R.id.button1);
		rb4=(RadioButton)findViewById(R.id.rbtn4);
		db45.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
 
				 if(rb4.isChecked())
				    {
				    	Toast.makeText(getBaseContext(), "Correct",Toast.LENGTH_SHORT).show();
				    	Difficult1.dc1++;
				    }
				    else
				    {
				    	Toast.makeText(getBaseContext(), "Wrong!! The correct answer was Michelin",Toast.LENGTH_SHORT).show();
				    }
				Intent i = new Intent(Difficult4.this,Difficult5.class);
			    startActivity(i);
 
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_difficult4, menu);
		return true;
	}

}
