package p029c8;

import com.google.android.gms.internal.measurement.B1;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f13542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f13543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f13544v;

    public c(d dVar, int i10, int i11) {
        this.f13544v = dVar;
        this.f13542t = i10;
        this.f13543u = i11;
    }

    @Override // p029c8.a
    public final Object[] c() {
        return this.f13544v.c();
    }

    @Override // p029c8.a
    public final int d() {
        return this.f13544v.e() + this.f13542t + this.f13543u;
    }

    @Override // p029c8.a
    public final int e() {
        return this.f13544v.e() + this.f13542t;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        B1.j(i10, this.f13543u);
        return this.f13544v.get(i10 + this.f13542t);
    }

    @Override // p029c8.d, java.util.List
    /* JADX INFO: renamed from: h */
    public final d subList(int i10, int i11) {
        B1.l(i10, i11, this.f13543u);
        int i12 = this.f13542t;
        return this.f13544v.subList(i10 + i12, i11 + i12);
    }

    @Override // p029c8.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p029c8.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13543u;
    }

    @Override // p029c8.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
