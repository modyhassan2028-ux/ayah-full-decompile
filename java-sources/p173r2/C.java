package p173r2;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21422f;
    public final int g;

    public C(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12) {
        this.f21417a = z10;
        this.f21418b = z11;
        this.f21419c = i10;
        this.f21420d = z12;
        this.f21421e = z13;
        this.f21422f = i11;
        this.g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f21417a == c10.f21417a && this.f21418b == c10.f21418b && this.f21419c == c10.f21419c && this.f21420d == c10.f21420d && this.f21421e == c10.f21421e && this.f21422f == c10.f21422f && this.g == c10.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f21417a ? 1 : 0) * 31) + (this.f21418b ? 1 : 0)) * 31) + this.f21419c) * 923521) + (this.f21420d ? 1 : 0)) * 31) + (this.f21421e ? 1 : 0)) * 31) + this.f21422f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C.class.getSimpleName());
        sb.append("(");
        if (this.f21417a) {
            sb.append("launchSingleTop ");
        }
        if (this.f21418b) {
            sb.append("restoreState ");
        }
        int i10 = this.g;
        int i11 = this.f21422f;
        if (i11 != -1 || i10 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i11));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
