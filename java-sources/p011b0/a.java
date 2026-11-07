package p011b0;

import java.util.NoSuchElementException;
import p120l9.l;
import p251z9.j;
import u.A;
import u.E;
import u.K;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f13118a;

    public /* synthetic */ a(E e10) {
        this.f13118a = e10;
    }

    public static final Object a(E e10) {
        Object objG = e10.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof A)) {
            e10.j(null);
            return objG;
        }
        A a9 = (A) objG;
        if (a9.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = a9.f22651b - 1;
        Object objE = a9.e(i10);
        a9.j(i10);
        j.c(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (a9.g()) {
            e10.j(null);
        }
        if (a9.f22651b == 1) {
            e10.l(null, a9.d());
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:9:0x001e->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[EDGE_INSN: B:31:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:9:0x001e->B:28:0x0085], SYNTHETIC] */
    public static final A b(E e10) {
        if (e10.i()) {
            A a9 = K.f22697b;
            j.c(a9, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return a9;
        }
        A a10 = new A();
        Object[] objArr = e10.f22671c;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof A) {
                                A a11 = (A) obj;
                                if (!a11.g()) {
                                    int i13 = a10.f22651b + a11.f22651b;
                                    Object[] objArr2 = a10.f22650a;
                                    if (objArr2.length < i13) {
                                        a10.l(i13, objArr2);
                                    }
                                    l.X(a10.f22651b, 0, a11.f22651b, a11.f22650a, a10.f22650a);
                                    a10.f22651b += a11.f22651b;
                                }
                            } else {
                                j.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                a10.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return a10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return j.a(this.f13118a, ((a) obj).f13118a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13118a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f13118a + ')';
    }
}
