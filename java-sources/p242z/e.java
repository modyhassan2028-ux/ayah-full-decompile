package p242z;

import A.K;
import A.M;
import A.R0;
import Z.C0698o;
import Z.C0699o0;
import p074h0.d;
import p093j0.r;
import p241y9.a;
import p241y9.f;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f24729a = new r();

    public static void b(e eVar, R0 r10, a aVar) {
        eVar.f24729a.add(new d(262103052, new M(r10, aVar), true));
    }

    public final void a(a aVar, C0698o c0698o, int i10) {
        c0698o.V(1320309496);
        int i11 = (c0698o.g(aVar) ? 4 : 2) | i10 | (c0698o.g(this) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            r rVar = this.f24729a;
            int size = rVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((f) rVar.get(i12)).d(aVar, c0698o, Integer.valueOf(i11 & 14));
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K(i10, 16, this, aVar);
        }
    }
}
