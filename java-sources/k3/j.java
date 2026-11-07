package k3;

import p110k9.o;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f18978k = new j(true, true, true, true, true, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18984f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f18985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f18986i;
    public final o j;

    public /* synthetic */ j() {
        this(false, false, false, false, false, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f18979a == jVar.f18979a && this.f18980b == jVar.f18980b && this.f18981c == jVar.f18981c && this.f18982d == jVar.f18982d && this.f18983e == jVar.f18983e && this.f18984f == jVar.f18984f && this.g == jVar.g;
    }

    public final int hashCode() {
        return ((((((((((((this.f18979a ? 1231 : 1237) * 31) + (this.f18980b ? 1231 : 1237)) * 31) + (this.f18981c ? 1231 : 1237)) * 31) + (this.f18982d ? 1231 : 1237)) * 31) + (this.f18983e ? 1231 : 1237)) * 31) + (this.f18984f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "ReminderRepeatDays(saturday=" + this.f18979a + ", sunday=" + this.f18980b + ", monday=" + this.f18981c + ", tuesday=" + this.f18982d + ", wednesday=" + this.f18983e + ", thursday=" + this.f18984f + ", friday=" + this.g + ")";
    }

    public j(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f18979a = z10;
        this.f18980b = z11;
        this.f18981c = z12;
        this.f18982d = z13;
        this.f18983e = z14;
        this.f18984f = z15;
        this.g = z16;
        this.f18985h = p110k9.a.d(new B3.f(13, this));
        this.f18986i = p110k9.a.d(new Ba.b(15));
        this.j = p110k9.a.d(new Ba.b(16));
    }
}
