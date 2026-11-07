package p164q2;

import android.app.ForegroundServiceStartNotAllowedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
