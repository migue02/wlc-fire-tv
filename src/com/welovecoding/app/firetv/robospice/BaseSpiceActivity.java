package com.welovecoding.app.firetv.robospice;

import android.app.Activity;
import com.octo.android.robospice.JacksonGoogleHttpClientSpiceService;
import com.octo.android.robospice.SpiceManager;

public class BaseSpiceActivity extends Activity {

  private SpiceManager spiceManager = new SpiceManager(JacksonGoogleHttpClientSpiceService.class);

  @Override
  protected void onStart() {
    spiceManager.start(this);
    super.onStart();
  }

  @Override
  protected void onStop() {
    spiceManager.shouldStop();
    super.onStop();
  }

  protected SpiceManager getSpiceManager() {
    return spiceManager;
  }

}
