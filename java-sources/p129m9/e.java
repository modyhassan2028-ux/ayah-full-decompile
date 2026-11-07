package p129m9;

import A9.c;
import B9.a;
import io.realm.internal.OsCollectionChangeSet;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p042e0.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Map, Serializable, c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final e f19705E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f19706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public j f19707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public f f19708C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f19709D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f19710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f19711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f19712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f19713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19718z;

    static {
        e eVar = new e(0);
        eVar.f19709D = true;
        f19705E = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i10 = this.f19714v * 2;
            int length = this.f19713u.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f19713u;
                int i12 = iArr[iJ];
                if (i12 <= 0) {
                    int i13 = this.f19715w;
                    Object[] objArr = this.f19710r;
                    if (i13 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f19715w = i14;
                    objArr[i13] = obj;
                    this.f19712t[i13] = iJ;
                    iArr[iJ] = i14;
                    this.f19718z++;
                    this.f19717y++;
                    if (i11 > this.f19714v) {
                        this.f19714v = i11;
                    }
                    return i13;
                }
                if (p251z9.j.a(this.f19710r[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    k(this.f19713u.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f19713u.length - 1 : iJ - 1;
            }
        }
    }

    public final e b() {
        c();
        this.f19709D = true;
        if (this.f19718z > 0) {
            return this;
        }
        e eVar = f19705E;
        p251z9.j.c(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f19709D) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f19715w - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f19712t;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f19713u[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        a.T(this.f19710r, 0, this.f19715w);
        Object[] objArr = this.f19711s;
        if (objArr != null) {
            a.T(objArr, 0, this.f19715w);
        }
        this.f19718z = 0;
        this.f19715w = 0;
        this.f19717y++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z10) {
        int i10;
        Object[] objArr = this.f19711s;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f19715w;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f19712t;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f19710r;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f19713u[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        a.T(this.f19710r, i12, i10);
        if (objArr != null) {
            a.T(objArr, i12, this.f19715w);
        }
        this.f19715w = i12;
    }

    public final boolean e(Collection collection) {
        p251z9.j.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f19708C;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f19708C = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f19718z == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        p251z9.j.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f19711s;
        p251z9.j.b(objArr);
        return p251z9.j.a(objArr[iH], entry.getValue());
    }

    public final void g(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f19710r;
        int length = objArr.length;
        int i11 = this.f19715w;
        int i12 = length - i11;
        int i13 = i11 - this.f19718z;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - OsCollectionChangeSet.MAX_ARRAY_LENGTH > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            p251z9.j.d(objArrCopyOf2, "copyOf(...)");
            this.f19710r = objArrCopyOf2;
            Object[] objArr2 = this.f19711s;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                p251z9.j.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f19711s = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f19712t, i15);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f19712t = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f19713u.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f19711s;
        p251z9.j.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i10 = this.f19714v;
        while (true) {
            int i11 = this.f19713u[iJ];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (p251z9.j.a(this.f19710r[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f19713u.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            int i11 = cVar.f3677r;
            e eVar = (e) cVar.f3680u;
            if (i11 >= eVar.f19715w) {
                throw new NoSuchElementException();
            }
            cVar.f3677r = i11 + 1;
            cVar.f3678s = i11;
            Object obj = eVar.f19710r[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f19711s;
            p251z9.j.b(objArr);
            Object obj2 = objArr[cVar.f3678s];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final int i(Object obj) {
        int i10 = this.f19715w;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f19712t[i10] >= 0) {
                Object[] objArr = this.f19711s;
                p251z9.j.b(objArr);
                if (p251z9.j.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19718z == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f19716x;
    }

    public final void k(int i10) {
        int[] iArr;
        this.f19717y++;
        int i11 = 0;
        if (this.f19715w > this.f19718z) {
            d(false);
        }
        this.f19713u = new int[i10];
        this.f19716x = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f19715w) {
            int i12 = i11 + 1;
            int iJ = j(this.f19710r[i11]);
            int i13 = this.f19714v;
            while (true) {
                iArr = this.f19713u;
                if (iArr[iJ] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i12;
            this.f19712t[i11] = iJ;
            i11 = i12;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f19706A;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f19706A = fVar2;
        return fVar2;
    }

    public final void l(int i10) {
        Object[] objArr = this.f19710r;
        p251z9.j.e(objArr, "<this>");
        objArr[i10] = null;
        Object[] objArr2 = this.f19711s;
        if (objArr2 != null) {
            objArr2[i10] = null;
        }
        int length = this.f19712t[i10];
        int i11 = this.f19714v * 2;
        int length2 = this.f19713u.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f19713u.length - 1 : length - 1;
            i13++;
            if (i13 > this.f19714v) {
                this.f19713u[i14] = 0;
            } else {
                int[] iArr = this.f19713u;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iJ = j(this.f19710r[i16]) - length;
                        int[] iArr2 = this.f19713u;
                        if ((iJ & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f19712t[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f19712t[i10] = -1;
            this.f19718z--;
            this.f19717y++;
        } while (i12 >= 0);
        this.f19713u[i14] = -1;
        this.f19712t[i10] = -1;
        this.f19718z--;
        this.f19717y++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f19711s;
        if (objArr == null) {
            int length = this.f19710r.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f19711s = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        p251z9.j.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f19711s;
            if (objArr == null) {
                int length = this.f19710r.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f19711s = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!p251z9.j.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f19711s;
        p251z9.j.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19718z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f19718z * 3) + 2);
        sb.append("{");
        int i10 = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = cVar.f3677r;
            e eVar = (e) cVar.f3680u;
            if (i11 >= eVar.f19715w) {
                throw new NoSuchElementException();
            }
            cVar.f3677r = i11 + 1;
            cVar.f3678s = i11;
            Object obj = eVar.f19710r[i11];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f19711s;
            p251z9.j.b(objArr);
            Object obj2 = objArr[cVar.f3678s];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.e();
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f19707B;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(1, this);
        this.f19707B = jVar2;
        return jVar2;
    }

    public e(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f19710r = objArr;
        this.f19711s = null;
        this.f19712t = iArr;
        this.f19713u = new int[iHighestOneBit];
        this.f19714v = 2;
        this.f19715w = 0;
        this.f19716x = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
