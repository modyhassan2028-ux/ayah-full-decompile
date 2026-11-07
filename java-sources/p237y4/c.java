package p237y4;

import A.C0040q0;
import E2.N0;
import G.V;
import K9.AbstractC0405x;
import K9.H;
import R9.d;
import R9.e;
import java.util.LinkedHashMap;
import java.util.Map;
import p110k9.a;
import p110k9.y;
import p218w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f24638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N0 f24639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f24640c;

    public c(j jVar) {
        p251z9.j.e(jVar, "suraModel");
        this.f24638a = jVar;
        this.f24639b = new N0(2);
        this.f24640c = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q9.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f24633t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24633t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objI = aVar.f24631r;
        int i11 = aVar.f24633t;
        LinkedHashMap linkedHashMap = this.f24640c;
        if (i11 == 0) {
            a.e(objI);
            if (linkedHashMap.isEmpty()) {
                e eVar = H.f5322a;
                d dVar = d.f7436t;
                C0040q0 c0040q0 = new C0040q0(this, (p150o9.c) null, 26);
                aVar.f24633t = 1;
                objI = AbstractC0405x.I(dVar, c0040q0, aVar);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objI == aVar2) {
                    return aVar2;
                }
            }
            return y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.e(objI);
        linkedHashMap.putAll((Map) objI);
        return y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i10, q9.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f24637u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f24637u = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objI = bVar.f24635s;
        int i12 = bVar.f24637u;
        N0 n6 = this.f24639b;
        if (i12 == 0) {
            a.e(objI);
            p124m3.a aVar = (p124m3.a) n6.g(new Integer(i10));
            if (aVar != null) {
                return aVar;
            }
            e eVar = H.f5322a;
            d dVar = d.f7436t;
            V v10 = new V(i10, 7, this, null);
            bVar.f24634r = i10;
            bVar.f24637u = 1;
            objI = AbstractC0405x.I(dVar, v10, bVar);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objI == aVar2) {
                return aVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = bVar.f24634r;
            a.e(objI);
        }
        p124m3.a aVar3 = (p124m3.a) objI;
        n6.k(new Integer(i10), aVar3);
        return aVar3;
    }
}
