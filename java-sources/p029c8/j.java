package p029c8;

import com.google.android.gms.internal.measurement.B1;
import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f13559t;

    public j(k kVar) {
        this.f13559t = kVar;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k kVar = this.f13559t;
        B1.j(i10, kVar.f13562w);
        Object[] objArr = kVar.f13561v;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13559t.f13562w;
    }
}
