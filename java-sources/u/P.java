package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Cloneable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f22704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ int[] f22705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f22706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f22707u;

    public P(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f22705s = new int[i14];
        this.f22706t = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f22707u;
        if (i11 != 0 && i10 <= this.f22705s[i11 - 1]) {
            f(i10, obj);
            return;
        }
        if (this.f22704r && i11 >= this.f22705s.length) {
            AbstractC1361p.a(this);
        }
        int i12 = this.f22707u;
        if (i12 >= this.f22705s.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f22705s, i16);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22705s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22706t, i16);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22706t = objArrCopyOf;
        }
        this.f22705s[i12] = i10;
        this.f22706t[i12] = obj;
        this.f22707u = i12 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final P clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p251z9.j.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        P p10 = (P) objClone;
        p10.f22705s = (int[]) this.f22705s.clone();
        p10.f22706t = (Object[]) this.f22706t.clone();
        return p10;
    }

    public final boolean c(int i10) {
        if (this.f22704r) {
            AbstractC1361p.a(this);
        }
        return p204v.a.a(this.f22707u, i10, this.f22705s) >= 0;
    }

    public final Object d(int i10) {
        Object obj;
        int iA = p204v.a.a(this.f22707u, i10, this.f22705s);
        if (iA < 0 || (obj = this.f22706t[iA]) == AbstractC1361p.f22746c) {
            return null;
        }
        return obj;
    }

    public final int e(int i10) {
        if (this.f22704r) {
            AbstractC1361p.a(this);
        }
        return this.f22705s[i10];
    }

    public final void f(int i10, Object obj) {
        int iA = p204v.a.a(this.f22707u, i10, this.f22705s);
        if (iA >= 0) {
            this.f22706t[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f22707u;
        if (i11 < i12) {
            Object[] objArr = this.f22706t;
            if (objArr[i11] == AbstractC1361p.f22746c) {
                this.f22705s[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f22704r && i12 >= this.f22705s.length) {
            AbstractC1361p.a(this);
            i11 = ~p204v.a.a(this.f22707u, i10, this.f22705s);
        }
        int i13 = this.f22707u;
        if (i13 >= this.f22705s.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f22705s, i17);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f22705s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f22706t, i17);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f22706t = objArrCopyOf;
        }
        int i18 = this.f22707u;
        if (i18 - i11 != 0) {
            int[] iArr = this.f22705s;
            int i19 = i11 + 1;
            p120l9.l.W(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f22706t;
            p120l9.l.X(i19, i11, this.f22707u, objArr2, objArr2);
        }
        this.f22705s[i11] = i10;
        this.f22706t[i11] = obj;
        this.f22707u++;
    }

    public final int g() {
        if (this.f22704r) {
            AbstractC1361p.a(this);
        }
        return this.f22707u;
    }

    public final Object h(int i10) {
        if (this.f22704r) {
            AbstractC1361p.a(this);
        }
        Object[] objArr = this.f22706t;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22707u * 28);
        sb.append('{');
        int i10 = this.f22707u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(e(i11));
            sb.append('=');
            Object objH = h(i11);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
