package u;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f22701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f22702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22703t;

    public O(int i10) {
        this.f22701r = i10 == 0 ? p204v.a.f22998a : new int[i10];
        this.f22702s = i10 == 0 ? p204v.a.f23000c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f22703t * 2;
        Object[] objArr = this.f22702s;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f22703t;
        int[] iArr = this.f22701r;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22701r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22702s, i10 * 2);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22702s = objArrCopyOf;
        }
        if (this.f22703t != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f22703t;
        if (i11 == 0) {
            return -1;
        }
        int iA = p204v.a.a(i11, i10, this.f22701r);
        if (iA < 0 || p251z9.j.a(obj, this.f22702s[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f22701r[i12] == i10) {
            if (p251z9.j.a(obj, this.f22702s[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f22701r[i13] == i10; i13--) {
            if (p251z9.j.a(obj, this.f22702s[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f22703t > 0) {
            this.f22701r = p204v.a.f22998a;
            this.f22702s = p204v.a.f23000c;
            this.f22703t = 0;
        }
        if (this.f22703t > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f22703t;
        if (i10 == 0) {
            return -1;
        }
        int iA = p204v.a.a(i10, 0, this.f22701r);
        if (iA < 0 || this.f22702s[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f22701r[i11] == 0) {
            if (this.f22702s[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f22701r[i12] == 0; i12--) {
            if (this.f22702s[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof O) {
                int i10 = this.f22703t;
                if (i10 != ((O) obj).f22703t) {
                    return false;
                }
                O o10 = (O) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objI = i(i11);
                    Object obj2 = o10.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !o10.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f22703t != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f22703t;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objI2 = i(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f22703t) {
            z10 = true;
        }
        if (z10) {
            return this.f22702s[i10 << 1];
        }
        p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f22703t)) {
            p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f22702s;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f22701r;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                p120l9.l.W(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f22702s;
                p120l9.l.X(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f22702s;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22701r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22702s, i16 << 1);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22702s = objArrCopyOf;
            if (i11 != this.f22703t) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                p120l9.l.W(0, 0, i10, iArr, this.f22701r);
                p120l9.l.X(0, 0, i12, objArr, this.f22702s);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                p120l9.l.W(i10, i17, i11, iArr, this.f22701r);
                p120l9.l.X(i12, i17 << 1, i11 << 1, objArr, this.f22702s);
            }
        }
        if (i11 != this.f22703t) {
            throw new ConcurrentModificationException();
        }
        this.f22703t = i13;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f22702s[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f22702s[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f22703t) {
            z10 = true;
        }
        if (!z10) {
            p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f22702s;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f22701r;
        Object[] objArr = this.f22702s;
        int i10 = this.f22703t;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f22703t) {
            z10 = true;
        }
        if (z10) {
            return this.f22702s[(i10 << 1) + 1];
        }
        p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f22703t <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f22703t;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f22702s;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f22701r;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22701r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22702s, i13 << 1);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22702s = objArrCopyOf;
            if (i10 != this.f22703t) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f22701r;
            int i14 = i12 + 1;
            p120l9.l.W(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f22702s;
            p120l9.l.X(i14 << 1, i12 << 1, this.f22703t << 1, objArr2, objArr2);
        }
        int i15 = this.f22703t;
        if (i10 == i15) {
            int[] iArr3 = this.f22701r;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f22702s;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f22703t = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f22703t;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22703t * 28);
        sb.append('{');
        int i10 = this.f22703t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i11);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !p251z9.j.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !p251z9.j.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
