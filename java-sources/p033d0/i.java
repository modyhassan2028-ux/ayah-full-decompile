package p033d0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p017b7.g;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f15549s = new i(new Object[0]);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object[] f15550r;

    public i(Object[] objArr) {
        this.f15550r = objArr;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f15550r.length;
    }

    @Override // p033d0.c
    public final c c(int i10, Object obj) {
        Object[] objArr = this.f15550r;
        g.S(i10, objArr.length);
        if (i10 == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.b0(0, i10, 6, objArr, objArr2);
            l.X(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        j.d(objArrCopyOf, "copyOf(...)");
        l.X(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p033d0.c
    public final c d(Object obj) {
        Object[] objArr = this.f15550r;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // p033d0.c
    public final c e(Collection collection) {
        Object[] objArr = this.f15550r;
        if (collection.size() + objArr.length > 32) {
            f fVarF = f();
            fVarF.addAll(collection);
            return fVarF.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        j.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // p033d0.c
    public final f f() {
        return new f(this, null, this.f15550r, 0);
    }

    @Override // p033d0.c
    public final c g(b bVar) {
        Object[] objArr = this.f15550r;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.e(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    j.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f15549s : new i(l.d0(objArrCopyOf, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g.P(i10, b());
        return this.f15550r[i10];
    }

    @Override // p033d0.c
    public final c h(int i10) {
        Object[] objArr = this.f15550r;
        g.P(i10, objArr.length);
        if (objArr.length == 1) {
            return f15549s;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        j.d(objArrCopyOf, "copyOf(...)");
        l.X(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // p120l9.d, java.util.List
    public final int indexOf(Object obj) {
        return l.l0(obj, this.f15550r);
    }

    @Override // p033d0.c
    public final c j(int i10, Object obj) {
        Object[] objArr = this.f15550r;
        g.P(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new i(objArrCopyOf);
    }

    @Override // p120l9.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f15550r;
        j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // p120l9.d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f15550r;
        g.S(i10, objArr.length);
        return new d(objArr, i10, objArr.length);
    }
}
