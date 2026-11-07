package p237y4;

import E2.N0;
import F.u;
import K9.AbstractC0405x;
import K9.H;
import R9.d;
import i7.C;
import p110k9.a;
import p246z4.k;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N0 f24646a = new N0(2);

    public e(C c10) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, String str, c cVar) {
        d dVar;
        int i11;
        String str2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f24645v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f24645v = i12 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objI = dVar.f24643t;
        int i13 = dVar.f24645v;
        N0 n6 = this.f24646a;
        if (i13 == 0) {
            a.e(objI);
            p065g3.c cVar2 = (p065g3.c) n6.g(new k(i10, str));
            if (cVar2 != null) {
                return cVar2;
            }
            R9.e eVar = H.f5322a;
            d dVar2 = d.f7436t;
            u uVar = new u(this, i10, str, null, 5);
            dVar.f24642s = str;
            dVar.f24641r = i10;
            dVar.f24645v = 1;
            objI = AbstractC0405x.I(dVar2, uVar, dVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objI == aVar) {
                return aVar;
            }
            i11 = i10;
            str2 = str;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = dVar.f24641r;
            str2 = dVar.f24642s;
            a.e(objI);
        }
        p065g3.c cVar3 = (p065g3.c) objI;
        n6.k(new k(i11, str2), cVar3);
        return cVar3;
    }
}
