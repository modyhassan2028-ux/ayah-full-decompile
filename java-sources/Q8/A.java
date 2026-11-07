package Q8;

/* JADX INFO: loaded from: classes.dex */
public enum A implements E8.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6881r;

    A(int i10) {
        this.f6881r = i10;
    }

    @Override // E8.f
    public final int a() {
        return this.f6881r;
    }
}
