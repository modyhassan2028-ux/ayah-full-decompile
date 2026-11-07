package Y9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements W9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9.f f10457a;

    public E(W9.f fVar) {
        this.f10457a = fVar;
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        Integer numS0 = H9.v.S0(str);
        if (numS0 != null) {
            return numS0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // W9.f
    public final va.g c() {
        return W9.i.f9680d;
    }

    @Override // W9.f
    public final int d() {
        return 1;
    }

    @Override // W9.f
    public final String e(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return p251z9.j.a(this.f10457a, e10.f10457a) && p251z9.j.a(b(), e10.b());
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
        return b().hashCode() + (this.f10457a.hashCode() * 31);
    }

    @Override // W9.f
    public final List i(int i10) {
        if (i10 >= 0) {
            return p120l9.r.f19440r;
        }
        StringBuilder sbW = p123m2.c.w(i10, "Illegal index ", ", ");
        sbW.append(b());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        if (i10 >= 0) {
            return this.f10457a;
        }
        StringBuilder sbW = p123m2.c.w(i10, "Illegal index ", ", ");
        sbW.append(b());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @Override // W9.f
    public final boolean k(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbW = p123m2.c.w(i10, "Illegal index ", ", ");
        sbW.append(b());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f10457a + ')';
    }
}
