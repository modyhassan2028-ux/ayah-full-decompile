package E6;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class p implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1950a;

    @Override // p101j9.a
    public final Object get() {
        switch (this.f1950a) {
            case 0:
                return new s(0, Executors.newSingleThreadExecutor());
            default:
                R7.f fVar = new R7.f(12);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(B6.c.f644r, new K6.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(B6.c.f646t, new K6.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(K6.d.f5251s)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(B6.c.f645s, new K6.c(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < B6.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new K6.b(fVar, map);
        }
    }
}
