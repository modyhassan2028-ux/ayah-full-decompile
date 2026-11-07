package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class r implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f12498b = new r(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12499a;

    public /* synthetic */ r(int i10) {
        this.f12499a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final V a(Class cls) {
        switch (this.f12499a) {
            case 0:
                if (!AbstractC0746u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0746u.d(cls.asSubclass(AbstractC0746u.class)).c(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        switch (this.f12499a) {
            case 0:
                return AbstractC0746u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
