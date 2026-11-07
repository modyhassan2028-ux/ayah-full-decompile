package p185s8;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22231f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f22233i;
    public byte j;

    public final N a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f22227b) != null && (str2 = this.f22232h) != null && (str3 = this.f22233i) != null) {
            return new N(this.f22226a, str, this.f22228c, this.f22229d, this.f22230e, this.f22231f, this.g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f22227b == null) {
            sb.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f22232h == null) {
            sb.append(" manufacturer");
        }
        if (this.f22233i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
