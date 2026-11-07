package na;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f20035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20036d;

    public a(String str) {
        j.e(str, "name");
        this.f20033a = str;
        this.f20034b = true;
        this.f20036d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f20033a;
    }
}
