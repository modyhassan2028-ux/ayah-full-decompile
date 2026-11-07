package com.squareup.moshi;

import com.google.android.gms.internal.measurement.B1;
import dev.zacsweers.moshix.sealed.runtime.internal.ObjectJsonAdapter;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f15515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ObjectJsonAdapter f15516b;

    public y(Class cls, ObjectJsonAdapter objectJsonAdapter) {
        this.f15515a = cls;
        this.f15516b = objectJsonAdapter;
    }

    @Override // com.squareup.moshi.j
    public final JsonAdapter a(Type type, Set set, C c10) {
        if (!set.isEmpty()) {
            return null;
        }
        Set set2 = V8.d.f8425a;
        if (B1.w(this.f15515a, type)) {
            return this.f15516b;
        }
        return null;
    }
}
