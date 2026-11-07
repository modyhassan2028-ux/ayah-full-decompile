package p142o1;

import Aa.a;
import android.support.v4.media.session.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f20225d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f20222a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20223b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f20224c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20226e = false;

    public c(a aVar) {
        this.f20225d = new a(this, aVar);
    }

    public final void a(e eVar, int i10) {
        this.f20225d.e(eVar.i(i10), 1.0f);
        this.f20225d.e(eVar.i(i10), -1.0f);
    }

    public final void b(h hVar, h hVar2, h hVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20223b = i10;
        }
        if (z10) {
            this.f20225d.e(hVar, 1.0f);
            this.f20225d.e(hVar2, -1.0f);
            this.f20225d.e(hVar3, -1.0f);
        } else {
            this.f20225d.e(hVar, -1.0f);
            this.f20225d.e(hVar2, 1.0f);
            this.f20225d.e(hVar3, 1.0f);
        }
    }

    public final void c(h hVar, h hVar2, h hVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20223b = i10;
        }
        if (z10) {
            this.f20225d.e(hVar, 1.0f);
            this.f20225d.e(hVar2, -1.0f);
            this.f20225d.e(hVar3, 1.0f);
        } else {
            this.f20225d.e(hVar, -1.0f);
            this.f20225d.e(hVar2, 1.0f);
            this.f20225d.e(hVar3, -1.0f);
        }
    }

    public h d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final h e(boolean[] zArr, h hVar) {
        int i10;
        int iD = this.f20225d.d();
        h hVar2 = null;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float fA = this.f20225d.a(i11);
            if (fA < 0.0f) {
                h hVarH = this.f20225d.h(i11);
                if ((zArr == null || !zArr[hVarH.f20247b]) && hVarH != hVar && (((i10 = hVarH.f20255l) == 3 || i10 == 4) && fA < f3)) {
                    f3 = fA;
                    hVar2 = hVarH;
                }
            }
        }
        return hVar2;
    }

    public final void f(h hVar) {
        h hVar2 = this.f20222a;
        if (hVar2 != null) {
            this.f20225d.e(hVar2, -1.0f);
            this.f20222a = null;
        }
        float fB = this.f20225d.b(hVar, true) * (-1.0f);
        this.f20222a = hVar;
        if (fB == 1.0f) {
            return;
        }
        this.f20223b /= fB;
        this.f20225d.j(fB);
    }

    public final void g(h hVar, boolean z10) {
        if (hVar.f20251f) {
            float f3 = this.f20225d.f(hVar);
            this.f20223b = (hVar.f20250e * f3) + this.f20223b;
            this.f20225d.b(hVar, z10);
            if (z10) {
                hVar.b(this);
            }
        }
    }

    public void h(c cVar, boolean z10) {
        float fC = this.f20225d.c(cVar, z10);
        this.f20223b = (cVar.f20223b * fC) + this.f20223b;
        if (z10) {
            cVar.f20222a.b(this);
        }
    }

    public String toString() {
        boolean z10;
        String strZ = p.z(this.f20222a == null ? "0" : "" + this.f20222a, " = ");
        if (this.f20223b != 0.0f) {
            StringBuilder sbC = p.C(strZ);
            sbC.append(this.f20223b);
            strZ = sbC.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = this.f20225d.d();
        for (int i10 = 0; i10 < iD; i10++) {
            h hVarH = this.f20225d.h(i10);
            if (hVarH != null) {
                float fA = this.f20225d.a(i10);
                if (fA != 0.0f) {
                    String string = hVarH.toString();
                    if (z10) {
                        if (fA > 0.0f) {
                            strZ = p.z(strZ, " + ");
                        } else {
                            strZ = p.z(strZ, " - ");
                            fA *= -1.0f;
                        }
                    } else if (fA < 0.0f) {
                        strZ = p.z(strZ, "- ");
                        fA *= -1.0f;
                    }
                    strZ = fA == 1.0f ? p.z(strZ, string) : strZ + fA + " " + string;
                    z10 = true;
                }
            }
        }
        return !z10 ? p.z(strZ, "0.0") : strZ;
    }
}
