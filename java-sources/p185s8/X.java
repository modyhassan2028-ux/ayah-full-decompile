package p185s8;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f22286f;

    public final Y a() {
        String str;
        if (this.f22286f == 7 && (str = this.f22282b) != null) {
            return new Y(this.f22281a, str, this.f22283c, this.f22284d, this.f22285e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f22286f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f22282b == null) {
            sb.append(" symbol");
        }
        if ((this.f22286f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f22286f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
