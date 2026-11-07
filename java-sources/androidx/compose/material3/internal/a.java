package androidx.compose.material3.internal;

import A.EnumC0047u0;
import A.V;
import K9.AbstractC0405x;
import X.C0635g;
import X.C0637i;
import X.C0638j;
import X.C0639k;
import X.C0641m;
import X.s;
import l0.r;
import p110k9.y;
import p232y.T;
import p241y9.e;
import q9.c;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(p241y9.a aVar, e eVar, c cVar) {
        C0639k c0639k;
        if (cVar instanceof C0639k) {
            c0639k = (C0639k) cVar;
            int i10 = c0639k.f9750s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0639k.f9750s = i10 - Integer.MIN_VALUE;
            } else {
                c0639k = new C0639k(cVar);
            }
        } else {
            c0639k = new C0639k(cVar);
        }
        Object obj = c0639k.f9749r;
        int i11 = c0639k.f9750s;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                C0641m c0641m = new C0641m(aVar, eVar, null, 0);
                c0639k.f9750s = 1;
                Object objJ = AbstractC0405x.j(c0641m, c0639k);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objJ == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
            }
        } catch (C0635g unused) {
        }
        return y.f19095a;
    }

    public static r b(r rVar, s sVar, EnumC0047u0 enumC0047u0, boolean z10) {
        return V.a(rVar, sVar.f9780f, enumC0047u0, z10, null, sVar.f9783k.getValue() != null, new C0637i(sVar, null), false);
    }

    public static final Object c(s sVar, Object obj, float f3, i iVar) {
        Object objA = sVar.a(obj, T.f24454r, new C0638j(sVar, f3, null), iVar);
        return objA == p161p9.a.f21156r ? objA : y.f19095a;
    }

    public static final r d(r rVar, s sVar, EnumC0047u0 enumC0047u0, e eVar) {
        return rVar.b(new DraggableAnchorsElement(sVar, eVar, enumC0047u0));
    }
}
