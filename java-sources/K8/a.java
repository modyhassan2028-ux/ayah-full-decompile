package K8;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5304f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f5305h;

    public final b a() {
        if (this.f5305h == 3 && this.f5300b != 0) {
            return new b(this.f5299a, this.f5300b, this.f5301c, this.f5302d, this.f5303e, this.f5304f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5300b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f5305h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f5305h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
    }
}
