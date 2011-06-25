package com.namelessdev.mpdroid;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;

import com.namelessdev.mpdroid.fragments.NowPlayingFragment;

/**
 * MainMenuActivity launches the NowPlayingFragment and the current playlist
 * 
 * @author Arnaud Barisain Monrose
 * @version $Id: $
 */
public class MainMenuActivity extends FragmentActivity {
	NowPlayingFragment nowPlaying;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.main_activity);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (true) {
			return super.onKeyDown(keyCode, event);
		}
		nowPlaying = (NowPlayingFragment) getSupportFragmentManager().findFragmentById(R.id.nowPlayingFragment);
		if (nowPlaying.onKeyDown(keyCode, event)) {
			return true;
		} else {
			return super.onKeyDown(keyCode, event);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (true) {
			return super.onTouchEvent(event);
		}
		nowPlaying = (NowPlayingFragment) getSupportFragmentManager().findFragmentById(R.id.nowPlayingFragment);
		if (nowPlaying.onTouchEvent(event)) {
			return true;
		} else {
			return super.onTouchEvent(event);
		}
	}

	public static void notifyUser(String message, Context context) {
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}
}