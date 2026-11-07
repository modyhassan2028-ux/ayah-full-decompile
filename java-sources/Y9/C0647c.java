package Y9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Y9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647c extends AbstractC0658n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0646b f10500b;

    public C0647c() {
        super(Z9.k.f11053a);
        W9.g gVar = Z9.k.f11054b;
        p251z9.j.e(gVar, "elementDesc");
        this.f10500b = new C0646b(gVar);
    }

    @Override // U9.a
    public final W9.f d() {
        return this.f10500b;
    }

    @Override // Y9.AbstractC0645a
    public final Object e() {
        return new ArrayList();
    }

    @Override // Y9.AbstractC0645a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        p251z9.j.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // Y9.AbstractC0645a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        p251z9.j.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        p251z9.j.e(collection, "<this>");
        return collection.size();
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        p251z9.j.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // Y9.AbstractC0645a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        p251z9.j.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // Y9.AbstractC0658n
    public final void m(int i10, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        p251z9.j.e(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
