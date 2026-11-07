package p214w;

import A6.a;
import l0.e;
import p063g1.l;
import p063g1.m;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class D extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f23425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f23426t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f3, long j, int i10) {
        super(1);
        this.f23424r = i10;
        this.f23425s = f3;
        this.f23426t = j;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Type inference failed for: r0v15, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r11v14, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r11v24, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r11v6, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r1v15, types: [y9.c, z9.k] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        long jB;
        int iOrdinal;
        switch (this.f23424r) {
            case 0:
                int iOrdinal2 = ((x) obj).ordinal();
                F f3 = this.f23425s;
                long j = this.f23426t;
                if (iOrdinal2 == 0) {
                    C1406t c1406t = f3.f23433K.f23440a.f23467c;
                    if (c1406t != null) {
                        j = ((l) c1406t.f23536b.e(new l(j))).f16260a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new a();
                    }
                    C1406t c1406t2 = f3.f23434L.f23443a.f23467c;
                    if (c1406t2 != null) {
                        j = ((l) c1406t2.f23536b.e(new l(j))).f16260a;
                    }
                }
                return new l(j);
            case 1:
                x xVar = (x) obj;
                F f7 = this.f23425s;
                if (f7.f23438P == null || f7.x0() == null || j.a(f7.f23438P, f7.x0()) || (iOrdinal = xVar.ordinal()) == 0 || iOrdinal == 1) {
                    jB = 0;
                } else {
                    if (iOrdinal != 2) {
                        throw new a();
                    }
                    C1406t c1406t3 = f7.f23434L.f23443a.f23467c;
                    if (c1406t3 != null) {
                        ?? r11 = c1406t3.f23536b;
                        long j10 = this.f23426t;
                        long j11 = ((l) r11.e(new l(j10))).f16260a;
                        e eVarX0 = f7.x0();
                        j.b(eVarX0);
                        m mVar = m.f16261r;
                        long jA = ((l0.j) eVarX0).a(j10, j11, mVar);
                        e eVar = f7.f23438P;
                        j.b(eVar);
                        jB = p063g1.j.b(jA, eVar.a(j10, j11, mVar));
                    } else {
                        jB = 0;
                    }
                }
                return new p063g1.j(jB);
            default:
                x xVar2 = (x) obj;
                F f10 = this.f23425s;
                Q q10 = f10.f23433K.f23440a.f23466b;
                long j12 = this.f23426t;
                long j13 = 0;
                long j14 = q10 != null ? ((p063g1.j) q10.f23462a.e(new l(j12))).f16254a : 0L;
                Q q11 = f10.f23434L.f23443a.f23466b;
                long j15 = q11 != null ? ((p063g1.j) q11.f23462a.e(new l(j12))).f16254a : 0L;
                int iOrdinal3 = xVar2.ordinal();
                if (iOrdinal3 == 0) {
                    j13 = j14;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new a();
                    }
                    j13 = j15;
                }
                return new p063g1.j(j13);
        }
    }
}
