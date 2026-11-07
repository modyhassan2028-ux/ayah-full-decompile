package p144o3;

import N9.AbstractC0419l;
import N9.U;
import N9.k0;
import p165q3.b;
import p165q3.c;
import p165q3.g;
import p165q3.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f20299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f20300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U f20301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f20302d;

    public a() {
        k0 k0VarC = AbstractC0419l.c(c.f21289a);
        this.f20299a = k0VarC;
        k0 k0VarC2 = AbstractC0419l.c(g.f21293a);
        this.f20300b = k0VarC2;
        this.f20301c = new U(k0VarC);
        this.f20302d = new U(k0VarC2);
    }

    public final b a() {
        Object value = this.f20301c.f6130r.getValue();
        if (value instanceof b) {
            return (b) value;
        }
        return null;
    }

    public final void b(h hVar) {
        k0 k0Var = this.f20300b;
        k0Var.getClass();
        k0Var.n(null, hVar);
    }
}
