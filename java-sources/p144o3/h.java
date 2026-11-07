package p144o3;

import D3.b;
import J3.x;
import K9.AbstractC0405x;
import K9.H;
import N9.AbstractC0419l;
import N9.k0;
import R9.d;
import R9.e;
import java.util.Iterator;
import java.util.List;
import p120l9.r;
import p161p9.a;
import p251z9.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f20328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f20329b;

    public h(x xVar) {
        j.e(xVar, "preferencesStore");
        this.f20328a = xVar;
        this.f20329b = AbstractC0419l.c(r.f19440r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, c cVar) {
        f fVar;
        Object next;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f20322u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f20322u = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objB = fVar.f20320s;
        int i11 = fVar.f20322u;
        Object obj = a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objB);
            fVar.f20319r = str;
            fVar.f20322u = 1;
            objB = b(fVar);
            if (objB != obj) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(objB);
            return objB;
        }
        str = fVar.f20319r;
        p110k9.a.e(objB);
        Iterator it = ((Iterable) objB).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!j.a(((p065g3.a) next).f16273a, str));
        p065g3.a aVar = (p065g3.a) next;
        if (aVar != null) {
            return aVar;
        }
        fVar.f20319r = null;
        fVar.f20322u = 2;
        Object objA = a("husary", fVar);
        return objA == obj ? obj : objA;
    }

    public final Object b(c cVar) {
        List list = (List) this.f20329b.getValue();
        if (!list.isEmpty()) {
            return list;
        }
        e eVar = H.f5322a;
        Object objI = AbstractC0405x.I(d.f7436t, new b(this, null, 7), cVar);
        return objI == a.f21156r ? objI : (List) objI;
    }
}
