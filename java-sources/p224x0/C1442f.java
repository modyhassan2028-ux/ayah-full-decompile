package p224x0;

import i7.B;
import p063g1.f;
import p123m2.c;
import p180s0.q;
import p251z9.j;

/* JADX INFO: renamed from: x0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1442f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f24214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final B f24215l = new B(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f24221f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24223i;
    public final int j;

    public C1442f(String str, float f3, float f7, float f10, float f11, F f12, long j, int i10, boolean z10) {
        int i11;
        synchronized (f24215l) {
            i11 = f24214k;
            f24214k = i11 + 1;
        }
        this.f24216a = str;
        this.f24217b = f3;
        this.f24218c = f7;
        this.f24219d = f10;
        this.f24220e = f11;
        this.f24221f = f12;
        this.g = j;
        this.f24222h = i10;
        this.f24223i = z10;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1442f)) {
            return false;
        }
        C1442f c1442f = (C1442f) obj;
        return j.a(this.f24216a, c1442f.f24216a) && f.a(this.f24217b, c1442f.f24217b) && f.a(this.f24218c, c1442f.f24218c) && this.f24219d == c1442f.f24219d && this.f24220e == c1442f.f24220e && this.f24221f.equals(c1442f.f24221f) && q.c(this.g, c1442f.g) && this.f24222h == c1442f.f24222h && this.f24223i == c1442f.f24223i;
    }

    public final int hashCode() {
        int iHashCode = (this.f24221f.hashCode() + c.n(c.n(c.n(c.n(this.f24216a.hashCode() * 31, this.f24217b, 31), this.f24218c, 31), this.f24219d, 31), this.f24220e, 31)) * 31;
        int i10 = q.f21844h;
        return ((c.o(iHashCode, 31, this.g) + this.f24222h) * 31) + (this.f24223i ? 1231 : 1237);
    }
}
