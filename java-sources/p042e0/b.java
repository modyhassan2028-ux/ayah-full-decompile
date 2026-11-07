package p042e0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f15714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f15715v;

    public b(h hVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f15714u = hVar;
        this.f15715v = obj2;
    }

    @Override // p042e0.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f15715v;
    }

    @Override // p042e0.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f15715v;
        this.f15715v = obj;
        f fVar = (f) this.f15714u.f15734s;
        e eVar = fVar.f15727u;
        Object obj3 = this.f15712s;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = fVar.f15721t;
        if (!z10) {
            eVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = fVar.f15719r[fVar.f15720s];
            Object obj4 = nVar.f15744r[nVar.f15746t];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f15723s, obj4, 0);
        }
        fVar.f15730x = eVar.f15725u;
        return obj2;
    }
}
