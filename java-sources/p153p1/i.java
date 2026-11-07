package p153p1;

import W.AbstractC0607v1;
import java.util.ArrayList;
import java.util.HashMap;
import p142o1.c;
import p142o1.e;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f20968g0 = -1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f20969h0 = -1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f20970i0 = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public c f20971j0 = this.f20901z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f20972k0 = 0;

    public i() {
        this.f20858H.clear();
        this.f20858H.add(this.f20971j0);
        int length = this.f20857G.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f20857G[i10] = this.f20971j0;
        }
    }

    @Override // p153p1.e
    public final void B(e eVar) {
        if (this.f20861K == null) {
            return;
        }
        c cVar = this.f20971j0;
        eVar.getClass();
        int iM = e.m(cVar);
        if (this.f20972k0 == 1) {
            this.f20866P = iM;
            this.Q = 0;
            w(this.f20861K.j());
            z(0);
            return;
        }
        this.f20866P = 0;
        this.Q = iM;
        z(this.f20861K.m());
        w(0);
    }

    public final void C(int i10) {
        if (this.f20972k0 == i10) {
            return;
        }
        this.f20972k0 = i10;
        ArrayList arrayList = this.f20858H;
        arrayList.clear();
        if (this.f20972k0 == 1) {
            this.f20971j0 = this.f20900y;
        } else {
            this.f20971j0 = this.f20901z;
        }
        arrayList.add(this.f20971j0);
        c[] cVarArr = this.f20857G;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f20971j0;
        }
    }

    @Override // p153p1.e
    public final void a(e eVar) {
        f fVar = (f) this.f20861K;
        if (fVar == null) {
            return;
        }
        c cVarH = fVar.h(2);
        c cVarH2 = fVar.h(4);
        e eVar2 = this.f20861K;
        d dVar = d.f20847s;
        boolean z10 = eVar2 != null && eVar2.f20860J[0] == dVar;
        if (this.f20972k0 == 0) {
            cVarH = fVar.h(3);
            cVarH2 = fVar.h(5);
            e eVar3 = this.f20861K;
            z10 = eVar3 != null && eVar3.f20860J[1] == dVar;
        }
        if (this.f20969h0 != -1) {
            h hVarJ = eVar.j(this.f20971j0);
            eVar.e(hVarJ, eVar.j(cVarH), this.f20969h0, 8);
            if (z10) {
                eVar.f(eVar.j(cVarH2), hVarJ, 0, 5);
                return;
            }
            return;
        }
        if (this.f20970i0 != -1) {
            h hVarJ2 = eVar.j(this.f20971j0);
            h hVarJ3 = eVar.j(cVarH2);
            eVar.e(hVarJ2, hVarJ3, -this.f20970i0, 8);
            if (z10) {
                eVar.f(hVarJ2, eVar.j(cVarH), 0, 5);
                eVar.f(hVarJ3, hVarJ2, 0, 5);
                return;
            }
            return;
        }
        if (this.f20968g0 != -1.0f) {
            h hVarJ4 = eVar.j(this.f20971j0);
            h hVarJ5 = eVar.j(cVarH2);
            float f3 = this.f20968g0;
            c cVarK = eVar.k();
            cVarK.f20225d.e(hVarJ4, -1.0f);
            cVarK.f20225d.e(hVarJ5, f3);
            eVar.c(cVarK);
        }
    }

    @Override // p153p1.e
    public final boolean b() {
        return true;
    }

    @Override // p153p1.e
    public final void f(e eVar, HashMap map) {
        super.f(eVar, map);
        i iVar = (i) eVar;
        this.f20968g0 = iVar.f20968g0;
        this.f20969h0 = iVar.f20969h0;
        this.f20970i0 = iVar.f20970i0;
        C(iVar.f20972k0);
    }

    @Override // p153p1.e
    public final c h(int i10) {
        switch (AbstractC0607v1.b(i10)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f20972k0 == 1) {
                    return this.f20971j0;
                }
                break;
            case 2:
            case 4:
                if (this.f20972k0 == 0) {
                    return this.f20971j0;
                }
                break;
        }
        throw new AssertionError(p123m2.c.E(i10));
    }
}
