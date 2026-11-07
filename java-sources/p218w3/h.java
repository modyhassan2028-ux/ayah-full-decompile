package p218w3;

import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.k0;
import P9.d;
import p150o9.c;
import z3.g;
import z3.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23671a = AbstractC0405x.b(AbstractC0405x.e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f23672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f23673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f23674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U f23675e;

    public h() {
        g gVar = g.f24791a;
        k0 k0VarC = AbstractC0419l.c(gVar);
        this.f23672b = k0VarC;
        k0 k0VarC2 = AbstractC0419l.c(gVar);
        this.f23673c = k0VarC2;
        this.f23674d = new U(k0VarC);
        this.f23675e = new U(k0VarC2);
    }

    public final void a(int i10, boolean z10) {
        z3.h hVar = new z3.h(i10, z10);
        k0 k0Var = this.f23672b;
        k0Var.getClass();
        c cVar = null;
        k0Var.n(null, hVar);
        if (z10) {
            AbstractC0405x.x(this.f23671a, null, new g(this, i10, cVar, 1), 3);
        }
    }

    public final void b(int i10, boolean z10) {
        i iVar = new i(i10, z10);
        k0 k0Var = this.f23673c;
        k0Var.getClass();
        c cVar = null;
        k0Var.n(null, iVar);
        if (z10) {
            AbstractC0405x.x(this.f23671a, null, new g(this, i10, cVar, 3), 3);
        }
    }
}
