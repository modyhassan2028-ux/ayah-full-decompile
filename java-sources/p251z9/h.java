package p251z9;

import F9.b;
import p110k9.e;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class h extends c implements g, b, e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f24877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f24878y;

    public h(int i10, Class cls, String str, String str2, int i11) {
        this(i10, b.f24868r, cls, str, str2, i11, 0);
    }

    @Override // p251z9.c
    public final b b() {
        w.f24887a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f24872u.equals(hVar.f24872u) && this.f24873v.equals(hVar.f24873v) && this.f24878y == hVar.f24878y && this.f24877x == hVar.f24877x && j.a(this.f24870s, hVar.f24870s) && j.a(c(), hVar.c());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        b bVar = this.f24869r;
        if (bVar == null) {
            b();
            this.f24869r = this;
            bVar = this;
        }
        return obj.equals(bVar);
    }

    @Override // p251z9.g
    public final int getArity() {
        return this.f24877x;
    }

    public final int hashCode() {
        return this.f24873v.hashCode() + a.x(this.f24872u, c() == null ? 0 : c().hashCode() * 31, 31);
    }

    public final String toString() {
        b bVar = this.f24869r;
        if (bVar == null) {
            b();
            this.f24869r = this;
            bVar = this;
        }
        if (bVar != this) {
            return bVar.toString();
        }
        String str = this.f24872u;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.D("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f24877x = i10;
        this.f24878y = 0;
    }
}
