package p198u3;

import A4.l;
import H9.o;
import J3.C0304b;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.h0;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import java.util.ArrayList;
import java.util.Collection;
import p077h3.a;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p120l9.r;
import p150o9.c;
import p151p.C1256n;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0304b f22890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1256n f22891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U f22892c;

    public d(C0304b c0304b, C1256n c1256n) {
        j.e(c0304b, "bookmarkStore");
        this.f22890a = c0304b;
        this.f22891b = c1256n;
        this.f22892c = AbstractC0419l.v(new b(c0304b.f4235d, this, 1), AbstractC0405x.b(AbstractC0405x.e()), new h0(), r.f19440r);
    }

    public final Object a(BookmarkType bookmarkType, i iVar) {
        Object obj;
        ArrayList arrayListD0 = m.D0((Collection) this.f22892c.f6130r.getValue());
        int size = arrayListD0.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayListD0.get(i10);
            i10++;
        } while (((a) obj).f16442c != bookmarkType);
        a aVar = (a) obj;
        if (aVar != null) {
            arrayListD0.remove(aVar);
            if (!o.e1(aVar.f16441b)) {
                arrayListD0.add(a.a(aVar, null, System.currentTimeMillis(), 6));
            }
            Object objB = b(arrayListD0, iVar);
            if (objB == p161p9.a.f21156r) {
                return objB;
            }
        }
        return y.f19095a;
    }

    public final Object b(ArrayList arrayList, i iVar) {
        ArrayList arrayList2 = new ArrayList(n.a0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            arrayList2.add(new PreferencesBookmark(aVar.f16440a, aVar.f16443d, aVar.f16441b, aVar.f16442c.name()));
        }
        C0304b c0304b = this.f22890a;
        Object objT = F9.n.t(c0304b.f4232a, new l(c0304b, arrayList2, (c) null, 2), iVar);
        y yVar = y.f19095a;
        p161p9.a aVar2 = p161p9.a.f21156r;
        if (objT != aVar2) {
            objT = yVar;
        }
        return objT == aVar2 ? objT : yVar;
    }
}
