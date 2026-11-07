package l0;

import A.Z;
import D0.C0086d;
import J0.AbstractC0283f;
import J0.InterfaceC0290m;
import J0.j0;
import J0.o0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import K9.a0;
import K9.c0;
import p232y.C1471z;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements InterfaceC0290m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f19334A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f19335B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f19336C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0086d f19337D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f19338E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public P9.d f19340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19341t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f19343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f19344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o0 f19345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j0 f19346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f19347z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q f19339r = this;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19342u = -1;

    public final InterfaceC0402u h0() {
        P9.d dVar = this.f19340s;
        if (dVar != null) {
            return dVar;
        }
        P9.d dVarB = AbstractC0405x.b(AbstractC0283f.y(this).getCoroutineContext().L(new c0((a0) AbstractC0283f.y(this).getCoroutineContext().i(K9.r.f5392s))));
        this.f19340s = dVarB;
        return dVarB;
    }

    public boolean i0() {
        return !(this instanceof C1471z);
    }

    public void j0() {
        if (this.f19338E) {
            G0.a.b("node attached multiple times");
        }
        if (this.f19346y == null) {
            G0.a.b("attach invoked on a node without a coordinator");
        }
        this.f19338E = true;
        this.f19335B = true;
    }

    public void k0() {
        if (!this.f19338E) {
            G0.a.b("Cannot detach a node that is not attached");
        }
        if (this.f19335B) {
            G0.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f19336C) {
            G0.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f19338E = false;
        P9.d dVar = this.f19340s;
        if (dVar != null) {
            AbstractC0405x.h(dVar, new Z("The Modifier.Node was detached", 2));
            this.f19340s = null;
        }
    }

    public /* synthetic */ void m0() {
    }

    public /* synthetic */ void o0() {
    }

    public void q0() {
        if (!this.f19338E) {
            G0.a.b("reset() called on an unattached node");
        }
        p0();
    }

    public void r0() {
        if (!this.f19338E) {
            G0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f19335B) {
            G0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f19335B = false;
        l0();
        this.f19336C = true;
    }

    public void s0() {
        if (!this.f19338E) {
            G0.a.b("node detached multiple times");
        }
        if (this.f19346y == null) {
            G0.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f19336C) {
            G0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f19336C = false;
        C0086d c0086d = this.f19337D;
        if (c0086d != null) {
            c0086d.invoke();
        }
        n0();
    }

    public void t0(q qVar) {
        this.f19339r = qVar;
    }

    public void u0(j0 j0Var) {
        this.f19346y = j0Var;
    }

    public void l0() {
    }

    public void n0() {
    }

    public void p0() {
    }
}
