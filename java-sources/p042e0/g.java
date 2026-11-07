package p042e0;

import java.util.Iterator;
import java.util.Map;
import p120l9.h;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f15732s;

    public /* synthetic */ g(int i10, e eVar) {
        this.f15731r = i10;
        this.f15732s = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f15731r) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p120l9.h
    public final int b() {
        switch (this.f15731r) {
            case 0:
                e eVar = this.f15732s;
                eVar.getClass();
                return eVar.f15726v;
            default:
                e eVar2 = this.f15732s;
                eVar2.getClass();
                return eVar2.f15726v;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15731r) {
            case 0:
                this.f15732s.clear();
                break;
            default:
                this.f15732s.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f15731r) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    e eVar = this.f15732s;
                    Object obj2 = eVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && eVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f15732s.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15731r) {
            case 0:
                return new h(this.f15732s);
            default:
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(1);
                }
                return new i(this.f15732s, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f15731r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f15732s.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f15732s;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
