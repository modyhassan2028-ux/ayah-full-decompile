package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.C0670a;
import Z.InterfaceC0674c;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p074h0.e;

/* JADX INFO: renamed from: a0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726j extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0726j f11104c = new C0726j(0, 2, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        int i10;
        e eVar = (e) a9.i(0);
        int iC = a10.c((C0670a) a9.i(1));
        if (a10.f10577t >= iC) {
            AbstractC0700p.c("Check failed");
        }
        AbstractC0813f2.P(a10, interfaceC0674c, iC);
        int i11 = a10.f10577t;
        int iC2 = a10.f10579v;
        while (iC2 >= 0 && !a10.w(iC2)) {
            iC2 = a10.C(a10.f10561b, iC2);
        }
        int iS = iC2 + 1;
        int I6 = 0;
        while (iS < i11) {
            if (a10.t(i11, iS)) {
                if (a10.w(iS)) {
                    I6 = 0;
                }
                iS++;
            } else {
                I6 += a10.w(iS) ? 1 : a10.f10561b[(a10.q(iS) * 5) + 1] & 67108863;
                iS += a10.s(iS);
            }
        }
        while (true) {
            i10 = a10.f10577t;
            if (i10 >= iC) {
                break;
            }
            if (a10.t(iC, i10)) {
                int i12 = a10.f10577t;
                if (i12 < a10.f10578u && (a10.f10561b[(a10.q(i12) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0674c.g(a10.B(a10.f10577t));
                    I6 = 0;
                }
                a10.N();
            } else {
                I6 += a10.I();
            }
        }
        if (i10 != iC) {
            AbstractC0700p.c("Check failed");
        }
        eVar.f16416a = I6;
    }
}
