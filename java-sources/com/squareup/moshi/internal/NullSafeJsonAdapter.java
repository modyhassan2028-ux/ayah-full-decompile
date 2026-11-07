package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.s;

/* JADX INFO: loaded from: classes.dex */
public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        if (nVar.N() != 9) {
            return this.delegate.a(nVar);
        }
        nVar.H();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        if (obj == null) {
            sVar.A();
        } else {
            this.delegate.e(sVar, obj);
        }
    }

    public final String toString() {
        return this.delegate + ".nullSafe()";
    }
}
