package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final j FACTORY = new C0914a(2);
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    public MapJsonAdapter(C c10, Type type, Type type2) {
        c10.getClass();
        Set set = V8.d.f8425a;
        this.keyAdapter = c10.b(type, set, null);
        this.valueAdapter = c10.b(type2, set, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        x xVar = new x();
        nVar.e();
        while (nVar.w()) {
            o oVar = (o) nVar;
            if (oVar.w()) {
                oVar.f15460B = oVar.j0();
                oVar.f15464y = 11;
            }
            Object objA = this.keyAdapter.a(nVar);
            Object objA2 = this.valueAdapter.a(nVar);
            Object objPut = xVar.put(objA, objA2);
            if (objPut != null) {
                throw new A6.a("Map key '" + objA + "' has multiple values at path " + nVar.s() + ": " + objPut + " and " + objA2);
            }
        }
        nVar.n();
        return xVar;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        sVar.e();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new A6.a("Map key is null at " + sVar.n());
            }
            int iE = sVar.E();
            if (iE != 5 && iE != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            sVar.f15488w = true;
            this.keyAdapter.e(sVar, entry.getKey());
            this.valueAdapter.e(sVar, entry.getValue());
        }
        sVar.i();
    }

    public final String toString() {
        return "JsonAdapter(" + this.keyAdapter + "=" + this.valueAdapter + ")";
    }
}
