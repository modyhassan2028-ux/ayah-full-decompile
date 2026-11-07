package p185s8;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22158f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f22160i;
    public N0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0 f22161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q0 f22162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f22163m;

    public final B a() {
        if (this.f22163m == 1 && this.f22153a != null && this.f22154b != null && this.f22156d != null && this.f22159h != null && this.f22160i != null) {
            return new B(this.f22153a, this.f22154b, this.f22155c, this.f22156d, this.f22157e, this.f22158f, this.g, this.f22159h, this.f22160i, this.j, this.f22161k, this.f22162l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22153a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f22154b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f22163m) == 0) {
            sb.append(" platform");
        }
        if (this.f22156d == null) {
            sb.append(" installationUuid");
        }
        if (this.f22159h == null) {
            sb.append(" buildVersion");
        }
        if (this.f22160i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
