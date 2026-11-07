package p185s8;

import p123m2.c;

/* JADX INFO: renamed from: s8.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1323i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f22378e;

    public final C1325j0 a() {
        String str;
        String str2;
        if (this.f22378e == 3 && (str = this.f22375b) != null && (str2 = this.f22376c) != null) {
            return new C1325j0(this.f22374a, str, str2, this.f22377d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f22378e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f22375b == null) {
            sb.append(" version");
        }
        if (this.f22376c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f22378e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
