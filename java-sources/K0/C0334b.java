package K0;

import java.text.BreakIterator;

/* JADX INFO: renamed from: K0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334b extends AbstractC0332a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0334b f5058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0334b f5059f;
    public static C0334b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p055f1.j f5060h = p055f1.j.f15910s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p055f1.j f5061i = p055f1.j.f15909r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5063d;

    @Override // K0.AbstractC0332a
    public final int[] f(int i10) {
        int iD;
        switch (this.f5062c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f5063d;
                    if (breakIterator == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f5063d;
                        if (breakIterator2 == null) {
                            p251z9.j.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return j(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f5063d;
                    if (breakIterator3 == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            case 1:
                if (k().length() <= 0 || i10 >= k().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!w(i10) && (!w(i10) || (i10 != 0 && w(i10 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f5063d;
                    if (breakIterator4 == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f5063d;
                if (breakIterator5 == null) {
                    p251z9.j.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !v(iFollowing2)) {
                    return null;
                }
                return j(i10, iFollowing2);
            default:
                if (k().length() <= 0 || i10 >= k().length()) {
                    return null;
                }
                p055f1.j jVar = f5060h;
                if (i10 < 0) {
                    U0.I i11 = (U0.I) this.f5063d;
                    if (i11 == null) {
                        p251z9.j.k("layoutResult");
                        throw null;
                    }
                    iD = i11.f8024b.d(0);
                } else {
                    U0.I i12 = (U0.I) this.f5063d;
                    if (i12 == null) {
                        p251z9.j.k("layoutResult");
                        throw null;
                    }
                    int iD2 = i12.f8024b.d(i10);
                    iD = t(iD2, jVar) == i10 ? iD2 : iD2 + 1;
                }
                U0.I i13 = (U0.I) this.f5063d;
                if (i13 == null) {
                    p251z9.j.k("layoutResult");
                    throw null;
                }
                if (iD >= i13.f8024b.f8111f) {
                    return null;
                }
                return j(t(iD, jVar), t(iD, f5061i) + 1);
        }
    }

    @Override // K0.AbstractC0332a
    public final int[] n(int i10) {
        int iD;
        switch (this.f5062c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f5063d;
                    if (breakIterator == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f5063d;
                        if (breakIterator2 == null) {
                            p251z9.j.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return j(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f5063d;
                    if (breakIterator3 == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            case 1:
                int length2 = k().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !w(i10 - 1) && !v(i10)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f5063d;
                    if (breakIterator4 == null) {
                        p251z9.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f5063d;
                if (breakIterator5 == null) {
                    p251z9.j.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !w(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !w(iPreceding2 - 1)) {
                    return j(iPreceding2, i10);
                }
                return null;
            default:
                if (k().length() <= 0 || i10 <= 0) {
                    return null;
                }
                int length3 = k().length();
                p055f1.j jVar = f5061i;
                if (i10 > length3) {
                    U0.I i11 = (U0.I) this.f5063d;
                    if (i11 == null) {
                        p251z9.j.k("layoutResult");
                        throw null;
                    }
                    iD = i11.f8024b.d(k().length());
                } else {
                    U0.I i12 = (U0.I) this.f5063d;
                    if (i12 == null) {
                        p251z9.j.k("layoutResult");
                        throw null;
                    }
                    int iD2 = i12.f8024b.d(i10);
                    iD = t(iD2, jVar) + 1 == i10 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return j(t(iD, f5060h), t(iD, jVar) + 1);
        }
    }

    public int t(int i10, p055f1.j jVar) {
        U0.I i11 = (U0.I) this.f5063d;
        if (i11 == null) {
            p251z9.j.k("layoutResult");
            throw null;
        }
        int iF = i11.f(i10);
        U0.I i12 = (U0.I) this.f5063d;
        if (i12 == null) {
            p251z9.j.k("layoutResult");
            throw null;
        }
        if (jVar != i12.g(iF)) {
            U0.I i13 = (U0.I) this.f5063d;
            if (i13 != null) {
                return i13.f(i10);
            }
            p251z9.j.k("layoutResult");
            throw null;
        }
        U0.I i14 = (U0.I) this.f5063d;
        if (i14 != null) {
            return i14.f8024b.c(i10, false) - 1;
        }
        p251z9.j.k("layoutResult");
        throw null;
    }

    public void u(String str) {
        switch (this.f5062c) {
            case 0:
                this.f5052a = str;
                BreakIterator breakIterator = (BreakIterator) this.f5063d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    p251z9.j.k("impl");
                    throw null;
                }
            default:
                this.f5052a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f5063d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    p251z9.j.k("impl");
                    throw null;
                }
        }
    }

    public boolean v(int i10) {
        if (i10 <= 0 || !w(i10 - 1)) {
            return false;
        }
        return i10 == k().length() || !w(i10);
    }

    public boolean w(int i10) {
        if (i10 < 0 || i10 >= k().length()) {
            return false;
        }
        return Character.isLetterOrDigit(k().codePointAt(i10));
    }
}
