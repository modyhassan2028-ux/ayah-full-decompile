package p054f0;

import G9.h;
import java.util.Iterator;
import p042e0.c;
import p120l9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p021c0.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f15890u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f15892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f15893t;

    static {
        p062g0.b bVar = p062g0.b.f16245a;
        f15890u = new b(bVar, bVar, c.f15716t);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f15891r = obj;
        this.f15892s = obj2;
        this.f15893t = cVar;
    }

    @Override // p120l9.a
    public final int b() {
        c cVar = this.f15893t;
        cVar.getClass();
        return cVar.f15718s;
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15893t.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.f15891r, this.f15893t);
    }
}
