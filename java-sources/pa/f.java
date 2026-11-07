package pa;

import Ca.r;
import E6.u;
import java.util.ArrayList;
import ka.n;
import ka.o;
import oa.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f21172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f21173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21174f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21176i;

    public f(m mVar, ArrayList arrayList, int i10, r rVar, u uVar, int i11, int i12, int i13) {
        this.f21169a = mVar;
        this.f21170b = arrayList;
        this.f21171c = i10;
        this.f21172d = rVar;
        this.f21173e = uVar;
        this.f21174f = i11;
        this.g = i12;
        this.f21175h = i13;
    }

    public static f a(f fVar, int i10, r rVar, u uVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f21171c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            rVar = fVar.f21172d;
        }
        r rVar2 = rVar;
        if ((i11 & 4) != 0) {
            uVar = fVar.f21173e;
        }
        u uVar2 = uVar;
        int i13 = fVar.f21174f;
        int i14 = fVar.g;
        int i15 = fVar.f21175h;
        j.e(uVar2, "request");
        return new f(fVar.f21169a, fVar.f21170b, i12, rVar2, uVar2, i13, i14, i15);
    }

    public final ka.u b(u uVar) {
        j.e(uVar, "request");
        ArrayList arrayList = this.f21170b;
        int size = arrayList.size();
        int i10 = this.f21171c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f21176i++;
        r rVar = this.f21172d;
        if (rVar != null) {
            if (!((oa.g) rVar.f850d).c().b((n) uVar.f1960b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f21176i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        f fVarA = a(this, i11, null, uVar, 58);
        o oVar = (o) arrayList.get(i10);
        ka.u uVarA = oVar.a(fVarA);
        if (uVarA == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (rVar == null || i11 >= arrayList.size() || fVarA.f21176i == 1) {
            return uVarA;
        }
        throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
    }
}
