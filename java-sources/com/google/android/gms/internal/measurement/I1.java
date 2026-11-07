package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        O1.f14084i.incrementAndGet();
    }
}
