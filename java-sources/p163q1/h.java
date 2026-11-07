package p163q1;

import p153p1.e;
import p153p1.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    @Override // p163q1.d
    public final void a(d dVar) {
        f fVar = this.f21277h;
        if (fVar.f21257c && !fVar.j) {
            fVar.d((int) ((((f) fVar.f21264l.get(0)).g * ((i) this.f21272b).f20968g0) + 0.5f));
        }
    }

    @Override // p163q1.m
    public final void d() {
        e eVar = this.f21272b;
        i iVar = (i) eVar;
        int i10 = iVar.f20969h0;
        int i11 = iVar.f20970i0;
        int i12 = iVar.f20972k0;
        f fVar = this.f21277h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f21264l.add(eVar.f20861K.f20878d.f21277h);
                this.f21272b.f20861K.f20878d.f21277h.f21263k.add(fVar);
                fVar.f21260f = i10;
            } else if (i11 != -1) {
                fVar.f21264l.add(eVar.f20861K.f20878d.f21278i);
                this.f21272b.f20861K.f20878d.f21278i.f21263k.add(fVar);
                fVar.f21260f = -i11;
            } else {
                fVar.f21256b = true;
                fVar.f21264l.add(eVar.f20861K.f20878d.f21278i);
                this.f21272b.f20861K.f20878d.f21278i.f21263k.add(fVar);
            }
            m(this.f21272b.f20878d.f21277h);
            m(this.f21272b.f20878d.f21278i);
            return;
        }
        if (i10 != -1) {
            fVar.f21264l.add(eVar.f20861K.f20880e.f21277h);
            this.f21272b.f20861K.f20880e.f21277h.f21263k.add(fVar);
            fVar.f21260f = i10;
        } else if (i11 != -1) {
            fVar.f21264l.add(eVar.f20861K.f20880e.f21278i);
            this.f21272b.f20861K.f20880e.f21278i.f21263k.add(fVar);
            fVar.f21260f = -i11;
        } else {
            fVar.f21256b = true;
            fVar.f21264l.add(eVar.f20861K.f20880e.f21278i);
            this.f21272b.f20861K.f20880e.f21278i.f21263k.add(fVar);
        }
        m(this.f21272b.f20880e.f21277h);
        m(this.f21272b.f20880e.f21278i);
    }

    @Override // p163q1.m
    public final void e() {
        e eVar = this.f21272b;
        int i10 = ((i) eVar).f20972k0;
        f fVar = this.f21277h;
        if (i10 == 1) {
            eVar.f20866P = fVar.g;
        } else {
            eVar.Q = fVar.g;
        }
    }

    @Override // p163q1.m
    public final void f() {
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
