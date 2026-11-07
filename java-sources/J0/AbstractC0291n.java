package J0;

/* JADX INFO: renamed from: J0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0291n extends l0.q {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f4150F = k0.e(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public l0.q f4151G;

    @Override // l0.q
    public final void j0() {
        super.j0();
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.u0(this.f19346y);
            if (!qVar.f19338E) {
                qVar.j0();
            }
        }
    }

    @Override // l0.q
    public final void k0() {
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.k0();
        }
        super.k0();
    }

    @Override // l0.q
    public final void q0() {
        super.q0();
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.q0();
        }
    }

    @Override // l0.q
    public final void r0() {
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.r0();
        }
        super.r0();
    }

    @Override // l0.q
    public final void s0() {
        super.s0();
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.s0();
        }
    }

    @Override // l0.q
    public final void t0(l0.q qVar) {
        this.f19339r = qVar;
        for (l0.q qVar2 = this.f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
            qVar2.t0(qVar);
        }
    }

    @Override // l0.q
    public final void u0(j0 j0Var) {
        this.f19346y = j0Var;
        for (l0.q qVar = this.f4151G; qVar != null; qVar = qVar.f19344w) {
            qVar.u0(j0Var);
        }
    }

    public final InterfaceC0290m v0(InterfaceC0290m interfaceC0290m) {
        l0.q qVar = ((l0.q) interfaceC0290m).f19339r;
        if (qVar != interfaceC0290m) {
            l0.q qVar2 = interfaceC0290m instanceof l0.q ? (l0.q) interfaceC0290m : null;
            l0.q qVar3 = qVar2 != null ? qVar2.f19343v : null;
            if (qVar != this.f19339r || !p251z9.j.a(qVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (qVar.f19338E) {
                G0.a.b("Cannot delegate to an already attached node");
            }
            qVar.t0(this.f19339r);
            int i10 = this.f19341t;
            int iF = k0.f(qVar);
            qVar.f19341t = iF;
            int i11 = this.f19341t;
            int i12 = iF & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof InterfaceC0302z)) {
                G0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar);
            }
            qVar.f19344w = this.f4151G;
            this.f4151G = qVar;
            qVar.f19343v = this;
            x0(iF | this.f19341t, false);
            if (this.f19338E) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    u0(this.f19346y);
                } else {
                    C0280d0 c0280d0 = AbstractC0283f.x(this).f3914W;
                    this.f19339r.u0(null);
                    c0280d0.n();
                }
                qVar.j0();
                qVar.r0();
                if (!qVar.f19338E) {
                    G0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                k0.a(qVar, -1, 1);
            }
        }
        return interfaceC0290m;
    }

    public final void w0(InterfaceC0290m interfaceC0290m) {
        l0.q qVar = null;
        for (l0.q qVar2 = this.f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
            if (qVar2 == interfaceC0290m) {
                boolean z10 = qVar2.f19338E;
                if (z10) {
                    u.z zVar = k0.f4143a;
                    if (!z10) {
                        G0.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    k0.a(qVar2, -1, 2);
                    qVar2.s0();
                    qVar2.k0();
                }
                qVar2.t0(qVar2);
                qVar2.f19342u = 0;
                if (qVar == null) {
                    this.f4151G = qVar2.f19344w;
                } else {
                    qVar.f19344w = qVar2.f19344w;
                }
                qVar2.f19344w = null;
                qVar2.f19343v = null;
                int i10 = this.f19341t;
                int iF = k0.f(this);
                x0(iF, true);
                if (this.f19338E && (i10 & 2) != 0 && (iF & 2) == 0) {
                    C0280d0 c0280d0 = AbstractC0283f.x(this).f3914W;
                    this.f19339r.u0(null);
                    c0280d0.n();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0290m).toString());
    }

    public final void x0(int i10, boolean z10) {
        l0.q qVar;
        int i11 = this.f19341t;
        this.f19341t = i10;
        if (i11 != i10) {
            l0.q qVar2 = this.f19339r;
            if (qVar2 == this) {
                this.f19342u = i10;
            }
            if (this.f19338E) {
                l0.q qVar3 = this;
                while (qVar3 != null) {
                    i10 |= qVar3.f19341t;
                    qVar3.f19341t = i10;
                    if (qVar3 == qVar2) {
                        break;
                    } else {
                        qVar3 = qVar3.f19343v;
                    }
                }
                if (z10 && qVar3 == qVar2) {
                    i10 = k0.f(qVar2);
                    qVar2.f19341t = i10;
                }
                int i12 = i10 | ((qVar3 == null || (qVar = qVar3.f19344w) == null) ? 0 : qVar.f19342u);
                while (qVar3 != null) {
                    i12 |= qVar3.f19341t;
                    qVar3.f19342u = i12;
                    qVar3 = qVar3.f19343v;
                }
            }
        }
    }
}
