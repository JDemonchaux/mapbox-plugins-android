package com.mapbox.mapboxsdk.plugins.locationlayer;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LocationTrackingMode {

  /**
   * One of these constants should be used when {@link LocationLayerPlugin#setLocationLayerEnabled(int)}'s called. The
   * mode can be switched at anytime by calling the {@code setLocationLayerEnabled} method passing in the new mode you'd
   * like the location layer to be in.
   *
   * @since 0.1.0
   */
  @IntDef( {NONE, FOLLOW, BEARING})
  @Retention(RetentionPolicy.SOURCE)
  public @interface Mode {
  }

  /**
   * All Tracking and bearing disable
   *
   * @since 0.1.0
   */
  public static final int NONE = 0x00000000;

  /**
   * Force tracking mode to follow
   *
   * @since 0.1.0
   */
  public static final int FOLLOW = 0x00000004;

  /**
   * Force heading mode
   *
   * @since 0.1.0
   */
  public static final int BEARING = 0x00000008;

}
