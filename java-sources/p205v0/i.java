package p205v0;

import android.os.Build;
import java.util.Locale;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23091a = 0;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        j.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }
}
