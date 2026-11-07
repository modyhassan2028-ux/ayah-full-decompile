package i7;

import E2.RunnableC0147v;
import U6.InterfaceC0524b;
import U6.InterfaceC0525c;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: renamed from: i7.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1018s1 implements ServiceConnection, InterfaceC0524b, InterfaceC0525c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f17545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile T f17546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17547c;

    public ServiceConnectionC1018s1(C1021t1 c1021t1) {
        this.f17547c = c1021t1;
    }

    @Override // U6.InterfaceC0524b
    public final void a(int i10) {
        C1023u0 c1023u0 = (C1023u0) this.f17547c.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.t();
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17177D.a("Service connection suspended");
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.x(new RunnableC0147v(17, this));
    }

    public final void b() throws Throwable {
        C1021t1 c1021t1 = this.f17547c;
        c1021t1.o();
        Context context = ((C1023u0) c1021t1.f16104r).f17579r;
        synchronized (this) {
            try {
                try {
                    if (this.f17545a) {
                        X x9 = ((C1023u0) this.f17547c.f16104r).f17584w;
                        C1023u0.m(x9);
                        x9.f17178E.a("Connection attempt already in progress");
                    } else {
                        if (this.f17546b != null && (this.f17546b.g() || this.f17546b.a())) {
                            X x10 = ((C1023u0) this.f17547c.f16104r).f17584w;
                            C1023u0.m(x10);
                            x10.f17178E.a("Already awaiting connection attempt");
                            return;
                        }
                        this.f17546b = new T(context, Looper.getMainLooper(), U6.J.a(context), R6.f.f7246b, 93, this, this, null);
                        X x11 = ((C1023u0) this.f17547c.f16104r).f17584w;
                        C1023u0.m(x11);
                        x11.f17178E.a("Connecting to remote service");
                        this.f17545a = true;
                        U6.y.f(this.f17546b);
                        this.f17546b.o();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // U6.InterfaceC0524b
    public final void c() {
        C1014r0 c1014r0 = ((C1023u0) this.f17547c.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.t();
        synchronized (this) {
            try {
                U6.y.f(this.f17546b);
                J j = (J) this.f17546b.u();
                C1014r0 c1014r1 = ((C1023u0) this.f17547c.f16104r).f17585x;
                C1023u0.m(c1014r1);
                c1014r1.x(new RunnableC1013q1(this, j, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f17546b = null;
                this.f17545a = false;
            }
        }
    }

    @Override // U6.InterfaceC0525c
    public final void g(R6.b bVar) {
        C1021t1 c1021t1 = this.f17547c;
        C1014r0 c1014r0 = ((C1023u0) c1021t1.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.t();
        X x9 = ((C1023u0) c1021t1.f16104r).f17584w;
        if (x9 == null || !x9.f16847s) {
            x9 = null;
        }
        if (x9 != null) {
            x9.f17178E.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f17545a = false;
            this.f17546b = null;
        }
        C1014r0 c1014r1 = ((C1023u0) this.f17547c.f16104r).f17585x;
        C1023u0.m(c1014r1);
        c1014r1.x(new p039d8.a(19, this, bVar, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1014r0 c1014r0 = ((C1023u0) this.f17547c.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.t();
        synchronized (this) {
            if (iBinder == null) {
                this.f17545a = false;
                X x9 = ((C1023u0) this.f17547c.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.a("Service connected with null binder");
                return;
            }
            J h7 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    h7 = iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(iBinder);
                    X x10 = ((C1023u0) this.f17547c.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.a("Bound to IMeasurementService interface");
                } else {
                    X x11 = ((C1023u0) this.f17547c.f16104r).f17584w;
                    C1023u0.m(x11);
                    x11.f17182w.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                X x12 = ((C1023u0) this.f17547c.f16104r).f17584w;
                C1023u0.m(x12);
                x12.f17182w.a("Service connect failed to get IMeasurementService");
            }
            if (h7 == null) {
                this.f17545a = false;
                try {
                    X6.a aVarA = X6.a.a();
                    C1021t1 c1021t1 = this.f17547c;
                    aVarA.b(((C1023u0) c1021t1.f16104r).f17579r, c1021t1.f17551t);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C1014r0 c1014r1 = ((C1023u0) this.f17547c.f16104r).f17585x;
                C1023u0.m(c1014r1);
                c1014r1.x(new RunnableC1013q1(this, h7, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1023u0 c1023u0 = (C1023u0) this.f17547c.f16104r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.t();
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17177D.a("Service disconnected");
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.x(new p039d8.a(18, this, componentName, false));
    }
}
