package p185s8;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E0 f22244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0 f22245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G0 f22246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J0 f22247f;
    public byte g;

    public final P a() {
        String str;
        E0 e10;
        F0 f3;
        if (this.g == 1 && (str = this.f22243b) != null && (e10 = this.f22244c) != null && (f3 = this.f22245d) != null) {
            return new P(this.f22242a, str, e10, f3, this.f22246e, this.f22247f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f22243b == null) {
            sb.append(" type");
        }
        if (this.f22244c == null) {
            sb.append(" app");
        }
        if (this.f22245d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
