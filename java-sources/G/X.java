package G;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final X f2646r = new X(2);

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        Map mapC = ((Y) obj2).c();
        if (mapC.isEmpty()) {
            return null;
        }
        return mapC;
    }
}
