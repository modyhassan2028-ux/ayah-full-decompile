package p163q1;

import java.util.ArrayList;
import p153p1.a;
import p153p1.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {
    @Override // p163q1.d
    public final void a(d dVar) {
        a aVar = (a) this.f21272b;
        int i10 = aVar.f20822i0;
        f fVar = this.f21277h;
        ArrayList arrayList = fVar.f21264l;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            int i14 = ((f) obj).g;
            if (i12 == -1 || i14 < i12) {
                i12 = i14;
            }
            if (i11 < i14) {
                i11 = i14;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f20824k0);
        } else {
            fVar.d(i11 + aVar.f20824k0);
        }
    }

    @Override // p163q1.m
    public final void d() {
        e eVar = this.f21272b;
        if (eVar instanceof a) {
            f fVar = this.f21277h;
            fVar.f21256b = true;
            ArrayList arrayList = fVar.f21264l;
            a aVar = (a) eVar;
            int i10 = aVar.f20822i0;
            boolean z10 = aVar.f20823j0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f21259e = 4;
                while (i11 < aVar.f20974h0) {
                    e eVar2 = aVar.f20973g0[i11];
                    if (z10 || eVar2.f20869X != 8) {
                        f fVar2 = eVar2.f20878d.f21277h;
                        fVar2.f21263k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i11++;
                }
                m(this.f21272b.f20878d.f21277h);
                m(this.f21272b.f20878d.f21278i);
                return;
            }
            if (i10 == 1) {
                fVar.f21259e = 5;
                while (i11 < aVar.f20974h0) {
                    e eVar3 = aVar.f20973g0[i11];
                    if (z10 || eVar3.f20869X != 8) {
                        f fVar3 = eVar3.f20878d.f21278i;
                        fVar3.f21263k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i11++;
                }
                m(this.f21272b.f20878d.f21277h);
                m(this.f21272b.f20878d.f21278i);
                return;
            }
            if (i10 == 2) {
                fVar.f21259e = 6;
                while (i11 < aVar.f20974h0) {
                    e eVar4 = aVar.f20973g0[i11];
                    if (z10 || eVar4.f20869X != 8) {
                        f fVar4 = eVar4.f20880e.f21277h;
                        fVar4.f21263k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i11++;
                }
                m(this.f21272b.f20880e.f21277h);
                m(this.f21272b.f20880e.f21278i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            fVar.f21259e = 7;
            while (i11 < aVar.f20974h0) {
                e eVar5 = aVar.f20973g0[i11];
                if (z10 || eVar5.f20869X != 8) {
                    f fVar5 = eVar5.f20880e.f21278i;
                    fVar5.f21263k.add(fVar);
                    arrayList.add(fVar5);
                }
                i11++;
            }
            m(this.f21272b.f20880e.f21277h);
            m(this.f21272b.f20880e.f21278i);
        }
    }

    @Override // p163q1.m
    public final void e() {
        e eVar = this.f21272b;
        if (eVar instanceof a) {
            int i10 = ((a) eVar).f20822i0;
            f fVar = this.f21277h;
            if (i10 == 0 || i10 == 1) {
                eVar.f20866P = fVar.g;
            } else {
                eVar.Q = fVar.g;
            }
        }
    }

    @Override // p163q1.m
    public final void f() {
        this.f21273c = null;
        this.f21277h.c();
    }

    @Override // p163q1.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f21277h;
        fVar2.f21263k.add(fVar);
        fVar.f21264l.add(fVar2);
    }
}
