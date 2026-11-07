package u;

import java.util.Arrays;

/* JADX INFO: renamed from: u.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1360o implements Cloneable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f22740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long[] f22741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f22742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f22743u;

    public C1360o(int i10) {
        if (i10 == 0) {
            this.f22741s = p204v.a.f22999b;
            this.f22742t = p204v.a.f23000c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.f22741s = new long[i14];
        this.f22742t = new Object[i14];
    }

    public final void a(long j, Long l10) {
        int i10 = this.f22743u;
        if (i10 != 0 && j <= this.f22741s[i10 - 1]) {
            h(j, l10);
            return;
        }
        if (this.f22740r) {
            long[] jArr = this.f22741s;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f22742t;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != AbstractC1361p.f22744a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f22740r = false;
                this.f22743u = i11;
            }
        }
        int i13 = this.f22743u;
        if (i13 >= this.f22741s.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f22741s, i17);
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f22741s = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22742t, i17);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22742t = objArrCopyOf;
        }
        this.f22741s[i13] = j;
        this.f22742t[i13] = l10;
        this.f22743u = i13 + 1;
    }

    public final void b() {
        int i10 = this.f22743u;
        Object[] objArr = this.f22742t;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f22743u = 0;
        this.f22740r = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1360o clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p251z9.j.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1360o c1360o = (C1360o) objClone;
        c1360o.f22741s = (long[]) this.f22741s.clone();
        c1360o.f22742t = (Object[]) this.f22742t.clone();
        return c1360o;
    }

    public final Object d(long j) {
        Object obj;
        int iB = p204v.a.b(this.f22741s, this.f22743u, j);
        if (iB < 0 || (obj = this.f22742t[iB]) == AbstractC1361p.f22744a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j) {
        Object obj;
        int iB = p204v.a.b(this.f22741s, this.f22743u, j);
        if (iB < 0 || (obj = this.f22742t[iB]) == AbstractC1361p.f22744a) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j) {
        if (this.f22740r) {
            int i10 = this.f22743u;
            long[] jArr = this.f22741s;
            Object[] objArr = this.f22742t;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1361p.f22744a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f22740r = false;
            this.f22743u = i11;
        }
        return p204v.a.b(this.f22741s, this.f22743u, j);
    }

    public final long g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f22743u)) {
            p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f22740r) {
            long[] jArr = this.f22741s;
            Object[] objArr = this.f22742t;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1361p.f22744a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f22740r = false;
            this.f22743u = i12;
        }
        return this.f22741s[i10];
    }

    public final void h(long j, Object obj) {
        Object obj2 = AbstractC1361p.f22744a;
        int iB = p204v.a.b(this.f22741s, this.f22743u, j);
        if (iB >= 0) {
            this.f22742t[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f22743u;
        if (i10 < i11) {
            Object[] objArr = this.f22742t;
            if (objArr[i10] == obj2) {
                this.f22741s[i10] = j;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f22740r) {
            long[] jArr = this.f22741s;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f22742t;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f22740r = false;
                this.f22743u = i12;
                i10 = ~p204v.a.b(this.f22741s, i12, j);
            }
        }
        int i14 = this.f22743u;
        if (i14 >= this.f22741s.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f22741s, i18);
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f22741s = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22742t, i18);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22742t = objArrCopyOf;
        }
        int i19 = this.f22743u;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f22741s;
            int i20 = i10 + 1;
            p120l9.l.Z(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f22742t;
            p120l9.l.X(i20, i10, this.f22743u, objArr3, objArr3);
        }
        this.f22741s[i10] = j;
        this.f22742t[i10] = obj;
        this.f22743u++;
    }

    public final void i(long j) {
        int iB = p204v.a.b(this.f22741s, this.f22743u, j);
        if (iB >= 0) {
            Object[] objArr = this.f22742t;
            Object obj = objArr[iB];
            Object obj2 = AbstractC1361p.f22744a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f22740r = true;
            }
        }
    }

    public final int j() {
        if (this.f22740r) {
            int i10 = this.f22743u;
            long[] jArr = this.f22741s;
            Object[] objArr = this.f22742t;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1361p.f22744a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f22740r = false;
            this.f22743u = i11;
        }
        return this.f22743u;
    }

    public final Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f22743u)) {
            p204v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f22740r) {
            long[] jArr = this.f22741s;
            Object[] objArr = this.f22742t;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1361p.f22744a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f22740r = false;
            this.f22743u = i12;
        }
        return this.f22742t[i10];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22743u * 28);
        sb.append('{');
        int i10 = this.f22743u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(g(i11));
            sb.append('=');
            Object objK = k(i11);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C1360o(Object obj) {
        this(10);
    }
}
