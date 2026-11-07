package io.realm.internal.android;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.internal.Capabilities;

/* JADX INFO: loaded from: classes.dex */
public class AndroidCapabilities implements Capabilities {

    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean EMULATE_MAIN_THREAD = false;
    private final Looper looper = Looper.myLooper();
    private final boolean isIntentServiceThread = isIntentServiceThread();

    private boolean hasLooper() {
        return this.looper != null;
    }

    private static boolean isIntentServiceThread() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }

    @Override // io.realm.internal.Capabilities
    public boolean canDeliverNotification() {
        return hasLooper() && !this.isIntentServiceThread;
    }

    @Override // io.realm.internal.Capabilities
    public void checkCanDeliverNotification(String str) {
        if (!hasLooper()) {
            throw new IllegalStateException(str != null ? str.concat(" Realm cannot be automatically updated on a thread without a looper.") : "");
        }
        if (this.isIntentServiceThread) {
            throw new IllegalStateException(str != null ? str.concat(" Realm cannot be automatically updated on an IntentService thread.") : "");
        }
    }

    @Override // io.realm.internal.Capabilities
    public boolean isMainThread() {
        Looper looper = this.looper;
        if (looper != null) {
            return EMULATE_MAIN_THREAD || looper == Looper.getMainLooper();
        }
        return false;
    }
}
