package i7;

import j$.util.Objects;

/* JADX INFO: renamed from: i7.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0989i1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0992j1 f17416s;

    public RunnableC0989i1(C0992j1 c0992j1, int i10) {
        this.f17415r = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(c0992j1);
                this.f17416s = c0992j1;
                break;
            default:
                Objects.requireNonNull(c0992j1);
                this.f17416s = c0992j1;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17415r) {
            case 0:
                C0992j1 c0992j1 = this.f17416s;
                c0992j1.f17430v = c0992j1.f17425A;
                break;
            default:
                this.f17416s.f17425A = null;
                break;
        }
    }
}
