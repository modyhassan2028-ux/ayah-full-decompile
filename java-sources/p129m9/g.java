package p129m9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import p120l9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f19721s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f19722r;

    static {
        e eVar = e.f19705E;
        f19721s = new g(e.f19705E);
    }

    public g(e eVar) {
        j.e(eVar, "backing");
        this.f19722r = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f19722r.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        this.f19722r.c();
        return super.addAll(collection);
    }

    @Override // p120l9.h
    public final int b() {
        return this.f19722r.f19718z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19722r.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19722r.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f19722r.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.f19722r;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f19722r;
        eVar.c();
        int iH = eVar.h(obj);
        if (iH < 0) {
            return false;
        }
        eVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        this.f19722r.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        this.f19722r.c();
        return super.retainAll(collection);
    }

    public g() {
        this(new e());
    }
}
