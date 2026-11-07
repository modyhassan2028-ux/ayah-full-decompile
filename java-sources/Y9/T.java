package Y9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T implements W9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W9.e f10485b;

    public T(String str, W9.e eVar) {
        p251z9.j.e(eVar, "kind");
        this.f10484a = str;
        this.f10485b = eVar;
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // W9.f
    public final String b() {
        return this.f10484a;
    }

    @Override // W9.f
    public final va.g c() {
        return this.f10485b;
    }

    @Override // W9.f
    public final int d() {
        return 0;
    }

    @Override // W9.f
    public final String e(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        return p251z9.j.a(this.f10484a, t2.f10484a) && p251z9.j.a(this.f10485b, t2.f10485b);
    }

    @Override // W9.f
    public final boolean f() {
        return false;
    }

    @Override // W9.f
    public final List getAnnotations() {
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (this.f10485b.hashCode() * 31) + this.f10484a.hashCode();
    }

    @Override // W9.f
    public final List i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // W9.f
    public final boolean k(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("PrimitiveDescriptor("), this.f10484a, ')');
    }
}
