package p182s5;

import C4.e;
import C4.g;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import N9.P;
import N9.k0;
import p198u3.b;
import p218w3.a;
import p218w3.c;
import p218w3.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f22146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f22148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f22149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f22150e;

    public d(f fVar, p198u3.d dVar, a aVar, c cVar) {
        j.e(fVar, "pageModel");
        j.e(dVar, "bookmarksModel");
        j.e(aVar, "currentPageModel");
        j.e(cVar, "jumpModel");
        this.f22146a = fVar;
        this.f22147b = cVar;
        k0 k0VarC = AbstractC0419l.c(null);
        this.f22148c = k0VarC;
        this.f22149d = new e(19, new g(k0VarC, this, 21));
        this.f22150e = new P(new InterfaceC0415h[]{aVar.f23647c, new g(fVar.f23666b.f4312f, fVar, 26), new b(dVar.f22892c, dVar, 0)}, new a(4, null));
    }

    public final void a(int i10) {
        p150o9.c cVar = null;
        this.f22148c.m(null);
        c cVar2 = this.f22147b;
        if (i10 <= 0) {
            cVar2.getClass();
            return;
        }
        AbstractC0405x.x(cVar2.f23655d, null, new p218w3.b(cVar2, i10, cVar, 1), 3);
        k0 k0Var = cVar2.f23656e;
        z3.c cVar3 = new z3.c(i10);
        k0Var.getClass();
        k0Var.n(null, cVar3);
    }
}
