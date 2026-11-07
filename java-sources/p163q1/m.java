package p163q1;

import W.AbstractC0607v1;
import p153p1.c;
import p153p1.d;
import p153p1.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f21272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f21273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f21275e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21276f = 0;
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f21277h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f21278i = new f(this);
    public int j = 1;

    public m(e eVar) {
        this.f21272b = eVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f21264l.add(fVar2);
        fVar.f21260f = i10;
        fVar2.f21263k.add(fVar);
    }

    public static f h(c cVar) {
        c cVar2 = cVar.f20843d;
        if (cVar2 == null) {
            return null;
        }
        e eVar = cVar2.f20841b;
        j jVar = eVar.f20878d;
        l lVar = eVar.f20880e;
        int iB = AbstractC0607v1.b(cVar2.f20842c);
        if (iB == 1) {
            return jVar.f21277h;
        }
        if (iB == 2) {
            return lVar.f21277h;
        }
        if (iB == 3) {
            return jVar.f21278i;
        }
        if (iB == 4) {
            return lVar.f21278i;
        }
        if (iB != 5) {
            return null;
        }
        return lVar.f21269k;
    }

    public static f i(c cVar, int i10) {
        c cVar2 = cVar.f20843d;
        if (cVar2 == null) {
            return null;
        }
        e eVar = cVar2.f20841b;
        m mVar = i10 == 0 ? eVar.f20878d : eVar.f20880e;
        int iB = AbstractC0607v1.b(cVar2.f20842c);
        if (iB == 1 || iB == 2) {
            return mVar.f21277h;
        }
        if (iB == 3 || iB == 4) {
            return mVar.f21278i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f21264l.add(fVar2);
        fVar.f21264l.add(this.f21275e);
        fVar.f21261h = i10;
        fVar.f21262i = gVar;
        fVar2.f21263k.add(fVar);
        gVar.f21263k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            e eVar = this.f21272b;
            int i12 = eVar.f20889n;
            int iMax = Math.max(eVar.f20888m, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            e eVar2 = this.f21272b;
            int i13 = eVar2.f20892q;
            int iMax2 = Math.max(eVar2.f20891p, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long j() {
        g gVar = this.f21275e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(c cVar, c cVar2, int i10) {
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.j && fVarH2.j) {
            int iC = cVar.c() + fVarH.g;
            int iC2 = fVarH2.g - cVar2.c();
            int i11 = iC2 - iC;
            g gVar = this.f21275e;
            if (!gVar.j) {
                d dVar = this.f21274d;
                d dVar2 = d.f20848t;
                if (dVar == dVar2) {
                    int i12 = this.f21271a;
                    if (i12 == 0) {
                        gVar.d(g(i11, i10));
                    } else if (i12 == 1) {
                        gVar.d(Math.min(g(gVar.f21265m, i10), i11));
                    } else if (i12 == 2) {
                        e eVar = this.f21272b;
                        e eVar2 = eVar.f20861K;
                        if (eVar2 != null) {
                            g gVar2 = (i10 == 0 ? eVar2.f20878d : eVar2.f20880e).f21275e;
                            if (gVar2.j) {
                                gVar.d(g((int) ((gVar2.g * (i10 == 0 ? eVar.f20890o : eVar.f20893r)) + 0.5f), i10));
                            }
                        }
                    } else if (i12 == 3) {
                        e eVar3 = this.f21272b;
                        m mVar = eVar3.f20878d;
                        l lVar = eVar3.f20880e;
                        if (mVar.f21274d != dVar2 || mVar.f21271a != 3 || lVar.f21274d != dVar2 || lVar.f21271a != 3) {
                            if (i10 == 0) {
                                mVar = lVar;
                            }
                            g gVar3 = mVar.f21275e;
                            if (gVar3.j) {
                                float f3 = eVar3.f20864N;
                                gVar.d(i10 == 1 ? (int) ((gVar3.g / f3) + 0.5f) : (int) ((f3 * gVar3.g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (gVar.j) {
                int i13 = gVar.g;
                f fVar = this.f21278i;
                f fVar2 = this.f21277h;
                if (i13 == i11) {
                    fVar2.d(iC);
                    fVar.d(iC2);
                    return;
                }
                e eVar4 = this.f21272b;
                float f7 = i10 == 0 ? eVar4.U : eVar4.f20867V;
                if (fVarH == fVarH2) {
                    iC = fVarH.g;
                    iC2 = fVarH2.g;
                    f7 = 0.5f;
                }
                fVar2.d((int) ((((iC2 - iC) - i13) * f7) + iC + 0.5f));
                fVar.d(fVar2.g + gVar.g);
            }
        }
    }
}
