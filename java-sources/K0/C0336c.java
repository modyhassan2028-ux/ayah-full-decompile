package K0;

/* JADX INFO: renamed from: K0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0336c extends AbstractC0332a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0336c f5065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p055f1.j f5066f = p055f1.j.f15910s;
    public static final p055f1.j g = p055f1.j.f15909r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U0.I f5067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public R0.p f5068d;

    @Override // K0.AbstractC0332a
    public final int[] f(int i10) {
        int iE;
        if (k().length() <= 0 || i10 >= k().length()) {
            return null;
        }
        try {
            R0.p pVar = this.f5068d;
            if (pVar == null) {
                p251z9.j.k("node");
                throw null;
            }
            p171r0.e eVarE = pVar.e();
            int iRound = Math.round(eVarE.f21392d - eVarE.f21390b);
            if (i10 <= 0) {
                i10 = 0;
            }
            U0.I i11 = this.f5067c;
            if (i11 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            int iD = i11.f8024b.d(i10);
            U0.I i12 = this.f5067c;
            if (i12 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            float f3 = i12.f8024b.f(iD) + iRound;
            U0.I i13 = this.f5067c;
            if (i13 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            if (i13 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            U0.p pVar2 = i13.f8024b;
            if (f3 < pVar2.f(pVar2.f8111f - 1)) {
                U0.I i14 = this.f5067c;
                if (i14 == null) {
                    p251z9.j.k("layoutResult");
                    throw null;
                }
                iE = i14.f8024b.e(f3);
            } else {
                U0.I i15 = this.f5067c;
                if (i15 == null) {
                    p251z9.j.k("layoutResult");
                    throw null;
                }
                iE = i15.f8024b.f8111f;
            }
            return j(i10, t(iE - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // K0.AbstractC0332a
    public final int[] n(int i10) {
        int iE;
        if (k().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            R0.p pVar = this.f5068d;
            if (pVar == null) {
                p251z9.j.k("node");
                throw null;
            }
            p171r0.e eVarE = pVar.e();
            int iRound = Math.round(eVarE.f21392d - eVarE.f21390b);
            int length = k().length();
            if (length <= i10) {
                i10 = length;
            }
            U0.I i11 = this.f5067c;
            if (i11 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            int iD = i11.f8024b.d(i10);
            U0.I i12 = this.f5067c;
            if (i12 == null) {
                p251z9.j.k("layoutResult");
                throw null;
            }
            float f3 = i12.f8024b.f(iD) - iRound;
            if (f3 > 0.0f) {
                U0.I i13 = this.f5067c;
                if (i13 == null) {
                    p251z9.j.k("layoutResult");
                    throw null;
                }
                iE = i13.f8024b.e(f3);
            } else {
                iE = 0;
            }
            if (i10 == k().length() && iE < iD) {
                iE++;
            }
            return j(t(iE, f5066f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int t(int i10, p055f1.j jVar) {
        U0.I i11 = this.f5067c;
        if (i11 == null) {
            p251z9.j.k("layoutResult");
            throw null;
        }
        int iF = i11.f(i10);
        U0.I i12 = this.f5067c;
        if (i12 == null) {
            p251z9.j.k("layoutResult");
            throw null;
        }
        if (jVar != i12.g(iF)) {
            U0.I i13 = this.f5067c;
            if (i13 != null) {
                return i13.f(i10);
            }
            p251z9.j.k("layoutResult");
            throw null;
        }
        U0.I i14 = this.f5067c;
        if (i14 != null) {
            return i14.f8024b.c(i10, false) - 1;
        }
        p251z9.j.k("layoutResult");
        throw null;
    }
}
