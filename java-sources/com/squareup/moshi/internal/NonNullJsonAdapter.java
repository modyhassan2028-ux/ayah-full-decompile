package com.squareup.moshi.internal;

import A6.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.s;

/* JADX INFO: loaded from: classes.dex */
public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        if (nVar.N() != 9) {
            return this.delegate.a(nVar);
        }
        throw new a("Unexpected null at " + nVar.s());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        if (obj != null) {
            this.delegate.e(sVar, obj);
        } else {
            throw new a("Unexpected null at " + sVar.n());
        }
    }

    public final String toString() {
        return this.delegate + ".nonNull()";
    }
}
