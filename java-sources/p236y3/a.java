package p236y3;

import J3.x;
import K9.AbstractC0405x;
import K9.H;
import K9.p0;
import N9.AbstractC0419l;
import N9.U;
import N9.k0;
import P9.d;
import R9.e;
import p150o9.c;
import p207v2.d0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f24627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f24628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f24629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f24630d;

    public a(x xVar) {
        j.e(xVar, "preferencesStore");
        this.f24627a = xVar;
        p0 p0VarE = AbstractC0405x.e();
        e eVar = H.f5322a;
        d dVarB = AbstractC0405x.b(Y2.a.Z(p0VarE, R9.d.f7436t));
        this.f24628b = dVarB;
        k0 k0VarC = AbstractC0419l.c("");
        this.f24629c = k0VarC;
        AbstractC0405x.x(dVarB, null, new d0(this, (c) null, 6), 3);
        this.f24630d = new U(k0VarC);
    }

    public final void a(String str) {
        j.e(str, "query");
        k0 k0Var = this.f24629c;
        k0Var.getClass();
        k0Var.n(null, str);
        AbstractC0405x.x(this.f24628b, null, new d0(this, str, null, 7), 3);
    }
}
