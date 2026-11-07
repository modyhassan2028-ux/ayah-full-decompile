package Z;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Z.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694m extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f10691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f10692e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0681f0 f10693f = new C0681f0(p074h0.h.f16418u, S.f10641u);
    public final /* synthetic */ C0698o g;

    public C0694m(C0698o c0698o, int i10, boolean z10, boolean z11, S s10) {
        this.g = c0698o;
        this.f10688a = i10;
        this.f10689b = z10;
        this.f10690c = z11;
    }

    @Override // Z.r
    public final void a(C0704u c0704u, p074h0.d dVar) {
        this.g.f10723b.a(c0704u, dVar);
    }

    @Override // Z.r
    public final void b() {
        this.g.f10745z--;
    }

    @Override // Z.r
    public final boolean c() {
        return this.g.f10723b.c();
    }

    @Override // Z.r
    public final boolean d() {
        return this.f10689b;
    }

    @Override // Z.r
    public final boolean e() {
        return this.f10690c;
    }

    @Override // Z.r
    public final InterfaceC0687i0 f() {
        return (InterfaceC0687i0) this.f10693f.getValue();
    }

    @Override // Z.r
    public final int g() {
        return this.f10688a;
    }

    @Override // Z.r
    public final p150o9.h h() {
        return this.g.f10723b.h();
    }

    @Override // Z.r
    public final void i(C0704u c0704u) {
        C0698o c0698o = this.g;
        c0698o.f10723b.i(c0698o.g);
        c0698o.f10723b.i(c0704u);
    }

    @Override // Z.r
    public final V j(W w9) {
        return this.g.f10723b.j(w9);
    }

    @Override // Z.r
    public final void k(Set set) {
        HashSet hashSet = this.f10691d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f10691d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // Z.r
    public final void l(C0698o c0698o) {
        this.f10692e.add(c0698o);
    }

    @Override // Z.r
    public final void m(C0704u c0704u) {
        this.g.f10723b.m(c0704u);
    }

    @Override // Z.r
    public final void n() {
        this.g.f10745z++;
    }

    @Override // Z.r
    public final void o(C0698o c0698o) {
        HashSet<Set> hashSet = this.f10691d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                p251z9.j.c(c0698o, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0698o.f10724c);
            }
        }
        LinkedHashSet linkedHashSet = this.f10692e;
        if ((linkedHashSet instanceof A9.a) && !(linkedHashSet instanceof A9.b)) {
            p251z9.y.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(c0698o);
    }

    @Override // Z.r
    public final void p(C0704u c0704u) {
        this.g.f10723b.p(c0704u);
    }

    public final void q() {
        LinkedHashSet<C0698o> linkedHashSet = this.f10692e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f10691d;
        if (hashSet != null) {
            for (C0698o c0698o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0698o.f10724c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
