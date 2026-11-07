package p029c8;

import Y2.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final o f13572A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object[] f13573z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object[] f13574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f13575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f13576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f13577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f13578y;

    static {
        Object[] objArr = new Object[0];
        f13573z = objArr;
        f13572A = new o(0, 0, 0, objArr, objArr);
    }

    public o(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f13574u = objArr;
        this.f13575v = i10;
        this.f13576w = objArr2;
        this.f13577x = i11;
        this.f13578y = i12;
    }

    @Override // p029c8.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f13574u;
        int i10 = this.f13578y;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // p029c8.a
    public final Object[] c() {
        return this.f13574u;
    }

    @Override // p029c8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13576w;
            if (objArr.length != 0) {
                int iK0 = a.k0(obj.hashCode());
                while (true) {
                    int i10 = iK0 & this.f13577x;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iK0 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // p029c8.a
    public final int d() {
        return this.f13578y;
    }

    @Override // p029c8.a
    public final int e() {
        return 0;
    }

    @Override // p029c8.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13575v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // p029c8.g
    public final d j() {
        return d.f(this.f13578y, this.f13574u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13578y;
    }
}
