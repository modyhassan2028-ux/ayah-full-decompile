package p185s8;

import p123m2.c;

/* JADX INFO: renamed from: s8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1315e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1319g0 f22343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f22347e;

    public final C1317f0 a() {
        C1319g0 c1319g0;
        String str;
        String str2;
        if (this.f22347e == 1 && (c1319g0 = this.f22343a) != null && (str = this.f22344b) != null && (str2 = this.f22345c) != null) {
            return new C1317f0(c1319g0, str, str2, this.f22346d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22343a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f22344b == null) {
            sb.append(" parameterKey");
        }
        if (this.f22345c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f22347e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
