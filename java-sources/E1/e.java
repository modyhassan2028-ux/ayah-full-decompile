package E1;

import android.os.Build;
import com.google.android.gms.internal.measurement.K1;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f1425b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1426a;

    public e(g gVar) {
        this.f1426a = gVar;
    }

    public static e a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new e(new h(K1.d(localeArr))) : new e(new f(localeArr));
    }

    public static e b(String str) {
        if (str == null || str.isEmpty()) {
            return f1425b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            int i11 = d.f1424a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1426a.equals(((e) obj).f1426a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1426a.hashCode();
    }

    public final String toString() {
        return this.f1426a.toString();
    }
}
