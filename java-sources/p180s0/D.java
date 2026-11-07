package p180s0;

import p123m2.c;
import p171r0.g;
import p171r0.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class D extends F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f21772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1300i f21773f;

    public D(g gVar) {
        C1300i c1300iA;
        this.f21772e = gVar;
        if (h.e(gVar)) {
            c1300iA = null;
        } else {
            c1300iA = AbstractC1302k.a();
            c.c(c1300iA, gVar);
        }
        this.f21773f = c1300iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return j.a(this.f21772e, ((D) obj).f21772e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21772e.hashCode();
    }
}
