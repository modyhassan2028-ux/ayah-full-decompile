package Q8;

/* JADX INFO: renamed from: Q8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0463j implements E8.f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7028r;

    EnumC0463j(int i10) {
        this.f7028r = i10;
    }

    @Override // E8.f
    public final int a() {
        return this.f7028r;
    }
}
