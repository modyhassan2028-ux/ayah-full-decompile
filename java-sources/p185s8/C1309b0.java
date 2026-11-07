package p185s8;

import p123m2.c;

/* JADX INFO: renamed from: s8.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1309b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f22313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22318f;
    public byte g;

    public final C1311c0 a() {
        if (this.g == 31) {
            return new C1311c0(this.f22313a, this.f22314b, this.f22315c, this.f22316d, this.f22317e, this.f22318f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
