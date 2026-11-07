package G;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0174h f2695a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        p251z9.j.d(lowerCase, "toLowerCase(...)");
        f2695a = lowerCase.equals("robolectric") ? new C0174h() : null;
    }
}
