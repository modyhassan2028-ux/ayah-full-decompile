package p251z9;

import F9.b;
import F9.f;
import K9.C0404w;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q implements f, e {
    public p(Class cls) {
        super(b.f24868r, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // p251z9.c
    public final b b() {
        w.f24887a.getClass();
        return this;
    }

    public final void g() {
        if (this.f24881x) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        b bVarF = f();
        if (bVarF == this) {
            throw new C0404w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((p) ((f) bVarF)).g();
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        g();
        throw null;
    }
}
