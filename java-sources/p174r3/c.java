package p174r3;

import C4.g;
import J3.B;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.h0;
import P9.d;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p110k9.a;
import p110k9.y;
import p120l9.n;
import p120l9.r;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f21515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U f21517c;

    public c(D3.c cVar, B b5) {
        j.e(cVar, "bookSource");
        j.e(b5, "tafsirInfoStore");
        this.f21515a = b5;
        d dVarB = AbstractC0405x.b(AbstractC0405x.e());
        g gVar = new g(b5.f4228c, cVar, 20);
        this.f21516b = gVar;
        this.f21517c = AbstractC0419l.v(gVar, dVarB, new h0(), r.f19440r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q9.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f21508t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f21508t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objP = aVar.f21506r;
        int i11 = aVar.f21508t;
        if (i11 == 0) {
            a.e(objP);
            aVar.f21508t = 1;
            objP = AbstractC0419l.p(this.f21516b, aVar);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objP == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(objP);
        }
        return Boolean.valueOf(!((Collection) objP).isEmpty());
    }

    public final Object b(List list, i iVar) {
        ArrayList arrayList = new ArrayList(n.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BookType) it.next()).f13685a);
        }
        Object objT = F9.n.t(this.f21515a.f4226a, new B2.d(arrayList, null, 7), iVar);
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objT != aVar) {
            objT = yVar;
        }
        return objT == aVar ? objT : yVar;
    }
}
