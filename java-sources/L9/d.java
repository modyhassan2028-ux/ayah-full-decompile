package L9;

import F2.x;
import K9.AbstractC0399q;
import K9.B;
import K9.C0389g;
import K9.H;
import K9.J;
import K9.a0;
import K9.l0;
import K9.r;
import K9.s0;
import P9.n;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.p;
import java.util.concurrent.CancellationException;
import p150o9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0399q implements B {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f5582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5583u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f5584v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f5585w;

    public d(Handler handler, String str, boolean z10) {
        this.f5582t = handler;
        this.f5583u = str;
        this.f5584v = z10;
        this.f5585w = z10 ? this : new d(handler, str, true);
    }

    @Override // K9.B
    public final void H(long j, C0389g c0389g) {
        x xVar = new x(2, c0389g, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5582t.postDelayed(xVar, j)) {
            c0389g.u(new A3.e(9, this, xVar));
        } else {
            g0(c0389g.f5365v, xVar);
        }
    }

    @Override // K9.B
    public final J N(long j, s0 s0Var, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5582t.postDelayed(s0Var, j)) {
            return new c(0, this, s0Var);
        }
        g0(hVar, s0Var);
        return l0.f5378r;
    }

    @Override // K9.AbstractC0399q
    public final void c0(h hVar, Runnable runnable) {
        if (this.f5582t.post(runnable)) {
            return;
        }
        g0(hVar, runnable);
    }

    @Override // K9.AbstractC0399q
    public final boolean e0(h hVar) {
        return (this.f5584v && j.a(Looper.myLooper(), this.f5582t.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f5582t == this.f5582t && dVar.f5584v == this.f5584v;
    }

    public final void g0(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a0 a0Var = (a0) hVar.i(r.f5392s);
        if (a0Var != null) {
            a0Var.e(cancellationException);
        }
        R9.e eVar = H.f5322a;
        R9.d.f7436t.c0(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5582t) ^ (this.f5584v ? 1231 : 1237);
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        d dVar;
        String str;
        R9.e eVar = H.f5322a;
        d dVar2 = n.f6798a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f5585w;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f5583u;
        if (string == null) {
            string = this.f5582t.toString();
        }
        return this.f5584v ? p.z(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
