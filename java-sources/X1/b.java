package X1;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p110k9.j;
import p120l9.m;
import p120l9.n;
import p120l9.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p248z6.c f9844b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f9843a = linkedHashMap;
        this.f9844b = new p248z6.c(z10);
    }

    public final Map a() {
        j jVar;
        Set<Map.Entry> setEntrySet = this.f9843a.entrySet();
        int iG0 = w.g0(n.a0(setEntrySet, 10));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                p251z9.j.d(bArrCopyOf, "copyOf(this, size)");
                jVar = new j(key, bArrCopyOf);
            } else {
                jVar = new j(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jVar.f19077r, jVar.f19078s);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        p251z9.j.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f9844b.f24847s).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        p251z9.j.e(eVar, "key");
        Object obj = this.f9843a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        p251z9.j.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(e eVar) {
        p251z9.j.e(eVar, "key");
        b();
        this.f9843a.remove(eVar);
    }

    public final void e(e eVar, Object obj) {
        p251z9.j.e(eVar, "key");
        f(eVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f9843a;
            LinkedHashMap linkedHashMap2 = this.f9843a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = p251z9.j.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(e eVar, Object obj) {
        p251z9.j.e(eVar, "key");
        b();
        if (obj == null) {
            d(eVar);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f9843a;
        if (z10) {
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(m.G0((Set) obj));
            p251z9.j.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(eVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            p251z9.j.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(eVar, bArrCopyOf);
        }
    }

    public final b g() {
        return new b(w.l0(a()), false);
    }

    public final b h() {
        return new b(w.l0(a()), true);
    }

    public final int hashCode() {
        Iterator it = this.f9843a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return m.l0(this.f9843a.entrySet(), ",\n", "{\n", "\n}", a.f9842r, 24);
    }

    public /* synthetic */ b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
