package W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p110k9.y;
import p120l9.m;
import p120l9.w;
import z3.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f9502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f9503t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f9501r = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f9501r) {
            case 0:
                i iVar = new i(3, (p150o9.c) obj3, 0);
                iVar.f9502s = (V1.e) obj;
                iVar.f9503t = (X1.b) obj2;
                return iVar.invokeSuspend(y.f19095a);
            case 1:
                i iVar2 = new i(3, (p150o9.c) obj3, 1);
                iVar2.f9502s = (List) obj;
                iVar2.f9503t = (Map) obj2;
                return iVar2.invokeSuspend(y.f19095a);
            case 2:
                i iVar3 = new i(3, (p150o9.c) obj3, 2);
                iVar3.f9502s = (z3.j) obj;
                iVar3.f9503t = (p095j3.a) obj2;
                return iVar3.invokeSuspend(y.f19095a);
            case 3:
                i iVar4 = new i(3, (p150o9.c) obj3, 3);
                iVar4.f9502s = (n) obj;
                iVar4.f9503t = (Map) obj2;
                return iVar4.invokeSuspend(y.f19095a);
            default:
                i iVar5 = new i(3, (p150o9.c) obj3, 4);
                iVar5.f9502s = (p065g3.a) obj;
                iVar5.f9503t = (p165q3.d) obj2;
                return iVar5.invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9501r) {
            case 0:
                p110k9.a.e(obj);
                V1.e eVar = (V1.e) this.f9502s;
                X1.b bVar = (X1.b) this.f9503t;
                Set setKeySet = bVar.a().keySet();
                ArrayList arrayList = new ArrayList(p120l9.n.a0(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((X1.e) it.next()).f9850a);
                }
                Map<String, ?> all = eVar.f8412a.getAll();
                p251z9.j.d(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = eVar.f8413b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(w.g0(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Set) {
                        value = m.G0((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                X1.b bVarG = bVar.g();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (value2 instanceof Boolean) {
                        bVarG.f(B9.a.g(str), value2);
                    } else if (value2 instanceof Float) {
                        p251z9.j.e(str, "name");
                        bVarG.f(new X1.e(str), value2);
                    } else if (value2 instanceof Integer) {
                        bVarG.f(B9.a.J(str), value2);
                    } else if (value2 instanceof Long) {
                        p251z9.j.e(str, "name");
                        bVarG.f(new X1.e(str), value2);
                    } else if (value2 instanceof String) {
                        bVarG.f(B9.a.Z(str), value2);
                    } else if (value2 instanceof Set) {
                        bVarG.f(B9.a.a0(str), (Set) value2);
                    }
                }
                return bVarG.h();
            case 1:
                List list = (List) this.f9502s;
                Map map = (Map) this.f9503t;
                p110k9.a.e(obj);
                return new p110k9.j(list, map);
            case 2:
                z3.j jVar = (z3.j) this.f9502s;
                p095j3.a aVar = (p095j3.a) this.f9503t;
                p110k9.a.e(obj);
                return new p110k9.j(jVar, aVar);
            case 3:
                n nVar = (n) this.f9502s;
                Map map2 = (Map) this.f9503t;
                p110k9.a.e(obj);
                return new p110k9.j(nVar, map2);
            default:
                p065g3.a aVar2 = (p065g3.a) this.f9502s;
                p165q3.d dVar = (p165q3.d) this.f9503t;
                p110k9.a.e(obj);
                if (!(dVar instanceof p165q3.b)) {
                    if (p251z9.j.a(dVar, p165q3.c.f21289a)) {
                        return new p136n5.b(aVar2);
                    }
                    throw new A6.a();
                }
                p165q3.i iVar = ((p165q3.b) dVar).f21288f;
                if (iVar == p165q3.i.f21294r) {
                    return new p136n5.a(aVar2);
                }
                return new p136n5.c(aVar2, iVar == p165q3.i.f21295s);
        }
    }
}
