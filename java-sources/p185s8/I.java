package p185s8;

import java.util.List;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f22203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22204f;
    public v0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M0 f22205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L0 f22206i;
    public w0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f22207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f22209m;

    public final J a() {
        String str;
        String str2;
        v0 v0Var;
        if (this.f22209m == 7 && (str = this.f22199a) != null && (str2 = this.f22200b) != null && (v0Var = this.g) != null) {
            return new J(str, str2, this.f22201c, this.f22202d, this.f22203e, this.f22204f, v0Var, this.f22205h, this.f22206i, this.j, this.f22207k, this.f22208l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22199a == null) {
            sb.append(" generator");
        }
        if (this.f22200b == null) {
            sb.append(" identifier");
        }
        if ((this.f22209m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f22209m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.f22209m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
