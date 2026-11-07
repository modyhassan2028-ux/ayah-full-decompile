package com.squareup.moshi;

import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonAdapter<T> {
    public abstract Object a(n nVar);

    public final Object b(String str) {
        Da.h hVar = new Da.h();
        hVar.d0(str);
        o oVar = new o(hVar);
        Object objA = a(oVar);
        if (oVar.N() == 10) {
            return objA;
        }
        throw new A6.a("JSON document was not fully consumed.");
    }

    public final NullSafeJsonAdapter c() {
        return this instanceof NullSafeJsonAdapter ? (NullSafeJsonAdapter) this : new NullSafeJsonAdapter(this);
    }

    public final String d(Object obj) {
        Da.h hVar = new Da.h();
        try {
            e(new q(hVar), obj);
            return hVar.E();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void e(s sVar, Object obj);
}
