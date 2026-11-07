package com.squareup.moshi;

import com.google.android.gms.internal.measurement.B1;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j {
    @Override // com.squareup.moshi.j
    public final JsonAdapter a(Type type, Set set, C c10) {
        Class clsF = B1.F(type);
        g gVar = null;
        if (set.isEmpty()) {
            if (clsF == List.class || clsF == Collection.class) {
                return new h(c10.b(B1.p(type), V8.d.f8425a, null), gVar, 0).c();
            }
            if (clsF == Set.class) {
                return new h(c10.b(B1.p(type), V8.d.f8425a, null), gVar, 1).c();
            }
        }
        return null;
    }
}
