package dev.zacsweers.moshix.sealed.runtime.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectJsonAdapter<T> extends JsonAdapter<T> {
    private final T instance;

    public ObjectJsonAdapter(T t2) {
        j.e(t2, "instance");
        this.instance = t2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        while (nVar.w()) {
            nVar.b0();
            nVar.c0();
        }
        nVar.n();
        return this.instance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        j.e(sVar, "writer");
        sVar.e();
        sVar.i();
    }

    public final String toString() {
        return a.D("ObjectJsonAdapter<", this.instance.getClass().getCanonicalName(), ">");
    }
}
