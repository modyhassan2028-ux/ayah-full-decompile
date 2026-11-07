package p185s8;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f22296e;

    public final C1307a0 a() {
        String str;
        if (this.f22296e == 7 && (str = this.f22292a) != null) {
            return new C1307a0(str, this.f22295d, this.f22293b, this.f22294c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22292a == null) {
            sb.append(" processName");
        }
        if ((this.f22296e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f22296e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f22296e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }
}
