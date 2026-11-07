package J;

import p063g1.m;
import p171r0.f;
import p171r0.g;
import p171r0.i;
import p180s0.C;
import p180s0.D;
import p180s0.F;
import p180s0.J;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements J {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f3867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f3868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f3869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f3870u;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f3867r = aVar;
        this.f3868s = aVar2;
        this.f3869t = aVar3;
        this.f3870u = aVar4;
    }

    public static d a(d dVar, b bVar, b bVar2, b bVar3, b bVar4, int i10) {
        a aVar = bVar;
        if ((i10 & 1) != 0) {
            aVar = dVar.f3867r;
        }
        a aVar2 = bVar2;
        if ((i10 & 2) != 0) {
            aVar2 = dVar.f3868s;
        }
        a aVar3 = bVar3;
        if ((i10 & 4) != 0) {
            aVar3 = dVar.f3869t;
        }
        a aVar4 = bVar4;
        if ((i10 & 8) != 0) {
            aVar4 = dVar.f3870u;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // p180s0.J
    public final F c(long j, m mVar, p063g1.c cVar) {
        float fA = this.f3867r.a(j, cVar);
        float fA2 = this.f3868s.a(j, cVar);
        float fA3 = this.f3869t.a(j, cVar);
        float fA4 = this.f3870u.a(j, cVar);
        float fC = i.c(j);
        float f3 = fA + fA4;
        if (f3 > fC) {
            float f7 = fC / f3;
            fA *= f7;
            fA4 *= f7;
        }
        float f10 = fA2 + fA3;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA2 *= f11;
            fA3 *= f11;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            C.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new C(f.d(0L, j));
        }
        p171r0.e eVarD = f.d(0L, j);
        m mVar2 = m.f16261r;
        float f12 = mVar == mVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
        if (mVar == mVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f13 = mVar == mVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        if (mVar != mVar2) {
            fA4 = fA3;
        }
        return new D(new g(eVarD.f21389a, eVarD.f21390b, eVarD.f21391c, eVarD.f21392d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f3867r, dVar.f3867r) && j.a(this.f3868s, dVar.f3868s) && j.a(this.f3869t, dVar.f3869t) && j.a(this.f3870u, dVar.f3870u);
    }

    public final int hashCode() {
        return this.f3870u.hashCode() + ((this.f3869t.hashCode() + ((this.f3868s.hashCode() + (this.f3867r.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f3867r + ", topEnd = " + this.f3868s + ", bottomEnd = " + this.f3869t + ", bottomStart = " + this.f3870u + ')';
    }
}
