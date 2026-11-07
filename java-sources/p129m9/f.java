package p129m9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p120l9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f19720s;

    public /* synthetic */ f(e eVar, int i10) {
        this.f19719r = i10;
        this.f19720s = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f19719r) {
            case 0:
                j.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f19719r) {
            case 0:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // p120l9.h
    public final int b() {
        switch (this.f19719r) {
            case 0:
                break;
        }
        return this.f19720s.f19718z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f19719r) {
            case 0:
                this.f19720s.clear();
                break;
            default:
                this.f19720s.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f19719r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f19720s.f((Map.Entry) obj);
            default:
                return this.f19720s.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f19719r) {
            case 0:
                j.e(collection, "elements");
                return this.f19720s.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f19719r) {
            case 0:
                break;
        }
        return this.f19720s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f19719r) {
            case 0:
                e eVar = this.f19720s;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f19720s;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f19719r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.f19720s;
                eVar.getClass();
                eVar.c();
                int iH = eVar.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = eVar.f19711s;
                j.b(objArr);
                if (!j.a(objArr[iH], entry.getValue())) {
                    return false;
                }
                eVar.l(iH);
                return true;
            default:
                e eVar2 = this.f19720s;
                eVar2.c();
                int iH2 = eVar2.h(obj);
                if (iH2 < 0) {
                    return false;
                }
                eVar2.l(iH2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f19719r) {
            case 0:
                j.e(collection, "elements");
                this.f19720s.c();
                break;
            default:
                j.e(collection, "elements");
                this.f19720s.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f19719r) {
            case 0:
                j.e(collection, "elements");
                this.f19720s.c();
                break;
            default:
                j.e(collection, "elements");
                this.f19720s.c();
                break;
        }
        return super.retainAll(collection);
    }
}
