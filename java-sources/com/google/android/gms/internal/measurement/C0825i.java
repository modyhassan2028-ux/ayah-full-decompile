package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0825i implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f14332r;

    public C0825i(Iterator it) {
        this.f14332r = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14332r.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C0865q((String) this.f14332r.next());
    }
}
