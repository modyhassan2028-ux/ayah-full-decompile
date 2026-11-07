package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f17836b;

    public A(Map map) {
        this.f17835a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l10 = (Long) entry2.getKey();
                ConcurrentHashMap concurrentHashMap = B.f17837a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, B.f17838b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, B.f17838b);
        this.f17836b = map2;
    }

    public final String a(long j, TextStyle textStyle) {
        Map map = (Map) this.f17835a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
