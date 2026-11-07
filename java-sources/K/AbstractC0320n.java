package K;

import A.C0007a;
import A.C0023i;
import D0.C0086d;
import U0.C0515g;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: renamed from: K.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0320n {
    static {
        float f3 = 40;
        p185s8.u0.b(f3, f3);
    }

    public static final void a(Z0.y yVar, p241y9.c cVar, l0.r rVar, boolean z10, U0.L l10, V v10, U u8, boolean z11, int i10, int i11, W2.n nVar, p241y9.c cVar2, B.j jVar, p180s0.L l11, p074h0.d dVar, C0698o c0698o, int i12) {
        p241y9.c cVar3;
        p241y9.c cVar4;
        c0698o.V(1804514146);
        int i13 = i10;
        int i14 = i12 | (c0698o.g(yVar) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | (c0698o.g(rVar) ? 256 : 128) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.h(false) ? 16384 : 8192) | (c0698o.g(l10) ? 131072 : 65536) | (c0698o.g(v10) ? 1048576 : 524288) | (c0698o.g(u8) ? 8388608 : 4194304) | (c0698o.h(z11) ? 67108864 : 33554432) | (c0698o.e(i13) ? 536870912 : 268435456);
        int i15 = 196608 | (c0698o.e(i11) ? 4 : 2) | (c0698o.g(nVar) ? 32 : 16) | 384 | (c0698o.g(jVar) ? 2048 : 1024) | (c0698o.g(l11) ? 16384 : 8192);
        if (c0698o.K(i14 & 1, ((i14 & 306783379) == 306783378 && (74899 & i15) == 74898) ? false : true)) {
            c0698o.P();
            if ((i12 & 1) == 0 || c0698o.w()) {
                cVar4 = C0317k.f4668s;
            } else {
                c0698o.N();
                cVar4 = cVar2;
            }
            c0698o.q();
            Z0.k kVarA = v10.a(z11);
            boolean z12 = !z11;
            int i16 = z11 ? 1 : i11;
            if (z11) {
                i13 = 1;
            }
            boolean z13 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objH = c0698o.H();
            if (z13 || objH == C0690k.f10683a) {
                objH = new C0007a(8, yVar, cVar);
                c0698o.e0(objH);
            }
            int i17 = i15 << 9;
            T.f(yVar, (p241y9.c) objH, rVar, l10, nVar, cVar4, jVar, l11, z12, i13, i16, kVarA, u8, z10, dVar, c0698o, ((i14 >> 6) & 7168) | (i14 & 910) | (i17 & 57344) | 196608 | (i17 & 3670016) | (i17 & 29360128), ((i14 >> 15) & 896) | (i14 & 7168) | (i14 & 57344) | 196608);
            cVar3 = cVar4;
        } else {
            c0698o.N();
            cVar3 = cVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0318l(yVar, cVar, rVar, z10, l10, v10, u8, z11, i10, i11, nVar, cVar3, jVar, l11, dVar, i12);
        }
    }

    public static final void b(String str, p241y9.c cVar, l0.r rVar, boolean z10, U0.L l10, V v10, U u8, int i10, int i11, W2.n nVar, p241y9.c cVar2, B.j jVar, p180s0.L l11, p074h0.d dVar, C0698o c0698o, int i12) {
        p241y9.c cVar3;
        p241y9.c cVar4;
        c0698o.V(945255183);
        int i13 = i12 | (c0698o.g(str) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | (c0698o.g(rVar) ? 256 : 128) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.h(false) ? 16384 : 8192) | (c0698o.g(l10) ? 131072 : 65536) | (c0698o.g(v10) ? 1048576 : 524288) | (c0698o.g(u8) ? 8388608 : 4194304) | (c0698o.h(false) ? 67108864 : 33554432) | (c0698o.e(i10) ? 536870912 : 268435456);
        int i14 = 196608 | (c0698o.e(i11) ? 4 : 2) | (c0698o.g(nVar) ? 32 : 16) | 384 | (c0698o.g(jVar) ? 2048 : 1024) | (c0698o.g(l11) ? 16384 : 8192);
        if (c0698o.K(i13 & 1, ((i13 & 306783379) == 306783378 && (74899 & i14) == 74898) ? false : true)) {
            c0698o.P();
            if ((i12 & 1) == 0 || c0698o.w()) {
                cVar4 = C0317k.f4669t;
            } else {
                c0698o.N();
                cVar4 = cVar2;
            }
            c0698o.q();
            Object objH = c0698o.H();
            p241y9.c cVar5 = cVar4;
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                objH = C0672b.r(new Z0.y(0L, 6, str));
                c0698o.e0(objH);
            }
            Z.X x9 = (Z.X) objH;
            Z0.y yVar = (Z0.y) x9.getValue();
            Z0.y yVar2 = new Z0.y(new C0515g(str), yVar.f10954b, yVar.f10955c);
            boolean zG = c0698o.g(yVar2);
            Object objH2 = c0698o.H();
            if (zG || objH2 == obj) {
                objH2 = new C0086d(8, yVar2, x9);
                c0698o.e0(objH2);
            }
            C0672b.h((p241y9.a) objH2, c0698o);
            boolean z11 = (i13 & 14) == 4;
            Object objH3 = c0698o.H();
            if (z11 || objH3 == obj) {
                objH3 = C0672b.r(str);
                c0698o.e0(objH3);
            }
            Object obj2 = (Z.X) objH3;
            Z0.k kVarA = v10.a(false);
            boolean zG2 = c0698o.g(obj2) | ((i13 & 112) == 32);
            Object objH4 = c0698o.H();
            if (zG2 || objH4 == obj) {
                objH4 = new C0023i(cVar, x9, obj2, 5);
                c0698o.e0(objH4);
            }
            int i15 = i14 << 9;
            T.f(yVar2, (p241y9.c) objH4, rVar, l10, nVar, cVar5, jVar, l11, true, i10, i11, kVarA, u8, z10, dVar, c0698o, (i13 & 896) | ((i13 >> 6) & 7168) | (i15 & 57344) | 196608 | (3670016 & i15) | (i15 & 29360128), (i13 & 57344) | ((i13 >> 15) & 896) | (i13 & 7168) | 196608);
            cVar3 = cVar5;
        } else {
            c0698o.N();
            cVar3 = cVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0319m(str, cVar, rVar, z10, l10, v10, u8, i10, i11, nVar, cVar3, jVar, l11, dVar, i12);
        }
    }
}
