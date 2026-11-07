package p251z9;

import java.io.Serializable;
import p245z2.a;

/* JADX INFO: renamed from: z9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1472a implements g, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f24861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f24862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f24863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f24864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f24865v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f24867x;

    public C1472a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.f24861r = obj;
        this.f24862s = cls;
        this.f24863t = str;
        this.f24864u = str2;
        this.f24866w = i10;
        this.f24867x = i11 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1472a)) {
            return false;
        }
        C1472a c1472a = (C1472a) obj;
        return this.f24865v == c1472a.f24865v && this.f24866w == c1472a.f24866w && this.f24867x == c1472a.f24867x && j.a(this.f24861r, c1472a.f24861r) && this.f24862s.equals(c1472a.f24862s) && this.f24863t.equals(c1472a.f24863t) && this.f24864u.equals(c1472a.f24864u);
    }

    @Override // p251z9.g
    public final int getArity() {
        return this.f24866w;
    }

    public final int hashCode() {
        Object obj = this.f24861r;
        return ((((a.x(this.f24864u, a.x(this.f24863t, (this.f24862s.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31), 31) + (this.f24865v ? 1231 : 1237)) * 31) + this.f24866w) * 31) + this.f24867x;
    }

    public final String toString() {
        w.f24887a.getClass();
        return x.a(this);
    }
}
