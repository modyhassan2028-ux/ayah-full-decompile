package p160p8;

import D6.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f21105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f21106t;

    public /* synthetic */ n(r rVar, s sVar, int i10) {
        this.f21104r = i10;
        this.f21105s = rVar;
        this.f21106t = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21104r) {
            case 0:
                this.f21105s.a(this.f21106t);
                break;
            default:
                this.f21105s.a(this.f21106t);
                break;
        }
    }
}
