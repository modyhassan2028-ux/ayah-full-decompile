package p224x0;

import A9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p042e0.h;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class F extends H implements Iterable, a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f24144A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f24145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f24146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f24147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f24148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f24149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f24150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f24151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f24152y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f24153z;

    public F(String str, float f3, float f7, float f10, float f11, float f12, float f13, float f14, List list, ArrayList arrayList) {
        this.f24145r = str;
        this.f24146s = f3;
        this.f24147t = f7;
        this.f24148u = f10;
        this.f24149v = f11;
        this.f24150w = f12;
        this.f24151x = f13;
        this.f24152y = f14;
        this.f24153z = list;
        this.f24144A = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof F)) {
            F f3 = (F) obj;
            return j.a(this.f24145r, f3.f24145r) && this.f24146s == f3.f24146s && this.f24147t == f3.f24147t && this.f24148u == f3.f24148u && this.f24149v == f3.f24149v && this.f24150w == f3.f24150w && this.f24151x == f3.f24151x && this.f24152y == f3.f24152y && j.a(this.f24153z, f3.f24153z) && j.a(this.f24144A, f3.f24144A);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24144A.hashCode() + ((this.f24153z.hashCode() + c.n(c.n(c.n(c.n(c.n(c.n(c.n(this.f24145r.hashCode() * 31, this.f24146s, 31), this.f24147t, 31), this.f24148u, 31), this.f24149v, 31), this.f24150w, 31), this.f24151x, 31), this.f24152y, 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }
}
