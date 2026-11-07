package p090i5;

import com.ayah.common.data.source.json.model.booklist.BookType;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p058f5.a;
import p058f5.d;
import p110k9.y;
import p120l9.m;
import p174r3.c;
import p174r3.l;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f16760b;

    public b(c cVar, l lVar) {
        j.e(cVar, "bookModel");
        j.e(lVar, "bookRepository");
        this.f16759a = cVar;
        this.f16760b = lVar;
    }

    public final Object a(d dVar, i iVar) {
        boolean z10 = dVar instanceof a;
        p161p9.a aVar = p161p9.a.f21156r;
        c cVar = this.f16759a;
        y yVar = y.f19095a;
        if (z10) {
            BookType bookType = ((a) dVar).f16223a;
            this.f16760b.e(bookType);
            Object objB = cVar.b(m.q0((Collection) cVar.f21517c.f6130r.getValue(), AbstractC0813f2.K(bookType)), iVar);
            if (objB != aVar) {
                objB = yVar;
            }
            if (objB == aVar) {
                return objB;
            }
        } else if (dVar instanceof p058f5.c) {
            Object objB2 = cVar.b(m.p0((Iterable) cVar.f21517c.f6130r.getValue(), m.G0(AbstractC0813f2.K(((p058f5.c) dVar).f16226a))), iVar);
            if (objB2 != aVar) {
                objB2 = yVar;
            }
            if (objB2 == aVar) {
                return objB2;
            }
        } else {
            if (!(dVar instanceof p058f5.b)) {
                throw new A6.a();
            }
            p058f5.b bVar = (p058f5.b) dVar;
            BookType bookType2 = bVar.f16224a;
            int i10 = bVar.f16225b;
            List list = (List) cVar.f21517c.f6130r.getValue();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.remove(bookType2);
            if (i10 < arrayList.size()) {
                arrayList.add(i10, bookType2);
            } else {
                arrayList.add(bookType2);
            }
            Object objB3 = cVar.b(arrayList, iVar);
            if (objB3 != aVar) {
                objB3 = yVar;
            }
            if (objB3 == aVar) {
                return objB3;
            }
        }
        return yVar;
    }
}
