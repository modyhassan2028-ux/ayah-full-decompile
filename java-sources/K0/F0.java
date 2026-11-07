package K0;

import I1.C0262o;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements C0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0262o f4926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f4927s;

    public F0(View view) {
        C0262o c0262o = new C0262o(view);
        if (c0262o.f3768d) {
            WeakHashMap weakHashMap = I1.S.f3689a;
            I1.I.n(view);
        }
        c0262o.f3768d = true;
        this.f4926r = c0262o;
        this.f4927s = new int[2];
        WeakHashMap weakHashMap2 = I1.S.f3689a;
        I1.I.l(view, true);
    }

    @Override // C0.a
    public final long B(int i10, long j, long j10) {
        if (!this.f4926r.g(P.a(j10), (i10 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.f4927s;
        p120l9.l.f0(iArr, 0);
        int iE = P.e(Float.intBitsToFloat((int) (j >> 32)));
        int iE2 = P.e(Float.intBitsToFloat((int) (j & 4294967295L)));
        int iE3 = P.e(Float.intBitsToFloat((int) (j10 >> 32)));
        int iE4 = P.e(Float.intBitsToFloat((int) (4294967295L & j10)));
        int i11 = i10 == 1 ? 1 : 0;
        this.f4926r.d(iE, iE2, iE3, iE4, null, i11 ^ 1, this.f4927s);
        return P.b(iArr, j10);
    }

    @Override // C0.a
    public final Object T(long j, long j10, p150o9.c cVar) {
        float fB = p063g1.q.b(j10) * (-1.0f);
        float fC = p063g1.q.c(j10) * (-1.0f);
        C0262o c0262o = this.f4926r;
        if (!c0262o.a(fB, fC, true)) {
            j10 = 0;
        }
        if (c0262o.f(0)) {
            c0262o.h(0);
        }
        if (c0262o.f(1)) {
            c0262o.h(1);
        }
        return new p063g1.q(j10);
    }

    @Override // C0.a
    public final Object h(long j, p150o9.c cVar) {
        float fB = p063g1.q.b(j) * (-1.0f);
        float fC = p063g1.q.c(j) * (-1.0f);
        C0262o c0262o = this.f4926r;
        if (!c0262o.b(fB, fC)) {
            j = 0;
        }
        if (c0262o.f(0)) {
            c0262o.h(0);
        }
        if (c0262o.f(1)) {
            c0262o.h(1);
        }
        return new p063g1.q(j);
    }

    @Override // C0.a
    public final long m(long j, int i10) {
        if (!this.f4926r.g(P.a(j), (i10 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.f4927s;
        p120l9.l.f0(iArr, 0);
        this.f4926r.c(P.e(Float.intBitsToFloat((int) (j >> 32))), P.e(Float.intBitsToFloat((int) (4294967295L & j))), (i10 == 1 ? 1 : 0) ^ 1, this.f4927s, null);
        return P.b(iArr, j);
    }
}
