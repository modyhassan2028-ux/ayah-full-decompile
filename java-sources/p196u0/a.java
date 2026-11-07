package p196u0;

import p063g1.c;
import p063g1.m;
import p171r0.i;
import p180s0.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f22790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f22791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f22792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22793d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f22790a, aVar.f22790a) && this.f22791b == aVar.f22791b && j.a(this.f22792c, aVar.f22792c) && i.a(this.f22793d, aVar.f22793d);
    }

    public final int hashCode() {
        int iHashCode = (this.f22792c.hashCode() + ((this.f22791b.hashCode() + (this.f22790a.hashCode() * 31)) * 31)) * 31;
        long j = this.f22793d;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f22790a + ", layoutDirection=" + this.f22791b + ", canvas=" + this.f22792c + ", size=" + ((Object) i.f(this.f22793d)) + ')';
    }
}
