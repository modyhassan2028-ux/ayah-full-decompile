package p027c6;

import java.util.Iterator;
import p110k9.a;
import p124m3.d;
import p124m3.j;
import p134n3.f;
import p151p.C1256n;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13496a = new b();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(f fVar, d dVar, C1256n c1256n, c cVar) {
        a aVar;
        Object next;
        j jVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f13495u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f13495u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objG = aVar.f13493s;
        int i11 = aVar.f13495u;
        if (i11 == 0) {
            a.e(objG);
            Iterator it = dVar.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((j) next).f19585a != fVar.f19994b);
            jVar = (j) next;
            if (jVar == null) {
                int i12 = fVar.f19994b;
                aVar.f13492r = fVar;
                aVar.f13495u = 1;
                objG = c1256n.g(i12, aVar);
                Object obj = p161p9.a.f21156r;
                if (objG == obj) {
                    return obj;
                }
            }
            return new p007a6.f(fVar, jVar);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = aVar.f13492r;
        a.e(objG);
        jVar = (j) objG;
        return new p007a6.f(fVar, jVar);
    }
}
