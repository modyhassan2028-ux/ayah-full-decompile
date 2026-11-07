package F;

import G.J;
import G.L;
import G.M;
import G.d0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2136s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, int i11) {
        super(1);
        this.f2135r = i11;
        this.f2136s = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f2135r;
        p110k9.y yVar = p110k9.y.f19095a;
        int i11 = this.f2136s;
        switch (i10) {
            case 0:
                J j = (J) obj;
                p093j0.i iVarC = p093j0.s.c();
                p093j0.s.g(iVarC, p093j0.s.d(iVarC), iVarC != null ? iVarC.e() : null);
                for (int i12 = 0; i12 < 2; i12++) {
                    int i13 = i11 + i12;
                    j.getClass();
                    long j10 = M.f2600a;
                    L l10 = j.f2596b;
                    android.support.v4.media.session.r rVar = l10.f2599c;
                    if (rVar != null) {
                        j.f2595a.add(new d0(rVar, i13, j10, l10.f2598b));
                    }
                }
                return yVar;
            case 1:
                return Boolean.valueOf(((p162q0.t) obj).z0(i11));
            case 2:
                float f3 = i11;
                F9.f[] fVarArr = R0.u.f7181a;
                R0.v vVar = R0.s.f7171r;
                F9.f fVar = R0.u.f7181a[9];
                vVar.a((R0.j) obj, Float.valueOf(f3));
                return yVar;
            case 3:
                float f7 = 12 + i11;
                F9.f[] fVarArr2 = R0.u.f7181a;
                R0.v vVar2 = R0.s.f7171r;
                F9.f fVar2 = R0.u.f7181a[9];
                vVar2.a((R0.j) obj, Float.valueOf(f7));
                return yVar;
            default:
                return Boolean.valueOf(((p162q0.t) obj).z0(i11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A a9, int i10) {
        super(1);
        this.f2135r = 0;
        this.f2136s = i10;
    }
}
