package p174r3;

import B3.e;
import D3.c;
import K9.AbstractC0405x;
import K9.H;
import K9.p0;
import N9.AbstractC0419l;
import N9.C0410c;
import N9.C0424q;
import N9.k0;
import O9.y;
import P9.d;
import android.content.Context;
import android.support.v4.media.session.p;
import com.ayah.common.data.source.database.BookDatabase;
import com.ayah.common.data.source.json.model.booklist.BookCategory;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p050e8.b;
import p120l9.m;
import p120l9.n;
import p120l9.s;
import p120l9.w;
import p251z9.j;
import s3.a;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f21548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f21549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f21550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f21551f;
    public final k0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f21552h;

    public l(Context context, c cVar, e eVar, a aVar) {
        j.e(cVar, "bookSource");
        j.e(eVar, "bookDatabaseFactory");
        j.e(aVar, "bookDownloadRepository");
        this.f21546a = context;
        this.f21547b = cVar;
        this.f21548c = eVar;
        this.f21549d = aVar;
        p0 p0VarE = AbstractC0405x.e();
        R9.e eVar2 = H.f5322a;
        d dVarB = AbstractC0405x.b(Y2.a.Z(p0VarE, R9.d.f7436t));
        s sVar = s.f19441r;
        this.f21550e = new AtomicReference(sVar);
        k0 k0VarC = AbstractC0419l.c(sVar);
        this.f21551f = k0VarC;
        this.g = AbstractC0419l.c(sVar);
        this.f21552h = k0VarC;
        p150o9.c cVar2 = null;
        AbstractC0405x.x(dVarB, null, new d(this, cVar2, 0), 3);
        AbstractC0419l.u(new C0424q(new C4.e(17, new C0424q(aVar.f22127e, new B2.d(this, cVar2, 16), 2)), new d(this, cVar2, 1), 2), dVarB);
        AbstractC0405x.x(dVarB, null, new d(this, cVar2, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(l lVar, q9.c cVar) throws IOException {
        f fVar;
        List list;
        String[] strArr;
        Context context = lVar.f21546a;
        AtomicReference atomicReference = lVar.f21550e;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f21528v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f21528v = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(lVar, cVar);
            }
        } else {
            fVar = new f(lVar, cVar);
        }
        Object obj = fVar.f21526t;
        int i11 = fVar.f21528v;
        int i12 = 0;
        if (i11 == 0) {
            p110k9.a.e(obj);
            Map map = (Map) atomicReference.get();
            if (!map.isEmpty()) {
                return map;
            }
            String[] list2 = context.getAssets().list("databases");
            if (list2 == null) {
                list2 = new String[0];
            }
            List listK = AbstractC0813f2.K(B1.E(context));
            c cVar2 = lVar.f21547b;
            fVar.f21524r = list2;
            fVar.f21525s = listK;
            fVar.f21528v = 1;
            Object objA = cVar2.a(fVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
                return aVar;
            }
            String[] strArr2 = list2;
            obj = objA;
            list = listK;
            strArr = strArr2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = fVar.f21525s;
            strArr = fVar.f21524r;
            p110k9.a.e(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (p120l9.l.T(p.z(((BookType) obj2).f13685a, ".db"), strArr)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayListQ0 = m.q0(list, arrayList);
        int iG0 = w.g0(n.a0(arrayListQ0, 10));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        int size = arrayListQ0.size();
        while (i12 < size) {
            Object obj3 = arrayListQ0.get(i12);
            i12++;
            linkedHashMap.put(((BookType) obj3).f13685a, obj3);
        }
        atomicReference.set(linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(q9.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f21523t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f21523t = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.f21521r;
        int i11 = eVar.f21523t;
        if (i11 == 0) {
            p110k9.a.e(objB);
            eVar.f21523t = 1;
            objB = this.f21547b.b(eVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(objB);
        }
        Map map = (Map) objB;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((BookCategory) ((Map.Entry) it.next()).getValue()).f13683c);
        }
        ArrayList arrayListB0 = n.b0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListB0.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListB0.get(i13);
            i13++;
            if (!f((BookType) obj)) {
                arrayList2.add(obj);
            }
        }
        int iG0 = w.g0(n.a0(arrayList2, 10));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        int size2 = arrayList2.size();
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            linkedHashMap.put(((BookType) obj2).f13685a, obj2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(BookType bookType, q9.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f21532u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f21532u = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objB = gVar.f21530s;
        int i11 = gVar.f21532u;
        if (i11 == 0) {
            p110k9.a.e(objB);
            gVar.f21529r = bookType;
            gVar.f21532u = 1;
            objB = this.f21547b.b(gVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bookType = gVar.f21529r;
            p110k9.a.e(objB);
        }
        for (Object obj : ((Map) objB).values()) {
            List list = ((BookCategory) obj).f13683c;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (j.a(((BookType) it.next()).f13685a, bookType.f13685a)) {
                        return obj;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(BookType bookType, q9.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f21537v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f21537v = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB = hVar.f21535t;
        int i11 = hVar.f21537v;
        Object obj = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objB);
            if (!f(bookType)) {
                return null;
            }
            hVar.f21533r = bookType;
            hVar.f21537v = 1;
            objB = this.f21548c.b(bookType, hVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BookDatabase bookDatabase = hVar.f21534s;
            p110k9.a.e(objB);
            return bookDatabase;
        }
        bookType = hVar.f21533r;
        p110k9.a.e(objB);
        BookDatabase bookDatabase2 = (BookDatabase) objB;
        if (bookDatabase2 == null) {
            String strO = b.o(bookType);
            Context context = this.f21546a;
            context.deleteDatabase(strO);
            File file = new File(context.getFilesDir(), strO);
            if (file.exists()) {
                file.delete();
            }
            hVar.f21533r = null;
            hVar.f21534s = bookDatabase2;
            hVar.f21537v = 2;
            if (g(hVar) == obj) {
                return obj;
            }
        }
        return bookDatabase2;
    }

    public final void e(BookType bookType) {
        j.e(bookType, "bookType");
        File file = new File(this.f21546a.getFilesDir(), p.z(b.o(bookType), ".zip"));
        if (f(bookType)) {
            return;
        }
        a aVar = this.f21549d;
        aVar.getClass();
        LinkedHashSet linkedHashSet = aVar.f22126d;
        String str = bookType.f13685a;
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        String str2 = bookType.f13686b;
        s3.b bVar = new s3.b(str, file, str2);
        p085i0.n nVar = aVar.f22123a;
        StringBuilder sb = new StringBuilder("https://cdn.ayah.app/books/");
        sb.append(str);
        sb.append("/");
        sb.append(str);
        sb.append("-");
        C0410c c0410cL = p.l(nVar, bVar, p.B(sb, str2, ".db.zip"), file);
        p150o9.c cVar = null;
        AbstractC0419l.u(new C0424q(new C0424q(c0410cL, new A4.l(aVar, bookType, cVar, 9), 2), new y(aVar, cVar, 26), 2), aVar.f22124b);
    }

    public final boolean f(BookType bookType) {
        return ((Map) this.f21550e.get()).containsKey(bookType.f13685a) || (((Map) this.f21551f.getValue()).get(bookType.f13685a) != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(q9.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f21545t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f21545t = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objA = kVar.f21543r;
        int i11 = kVar.f21545t;
        if (i11 == 0) {
            p110k9.a.e(objA);
            kVar.f21545t = 1;
            objA = this.f21547b.a(kVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(objA);
        }
        Map map = (Map) this.g.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objA) {
            BookType bookType = (BookType) obj;
            String strO = b.o(bookType);
            String str = bookType.f13685a;
            if (map.get(str) == null || (map.get(str) instanceof i6.b)) {
                Context context = this.f21546a;
                if (context.getDatabasePath(strO).exists() || new File(context.getFilesDir(), strO).exists()) {
                    arrayList.add(obj);
                }
            }
        }
        int iG0 = w.g0(n.a0(arrayList, 10));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            linkedHashMap.put(((BookType) obj2).f13685a, obj2);
        }
        k0 k0Var = this.f21551f;
        k0Var.getClass();
        k0Var.n(null, linkedHashMap);
        return p110k9.y.f19095a;
    }
}
