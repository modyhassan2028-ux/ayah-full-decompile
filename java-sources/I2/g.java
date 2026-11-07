package I2;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Q2.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R2.a f3813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3815t;

    public g(R2.a aVar, String str) {
        this.f3813r = aVar;
        this.f3814s = str;
    }

    @Override // Q2.c
    public final boolean I() {
        return getLong(0) != 0;
    }

    public final void b() {
        if (this.f3815t) {
            u0.F(21, "statement is closed");
            throw null;
        }
    }
}
