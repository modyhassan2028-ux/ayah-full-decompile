package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.C0670a;
import Z.InterfaceC0674c;
import Z.z0;
import java.util.ArrayList;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
public final class u extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f11118c = new u(1, 0, 2);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        C0670a c0670a;
        int iC;
        int iH = a9.h(0);
        if (a10.f10571n != 0) {
            AbstractC0700p.c("Cannot move a group while inserting");
        }
        if (iH < 0) {
            AbstractC0700p.c("Parameter offset is out of bounds");
        }
        if (iH == 0) {
            return;
        }
        int i10 = a10.f10577t;
        int i11 = a10.f10579v;
        int i12 = a10.f10578u;
        int i13 = i10;
        while (iH > 0) {
            i13 += a10.f10561b[(a10.q(i13) * 5) + 3];
            if (i13 > i12) {
                AbstractC0700p.c("Parameter offset is out of bounds");
            }
            iH--;
        }
        int i14 = a10.f10561b[(a10.q(i13) * 5) + 3];
        int iF = a10.f(a10.f10561b, a10.q(a10.f10577t));
        int iF2 = a10.f(a10.f10561b, a10.q(i13));
        int i15 = i13 + i14;
        int iF3 = a10.f(a10.f10561b, a10.q(i15));
        int i16 = iF3 - iF2;
        a10.v(i16, Math.max(a10.f10577t - 1, 0));
        a10.u(i14);
        int[] iArr = a10.f10561b;
        int iQ = a10.q(i15) * 5;
        l.W(a10.q(i10) * 5, iQ, (i14 * 5) + iQ, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = a10.f10562c;
            int iG = a10.g(iF2 + i16);
            System.arraycopy(objArr, iG, objArr, iF, a10.g(iF3 + i16) - iG);
        }
        int i17 = iF2 + i16;
        int i18 = i17 - iF;
        int i19 = a10.f10568k;
        int i20 = a10.f10569l;
        int length = a10.f10562c.length;
        int i21 = a10.f10570m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iQ2 = a10.q(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iQ2 * 5) + 4] = A0.h(A0.h(a10.f(iArr, iQ2) - i24, i21 < iQ2 ? 0 : i19, i20, length), a10.f10568k, a10.f10569l, a10.f10562c.length);
            i23++;
            i18 = i24;
            i19 = i19;
            iArr = iArr2;
        }
        int i25 = i15 + i14;
        int iN = a10.n();
        int iB = z0.b(a10.f10563d, i15, iN);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < a10.f10563d.size() && (iC = a10.c((c0670a = (C0670a) a10.f10563d.get(iB)))) >= i15 && iC < i25) {
                arrayList.add(c0670a);
                a10.f10563d.remove(iB);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            C0670a c0670a2 = (C0670a) arrayList.get(i27);
            int iC2 = a10.c(c0670a2) + i26;
            if (iC2 >= a10.g) {
                c0670a2.f10648a = -(iN - iC2);
            } else {
                c0670a2.f10648a = iC2;
            }
            a10.f10563d.add(z0.b(a10.f10563d, iC2, iN), c0670a2);
        }
        if (a10.G(i15, i14)) {
            AbstractC0700p.c("Unexpectedly removed anchors");
        }
        a10.l(i11, a10.f10578u, i10);
        if (i16 > 0) {
            a10.H(i17, i16, i15 - 1);
        }
    }
}
