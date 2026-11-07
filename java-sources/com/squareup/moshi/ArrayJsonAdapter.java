package com.squareup.moshi;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class ArrayJsonAdapter extends JsonAdapter<Object> {
    public static final j FACTORY = new C0914a(0);
    private final JsonAdapter<Object> elementAdapter;
    private final Class<?> elementClass;

    public ArrayJsonAdapter(Class<?> cls, JsonAdapter<Object> jsonAdapter) {
        this.elementClass = cls;
        this.elementAdapter = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        ArrayList arrayList = new ArrayList();
        nVar.b();
        while (nVar.w()) {
            arrayList.add(this.elementAdapter.a(nVar));
        }
        nVar.i();
        Object objNewInstance = Array.newInstance(this.elementClass, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        sVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.elementAdapter.e(sVar, Array.get(obj, i10));
        }
        ((q) sVar).X(1, 2, ']');
    }

    public final String toString() {
        return this.elementAdapter + ".array()";
    }
}
