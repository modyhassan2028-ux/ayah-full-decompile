package p178r8;

import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f21619c = new i(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21621b;

    public i(int i10, int i11) {
        this.f21620a = i10;
        this.f21621b = i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f21620a);
        sb.append(", length = ");
        return a.E(sb, this.f21621b, "]");
    }
}
