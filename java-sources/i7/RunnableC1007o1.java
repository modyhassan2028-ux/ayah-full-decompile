package i7;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: renamed from: i7.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1007o1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X1 f17498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17499t;

    public /* synthetic */ RunnableC1007o1(C1021t1 c1021t1, X1 x9, int i10) {
        this.f17497r = i10;
        this.f17498s = x9;
        this.f17499t = c1021t1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f17497r) {
            case 0:
                C1021t1 c1021t1 = this.f17499t;
                J j = c1021t1.f17552u;
                C1023u0 c1023u0 = (C1023u0) c1021t1.f16104r;
                if (j != null) {
                    try {
                        j.o(this.f17498s);
                    } catch (RemoteException e10) {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17182w.b(e10, "Failed to reset data on the service: remote exception");
                    }
                    c1021t1.B();
                } else {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                C1021t1 c1021t2 = this.f17499t;
                J j10 = c1021t2.f17552u;
                C1023u0 c1023u1 = (C1023u0) c1021t2.f16104r;
                if (j10 == null) {
                    X x11 = c1023u1.f17584w;
                    C1023u0.m(x11);
                    x11.f17182w.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        X1 x12 = this.f17498s;
                        C0981g c0981g = c1023u1.f17582u;
                        F f3 = G.f16936c1;
                        if (c0981g.y(null, f3)) {
                            c1021t2.G(j10, null, x12);
                        }
                        j10.A0(x12);
                        c1023u1.o().t();
                        c1023u1.f17582u.y(null, f3);
                        c1021t2.G(j10, null, x12);
                        c1021t2.B();
                    } catch (RemoteException e11) {
                        X x13 = c1023u1.f17584w;
                        C1023u0.m(x13);
                        x13.f17182w.b(e11, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                C1021t1 c1021t3 = this.f17499t;
                J j11 = c1021t3.f17552u;
                C1023u0 c1023u2 = (C1023u0) c1021t3.f16104r;
                if (j11 == null) {
                    X x14 = c1023u2.f17584w;
                    C1023u0.m(x14);
                    x14.f17185z.a("Failed to send app backgrounded");
                } else {
                    try {
                        j11.i(this.f17498s);
                        c1021t3.B();
                    } catch (RemoteException e12) {
                        X x15 = c1023u2.f17584w;
                        C1023u0.m(x15);
                        x15.f17182w.b(e12, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                C1021t1 c1021t4 = this.f17499t;
                J j12 = c1021t4.f17552u;
                C1023u0 c1023u3 = (C1023u0) c1021t4.f16104r;
                if (j12 == null) {
                    X x16 = c1023u3.f17584w;
                    C1023u0.m(x16);
                    x16.f17182w.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        j12.R(this.f17498s);
                        c1021t4.B();
                    } catch (RemoteException e13) {
                        X x17 = c1023u3.f17584w;
                        C1023u0.m(x17);
                        x17.f17182w.b(e13, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                C1021t1 c1021t5 = this.f17499t;
                J j13 = c1021t5.f17552u;
                C1023u0 c1023u4 = (C1023u0) c1021t5.f16104r;
                if (j13 == null) {
                    X x18 = c1023u4.f17584w;
                    C1023u0.m(x18);
                    x18.f17182w.a("Failed to send consent settings to service");
                } else {
                    try {
                        j13.c0(this.f17498s);
                        c1021t5.B();
                    } catch (RemoteException e14) {
                        X x19 = c1023u4.f17584w;
                        C1023u0.m(x19);
                        x19.f17182w.b(e14, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public RunnableC1007o1(C1021t1 c1021t1, X1 x9) {
        this.f17497r = 4;
        this.f17498s = x9;
        Objects.requireNonNull(c1021t1);
        this.f17499t = c1021t1;
    }
}
