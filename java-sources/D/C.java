package D;

import J0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends l0.q implements u0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public l0.h f872F;

    @Override // J0.u0
    public final Object i(p063g1.c cVar, Object obj) {
        T t2 = obj instanceof T ? (T) obj : null;
        if (t2 == null) {
            t2 = new T();
        }
        t2.f915c = new C0078v(this.f872F);
        return t2;
    }
}
