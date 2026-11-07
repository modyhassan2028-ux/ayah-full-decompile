package N9;

import K9.C0389g;

/* JADX INFO: loaded from: classes.dex */
public final class W implements K9.J {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Y f6131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f6132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f6133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0389g f6134u;

    public W(Y y10, long j, Object obj, C0389g c0389g) {
        this.f6131r = y10;
        this.f6132s = j;
        this.f6133t = obj;
        this.f6134u = c0389g;
    }

    @Override // K9.J
    public final void a() {
        Y y10 = this.f6131r;
        synchronized (y10) {
            if (this.f6132s < y10.r()) {
                return;
            }
            Object[] objArr = y10.f6148y;
            p251z9.j.b(objArr);
            long j = this.f6132s;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC0419l.f(objArr, j, AbstractC0419l.f6214b);
            y10.m();
        }
    }
}
