package ta;

import Da.k;
import R7.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f22649a;

    static {
        k kVar = k.f1363u;
        f22649a = f.m("xn--");
    }

    public static int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = (i12 / i11) + i12;
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return ((i13 * 36) / (i13 + 38)) + i14;
    }

    public static int b(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }
}
