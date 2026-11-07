package p029c8;

import com.google.android.gms.internal.measurement.B1;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object[] f13565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f13566u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f13567v;

    public m(Object[] objArr, int i10, int i11) {
        this.f13565t = objArr;
        this.f13566u = i10;
        this.f13567v = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        B1.j(i10, this.f13567v);
        Object obj = this.f13565t[(i10 * 2) + this.f13566u];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13567v;
    }
}
