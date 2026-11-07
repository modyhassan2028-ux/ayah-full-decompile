package U0;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L f8036d = new L(0, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f8038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8039c;

    public L(C c10, u uVar, x xVar) {
        this.f8037a = c10;
        this.f8038b = uVar;
        this.f8039c = xVar;
    }

    public static L a(L l10, long j, long j10, Y0.l lVar, Y0.e eVar, long j11, long j12, p055f1.i iVar, int i10) {
        p055f1.p cVar;
        long jB = (i10 & 1) != 0 ? l10.f8037a.f7994a.b() : j;
        long j13 = (i10 & 2) != 0 ? l10.f8037a.f7995b : j10;
        Y0.l lVar2 = (i10 & 4) != 0 ? l10.f8037a.f7996c : lVar;
        C c10 = l10.f8037a;
        Y0.j jVar = c10.f7997d;
        Y0.k kVar = c10.f7998e;
        Y0.e eVar2 = (i10 & 32) != 0 ? c10.f7999f : eVar;
        String str = c10.g;
        long j14 = (i10 & 128) != 0 ? c10.f8000h : j11;
        p055f1.a aVar = c10.f8001i;
        p055f1.q qVar = c10.j;
        p012b1.c cVar2 = c10.f8002k;
        long j15 = c10.f8003l;
        p055f1.l lVar3 = c10.f8004m;
        p180s0.I i11 = c10.f8005n;
        p196u0.c cVar3 = c10.f8006o;
        int i12 = (i10 & 32768) != 0 ? l10.f8038b.f8124a : 3;
        u uVar = l10.f8038b;
        int i13 = uVar.f8125b;
        long j16 = (i10 & 131072) != 0 ? uVar.f8126c : j12;
        p055f1.r rVar = uVar.f8127d;
        x xVar = (i10 & 524288) != 0 ? l10.f8039c : X.t.f9786a;
        p055f1.i iVar2 = (i10 & 1048576) != 0 ? uVar.f8129f : iVar;
        int i14 = uVar.g;
        int i15 = uVar.f8130h;
        p055f1.t tVar = uVar.f8131i;
        if (p180s0.q.c(jB, c10.f7994a.b())) {
            cVar = c10.f7994a;
        } else {
            cVar = jB != 16 ? new p055f1.c(jB) : p055f1.n.f15918a;
        }
        return new L(new C(cVar, j13, lVar2, jVar, kVar, eVar2, str, j14, aVar, qVar, cVar2, j15, lVar3, i11, null, cVar3), new u(i12, i13, j16, rVar, xVar != null ? xVar.f8135a : null, iVar2, i14, i15, tVar), xVar);
    }

    public static L e(L l10, long j, long j10, Y0.l lVar, Y0.e eVar, long j11, int i10, long j12, int i11) {
        long j13 = (i11 & 2) != 0 ? p063g1.o.f16266c : j10;
        Y0.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        Y0.e eVar2 = (i11 & 32) != 0 ? null : eVar;
        long j14 = (i11 & 128) != 0 ? p063g1.o.f16266c : j11;
        long j15 = p180s0.q.g;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j16 = (i11 & 131072) != 0 ? p063g1.o.f16266c : j12;
        C cA = E.a(l10.f8037a, j, null, Float.NaN, j13, lVar2, null, null, eVar2, null, j14, null, null, null, j15, null, null, null, null);
        u uVarA = v.a(l10.f8038b, i12, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        return (l10.f8037a == cA && l10.f8038b == uVarA) ? l10 : new L(cA, uVarA);
    }

    public final long b() {
        return this.f8037a.f7994a.b();
    }

    public final boolean c(L l10) {
        if (this != l10) {
            return p251z9.j.a(this.f8038b, l10.f8038b) && this.f8037a.a(l10.f8037a);
        }
        return true;
    }

    public final L d(L l10) {
        return (l10 == null || l10.equals(f8036d)) ? this : new L(this.f8037a.c(l10.f8037a), this.f8038b.a(l10.f8038b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return p251z9.j.a(this.f8037a, l10.f8037a) && p251z9.j.a(this.f8038b, l10.f8038b) && p251z9.j.a(this.f8039c, l10.f8039c);
    }

    public final int hashCode() {
        int iHashCode = (this.f8038b.hashCode() + (this.f8037a.hashCode() * 31)) * 31;
        x xVar = this.f8039c;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) p180s0.q.i(b()));
        sb.append(", brush=");
        C c10 = this.f8037a;
        sb.append(c10.f7994a.e());
        sb.append(", alpha=");
        sb.append(c10.f7994a.c());
        sb.append(", fontSize=");
        sb.append((Object) p063g1.o.e(c10.f7995b));
        sb.append(", fontWeight=");
        sb.append(c10.f7996c);
        sb.append(", fontStyle=");
        sb.append(c10.f7997d);
        sb.append(", fontSynthesis=");
        sb.append(c10.f7998e);
        sb.append(", fontFamily=");
        sb.append(c10.f7999f);
        sb.append(", fontFeatureSettings=");
        sb.append(c10.g);
        sb.append(", letterSpacing=");
        sb.append((Object) p063g1.o.e(c10.f8000h));
        sb.append(", baselineShift=");
        sb.append(c10.f8001i);
        sb.append(", textGeometricTransform=");
        sb.append(c10.j);
        sb.append(", localeList=");
        sb.append(c10.f8002k);
        sb.append(", background=");
        p123m2.c.A(c10.f8003l, ", textDecoration=", sb);
        sb.append(c10.f8004m);
        sb.append(", shadow=");
        sb.append(c10.f8005n);
        sb.append(", drawStyle=");
        sb.append(c10.f8006o);
        sb.append(", textAlign=");
        u uVar = this.f8038b;
        sb.append((Object) p055f1.k.a(uVar.f8124a));
        sb.append(", textDirection=");
        sb.append((Object) p055f1.m.a(uVar.f8125b));
        sb.append(", lineHeight=");
        sb.append((Object) p063g1.o.e(uVar.f8126c));
        sb.append(", textIndent=");
        sb.append(uVar.f8127d);
        sb.append(", platformStyle=");
        sb.append(this.f8039c);
        sb.append(", lineHeightStyle=");
        sb.append(uVar.f8129f);
        sb.append(", lineBreak=");
        sb.append((Object) p055f1.e.a(uVar.g));
        sb.append(", hyphens=");
        sb.append((Object) p055f1.d.a(uVar.f8130h));
        sb.append(", textMotion=");
        sb.append(uVar.f8131i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public L(C c10, u uVar) {
        c10.getClass();
        w wVar = uVar.f8128e;
        this(c10, uVar, wVar == null ? null : new x(null, wVar));
    }

    public L(long j, long j10, Y0.l lVar, long j11, int i10, long j12, int i11) {
        this(new C((i11 & 1) != 0 ? p180s0.q.g : j, (i11 & 2) != 0 ? p063g1.o.f16266c : j10, (i11 & 4) != 0 ? null : lVar, (Y0.j) null, (Y0.k) null, (Y0.e) null, (String) null, (i11 & 128) != 0 ? p063g1.o.f16266c : j11, (p055f1.a) null, (p055f1.q) null, (p012b1.c) null, p180s0.q.g, (p055f1.l) null, (p180s0.I) null, (u0) null), new u((32768 & i11) != 0 ? Integer.MIN_VALUE : i10, Integer.MIN_VALUE, (i11 & 131072) != 0 ? p063g1.o.f16266c : j12, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
