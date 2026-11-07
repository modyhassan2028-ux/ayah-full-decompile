package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Exception f16771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16772d;

    public d(Object obj, String str, Exception exc, boolean z10) {
        j.e(str, "url");
        this.f16769a = obj;
        this.f16770b = str;
        this.f16771c = exc;
        this.f16772d = z10;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16769a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f16769a, dVar.f16769a) && j.a(this.f16770b, dVar.f16770b) && j.a(this.f16771c, dVar.f16771c) && this.f16772d == dVar.f16772d;
    }

    public final int hashCode() {
        Object obj = this.f16769a;
        int iX = p245z2.a.x(this.f16770b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
        Exception exc = this.f16771c;
        return ((iX + (exc != null ? exc.hashCode() : 0)) * 31) + (this.f16772d ? 1231 : 1237);
    }

    public final String toString() {
        return "Error(request=" + this.f16769a + ", url=" + this.f16770b + ", exception=" + this.f16771c + ", isTerminal=" + this.f16772d + ")";
    }

    public /* synthetic */ d(Object obj, String str, R6.g gVar, int i10) {
        this(obj, str, (Exception) ((i10 & 4) != 0 ? null : gVar), false);
    }
}
