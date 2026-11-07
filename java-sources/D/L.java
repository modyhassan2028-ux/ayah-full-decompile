package D;

import J0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends l0.q implements u0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f896F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f897G;

    @Override // J0.u0
    public final Object i(p063g1.c cVar, Object obj) {
        T t2 = obj instanceof T ? (T) obj : null;
        if (t2 == null) {
            t2 = new T();
        }
        t2.f913a = this.f896F;
        t2.f914b = this.f897G;
        return t2;
    }
}
