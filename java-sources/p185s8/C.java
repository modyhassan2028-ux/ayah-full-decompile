package p185s8;

import java.util.List;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22179f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f22181i;
    public byte j;

    public final D a() {
        String str;
        if (this.j == 63 && (str = this.f22175b) != null) {
            return new D(this.f22174a, str, this.f22176c, this.f22177d, this.f22178e, this.f22179f, this.g, this.f22180h, this.f22181i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f22175b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
