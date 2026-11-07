package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795c implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f14214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Iterator f14215s;

    public C0795c(C0800d c0800d, Iterator it, Iterator it2) {
        this.f14214r = it;
        this.f14215s = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14214r.hasNext()) {
            return true;
        }
        return this.f14215s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f14214r;
        if (it.hasNext()) {
            return new C0865q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f14215s;
        if (it2.hasNext()) {
            return new C0865q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
