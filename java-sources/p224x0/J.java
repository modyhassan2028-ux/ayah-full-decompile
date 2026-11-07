package p224x0;

import java.util.List;
import p123m2.c;
import p180s0.F;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class J extends H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24160A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f24161B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f24162C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f24163D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f24164E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f24165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f24166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final F f24168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f24169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final F f24170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f24171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f24172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f24173z;

    public J(String str, List list, int i10, F f3, float f7, F f10, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f24165r = str;
        this.f24166s = list;
        this.f24167t = i10;
        this.f24168u = f3;
        this.f24169v = f7;
        this.f24170w = f10;
        this.f24171x = f11;
        this.f24172y = f12;
        this.f24173z = i11;
        this.f24160A = i12;
        this.f24161B = f13;
        this.f24162C = f14;
        this.f24163D = f15;
        this.f24164E = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J.class == obj.getClass()) {
            J j = (J) obj;
            return j.a(this.f24165r, j.f24165r) && j.a(this.f24168u, j.f24168u) && this.f24169v == j.f24169v && j.a(this.f24170w, j.f24170w) && this.f24171x == j.f24171x && this.f24172y == j.f24172y && this.f24173z == j.f24173z && this.f24160A == j.f24160A && this.f24161B == j.f24161B && this.f24162C == j.f24162C && this.f24163D == j.f24163D && this.f24164E == j.f24164E && this.f24167t == j.f24167t && j.a(this.f24166s, j.f24166s);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f24166s.hashCode() + (this.f24165r.hashCode() * 31)) * 31;
        F f3 = this.f24168u;
        int iN = c.n((iHashCode + (f3 != null ? f3.hashCode() : 0)) * 31, this.f24169v, 31);
        F f7 = this.f24170w;
        return c.n(c.n(c.n(c.n((((c.n(c.n((iN + (f7 != null ? f7.hashCode() : 0)) * 31, this.f24171x, 31), this.f24172y, 31) + this.f24173z) * 31) + this.f24160A) * 31, this.f24161B, 31), this.f24162C, 31), this.f24163D, 31), this.f24164E, 31) + this.f24167t;
    }
}
