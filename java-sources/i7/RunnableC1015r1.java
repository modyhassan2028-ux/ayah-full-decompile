package i7;

import android.os.RemoteException;

/* JADX INFO: renamed from: i7.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1015r1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17540s;

    public /* synthetic */ RunnableC1015r1(C1021t1 c1021t1, int i10) {
        this.f17539r = i10;
        this.f17540s = c1021t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17539r) {
            case 0:
                this.f17540s.u();
                break;
            case 1:
                C1021t1 c1021t1 = this.f17540s;
                C1023u0 c1023u0 = (C1023u0) c1021t1.f16104r;
                J j = c1021t1.f17552u;
                if (j == null) {
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17182w.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        j.O(c1021t1.E(false));
                        c1021t1.B();
                    } catch (RemoteException e10) {
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17182w.b(e10, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                C1021t1 c1021t2 = this.f17540s;
                C1023u0 c1023u1 = (C1023u0) c1021t2.f16104r;
                J j10 = c1021t2.f17552u;
                if (j10 == null) {
                    X x11 = c1023u1.f17584w;
                    C1023u0.m(x11);
                    x11.f17182w.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        j10.t(c1021t2.E(false));
                        c1021t2.B();
                    } catch (RemoteException e11) {
                        X x12 = c1023u1.f17584w;
                        C1023u0.m(x12);
                        x12.f17182w.b(e11, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
