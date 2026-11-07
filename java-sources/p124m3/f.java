package p124m3;

import java.util.ArrayList;
import p120l9.m;
import p125m4.b;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19566c;

    public f(g gVar, h hVar, ArrayList arrayList) {
        this.f19564a = gVar;
        this.f19565b = hVar;
        this.f19566c = arrayList;
    }

    public final String a() {
        final boolean zB = b.b();
        return m.l0(this.f19566c, " ", null, null, new c() { // from class: m3.e
            @Override // p241y9.c
            public final Object e(Object obj) {
                a aVar = (a) obj;
                j.e(aVar, "it");
                return zB ? aVar.f19531e : aVar.f19532f;
            }
        }, 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19564a.equals(fVar.f19564a) && j.a(this.f19565b, fVar.f19565b) && this.f19566c.equals(fVar.f19566c);
    }

    public final int hashCode() {
        int iHashCode = this.f19564a.hashCode() * 31;
        h hVar = this.f19565b;
        return this.f19566c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PageHeaderDao(part=" + this.f19564a + ", quarter=" + this.f19565b + ", chapters=" + this.f19566c + ")";
    }
}
