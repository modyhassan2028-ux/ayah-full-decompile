package U6;

import E2.RunnableC0147v;
import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.AbstractC0899x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: U6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0527e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final R6.d[] f8225x = new R6.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F2.v f8227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f8229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R6.f f8230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f8231f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f8233i;
    public InterfaceC0526d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IInterface f8234k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C f8236m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0524b f8238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC0525c f8239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f8241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile String f8242s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f8226a = null;
    public final Object g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8232h = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f8235l = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8237n = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public R6.b f8243t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8244u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile F f8245v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicInteger f8246w = new AtomicInteger(0);

    public AbstractC0527e(Context context, Looper looper, J j, R6.f fVar, int i10, InterfaceC0524b interfaceC0524b, InterfaceC0525c interfaceC0525c, String str) {
        y.g(context, "Context must not be null");
        this.f8228c = context;
        y.g(looper, "Looper must not be null");
        y.g(j, "Supervisor must not be null");
        this.f8229d = j;
        y.g(fVar, "API availability must not be null");
        this.f8230e = fVar;
        this.f8231f = new A(this, looper);
        this.f8240q = i10;
        this.f8238o = interfaceC0524b;
        this.f8239p = interfaceC0525c;
        this.f8241r = str;
    }

    public static /* bridge */ /* synthetic */ void y(AbstractC0527e abstractC0527e) {
        int i10;
        int i11;
        synchronized (abstractC0527e.g) {
            i10 = abstractC0527e.f8237n;
        }
        if (i10 == 3) {
            abstractC0527e.f8244u = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        A a9 = abstractC0527e.f8231f;
        a9.sendMessage(a9.obtainMessage(i11, abstractC0527e.f8246w.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean z(AbstractC0527e abstractC0527e, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC0527e.g) {
            try {
                if (abstractC0527e.f8237n != i10) {
                    return false;
                }
                abstractC0527e.A(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(int i10, IInterface iInterface) {
        F2.v vVar;
        y.a((i10 == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.f8237n = i10;
                this.f8234k = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    C c10 = this.f8236m;
                    if (c10 != null) {
                        J j = this.f8229d;
                        String str = this.f8227b.f2330b;
                        y.f(str);
                        this.f8227b.getClass();
                        if (this.f8241r == null) {
                            this.f8228c.getClass();
                        }
                        j.d(str, c10, this.f8227b.f2331c);
                        this.f8236m = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    C c11 = this.f8236m;
                    if (c11 != null && (vVar = this.f8227b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + vVar.f2330b + " on com.google.android.gms");
                        J j10 = this.f8229d;
                        String str2 = this.f8227b.f2330b;
                        y.f(str2);
                        this.f8227b.getClass();
                        if (this.f8241r == null) {
                            this.f8228c.getClass();
                        }
                        j10.d(str2, c11, this.f8227b.f2331c);
                        this.f8246w.incrementAndGet();
                    }
                    C c12 = new C(this, this.f8246w.get());
                    this.f8236m = c12;
                    String strW = w();
                    boolean zX = x();
                    this.f8227b = new F2.v(2, strW, zX);
                    if (zX && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8227b.f2330b)));
                    }
                    J j11 = this.f8229d;
                    String str3 = this.f8227b.f2330b;
                    y.f(str3);
                    this.f8227b.getClass();
                    String name = this.f8241r;
                    if (name == null) {
                        name = this.f8228c.getClass().getName();
                    }
                    R6.b bVarC = j11.c(new G(str3, this.f8227b.f2331c), c12, name, null);
                    if (!(bVarC.f7234s == 0)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f8227b.f2330b + " on com.google.android.gms");
                        int i11 = bVarC.f7234s;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (bVarC.f7235t != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.f7235t);
                        }
                        int i12 = this.f8246w.get();
                        E e10 = new E(this, i11, bundle);
                        A a9 = this.f8231f;
                        a9.sendMessage(a9.obtainMessage(7, i12, -1, e10));
                    }
                } else if (i10 == 4) {
                    y.f(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.g) {
            z10 = this.f8237n == 4;
        }
        return z10;
    }

    public final void b(O8.c cVar) {
        ((T6.i) cVar.f6511r).f7839p.f7828m.post(new RunnableC0147v(8, cVar));
    }

    public final void d(InterfaceC0526d interfaceC0526d) {
        this.j = interfaceC0526d;
        A(2, null);
    }

    public final void e(String str) {
        this.f8226a = str;
        l();
    }

    public abstract int f();

    public final boolean g() {
        boolean z10;
        synchronized (this.g) {
            int i10 = this.f8237n;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final R6.d[] h() {
        F f3 = this.f8245v;
        if (f3 == null) {
            return null;
        }
        return f3.f8202s;
    }

    public final void i() {
        if (!a() || this.f8227b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(InterfaceC0530h interfaceC0530h, Set set) {
        Bundle bundleS = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.f8242s : this.f8242s;
        int i10 = this.f8240q;
        int i11 = R6.f.f7245a;
        Scope[] scopeArr = C0529g.f8253F;
        Bundle bundle = new Bundle();
        R6.d[] dVarArr = C0529g.f8254G;
        C0529g c0529g = new C0529g(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0529g.f8263u = this.f8228c.getPackageName();
        c0529g.f8266x = bundleS;
        if (set != null) {
            c0529g.f8265w = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountQ = q();
            if (accountQ == null) {
                accountQ = new Account("<<default account>>", "com.google");
            }
            c0529g.f8267y = accountQ;
            if (interfaceC0530h != 0) {
                c0529g.f8264v = ((AbstractC0899x) interfaceC0530h).g;
            }
        }
        c0529g.f8268z = f8225x;
        c0529g.f8255A = r();
        try {
            synchronized (this.f8232h) {
                try {
                    u uVar = this.f8233i;
                    if (uVar != null) {
                        uVar.a(new B(this, this.f8246w.get()), c0529g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.f8246w.get();
            A a9 = this.f8231f;
            a9.sendMessage(a9.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f8246w.get();
            D d5 = new D(this, 8, null, null);
            A a10 = this.f8231f;
            a10.sendMessage(a10.obtainMessage(1, i13, -1, d5));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i14 = this.f8246w.get();
            D d9 = new D(this, 8, null, null);
            A a11 = this.f8231f;
            a11.sendMessage(a11.obtainMessage(1, i14, -1, d9));
        }
    }

    public final String k() {
        return this.f8226a;
    }

    public final void l() {
        this.f8246w.incrementAndGet();
        synchronized (this.f8235l) {
            try {
                int size = this.f8235l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s) this.f8235l.get(i10)).c();
                }
                this.f8235l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8232h) {
            this.f8233i = null;
        }
        A(1, null);
    }

    public boolean m() {
        return false;
    }

    public final void o() {
        int iB = this.f8230e.b(this.f8228c, f());
        if (iB == 0) {
            d(new r(this));
            return;
        }
        A(1, null);
        this.j = new r(this);
        int i10 = this.f8246w.get();
        A a9 = this.f8231f;
        a9.sendMessage(a9.obtainMessage(3, i10, iB, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public R6.d[] r() {
        return f8225x;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.f8237n == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f8234k;
                y.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return f() >= 211700000;
    }
}
