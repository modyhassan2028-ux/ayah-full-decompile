package Y9;

import java.util.Iterator;

/* JADX INFO: renamed from: Y9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0645a implements U9.a {
    @Override // U9.a
    public Object c(X9.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(X9.b bVar) {
        Object objE = e();
        int iF = f(objE);
        X9.a aVarD = bVar.d(d());
        while (true) {
            int iH = aVarD.h(d());
            if (iH == -1) {
                aVarD.t(d());
                return l(objE);
            }
            j(aVarD, iH + iF, objE);
        }
    }

    public abstract void j(X9.a aVar, int i10, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
