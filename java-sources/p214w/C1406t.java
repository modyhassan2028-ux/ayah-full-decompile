package p214w;

import l0.j;
import p223x.C1408a0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: w.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1406t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f23535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f23536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1408a0 f23537c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1406t(j jVar, c cVar, C1408a0 c1408a0) {
        this.f23535a = jVar;
        this.f23536b = (k) cVar;
        this.f23537c = c1408a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406t)) {
            return false;
        }
        C1406t c1406t = (C1406t) obj;
        return this.f23535a.equals(c1406t.f23535a) && this.f23536b.equals(c1406t.f23536b) && this.f23537c.equals(c1406t.f23537c);
    }

    public final int hashCode() {
        return ((this.f23537c.hashCode() + ((this.f23536b.hashCode() + (this.f23535a.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f23535a + ", size=" + this.f23536b + ", animationSpec=" + this.f23537c + ", clip=true)";
    }
}
