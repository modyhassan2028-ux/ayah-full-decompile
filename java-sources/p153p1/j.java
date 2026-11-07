package p153p1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class j extends e {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e[] f20973g0 = new e[4];

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f20974h0 = 0;

    public final void C(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f20974h0 + 1;
        e[] eVarArr = this.f20973g0;
        if (i10 > eVarArr.length) {
            this.f20973g0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f20973g0;
        int i11 = this.f20974h0;
        eVarArr2[i11] = eVar;
        this.f20974h0 = i11 + 1;
    }

    @Override // p153p1.e
    public void f(e eVar, HashMap map) {
        super.f(eVar, map);
        j jVar = (j) eVar;
        this.f20974h0 = 0;
        int i10 = jVar.f20974h0;
        for (int i11 = 0; i11 < i10; i11++) {
            C((e) map.get(jVar.f20973g0[i11]));
        }
    }

    public void D() {
    }
}
