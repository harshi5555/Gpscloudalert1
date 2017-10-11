package com.gpscloudalert;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by harshi on 03/10/17.
 */

public class Constants {
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 20;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        LANDMARKS.put("Moscone South", new LatLng(59.334906,18.05829));

        // Googleplex.
        LANDMARKS.put("Japantown", new LatLng(59.334961,18.05761));

        // Test
        LANDMARKS.put("SFO", new LatLng(59.335962,18.057827));
    }
}
