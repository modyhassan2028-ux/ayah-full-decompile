package p251z9;

import F9.b;
import F9.e;
import F9.f;
import K9.C0404w;
import R0.u;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements e, f {
    public l(String str, String str2) {
        super(b.f24868r, u.class, str, str2, 1);
    }

    @Override // p251z9.c
    public final b b() {
        w.f24887a.getClass();
        return this;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        g();
        throw null;
    }

    public final void g() {
        if (this.f24881x) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        b bVarF = f();
        if (bVarF == this) {
            throw new C0404w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((f) bVarF)).g();
    }

    @Override // F9.e
    public final Object get(Object obj) {
        throw null;
    }
}
