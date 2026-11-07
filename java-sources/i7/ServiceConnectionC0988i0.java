package i7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* JADX INFO: renamed from: i7.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0988i0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0991j0 f17414b;

    public ServiceConnectionC0988i0(C0991j0 c0991j0, String str) {
        Objects.requireNonNull(c0991j0);
        this.f17414b = c0991j0;
        this.f17413a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0991j0 c0991j0 = this.f17414b;
        if (iBinder == null) {
            X x9 = c0991j0.f17424b.f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.B.f13994f;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.C a9 = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.C ? (com.google.android.gms.internal.measurement.C) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.A(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            C1023u0 c1023u0 = c0991j0.f17424b;
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17178E.a("Install Referrer Service connected");
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.x(new p039d8.a(this, a9, this));
        } catch (RuntimeException e10) {
            X x11 = c0991j0.f17424b.f17584w;
            C1023u0.m(x11);
            x11.f17185z.b(e10, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        X x9 = this.f17414b.f17424b.f17584w;
        C1023u0.m(x9);
        x9.f17178E.a("Install Referrer Service disconnected");
    }
}
