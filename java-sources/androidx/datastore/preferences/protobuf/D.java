package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class D implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f12376a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final V a(Class cls) {
        for (K k7 : this.f12376a) {
            if (k7.b(cls)) {
                return k7.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        for (K k7 : this.f12376a) {
            if (k7.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
