package p150o9;

import java.io.Serializable;
import p026c5.a;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f20377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f20378s;

    public b(f fVar, h hVar) {
        j.e(hVar, "left");
        j.e(fVar, "element");
        this.f20377r = hVar;
        this.f20378s = fVar;
    }

    @Override // p150o9.h
    public final h A(g gVar) {
        j.e(gVar, "key");
        f fVar = this.f20378s;
        f fVarI = fVar.i(gVar);
        h hVar = this.f20377r;
        if (fVarI != null) {
            return hVar;
        }
        h hVarA = hVar.A(gVar);
        if (hVarA == hVar) {
            return this;
        }
        return hVarA == i.f20380r ? fVar : new b(fVar, hVarA);
    }

    @Override // p150o9.h
    public final Object F(Object obj, e eVar) {
        return eVar.invoke(this.f20377r.F(obj, eVar), this.f20378s);
    }

    @Override // p150o9.h
    public final h L(h hVar) {
        j.e(hVar, "context");
        return hVar == i.f20380r ? this : (h) hVar.F(this, new a(11));
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i10 = 2;
            b bVar2 = bVar;
            int i11 = 2;
            while (true) {
                h hVar = bVar2.f20377r;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i11++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f20377r;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f20378s;
                    if (!j.a(bVar.i(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f20377r;
                    if (!(hVar3 instanceof b)) {
                        j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = j.a(bVar.i(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20378s.hashCode() + this.f20377r.hashCode();
    }

    @Override // p150o9.h
    public final f i(g gVar) {
        j.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarI = bVar.f20378s.i(gVar);
            if (fVarI != null) {
                return fVarI;
            }
            h hVar = bVar.f20377r;
            if (!(hVar instanceof b)) {
                return hVar.i(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("["), (String) F("", new a(10)), ']');
    }
}
