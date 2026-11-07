package p153p1;

import java.util.ArrayList;
import java.util.HashMap;
import p142o1.e;
import p163q1.b;
import s1.d;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public e[] f20948Q0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f20950i0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f20951j0 = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f20952k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f20953l0 = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f20954m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f20955n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f20956o0 = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20957p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f20958q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b f20959r0 = new b();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f20960s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f20961t0 = -1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f20962u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f20963v0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f20964w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f20965x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f20966y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f20967z0 = 0.5f;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public float f20933A0 = 0.5f;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public float f20934B0 = 0.5f;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public float f20935C0 = 0.5f;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public float f20936D0 = 0.5f;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public float f20937E0 = 0.5f;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f20938F0 = 0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f20939G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f20940H0 = 2;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f20941I0 = 2;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f20942J0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f20943K0 = -1;
    public int L0 = 0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final ArrayList f20944M0 = new ArrayList();

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public e[] f20945N0 = null;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public e[] f20946O0 = null;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int[] f20947P0 = null;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f20949R0 = 0;

    @Override // p153p1.j
    public final void D() {
        for (int i10 = 0; i10 < this.f20974h0; i10++) {
            e eVar = this.f20973g0[i10];
        }
    }

    public final int E(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.f20860J[1] == d.f20848t) {
            int i11 = eVar.f20886k;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f20893r * i10);
                if (i12 != eVar.j()) {
                    G(eVar, eVar.f20860J[0], eVar.m(), d.f20846r, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.j();
            }
            if (i11 == 3) {
                return (int) ((eVar2.m() * eVar2.f20864N) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.j();
    }

    public final int F(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.f20860J[0] == d.f20848t) {
            int i11 = eVar.j;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f20890o * i10);
                if (i12 != eVar.m()) {
                    G(eVar, d.f20846r, i12, eVar.f20860J[1], eVar.j());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.m();
            }
            if (i11 == 3) {
                return (int) ((eVar2.j() * eVar2.f20864N) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.m();
    }

    public final void G(e eVar, d dVar, int i10, d dVar2, int i11) {
        d dVar3;
        e eVar2;
        while (true) {
            dVar3 = this.f20960s0;
            if (dVar3 != null || (eVar2 = this.f20861K) == null) {
                break;
            } else {
                this.f20960s0 = ((f) eVar2).f20905j0;
            }
        }
        b bVar = this.f20959r0;
        bVar.f21238a = dVar;
        bVar.f21239b = dVar2;
        bVar.f21240c = i10;
        bVar.f21241d = i11;
        dVar3.a(eVar, bVar);
        eVar.z(bVar.f21242e);
        eVar.w(bVar.f21243f);
        eVar.f20898w = bVar.f21244h;
        int i12 = bVar.g;
        eVar.R = i12;
        eVar.f20898w = i12 > 0;
    }

    @Override // p153p1.e
    public final void a(e eVar) {
        e eVar2;
        super.a(eVar);
        e eVar3 = this.f20861K;
        boolean z10 = eVar3 != null ? ((f) eVar3).f20906k0 : false;
        int i10 = this.f20942J0;
        ArrayList arrayList = this.f20944M0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((g) arrayList.get(i11)).b(i11, z10, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2 && this.f20947P0 != null && this.f20946O0 != null && this.f20945N0 != null) {
                for (int i12 = 0; i12 < this.f20949R0; i12++) {
                    this.f20948Q0[i12].u();
                }
                int[] iArr = this.f20947P0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                e eVar4 = null;
                for (int i15 = 0; i15 < i13; i15++) {
                    e eVar5 = this.f20946O0[z10 ? (i13 - i15) - 1 : i15];
                    if (eVar5 != null) {
                        c cVar = eVar5.f20900y;
                        if (eVar5.f20869X != 8) {
                            if (i15 == 0) {
                                eVar5.e(cVar, this.f20900y, this.f20954m0);
                                eVar5.f20871Z = this.f20961t0;
                                eVar5.U = this.f20967z0;
                            }
                            if (i15 == i13 - 1) {
                                eVar5.e(eVar5.f20851A, this.f20851A, this.f20955n0);
                            }
                            if (i15 > 0) {
                                eVar5.e(cVar, eVar4.f20851A, this.f20938F0);
                                eVar4.e(eVar4.f20851A, cVar, 0);
                            }
                            eVar4 = eVar5;
                        }
                    }
                }
                for (int i16 = 0; i16 < i14; i16++) {
                    e eVar6 = this.f20945N0[i16];
                    if (eVar6 != null) {
                        c cVar2 = eVar6.f20901z;
                        if (eVar6.f20869X != 8) {
                            if (i16 == 0) {
                                eVar6.e(cVar2, this.f20901z, this.f20950i0);
                                eVar6.f20873a0 = this.f20962u0;
                                eVar6.f20867V = this.f20933A0;
                            }
                            if (i16 == i14 - 1) {
                                eVar6.e(eVar6.f20852B, this.f20852B, this.f20951j0);
                            }
                            if (i16 > 0) {
                                eVar6.e(cVar2, eVar4.f20852B, this.f20939G0);
                                eVar4.e(eVar4.f20852B, cVar2, 0);
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    for (int i18 = 0; i18 < i14; i18++) {
                        int i19 = (i18 * i13) + i17;
                        if (this.L0 == 1) {
                            i19 = (i17 * i14) + i18;
                        }
                        e[] eVarArr = this.f20948Q0;
                        if (i19 < eVarArr.length && (eVar2 = eVarArr[i19]) != null && eVar2.f20869X != 8) {
                            e eVar7 = this.f20946O0[i17];
                            e eVar8 = this.f20945N0[i18];
                            if (eVar2 != eVar7) {
                                eVar2.e(eVar2.f20900y, eVar7.f20900y, 0);
                                eVar2.e(eVar2.f20851A, eVar7.f20851A, 0);
                            }
                            if (eVar2 != eVar8) {
                                eVar2.e(eVar2.f20901z, eVar8.f20901z, 0);
                                eVar2.e(eVar2.f20852B, eVar8.f20852B, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z10, true);
        }
        this.f20956o0 = false;
    }

    @Override // p153p1.j, p153p1.e
    public final void f(e eVar, HashMap map) {
        super.f(eVar, map);
        h hVar = (h) eVar;
        this.f20961t0 = hVar.f20961t0;
        this.f20962u0 = hVar.f20962u0;
        this.f20963v0 = hVar.f20963v0;
        this.f20964w0 = hVar.f20964w0;
        this.f20965x0 = hVar.f20965x0;
        this.f20966y0 = hVar.f20966y0;
        this.f20967z0 = hVar.f20967z0;
        this.f20933A0 = hVar.f20933A0;
        this.f20934B0 = hVar.f20934B0;
        this.f20935C0 = hVar.f20935C0;
        this.f20936D0 = hVar.f20936D0;
        this.f20937E0 = hVar.f20937E0;
        this.f20938F0 = hVar.f20938F0;
        this.f20939G0 = hVar.f20939G0;
        this.f20940H0 = hVar.f20940H0;
        this.f20941I0 = hVar.f20941I0;
        this.f20942J0 = hVar.f20942J0;
        this.f20943K0 = hVar.f20943K0;
        this.L0 = hVar.L0;
    }
}
