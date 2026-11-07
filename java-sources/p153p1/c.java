package p153p1;

import W.AbstractC0607v1;
import java.util.HashSet;
import java.util.Iterator;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f20843d;
    public h g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f20840a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20844e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20845f = -1;

    public c(e eVar, int i10) {
        this.f20841b = eVar;
        this.f20842c = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, -1, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z10) {
        if (cVar == null) {
            h();
            return true;
        }
        if (!z10 && !g(cVar)) {
            return false;
        }
        this.f20843d = cVar;
        if (cVar.f20840a == null) {
            cVar.f20840a = new HashSet();
        }
        this.f20843d.f20840a.add(this);
        if (i10 > 0) {
            this.f20844e = i10;
        } else {
            this.f20844e = 0;
        }
        this.f20845f = i11;
        return true;
    }

    public final int c() {
        c cVar;
        if (this.f20841b.f20869X == 8) {
            return 0;
        }
        int i10 = this.f20845f;
        return (i10 <= -1 || (cVar = this.f20843d) == null || cVar.f20841b.f20869X != 8) ? this.f20844e : i10;
    }

    public final c d() {
        int i10 = this.f20842c;
        int iB = AbstractC0607v1.b(i10);
        e eVar = this.f20841b;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f20851A;
            case 2:
                return eVar.f20852B;
            case 3:
                return eVar.f20900y;
            case 4:
                return eVar.f20901z;
            default:
                throw new AssertionError(p123m2.c.E(i10));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f20840a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f20843d != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[RETURN] */
    public final boolean g(c cVar) {
        if (cVar != null) {
            e eVar = cVar.f20841b;
            int i10 = cVar.f20842c;
            int i11 = this.f20842c;
            if (i10 != i11) {
                switch (AbstractC0607v1.b(i11)) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z10 = i10 == 2 || i10 == 4;
                        if (!(eVar instanceof i)) {
                            return z10;
                        }
                        if (z10 || i10 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z11 = i10 == 3 || i10 == 5;
                        if (!(eVar instanceof i)) {
                            return z11;
                        }
                        if (z11 || i10 == 9) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i10 != 6 && i10 != 8 && i10 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(p123m2.c.E(i11));
                }
            } else if (i11 != 6 || (eVar.f20898w && this.f20841b.f20898w)) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        HashSet hashSet;
        c cVar = this.f20843d;
        if (cVar != null && (hashSet = cVar.f20840a) != null) {
            hashSet.remove(this);
        }
        this.f20843d = null;
        this.f20844e = 0;
        this.f20845f = -1;
    }

    public final void i() {
        h hVar = this.g;
        if (hVar == null) {
            this.g = new h(1);
        } else {
            hVar.c();
        }
    }

    public final String toString() {
        return this.f20841b.f20870Y + ":" + p123m2.c.E(this.f20842c);
    }
}
