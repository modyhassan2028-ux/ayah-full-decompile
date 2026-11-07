package p029c8;

import com.google.android.gms.internal.measurement.B1;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f13556v = new i(0, new Object[0]);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object[] f13557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f13558u;

    public i(int i10, Object[] objArr) {
        this.f13557t = objArr;
        this.f13558u = i10;
    }

    @Override // p029c8.d, p029c8.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f13557t;
        int i10 = this.f13558u;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // p029c8.a
    public final Object[] c() {
        return this.f13557t;
    }

    @Override // p029c8.a
    public final int d() {
        return this.f13558u;
    }

    @Override // p029c8.a
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        B1.j(i10, this.f13558u);
        Object obj = this.f13557t[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13558u;
    }
}
