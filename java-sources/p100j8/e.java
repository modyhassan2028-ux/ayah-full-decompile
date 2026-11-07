package p100j8;

import F2.x;
import G8.a;
import G8.b;
import R7.f;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p017b7.g;
import p109k8.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f18793h = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f18798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f18799f;
    public final f g;

    public e(ArrayList arrayList, ArrayList arrayList2, f fVar) {
        j jVar = j.f19063r;
        this.f18794a = new HashMap();
        this.f18795b = new HashMap();
        this.f18796c = new HashMap();
        this.f18797d = new HashSet();
        this.f18799f = new AtomicReference();
        j jVar2 = new j();
        this.f18798e = jVar2;
        this.g = fVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 2;
        int i11 = 0;
        arrayList3.add(a.c(jVar2, j.class, b.class, a.class));
        arrayList3.add(a.c(this, e.class, new Class[0]));
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((I8.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.t(componentRegistrar));
                        it.remove();
                    }
                } catch (k e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((a) it2.next()).f18787b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f18797d.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f18797d.add(obj3.toString());
                    }
                }
            }
            if (this.f18794a.isEmpty()) {
                p000a.a.z(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f18794a.keySet());
                arrayList6.addAll(arrayList3);
                p000a.a.z(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f18794a.put(aVar2, new l(new H8.b(i10, this, aVar2)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(j());
            c();
        }
        int size4 = arrayList5.size();
        while (i11 < size4) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f18799f.get();
        if (bool != null) {
            a(this.f18794a, bool.booleanValue());
        }
    }

    public final void a(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            I8.b bVar = (I8.b) entry.getValue();
            int i10 = aVar.f18789d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        j jVar = this.f18798e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f18809b;
                if (arrayDeque != null) {
                    jVar.f18809b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw p245z2.a.z(it);
            }
        }
    }

    @Override // p100j8.b
    public final Object b(Class cls) {
        return e(p.a(cls));
    }

    public final void c() {
        HashMap map = this.f18795b;
        HashMap map2 = this.f18796c;
        for (a aVar : this.f18794a.keySet()) {
            for (h hVar : aVar.f18788c) {
                boolean z10 = hVar.f18806b == 2;
                p pVar = hVar.f18805a;
                if (z10 && !map2.containsKey(pVar)) {
                    Set set = Collections.EMPTY_SET;
                    m mVar = new m();
                    mVar.f18814b = null;
                    mVar.f18813a = Collections.newSetFromMap(new ConcurrentHashMap());
                    mVar.f18813a.addAll(set);
                    map2.put(pVar, mVar);
                } else if (map.containsKey(pVar)) {
                    continue;
                } else {
                    int i10 = hVar.f18806b;
                    if (i10 == 1) {
                        throw new i("Unsatisfied dependency for component " + aVar + ": " + pVar);
                    }
                    if (i10 != 2) {
                        map.put(pVar, new n(n.f18815c, n.f18816d));
                    }
                }
            }
        }
    }

    @Override // p100j8.b
    public final n d(p pVar) {
        I8.b bVarI = i(pVar);
        if (bVarI == null) {
            return new n(n.f18815c, n.f18816d);
        }
        return bVarI instanceof n ? (n) bVarI : new n(null, bVarI);
    }

    @Override // p100j8.b
    public final Object e(p pVar) {
        I8.b bVarI = i(pVar);
        if (bVarI == null) {
            return null;
        }
        return bVarI.get();
    }

    @Override // p100j8.b
    public final I8.b f(Class cls) {
        return i(p.a(cls));
    }

    @Override // p100j8.b
    public final Set g(p pVar) {
        I8.b bVar;
        synchronized (this) {
            bVar = (m) this.f18796c.get(pVar);
            if (bVar == null) {
                bVar = f18793h;
            }
        }
        return (Set) bVar.get();
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.f18790e == 0) {
                I8.b bVar = (I8.b) this.f18794a.get(aVar);
                for (p pVar : aVar.f18787b) {
                    HashMap map = this.f18795b;
                    if (map.containsKey(pVar)) {
                        arrayList2.add(new x(6, (n) ((I8.b) map.get(pVar)), bVar));
                    } else {
                        map.put(pVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // p100j8.b
    public final synchronized I8.b i(p pVar) {
        g.R(pVar, "Null interface requested.");
        return (I8.b) this.f18795b.get(pVar);
    }

    public final ArrayList j() {
        HashMap map = this.f18796c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f18794a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f18790e != 0) {
                I8.b bVar = (I8.b) entry.getValue();
                for (p pVar : aVar.f18787b) {
                    if (!map2.containsKey(pVar)) {
                        map2.put(pVar, new HashSet());
                    }
                    ((Set) map2.get(pVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                m mVar = (m) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new x(7, mVar, (I8.b) it.next()));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f18814b = null;
                mVar2.f18813a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.f18813a.addAll(set);
                map.put(pVar2, mVar2);
            }
        }
        return arrayList;
    }
}
