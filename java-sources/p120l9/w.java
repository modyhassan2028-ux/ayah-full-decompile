package p120l9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p050e8.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends b {
    public static Object f0(Object obj, Map map) {
        j.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int g0(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map h0(p110k9.j jVar) {
        j.e(jVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(jVar.f19077r, jVar.f19078s);
        j.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map i0(p110k9.j... jVarArr) {
        if (jVarArr.length <= 0) {
            return s.f19441r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(jVarArr.length));
        for (p110k9.j jVar : jVarArr) {
            linkedHashMap.put(jVar.f19077r, jVar.f19078s);
        }
        return linkedHashMap;
    }

    public static Map j0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return s.f19441r;
        }
        if (size == 1) {
            return h0((p110k9.j) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            p110k9.j jVar = (p110k9.j) obj;
            linkedHashMap.put(jVar.f19077r, jVar.f19078s);
        }
        return linkedHashMap;
    }

    public static Map k0(Map map) {
        j.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return s.f19441r;
        }
        if (size != 1) {
            return l0(map);
        }
        j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        j.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap l0(Map map) {
        j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
