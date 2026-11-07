package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f17840a = new C();

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C);
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
