package X;

import W.C0585o;
import W.J0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p104k1.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p063g1.c f9793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0585o f9795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0633e f9796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0633e f9797f;
    public final O g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O f9798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0634f f9799i;
    public final C0634f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0634f f9800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P f9801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P f9802m;

    public w(long j, p063g1.c cVar, C0585o c0585o) {
        int iE = cVar.E(J0.f8603a);
        this.f9792a = j;
        this.f9793b = cVar;
        this.f9794c = iE;
        this.f9795d = c0585o;
        int iE2 = cVar.E(Float.intBitsToFloat((int) (j >> 32)));
        l0.h hVar = l0.c.f19309D;
        this.f9796e = new C0633e(hVar, hVar, iE2);
        l0.h hVar2 = l0.c.f19311F;
        this.f9797f = new C0633e(hVar2, hVar2, iE2);
        this.g = new O(l0.a.f19302c);
        this.f9798h = new O(l0.a.f19303d);
        int iE3 = cVar.E(Float.intBitsToFloat((int) (j & 4294967295L)));
        l0.i iVar = l0.c.f19306A;
        l0.i iVar2 = l0.c.f19308C;
        this.f9799i = new C0634f(iVar, iVar2, iE3);
        this.j = new C0634f(iVar2, iVar, iE3);
        this.f9800k = new C0634f(l0.c.f19307B, iVar, iE3);
        this.f9801l = new P(iVar, iE);
        this.f9802m = new P(iVar2, iE);
    }

    @Override // p104k1.s
    public final long a(p063g1.k kVar, long j, p063g1.m mVar, long j10) {
        p063g1.k kVar2;
        long j11;
        int iA;
        char c10;
        int i10;
        int i11 = (int) (j >> 32);
        int i12 = 0;
        List listS = p120l9.l.S(new G[]{this.f9796e, this.f9797f, ((int) (kVar.a() >> 32)) < i11 / 2 ? this.g : this.f9798h});
        int size = listS.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                kVar2 = kVar;
                j11 = j;
                iA = 0;
                break;
            }
            int i14 = (int) (j10 >> 32);
            kVar2 = kVar;
            j11 = j;
            iA = ((G) listS.get(i13)).a(kVar2, j11, i14, mVar);
            if (i13 == AbstractC0813f2.E(listS) || (iA >= 0 && i14 + iA <= i11)) {
                break;
            }
            i13++;
        }
        char c11 = ' ';
        int i15 = (int) (j11 & 4294967295L);
        List listS2 = p120l9.l.S(new H[]{this.f9799i, this.j, this.f9800k, ((int) (kVar2.a() & 4294967295L)) < i15 / 2 ? this.f9801l : this.f9802m});
        int size2 = listS2.size();
        int i16 = 0;
        while (i16 < size2) {
            c10 = c11;
            int i17 = i15;
            int i18 = (int) (j10 & 4294967295L);
            int iA2 = ((H) listS2.get(i16)).a(kVar2, j11, i18);
            if (i16 == AbstractC0813f2.E(listS2) || (iA2 >= (i10 = this.f9794c) && i18 + iA2 <= i17 - i10)) {
                i12 = iA2;
                long jD = va.g.d(iA, i12);
                int i19 = (int) (jD >> c10);
                int i20 = (int) (jD & 4294967295L);
                this.f9795d.invoke(kVar2, new p063g1.k(i19, i20, ((int) (j10 >> c10)) + i19, ((int) (j10 & 4294967295L)) + i20));
                return jD;
            }
            i16++;
            c11 = c10;
            i15 = i17;
        }
        c10 = c11;
        long jD2 = va.g.d(iA, i12);
        int i110 = (int) (jD2 >> c10);
        int i21 = (int) (jD2 & 4294967295L);
        this.f9795d.invoke(kVar2, new p063g1.k(i110, i21, ((int) (j10 >> c10)) + i110, ((int) (j10 & 4294967295L)) + i21));
        return jD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f9792a == wVar.f9792a && p251z9.j.a(this.f9793b, wVar.f9793b) && this.f9794c == wVar.f9794c && p251z9.j.a(this.f9795d, wVar.f9795d);
    }

    public final int hashCode() {
        long j = this.f9792a;
        return this.f9795d.hashCode() + ((((this.f9793b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + this.f9794c) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) p063g1.g.a(this.f9792a)) + ", density=" + this.f9793b + ", verticalMargin=" + this.f9794c + ", onPositionCalculated=" + this.f9795d + ')';
    }
}
