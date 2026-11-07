package Y9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0645a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U9.a f10455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f10456b;

    public D(U9.a aVar) {
        Z z10 = Z.f10495a;
        this.f10455a = aVar;
        this.f10456b = new C(Z.f10496b, aVar.d());
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        h(obj);
        C c10 = this.f10456b;
        p251z9.j.e(c10, "descriptor");
        p009aa.n nVarA = nVar.a(c10);
        Iterator itG = g(obj);
        int i10 = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            nVarA.o(c10, i10, Z.f10495a, key);
            i10 += 2;
            nVarA.o(c10, i11, this.f10455a, value);
        }
        nVarA.t(c10);
    }

    @Override // U9.a
    public final W9.f d() {
        return this.f10456b;
    }

    @Override // Y9.AbstractC0645a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // Y9.AbstractC0645a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        p251z9.j.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // Y9.AbstractC0645a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        p251z9.j.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        Map map = (Map) obj;
        p251z9.j.e(map, "<this>");
        return map.size();
    }

    @Override // Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        Map map = (Map) obj;
        p251z9.j.e(map, "builder");
        Z z10 = Z.f10495a;
        C c10 = this.f10456b;
        Object objF = aVar.f(c10, i10, z10, null);
        int iH = aVar.h(c10);
        if (iH != i10 + 1) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i10, iH, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objF);
        U9.a aVar2 = this.f10455a;
        map.put(objF, (!zContainsKey || (aVar2.d().c() instanceof W9.e)) ? aVar.f(c10, iH, aVar2, null) : aVar.f(c10, iH, aVar2, p120l9.w.f0(objF, map)));
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        p251z9.j.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // Y9.AbstractC0645a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        p251z9.j.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
