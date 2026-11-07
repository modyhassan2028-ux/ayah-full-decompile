package p153p1;

import android.support.v4.media.session.p;
import java.util.HashMap;
import p142o1.c;
import p142o1.e;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f20822i0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f20823j0 = true;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f20824k0 = 0;

    @Override // p153p1.e
    public final void a(e eVar) {
        boolean z10;
        int i10;
        c[] cVarArr = this.f20857G;
        c cVar = this.f20900y;
        cVarArr[0] = cVar;
        int i11 = 2;
        c cVar2 = this.f20901z;
        cVarArr[2] = cVar2;
        c cVar3 = this.f20851A;
        cVarArr[1] = cVar3;
        c cVar4 = this.f20852B;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.g = eVar.j(cVar5);
        }
        int i12 = this.f20822i0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i12];
        int i13 = 0;
        while (true) {
            if (i13 >= this.f20974h0) {
                z10 = false;
                break;
            }
            e eVar2 = this.f20973g0[i13];
            if (this.f20823j0 || eVar2.b()) {
                int i14 = this.f20822i0;
                d dVar = d.f20848t;
                if (((i14 == 0 || i14 == 1) && eVar2.f20860J[0] == dVar && eVar2.f20900y.f20843d != null && eVar2.f20851A.f20843d != null) || ((i14 == 2 || i14 == 3) && eVar2.f20860J[1] == dVar && eVar2.f20901z.f20843d != null && eVar2.f20852B.f20843d != null)) {
                    z10 = true;
                    break;
                }
            }
            i13++;
        }
        boolean z11 = cVar.e() || cVar3.e();
        boolean z12 = cVar2.e() || cVar4.e();
        int i15 = !(!z10 && (((i10 = this.f20822i0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f20974h0) {
            e eVar3 = this.f20973g0[i16];
            if (this.f20823j0 || eVar3.b()) {
                h hVarJ = eVar.j(eVar3.f20857G[this.f20822i0]);
                c[] cVarArr2 = eVar3.f20857G;
                int i17 = this.f20822i0;
                c cVar7 = cVarArr2[i17];
                cVar7.g = hVarJ;
                c cVar8 = cVar7.f20843d;
                int i18 = (cVar8 == null || cVar8.f20841b != this) ? 0 : cVar7.f20844e;
                if (i17 == 0 || i17 == i11) {
                    h hVar = cVar6.g;
                    int i19 = this.f20824k0 - i18;
                    c cVarK = eVar.k();
                    h hVarL = eVar.l();
                    hVarL.f20249d = 0;
                    cVarK.c(hVar, hVarJ, hVarL, i19);
                    eVar.c(cVarK);
                } else {
                    h hVar2 = cVar6.g;
                    int i20 = this.f20824k0 + i18;
                    c cVarK2 = eVar.k();
                    h hVarL2 = eVar.l();
                    hVarL2.f20249d = 0;
                    cVarK2.b(hVar2, hVarJ, hVarL2, i20);
                    eVar.c(cVarK2);
                }
                eVar.e(cVar6.g, hVarJ, this.f20824k0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f20822i0;
        if (i21 == 0) {
            eVar.e(cVar3.g, cVar.g, 0, 8);
            eVar.e(cVar.g, this.f20861K.f20851A.g, 0, 4);
            eVar.e(cVar.g, this.f20861K.f20900y.g, 0, 0);
            return;
        }
        if (i21 == 1) {
            eVar.e(cVar.g, cVar3.g, 0, 8);
            eVar.e(cVar.g, this.f20861K.f20900y.g, 0, 4);
            eVar.e(cVar.g, this.f20861K.f20851A.g, 0, 0);
        } else if (i21 == 2) {
            eVar.e(cVar4.g, cVar2.g, 0, 8);
            eVar.e(cVar2.g, this.f20861K.f20852B.g, 0, 4);
            eVar.e(cVar2.g, this.f20861K.f20901z.g, 0, 0);
        } else if (i21 == 3) {
            eVar.e(cVar2.g, cVar4.g, 0, 8);
            eVar.e(cVar2.g, this.f20861K.f20901z.g, 0, 4);
            eVar.e(cVar2.g, this.f20861K.f20852B.g, 0, 0);
        }
    }

    @Override // p153p1.e
    public final boolean b() {
        return true;
    }

    @Override // p153p1.j, p153p1.e
    public final void f(e eVar, HashMap map) {
        super.f(eVar, map);
        a aVar = (a) eVar;
        this.f20822i0 = aVar.f20822i0;
        this.f20823j0 = aVar.f20823j0;
        this.f20824k0 = aVar.f20824k0;
    }

    @Override // p153p1.e
    public final String toString() {
        String strB = p.B(new StringBuilder("[Barrier] "), this.f20870Y, " {");
        for (int i10 = 0; i10 < this.f20974h0; i10++) {
            e eVar = this.f20973g0[i10];
            if (i10 > 0) {
                strB = p.z(strB, ", ");
            }
            StringBuilder sbC = p.C(strB);
            sbC.append(eVar.f20870Y);
            strB = sbC.toString();
        }
        return p.z(strB, "}");
    }
}
