package p131n0;

import O8.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f19814d;

    public d(int i10, long j, e eVar, c cVar) {
        this.f19811a = i10;
        this.f19812b = j;
        this.f19813c = eVar;
        this.f19814d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19811a == dVar.f19811a && this.f19812b == dVar.f19812b && this.f19813c == dVar.f19813c && j.a(this.f19814d, dVar.f19814d);
    }

    public final int hashCode() {
        int i10 = this.f19811a * 31;
        long j = this.f19812b;
        int iHashCode = (this.f19813c.hashCode() + ((i10 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        c cVar = this.f19814d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f19811a + ", timestamp=" + this.f19812b + ", type=" + this.f19813c + ", structureCompat=" + this.f19814d + ')';
    }
}
