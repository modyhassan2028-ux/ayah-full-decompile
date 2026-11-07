package com.squareup.moshi;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final j FACTORY = new C0914a(1);
    private final AbstractC0918e classFactory;
    private final f[] fieldsArray;
    private final m options;

    public ClassJsonAdapter(AbstractC0918e abstractC0918e, Map<String, f> map) {
        this.classFactory = abstractC0918e;
        this.fieldsArray = (f[]) map.values().toArray(new f[map.size()]);
        this.options = m.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        try {
            Object objA = this.classFactory.a();
            try {
                nVar.e();
                while (nVar.w()) {
                    int iV = nVar.V(this.options);
                    if (iV == -1) {
                        nVar.b0();
                        nVar.c0();
                    } else {
                        f fVar = this.fieldsArray[iV];
                        fVar.f15444b.set(objA, fVar.f15445c.a(nVar));
                    }
                }
                nVar.n();
                return objA;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            V8.d.g(e11);
            throw null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        try {
            sVar.e();
            for (f fVar : this.fieldsArray) {
                sVar.w(fVar.f15443a);
                fVar.f15445c.e(sVar, fVar.f15444b.get(obj));
            }
            sVar.i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.classFactory + ")";
    }
}
