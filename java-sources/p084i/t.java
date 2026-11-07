package p084i;

import K0.AbstractC0332a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0332a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16629c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f16630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, i iVar) {
        super(xVar);
        this.f16630d = xVar;
        this.f16631e = iVar;
    }

    @Override // K0.AbstractC0332a
    public final IntentFilter e() {
        switch (this.f16629c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // K0.AbstractC0332a
    public final int g() {
        Location location;
        boolean z10;
        long j;
        Location lastKnownLocation;
        switch (this.f16629c) {
            case 0:
                return p.a((PowerManager) this.f16631e) ? 2 : 1;
            default:
                i iVar = (i) this.f16631e;
                G g = (G) iVar.f16424u;
                LocationManager locationManager = (LocationManager) iVar.f16423t;
                if (g.f16518b <= System.currentTimeMillis()) {
                    Context context = (Context) iVar.f16422s;
                    Location lastKnownLocation2 = null;
                    if (p181s2.t.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (p181s2.t.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z10 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (F.f16512e == null) {
                            F.f16512e = new F();
                        }
                        F f3 = F.f16512e;
                        f3.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        f3.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z10 = f3.f16514b == 1;
                        long j10 = f3.f16516d;
                        long j11 = f3.f16515c;
                        f3.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j12 = f3.f16516d;
                        if (j10 == -1 || j11 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j = j10 + 60000;
                        }
                        g.f16517a = z10;
                        g.f16518b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z10 = true;
                        }
                    }
                    break;
                } else {
                    z10 = g.f16517a;
                }
                return z10 ? 2 : 1;
        }
    }

    @Override // K0.AbstractC0332a
    public final void m() {
        switch (this.f16629c) {
            case 0:
                this.f16630d.m(true, true);
                break;
            default:
                this.f16630d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, Context context) {
        super(xVar);
        this.f16630d = xVar;
        this.f16631e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
