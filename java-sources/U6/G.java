package U6;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f8205d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8208c;

    public G(String str, boolean z10) {
        y.c(str);
        this.f8206a = str;
        y.c("com.google.android.gms");
        this.f8207b = "com.google.android.gms";
        this.f8208c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    public final Intent a(Context context) throws z {
        Bundle bundleCall;
        PendingIntent pendingIntent;
        Intent intent = null;
        String str = this.f8206a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f8208c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f8205d);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } catch (RemoteException e10) {
                        e = e10;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    }
                    if (bundleCall == null && (intent = (Intent) bundleCall.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                        throw new z(new R6.b(25, pendingIntent));
                    }
                    if (intent == null) {
                        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e12) {
                e = e12;
                bundleCall = null;
            } catch (IllegalArgumentException e13) {
                e = e13;
                bundleCall = null;
            }
            Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
            if (bundleCall == null) {
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f8207b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return y.i(this.f8206a, g.f8206a) && y.i(this.f8207b, g.f8207b) && y.i(null, null) && this.f8208c == g.f8208c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8206a, this.f8207b, null, 4225, Boolean.valueOf(this.f8208c)});
    }

    public final String toString() {
        String str = this.f8206a;
        if (str != null) {
            return str;
        }
        y.f(null);
        throw null;
    }
}
