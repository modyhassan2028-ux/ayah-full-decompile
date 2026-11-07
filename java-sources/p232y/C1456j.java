package p232y;

import p180s0.C1294c;
import p180s0.C1297f;
import p180s0.C1300i;
import p196u0.b;
import p251z9.j;

/* JADX INFO: renamed from: y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1456j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1297f f24530a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1294c f24531b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f24532c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1300i f24533d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1456j)) {
            return false;
        }
        C1456j c1456j = (C1456j) obj;
        return j.a(this.f24530a, c1456j.f24530a) && j.a(this.f24531b, c1456j.f24531b) && j.a(this.f24532c, c1456j.f24532c) && j.a(this.f24533d, c1456j.f24533d);
    }

    public final int hashCode() {
        C1297f c1297f = this.f24530a;
        int iHashCode = (c1297f == null ? 0 : c1297f.hashCode()) * 31;
        C1294c c1294c = this.f24531b;
        int iHashCode2 = (iHashCode + (c1294c == null ? 0 : c1294c.hashCode())) * 31;
        b bVar = this.f24532c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C1300i c1300i = this.f24533d;
        return iHashCode3 + (c1300i != null ? c1300i.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f24530a + ", canvas=" + this.f24531b + ", canvasDrawScope=" + this.f24532c + ", borderPath=" + this.f24533d + ')';
    }
}
