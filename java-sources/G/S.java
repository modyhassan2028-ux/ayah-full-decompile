package G;

import A.X0;
import Z.C0675c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2628a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2629b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2630c = 50;

    public static final boolean a(boolean z10, X0 x9, int i10) {
        if (z10) {
            if (x9.b() > i10) {
                return true;
            }
            return x9.b() == i10 && ((C0675c0) ((F.A) x9.f168c).f2012d.f1159t).g() > 0;
        }
        if (x9.b() < i10) {
            return true;
        }
        return x9.b() == i10 && ((C0675c0) ((F.A) x9.f168c).f2012d.f1159t).g() < 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: j -> 0x018c, TryCatch #4 {j -> 0x018c, blocks: (B:33:0x00bd, B:35:0x00c1, B:37:0x00cd, B:51:0x00f3, B:55:0x0122, B:60:0x0136), top: B:98:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016f -> B:18:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(A.X0 r30, int r31, int r32, p063g1.c r33, q9.c r34) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G.S.b(A.X0, int, int, g1.c, q9.c):java.lang.Object");
    }

    public static final boolean c(X0 x9, int i10) {
        return i10 <= x9.c() && x9.b() <= i10;
    }
}
