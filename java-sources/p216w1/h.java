package p216w1;

import android.content.ComponentName;
import android.os.PowerManager;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerManager.WakeLock f23584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f23585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23586c;

    public h(JobIntentService jobIntentService, ComponentName componentName) {
        jobIntentService.getApplicationContext();
        PowerManager powerManager = (PowerManager) jobIntentService.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f23584a = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f23585b = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f23586c) {
                    this.f23586c = false;
                    this.f23585b.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this) {
        }
    }
}
