package com.crashable.demo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Simple demo activity that will cause an index out of bounds exception in the on create.
 * @author jonthornton
 *
 */
public class DemoActivity extends Activity{

	@Override
	public void onCreate(final Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		//Create a simple array
		final int[] array = new int[]{};

		//Try to access the array at a point that the values does not exist
		final int x = array[5];

	}
}
