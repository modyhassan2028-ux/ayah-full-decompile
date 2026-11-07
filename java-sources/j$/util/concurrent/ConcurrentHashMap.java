package j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, u {
    public static final int g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f18077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f18078i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f18079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f18080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f18081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18083o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile transient l[] f18084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient l[] f18085b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient c[] f18086c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient i f18087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient s f18088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient e f18089f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f17734b;
        f18077h = aVar;
        f18078i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f18079k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f18080l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f18081m = aVar.h(c.class, "value");
        f18082n = aVar.a(l[].class);
        int iB = aVar.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f18083o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i10) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i10 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final l k(l[] lVarArr, int i10) {
        return (l) f18077h.f(lVarArr, (((long) i10) << f18083o) + ((long) f18082n));
    }

    public static final boolean b(l[] lVarArr, int i10, l lVar) {
        j$.sun.misc.a aVar = f18077h;
        return j$.com.android.tools.r8.a.E(aVar.f17735a, lVarArr, (((long) i10) << f18083o) + ((long) f18082n), lVar);
    }

    public static final void h(l[] lVarArr, int i10, l lVar) {
        f18077h.j(lVarArr, (((long) i10) << f18083o) + ((long) f18082n), lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        this(i10, 0.75f, 1);
    }

    public ConcurrentHashMap(int i10, float f3, int i11) {
        if (f3 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((double) ((i10 < i11 ? i11 : i10) / f3)) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : l((int) j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j10 = j();
        if (j10 < 0) {
            return 0;
        }
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l lVarK;
        Object obj2;
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f18084a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (lVarK = k(lVarArr, (length - 1) & i10)) == null) {
            return null;
        }
        int i11 = lVarK.f18105a;
        if (i11 == i10) {
            Object obj3 = lVarK.f18106b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) lVarK.f18107c;
            }
        } else if (i11 < 0) {
            l lVarA = lVarK.a(i10, obj);
            if (lVarA != null) {
                return (V) lVarA.f18107c;
            }
            return null;
        }
        while (true) {
            lVarK = lVarK.f18108d;
            if (lVarK == null) {
                return null;
            }
            if (lVarK.f18105a == i10 && ((obj2 = lVarK.f18106b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return (V) lVarK.f18107c;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f18084a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f18107c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k7, V v10) {
        return (V) f(k7, v10, false);
    }

    public final Object f(Object obj, Object obj2, boolean z10) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArrE = this.f18084a;
        int i11 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i12 = (length - 1) & i10;
                    l lVarK = k(lVarArrE, i12);
                    if (lVarK == null) {
                        if (b(lVarArrE, i12, new l(i10, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i13 = lVarK.f18105a;
                        if (i13 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            if (z10 && i13 == i10 && (((obj5 = lVarK.f18106b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = lVarK.f18107c) != null)) {
                                return obj6;
                            }
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i12) != lVarK) {
                                        obj3 = null;
                                    } else if (i13 >= 0) {
                                        i11 = 1;
                                        l lVar = lVarK;
                                        while (true) {
                                            if (lVar.f18105a == i10 && ((obj4 = lVar.f18106b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                obj3 = lVar.f18107c;
                                                if (!z10) {
                                                    lVar.f18107c = obj2;
                                                }
                                            } else {
                                                l lVar2 = lVar.f18108d;
                                                if (lVar2 == null) {
                                                    lVar.f18108d = new l(i10, obj, obj2);
                                                    obj3 = null;
                                                } else {
                                                    i11++;
                                                    lVar = lVar2;
                                                }
                                            }
                                        }
                                    } else if (lVarK instanceof q) {
                                        r rVarE = ((q) lVarK).e(i10, obj, obj2);
                                        if (rVarE != null) {
                                            Object obj7 = rVarE.f18107c;
                                            if (!z10) {
                                                rVarE.f18107c = obj2;
                                            }
                                            obj3 = obj7;
                                        } else {
                                            obj3 = null;
                                        }
                                        i11 = 2;
                                    } else {
                                        if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                        obj3 = null;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArrE, i12);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        a(1L, i11);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b0 A[PHI: r7
      0x00b0: PHI (r7v3 boolean) = 
      (r7v1 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
     binds: [B:66:0x00af, B:47:0x0077, B:49:0x007d, B:53:0x0085, B:55:0x008b, B:42:0x0069, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        l lVarK;
        boolean z10;
        Object obj4;
        r rVarB;
        Object obj5;
        int i11 = i(obj.hashCode());
        l[] lVarArrD = this.f18084a;
        while (lVarArrD != null && (length = lVarArrD.length) != 0 && (lVarK = k(lVarArrD, (i10 = (length - 1) & i11))) != null) {
            int i12 = lVarK.f18105a;
            if (i12 == -1) {
                lVarArrD = d(lVarArrD, lVarK);
            } else {
                synchronized (lVarK) {
                    try {
                        if (k(lVarArrD, i10) == lVarK) {
                            z10 = true;
                            if (i12 >= 0) {
                                l lVar = null;
                                l lVar2 = lVarK;
                                while (true) {
                                    if (lVar2.f18105a == i11 && ((obj5 = lVar2.f18106b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        obj4 = lVar2.f18107c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                lVar2.f18107c = obj2;
                                            } else if (lVar != null) {
                                                lVar.f18108d = lVar2.f18108d;
                                            } else {
                                                h(lVarArrD, i10, lVar2.f18108d);
                                            }
                                        }
                                    } else {
                                        l lVar3 = lVar2.f18108d;
                                        if (lVar3 != null) {
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (lVarK instanceof q) {
                                q qVar = (q) lVarK;
                                r rVar = qVar.f18122e;
                                if (rVar == null || (rVarB = rVar.b(i11, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = rVarB.f18107c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        rVarB.f18107c = obj2;
                                    } else if (qVar.f(rVarB)) {
                                        h(lVarArrD, i10, p(qVar.f18123f));
                                    }
                                }
                            } else {
                                if (lVarK instanceof m) {
                                    throw new IllegalStateException("Recursive update");
                                }
                                z10 = false;
                                obj4 = null;
                            }
                        } else {
                            z10 = false;
                            obj4 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z10) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l lVarK;
        l lVar;
        l[] lVarArrD = this.f18084a;
        long j10 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (true) {
                if (lVarArrD == null || i10 >= lVarArrD.length) {
                    break loop0;
                }
                lVarK = k(lVarArrD, i10);
                if (lVarK == null) {
                    i10++;
                } else {
                    int i11 = lVarK.f18105a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i10) == lVarK) {
                                if (i11 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof q ? ((q) lVarK).f18123f : null;
                                }
                                while (lVar != null) {
                                    j10--;
                                    lVar = lVar.f18108d;
                                }
                                h(lVarArrD, i10, null);
                                i10++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f18087d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f18087d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f18088e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f18088e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f18089f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f18089f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f18084a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f18107c.hashCode() ^ lVarA.f18106b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f18084a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f18106b;
                Object obj2 = lVarA.f18107c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f18084a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA != null) {
                Object obj2 = lVarA.f18107c;
                Object obj3 = map.get(lVarA.f18106b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = 0;
        int i11 = 1;
        while (i11 < 16) {
            i10++;
            i11 <<= 1;
        }
        int i12 = 32 - i10;
        int i13 = i11 - 1;
        n[] nVarArr = new n[16];
        for (int i14 = 0; i14 < 16; i14++) {
            nVarArr[i14] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i12);
        putFieldPutFields.put("segmentMask", i13);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f18084a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f18106b);
                objectOutputStream.writeObject(lVarA.f18107c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j10;
        long j11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j12 = 0;
        long j13 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j10 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j13++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j13 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j14 = (long) (((double) (j13 / 0.75f)) + 1.0d);
        int iL = j14 >= 1073741824 ? 1073741824 : l((int) j14);
        l[] lVarArr = new l[iL];
        int i10 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.f18108d;
            int i11 = lVar.f18105a;
            int i12 = i11 & i10;
            l lVarK = k(lVarArr, i12);
            boolean z10 = true;
            if (lVarK == null) {
                j11 = j10;
            } else {
                Object obj2 = lVar.f18106b;
                if (lVarK.f18105a < 0) {
                    if (((q) lVarK).e(i11, obj2, lVar.f18107c) == null) {
                        j12 += j10;
                    }
                    j11 = j10;
                } else {
                    j11 = j10;
                    int i13 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.f18108d) {
                        if (lVar3.f18105a == i11 && ((obj = lVar3.f18106b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i13++;
                    }
                    if (z10 && i13 >= 8) {
                        j12 += j11;
                        lVar.f18108d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.f18105a, lVar4.f18106b, lVar4.f18107c, null, null);
                            rVar3.f18126h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f18108d = rVar3;
                            }
                            lVar4 = lVar4.f18108d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i12, new q(rVar));
                    }
                }
                z10 = false;
            }
            if (z10) {
                j12 += j11;
                lVar.f18108d = lVarK;
                h(lVarArr, i12, lVar);
            }
            lVar = lVar2;
            j10 = j11;
        }
        this.f18084a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j12;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k7, V v10) {
        return (V) f(k7, v10, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f18084a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f18106b, lVarA.f18107c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f18084a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f18107c;
            Object obj2 = lVarA.f18106b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        r rVarB;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArrE = this.f18084a;
        int i11 = 0;
        Object objApply = null;
        int i12 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    l lVarK = k(lVarArrE, i13);
                    if (lVarK == null) {
                        break;
                    }
                    int i14 = lVarK.f18105a;
                    if (i14 == -1) {
                        lVarArrE = d(lVarArrE, lVarK);
                    } else {
                        synchronized (lVarK) {
                            try {
                                if (k(lVarArrE, i13) == lVarK) {
                                    if (i14 >= 0) {
                                        i12 = 1;
                                        l lVar = null;
                                        l lVar2 = lVarK;
                                        while (true) {
                                            if (lVar2.f18105a == i10 && ((obj2 = lVar2.f18106b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, lVar2.f18107c);
                                                if (objApply != null) {
                                                    lVar2.f18107c = objApply;
                                                    break;
                                                }
                                                l lVar3 = lVar2.f18108d;
                                                if (lVar != null) {
                                                    lVar.f18108d = lVar3;
                                                } else {
                                                    h(lVarArrE, i13, lVar3);
                                                }
                                                i11 = -1;
                                                break;
                                            }
                                            l lVar4 = lVar2.f18108d;
                                            if (lVar4 == null) {
                                                break;
                                            }
                                            i12++;
                                            lVar = lVar2;
                                            lVar2 = lVar4;
                                        }
                                    } else if (lVarK instanceof q) {
                                        q qVar = (q) lVarK;
                                        r rVar = qVar.f18122e;
                                        if (rVar != null && (rVarB = rVar.b(i10, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, rVarB.f18107c);
                                            if (objApply != null) {
                                                rVarB.f18107c = objApply;
                                            } else {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i13, p(qVar.f18123f));
                                                }
                                                i11 = -1;
                                            }
                                        }
                                        i12 = 2;
                                    } else if (lVarK instanceof m) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i11 != 0) {
            a(i11, i12);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0044 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i11 = i(obj.hashCode());
        l[] lVarArrE = this.f18084a;
        int i12 = 0;
        Object obj5 = null;
        int i13 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i14 = (length - 1) & i11;
                    l lVarK = k(lVarArrE, i14);
                    i10 = 1;
                    if (lVarK == null) {
                        if (b(lVarArrE, i14, new l(i11, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i15 = lVarK.f18105a;
                        if (i15 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i14) == lVarK) {
                                        if (i15 >= 0) {
                                            l lVar = null;
                                            l lVar2 = lVarK;
                                            i12 = 1;
                                            while (true) {
                                                if (lVar2.f18105a == i11 && ((obj3 = lVar2.f18106b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    Object objApply = biFunction.apply(lVar2.f18107c, obj4);
                                                    if (objApply != null) {
                                                        lVar2.f18107c = objApply;
                                                        obj5 = objApply;
                                                        break;
                                                    }
                                                    l lVar3 = lVar2.f18108d;
                                                    if (lVar != null) {
                                                        lVar.f18108d = lVar3;
                                                    } else {
                                                        h(lVarArrE, i14, lVar3);
                                                    }
                                                    obj5 = objApply;
                                                    i13 = -1;
                                                    break;
                                                }
                                                l lVar4 = lVar2.f18108d;
                                                if (lVar4 == null) {
                                                    lVar2.f18108d = new l(i11, obj, obj4);
                                                    obj5 = obj4;
                                                    i13 = 1;
                                                    break;
                                                }
                                                i12++;
                                                lVar = lVar2;
                                                lVar2 = lVar4;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.f18122e;
                                            r rVarB = rVar == null ? null : rVar.b(i11, obj, null);
                                            Object objApply2 = rVarB == null ? obj4 : biFunction.apply(rVarB.f18107c, obj4);
                                            if (objApply2 != null) {
                                                if (rVarB != null) {
                                                    rVarB.f18107c = objApply2;
                                                } else {
                                                    qVar.e(i11, obj, objApply2);
                                                    i13 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i14, p(qVar.f18123f));
                                                }
                                                i13 = -1;
                                            }
                                            i12 = 2;
                                            obj5 = objApply2;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    n(lVarArrE, i14);
                                }
                                i10 = i13;
                                obj4 = obj5;
                                break;
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i10 != 0) {
            a(i10, i12);
        }
        return obj4;
    }

    public final l[] e() {
        while (true) {
            l[] lVarArr = this.f18084a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f18077h.c(this, f18078i, i10, -1)) {
                try {
                    l[] lVarArr2 = this.f18084a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        l[] lVarArr3 = new l[i11];
                        this.f18084a = lVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    return lVarArr2;
                } finally {
                    this.sizeCtl = i10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x019d  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #2 {all -> 0x014d, blocks: (B:96:0x013e, B:98:0x0142), top: B:132:0x013e }] */
    public final void a(long j10, int i10) {
        boolean zD;
        v vVar;
        int i11;
        c[] cVarArr;
        j$.sun.misc.a aVar;
        long j11;
        long j12;
        boolean z10;
        int length;
        boolean z11;
        int length2;
        int length3;
        c cVar;
        long j13;
        l[] lVarArr;
        int length4;
        l[] lVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        c[] cVarArr2 = concurrentHashMap.f18086c;
        if (cVarArr2 != null) {
            if (cVarArr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            vVar = ThreadLocalRandom.f18092f;
            i11 = ((ThreadLocalRandom) vVar.get()).f18094b;
            if (i11 == 0) {
                ThreadLocalRandom.d();
                i11 = ((ThreadLocalRandom) vVar.get()).f18094b;
                zD = true;
            }
            boolean z12 = zD;
            int i12 = i11;
            while (true) {
                boolean z13 = false;
                while (true) {
                    cVarArr = concurrentHashMap.f18086c;
                    if (cVarArr == null) {
                    }
                    if (concurrentHashMap.cellsBusy != 0) {
                        aVar = f18077h;
                        j11 = f18079k;
                        j12 = concurrentHashMap.baseCount;
                        if (aVar.d(concurrentHashMap, j11, j12, j12 + j10)) {
                            return;
                        }
                    } else {
                        aVar = f18077h;
                        j11 = f18079k;
                        j12 = concurrentHashMap.baseCount;
                        if (aVar.d(concurrentHashMap, j11, j12, j12 + j10)) {
                            return;
                        }
                    }
                    concurrentHashMap = this;
                }
                if (concurrentHashMap.f18086c == cVarArr) {
                    concurrentHashMap.f18086c = (c[]) Arrays.copyOf(cVarArr, length << 1);
                }
                concurrentHashMap.cellsBusy = 0;
            }
        } else {
            j$.sun.misc.a aVar2 = f18077h;
            long j14 = f18079k;
            long j15 = concurrentHashMap.baseCount;
            j13 = j15 + j10;
            if (!aVar2.d(concurrentHashMap, j14, j15, j13)) {
                if (cVarArr2 != null || (length3 = cVarArr2.length - 1) < 0 || (cVar = cVarArr2[length3 & ((ThreadLocalRandom) ThreadLocalRandom.f18092f.get()).f18094b]) == null) {
                    zD = true;
                } else {
                    j$.sun.misc.a aVar3 = f18077h;
                    long j16 = f18081m;
                    long j17 = cVar.value;
                    zD = aVar3.d(cVar, j16, j17, j17 + j10);
                    if (zD) {
                        if (i10 <= 1) {
                            return;
                        } else {
                            j13 = concurrentHashMap.j();
                        }
                    }
                }
                vVar = ThreadLocalRandom.f18092f;
                i11 = ((ThreadLocalRandom) vVar.get()).f18094b;
                if (i11 == 0) {
                    ThreadLocalRandom.d();
                    i11 = ((ThreadLocalRandom) vVar.get()).f18094b;
                    zD = true;
                }
                boolean z14 = zD;
                int i13 = i11;
                while (true) {
                    boolean z15 = false;
                    while (true) {
                        cVarArr = concurrentHashMap.f18086c;
                        if (cVarArr == null && (length = cVarArr.length) > 0) {
                            c cVar2 = cVarArr[(length - 1) & i13];
                            if (cVar2 != null) {
                                if (z14) {
                                    j$.sun.misc.a aVar4 = f18077h;
                                    long j18 = f18081m;
                                    long j19 = cVar2.value;
                                    if (!aVar4.d(cVar2, j18, j19, j19 + j10)) {
                                        if (concurrentHashMap.f18086c == cVarArr && length < g) {
                                            if (!z15) {
                                                z15 = true;
                                            } else if (concurrentHashMap.cellsBusy == 0 && aVar4.c(concurrentHashMap, f18080l, 0, 1)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z14 = true;
                                }
                                int i14 = (i13 << 13) ^ i13;
                                int i15 = i14 ^ (i14 >>> 17);
                                int i16 = i15 ^ (i15 << 5);
                                ((ThreadLocalRandom) ThreadLocalRandom.f18092f.get()).f18094b = i16;
                                i13 = i16;
                                concurrentHashMap = this;
                            } else if (concurrentHashMap.cellsBusy == 0) {
                                c cVar3 = new c(j10);
                                if (concurrentHashMap.cellsBusy == 0 && f18077h.c(concurrentHashMap, f18080l, 0, 1)) {
                                    try {
                                        c[] cVarArr3 = concurrentHashMap.f18086c;
                                        if (cVarArr3 == null || (length2 = cVarArr3.length) <= 0) {
                                            z11 = false;
                                        } else {
                                            int i17 = (length2 - 1) & i13;
                                            if (cVarArr3[i17] == null) {
                                                cVarArr3[i17] = cVar3;
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                        concurrentHashMap.cellsBusy = 0;
                                        if (z11) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        concurrentHashMap.cellsBusy = 0;
                                        throw th;
                                    }
                                }
                            }
                            z15 = false;
                            int i18 = (i13 << 13) ^ i13;
                            int i19 = i18 ^ (i18 >>> 17);
                            int i110 = i19 ^ (i19 << 5);
                            ((ThreadLocalRandom) ThreadLocalRandom.f18092f.get()).f18094b = i110;
                            i13 = i110;
                            concurrentHashMap = this;
                        } else {
                            if (concurrentHashMap.cellsBusy != 0 && concurrentHashMap.f18086c == cVarArr && f18077h.c(concurrentHashMap, f18080l, 0, 1)) {
                                try {
                                    if (concurrentHashMap.f18086c == cVarArr) {
                                        c[] cVarArr4 = new c[2];
                                        cVarArr4[i13 & 1] = new c(j10);
                                        concurrentHashMap.f18086c = cVarArr4;
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    concurrentHashMap.cellsBusy = 0;
                                    if (z10) {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    concurrentHashMap.cellsBusy = 0;
                                    throw th2;
                                }
                            } else {
                                aVar = f18077h;
                                j11 = f18079k;
                                j12 = concurrentHashMap.baseCount;
                                if (aVar.d(concurrentHashMap, j11, j12, j12 + j10)) {
                                    return;
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                    try {
                        if (concurrentHashMap.f18086c == cVarArr) {
                            concurrentHashMap.f18086c = (c[]) Arrays.copyOf(cVarArr, length << 1);
                        }
                        concurrentHashMap.cellsBusy = 0;
                    } catch (Throwable th3) {
                        concurrentHashMap.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        }
        if (i10 < 0) {
            return;
        }
        while (true) {
            int i20 = concurrentHashMap.sizeCtl;
            if (j13 < i20 || (lVarArr = concurrentHashMap.f18084a) == null || (length4 = lVarArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i20 < 0) {
                if ((i20 >>> 16) != iNumberOfLeadingZeros || i20 == iNumberOfLeadingZeros + 1 || i20 == iNumberOfLeadingZeros + 65535 || (lVarArr2 = concurrentHashMap.f18085b) == null || concurrentHashMap.transferIndex <= 0) {
                    return;
                }
                if (f18077h.c(concurrentHashMap, f18078i, i20, i20 + 1)) {
                    concurrentHashMap.m(lVarArr, lVarArr2);
                }
            } else if (f18077h.c(concurrentHashMap, f18078i, i20, (iNumberOfLeadingZeros << 16) + 2)) {
                concurrentHashMap.m(lVarArr, null);
            }
            j13 = concurrentHashMap.j();
        }
    }

    public final l[] d(l[] lVarArr, l lVar) {
        int i10;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f18099e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (lVarArr2 == this.f18085b && this.f18084a == lVarArr && (i10 = this.sizeCtl) < 0 && (i10 >>> 16) == iNumberOfLeadingZeros && i10 != iNumberOfLeadingZeros + 1 && i10 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f18077h.c(this, f18078i, i10, i10 + 1)) {
                    m(lVarArr, lVarArr2);
                    return lVarArr2;
                }
            }
            return lVarArr2;
        }
        return this.f18084a;
    }

    public final void o(int i10) {
        int length;
        int iL = i10 >= 536870912 ? 1073741824 : l(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                break;
            }
            l[] lVarArr = this.f18084a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i12 = i11 > iL ? i11 : iL;
                if (f18077h.c(this, f18078i, i11, -1)) {
                    try {
                        if (this.f18084a == lVarArr) {
                            this.f18084a = new l[i12];
                            i11 = i12 - (i12 >>> 2);
                        }
                        this.sizeCtl = i11;
                    } catch (Throwable th) {
                        this.sizeCtl = i11;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else if (iL <= i11 || length >= 1073741824) {
                break;
            } else if (lVarArr == this.f18084a) {
                if (f18077h.c(this, f18078i, i11, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(lVarArr, null);
                }
            }
        }
    }

    public final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i10;
        int i11;
        int i12;
        boolean z10;
        char c10;
        int i13;
        int i14;
        l qVar;
        l qVar2;
        l lVar;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i15 = g;
        boolean z11 = true;
        int i16 = i15 > 1 ? (length >>> 3) / i15 : length;
        char c11 = 16;
        int i17 = i16 < 16 ? 16 : i16;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.f18085b = lVarArr4;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar = new g(lVarArr3);
        boolean zB = true;
        int i18 = 0;
        int i19 = 0;
        boolean z12 = false;
        while (true) {
            if (zB) {
                int i20 = i18 - 1;
                if (i20 >= i19 || z12) {
                    i19 = i19;
                    i18 = i20;
                    zB = false;
                } else {
                    int i21 = concurrentHashMap.transferIndex;
                    if (i21 <= 0) {
                        i18 = -1;
                    } else {
                        j$.sun.misc.a aVar = f18077h;
                        int i22 = i19;
                        long j10 = j;
                        if (i21 > i17) {
                            i11 = i21 - i17;
                            i10 = i20;
                        } else {
                            i10 = i20;
                            i11 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j10, i21, i11);
                        i19 = i11;
                        if (zC) {
                            i18 = i21 - 1;
                        } else {
                            i19 = i22;
                            i18 = i10;
                        }
                    }
                    zB = false;
                }
            } else {
                int i23 = i19;
                r rVar = null;
                l lVar2 = null;
                if (i18 < 0 || i18 >= length || (i14 = i18 + length) >= length2) {
                    i12 = length;
                    z10 = z11;
                    c10 = c11;
                    i13 = i17;
                    if (z12) {
                        concurrentHashMap.f18085b = null;
                        concurrentHashMap.f18084a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i24 = i18;
                    j$.sun.misc.a aVar2 = f18077h;
                    long j11 = f18078i;
                    int i25 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j11, i25, i25 - 1)) {
                        i18 = i24;
                    } else {
                        if (i25 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        zB = z10;
                        z12 = zB;
                        i18 = i12;
                    }
                } else {
                    l lVarK = k(lVarArr, i18);
                    if (lVarK == null) {
                        zB = b(lVarArr, i18, gVar);
                        i12 = length;
                        z10 = z11;
                        c10 = c11;
                        i13 = i17;
                    } else {
                        z10 = z11;
                        int i26 = lVarK.f18105a;
                        if (i26 == -1) {
                            i12 = length;
                            c10 = c11;
                            i13 = i17;
                            zB = z10;
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArr, i18) == lVarK) {
                                        if (i26 >= 0) {
                                            int i27 = i26 & length;
                                            l lVar3 = lVarK.f18108d;
                                            l lVar4 = lVarK;
                                            while (lVar3 != null) {
                                                char c12 = c11;
                                                int i28 = lVar3.f18105a & length;
                                                if (i28 != i27) {
                                                    lVar4 = lVar3;
                                                    i27 = i28;
                                                }
                                                lVar3 = lVar3.f18108d;
                                                c11 = c12;
                                            }
                                            c10 = c11;
                                            if (i27 == 0) {
                                                lVar = null;
                                                lVar2 = lVar4;
                                            } else {
                                                lVar = lVar4;
                                            }
                                            l lVar5 = lVarK;
                                            while (lVar5 != lVar4) {
                                                int i29 = lVar5.f18105a;
                                                Object obj = lVar5.f18106b;
                                                int i30 = length;
                                                Object obj2 = lVar5.f18107c;
                                                if ((i29 & i30) == 0) {
                                                    lVar2 = new l(i29, obj, obj2, lVar2);
                                                } else {
                                                    lVar = new l(i29, obj, obj2, lVar);
                                                }
                                                lVar5 = lVar5.f18108d;
                                                length = i30;
                                                i17 = i17;
                                            }
                                            i12 = length;
                                            i13 = i17;
                                            h(lVarArr3, i18, lVar2);
                                            h(lVarArr3, i14, lVar);
                                            h(lVarArr, i18, gVar);
                                        } else {
                                            i12 = length;
                                            c10 = c11;
                                            i13 = i17;
                                            if (lVarK instanceof q) {
                                                q qVar3 = (q) lVarK;
                                                r rVar2 = null;
                                                r rVar3 = null;
                                                l lVar6 = qVar3.f18123f;
                                                int i31 = 0;
                                                int i32 = 0;
                                                r rVar4 = null;
                                                while (lVar6 != null) {
                                                    q qVar4 = qVar3;
                                                    int i33 = lVar6.f18105a;
                                                    r rVar5 = new r(i33, lVar6.f18106b, lVar6.f18107c, null, null);
                                                    if ((i33 & i12) == 0) {
                                                        rVar5.f18126h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.f18108d = rVar5;
                                                        }
                                                        i31++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.f18126h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.f18108d = rVar5;
                                                        }
                                                        i32++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVar6 = lVar6.f18108d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i31 <= 6) {
                                                    qVar = p(rVar);
                                                } else {
                                                    qVar = i32 != 0 ? new q(rVar) : qVar5;
                                                }
                                                if (i32 <= 6) {
                                                    qVar2 = p(rVar4);
                                                } else {
                                                    qVar2 = i31 != 0 ? new q(rVar4) : qVar5;
                                                }
                                                h(lVarArr3, i18, qVar);
                                                h(lVarArr3, i14, qVar2);
                                                h(lVarArr, i18, gVar);
                                            }
                                        }
                                        zB = z10;
                                    } else {
                                        i12 = length;
                                        c10 = c11;
                                        i13 = i17;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i19 = i23;
                z11 = z10;
                c11 = c10;
                length = i12;
                i17 = i13;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.f18086c;
        long j10 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j10 += cVar.value;
                }
            }
        }
        return j10;
    }

    public final void n(l[] lVarArr, int i10) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i10);
        if (lVarK == null || lVarK.f18105a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i10) == lVarK) {
                    r rVar = null;
                    r rVar2 = null;
                    l lVar = lVarK;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f18105a, lVar.f18106b, lVar.f18107c, null, null);
                        rVar3.f18126h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f18108d = rVar3;
                        }
                        lVar = lVar.f18108d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i10, new q(rVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (l lVar3 = rVar; lVar3 != null; lVar3 = lVar3.f18108d) {
            l lVar4 = new l(lVar3.f18105a, lVar3.f18106b, lVar3.f18107c);
            if (lVar2 == null) {
                lVar = lVar4;
            } else {
                lVar2.f18108d = lVar4;
            }
            lVar2 = lVar4;
        }
        return lVar;
    }
}
