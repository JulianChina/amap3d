package com.run.sg.amap3d.basic.map;


import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import com.amap.api.maps.AMap;
import com.amap.api.maps.TextureMapFragment;

/**
 * 基本地图（TextureMapFragment）实现
 */
public class BaseTextureMapFragmentActivity extends Activity {
	private AMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.run.sg.amap3d.R.layout.basemap_texture_fragment_activity);
		setUpMapIfNeeded();

		setTitle("基本地图（TextureMapFragment）");
	}

	@Override
	protected void onResume() {
		super.onResume();
		setUpMapIfNeeded();
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}

	/**
	 * 获取Amap 对象
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setUpMapIfNeeded() {
		if (mMap == null) {
			mMap = ((TextureMapFragment) getFragmentManager().findFragmentById(com.run.sg.amap3d.R.id.map)).getMap();
		}
	}

}