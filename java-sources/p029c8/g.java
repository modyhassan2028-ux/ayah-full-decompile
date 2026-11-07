package p029c8;

import Y2.a;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a implements Set {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f13552t = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient d f13553s;

    public static int g(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static g h(int i10, Object... objArr) {
        if (i10 == 0) {
            return o.f13572A;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p(obj);
        }
        int iG = g(i10);
        Object[] objArr2 = new Object[iG];
        int i11 = iG - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i14);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iK0 = a.k0(iHashCode);
            while (true) {
                int i15 = iK0 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iK0++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p(obj4);
        }
        if (g(i13) < iG / 2) {
            return h(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new o(i12, i11, i13, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o) && (((g) obj) instanceof o) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public d f() {
        d dVar = this.f13553s;
        if (dVar != null) {
            return dVar;
        }
        d dVarJ = j();
        this.f13553s = dVarJ;
        return dVarJ;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public d j() {
        Object[] array = toArray(a.f13538r);
        b bVar = d.f13545s;
        return d.f(array.length, array);
    }
}
