package Y9;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class V implements W9.f, InterfaceC0654j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9.f f10487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f10489c;

    public V(W9.f fVar) {
        p251z9.j.e(fVar, "original");
        this.f10487a = fVar;
        this.f10488b = fVar.b() + '?';
        this.f10489c = M.b(fVar);
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        return this.f10487a.a(str);
    }

    @Override // W9.f
    public final String b() {
        return this.f10488b;
    }

    @Override // W9.f
    public final va.g c() {
        return this.f10487a.c();
    }

    @Override // W9.f
    public final int d() {
        return this.f10487a.d();
    }

    @Override // W9.f
    public final String e(int i10) {
        return this.f10487a.e(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return p251z9.j.a(this.f10487a, ((V) obj).f10487a);
        }
        return false;
    }

    @Override // W9.f
    public final boolean f() {
        return this.f10487a.f();
    }

    @Override // Y9.InterfaceC0654j
    public final Set g() {
        return this.f10489c;
    }

    @Override // W9.f
    public final List getAnnotations() {
        return this.f10487a.getAnnotations();
    }

    @Override // W9.f
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f10487a.hashCode() * 31;
    }

    @Override // W9.f
    public final List i(int i10) {
        return this.f10487a.i(i10);
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        return this.f10487a.j(i10);
    }

    @Override // W9.f
    public final boolean k(int i10) {
        return this.f10487a.k(i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10487a);
        sb.append('?');
        return sb.toString();
    }
}
