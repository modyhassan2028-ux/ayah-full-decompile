package u;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f22650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22651b;

    public A(int i10) {
        this.f22650a = i10 == 0 ? K.f22696a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f22651b + 1;
        Object[] objArr = this.f22650a;
        if (objArr.length < i10) {
            l(i10, objArr);
        }
        Object[] objArr2 = this.f22650a;
        int i11 = this.f22651b;
        objArr2[i11] = obj;
        this.f22651b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f22651b;
        int size = list.size() + i10;
        Object[] objArr = this.f22650a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f22650a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f22651b = list.size() + this.f22651b;
    }

    public final void c() {
        p120l9.l.e0(0, this.f22651b, null, this.f22650a);
        this.f22651b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f22650a[0];
        }
        p204v.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i10) {
        if (i10 >= 0 && i10 < this.f22651b) {
            return this.f22650a[i10];
        }
        m(i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a9 = (A) obj;
            int i10 = a9.f22651b;
            int i11 = this.f22651b;
            if (i10 == i11) {
                Object[] objArr = this.f22650a;
                Object[] objArr2 = a9.f22650a;
                E9.d dVarI0 = B0.c.i0(0, i11);
                int i12 = dVarI0.f1995r;
                int i13 = dVarI0.f1996s;
                if (i12 > i13) {
                    return true;
                }
                while (p251z9.j.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f22650a;
            int i11 = this.f22651b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f22650a;
        int i12 = this.f22651b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f22651b == 0;
    }

    public final boolean h() {
        return this.f22651b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f22650a;
        int i10 = this.f22651b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f22651b)) {
            m(i10);
            throw null;
        }
        Object[] objArr = this.f22650a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            p120l9.l.X(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f22651b - 1;
        this.f22651b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f22651b) || i11 < 0 || i11 > i12) {
            StringBuilder sbX = p123m2.c.x("Start (", i10, ") and end (", i11, ") must be in 0..");
            sbX.append(this.f22651b);
            p204v.a.d(sbX.toString());
            throw null;
        }
        if (i11 < i10) {
            p204v.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f22650a;
                p120l9.l.X(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f22651b;
            int i14 = i13 - (i11 - i10);
            p120l9.l.e0(i14, i13, null, this.f22650a);
            this.f22651b = i14;
        }
    }

    public final void l(int i10, Object[] objArr) {
        p251z9.j.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        p120l9.l.X(0, 0, length, objArr, objArr2);
        this.f22650a = objArr2;
    }

    public final void m(int i10) {
        StringBuilder sbW = p123m2.c.w(i10, "Index ", " must be in 0..");
        sbW.append(this.f22651b - 1);
        p204v.a.d(sbW.toString());
        throw null;
    }

    public final String toString() {
        p085i0.f fVar = new p085i0.f(7, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f22650a;
        int i10 = this.f22651b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) fVar.e(obj));
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        p251z9.j.d(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ A() {
        this(16);
    }
}
