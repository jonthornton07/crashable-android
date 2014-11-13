package com.crashable.test;

import android.test.ActivityInstrumentationTestCase2;

import com.chrashable.R;
import com.crashable.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

	private MainActivity mActivity;

	public MainActivityTest(){
		super(MainActivity.class);
	}

	@Override
	public void setUp() throws Exception{
		super.setUp();

		this.setActivityInitialTouchMode(false);
		this.mActivity = this.getActivity();
	}

	public void testExample(){
		assertEquals("Hello World!", this.mActivity.getString(R.string.hello_world));
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
