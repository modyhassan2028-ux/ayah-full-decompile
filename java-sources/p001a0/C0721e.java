package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.C0670a;
import Z.InterfaceC0674c;
import Z.u0;
import p011b0.e;

/* JADX INFO: renamed from: a0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721e extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0721e f11099c = new C0721e(0, 2, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        C0670a c0670a = (C0670a) a9.i(0);
        Object objI = a9.i(1);
        if (objI instanceof u0) {
            ((e) hVar.f1923c).b((u0) objI);
        }
        if (a10.f10571n != 0) {
            AbstractC0700p.c("Can only append a slot if not current inserting");
        }
        int i10 = a10.f10567i;
        int i11 = a10.j;
        int iC = a10.c(c0670a);
        int iF = a10.f(a10.f10561b, a10.q(iC + 1));
        a10.f10567i = iF;
        a10.j = iF;
        a10.v(1, iC);
        if (i10 >= iF) {
            i10++;
            i11++;
        }
        a10.f10562c[iF] = objI;
        a10.f10567i = i10;
        a10.j = i11;
    }
}
