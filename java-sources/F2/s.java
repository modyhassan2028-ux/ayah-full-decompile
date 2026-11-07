package F2;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2318a;

    public s(int i10) {
        switch (i10) {
            case 1:
                this.f2318a = new LinkedHashMap();
                break;
            default:
                this.f2318a = new LinkedHashMap();
                break;
        }
    }

    public void a(p251z9.e eVar, p241y9.c cVar) {
        p251z9.j.e(cVar, "initializer");
        LinkedHashMap linkedHashMap = this.f2318a;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new p105k2.e(eVar, cVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + eVar.b() + '.').toString());
    }

    public void b(C3.a aVar) {
        p251z9.j.e(aVar, "migration");
        int i10 = aVar.f722a;
        int i11 = aVar.f723b;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f2318a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i11))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i11), aVar);
    }

    public p018b9.d c() {
        Collection collectionValues = this.f2318a.values();
        p251z9.j.e(collectionValues, "initializers");
        p105k2.e[] eVarArr = (p105k2.e[]) collectionValues.toArray(new p105k2.e[0]);
        return new p018b9.d((p105k2.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
