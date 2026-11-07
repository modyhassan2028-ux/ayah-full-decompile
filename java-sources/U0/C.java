package U0;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0510b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p055f1.p f7994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y0.l f7996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y0.j f7997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y0.k f7998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y0.e f7999f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p055f1.a f8001i;
    public final p055f1.q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p012b1.c f8002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f8003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p055f1.l f8004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p180s0.I f8005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p196u0.c f8006o;

    public C(long j, long j10, Y0.l lVar, Y0.j jVar, Y0.k kVar, Y0.e eVar, String str, long j11, p055f1.a aVar, p055f1.q qVar, p012b1.c cVar, long j12, p055f1.l lVar2, p180s0.I i10, u0 u0Var) {
        this(j != 16 ? new p055f1.c(j) : p055f1.n.f15918a, j10, lVar, jVar, kVar, eVar, str, j11, aVar, qVar, cVar, j12, lVar2, i10, u0Var, null);
    }

    public final boolean a(C c10) {
        if (this == c10) {
            return true;
        }
        return p063g1.o.a(this.f7995b, c10.f7995b) && p251z9.j.a(this.f7996c, c10.f7996c) && p251z9.j.a(this.f7997d, c10.f7997d) && p251z9.j.a(this.f7998e, c10.f7998e) && p251z9.j.a(this.f7999f, c10.f7999f) && p251z9.j.a(this.g, c10.g) && p063g1.o.a(this.f8000h, c10.f8000h) && p251z9.j.a(this.f8001i, c10.f8001i) && p251z9.j.a(this.j, c10.j) && p251z9.j.a(this.f8002k, c10.f8002k) && p180s0.q.c(this.f8003l, c10.f8003l) && p251z9.j.a(null, null);
    }

    public final boolean b(C c10) {
        return p251z9.j.a(this.f7994a, c10.f7994a) && p251z9.j.a(this.f8004m, c10.f8004m) && p251z9.j.a(this.f8005n, c10.f8005n) && p251z9.j.a(this.f8006o, c10.f8006o);
    }

    public final C c(C c10) {
        if (c10 == null) {
            return this;
        }
        p055f1.p pVar = c10.f7994a;
        return E.a(this, pVar.b(), pVar.e(), pVar.c(), c10.f7995b, c10.f7996c, c10.f7997d, c10.f7998e, c10.f7999f, c10.g, c10.f8000h, c10.f8001i, c10.j, c10.f8002k, c10.f8003l, c10.f8004m, c10.f8005n, null, c10.f8006o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return a(c10) && b(c10);
    }

    public final int hashCode() {
        p055f1.p pVar = this.f7994a;
        long jB = pVar.b();
        int i10 = p180s0.q.f21844h;
        int iA = p110k9.t.a(jB) * 31;
        p180s0.F fE = pVar.e();
        int iD = (p063g1.o.d(this.f7995b) + ((Float.floatToIntBits(pVar.c()) + ((iA + (fE != null ? fE.hashCode() : 0)) * 31)) * 31)) * 31;
        Y0.l lVar = this.f7996c;
        int i11 = (iD + (lVar != null ? lVar.f10364r : 0)) * 31;
        Y0.j jVar = this.f7997d;
        int i12 = (i11 + (jVar != null ? jVar.f10356a : 0)) * 31;
        Y0.k kVar = this.f7998e;
        int i13 = (i12 + (kVar != null ? kVar.f10357a : 0)) * 31;
        Y0.e eVar = this.f7999f;
        int iHashCode = (i13 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = (p063g1.o.d(this.f8000h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        p055f1.a aVar = this.f8001i;
        int iFloatToIntBits = (iD2 + (aVar != null ? Float.floatToIntBits(aVar.f15894a) : 0)) * 31;
        p055f1.q qVar = this.j;
        int iHashCode2 = (iFloatToIntBits + (qVar != null ? qVar.hashCode() : 0)) * 31;
        p012b1.c cVar = this.f8002k;
        int iO = p123m2.c.o((iHashCode2 + (cVar != null ? cVar.f13145r.hashCode() : 0)) * 31, 31, this.f8003l);
        p055f1.l lVar2 = this.f8004m;
        int i14 = (iO + (lVar2 != null ? lVar2.f15916a : 0)) * 31;
        p180s0.I i15 = this.f8005n;
        int iHashCode3 = (((i14 + (i15 != null ? i15.hashCode() : 0)) * 31) + 0) * 31;
        p196u0.c cVar2 = this.f8006o;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        p055f1.p pVar = this.f7994a;
        sb.append((Object) p180s0.q.i(pVar.b()));
        sb.append(", brush=");
        sb.append(pVar.e());
        sb.append(", alpha=");
        sb.append(pVar.c());
        sb.append(", fontSize=");
        sb.append((Object) p063g1.o.e(this.f7995b));
        sb.append(", fontWeight=");
        sb.append(this.f7996c);
        sb.append(", fontStyle=");
        sb.append(this.f7997d);
        sb.append(", fontSynthesis=");
        sb.append(this.f7998e);
        sb.append(", fontFamily=");
        sb.append(this.f7999f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) p063g1.o.e(this.f8000h));
        sb.append(", baselineShift=");
        sb.append(this.f8001i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.f8002k);
        sb.append(", background=");
        p123m2.c.A(this.f8003l, ", textDecoration=", sb);
        sb.append(this.f8004m);
        sb.append(", shadow=");
        sb.append(this.f8005n);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append(this.f8006o);
        sb.append(')');
        return sb.toString();
    }

    public C(p055f1.p pVar, long j, Y0.l lVar, Y0.j jVar, Y0.k kVar, Y0.e eVar, String str, long j10, p055f1.a aVar, p055f1.q qVar, p012b1.c cVar, long j11, p055f1.l lVar2, p180s0.I i10, u0 u0Var, p196u0.c cVar2) {
        this.f7994a = pVar;
        this.f7995b = j;
        this.f7996c = lVar;
        this.f7997d = jVar;
        this.f7998e = kVar;
        this.f7999f = eVar;
        this.g = str;
        this.f8000h = j10;
        this.f8001i = aVar;
        this.j = qVar;
        this.f8002k = cVar;
        this.f8003l = j11;
        this.f8004m = lVar2;
        this.f8005n = i10;
        this.f8006o = cVar2;
    }

    public C(long j, long j10, Y0.l lVar, Y0.j jVar, Y0.k kVar, Y0.e eVar, String str, long j11, p055f1.a aVar, p055f1.q qVar, p012b1.c cVar, long j12, p055f1.l lVar2, p180s0.I i10, int i11) {
        this((i11 & 1) != 0 ? p180s0.q.g : j, (i11 & 2) != 0 ? p063g1.o.f16266c : j10, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : jVar, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : eVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? p063g1.o.f16266c : j11, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : qVar, (i11 & 1024) != 0 ? null : cVar, (i11 & 2048) != 0 ? p180s0.q.g : j12, (i11 & 4096) != 0 ? null : lVar2, (i11 & 8192) != 0 ? null : i10, (u0) null);
    }
}
