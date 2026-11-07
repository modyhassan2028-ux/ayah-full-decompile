package Y9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C implements W9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9.f f10453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W9.f f10454b;

    public C(W9.f fVar, W9.f fVar2) {
        p251z9.j.e(fVar, "keyDesc");
        p251z9.j.e(fVar2, "valueDesc");
        this.f10453a = fVar;
        this.f10454b = fVar2;
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        Integer numS0 = H9.v.S0(str);
        if (numS0 != null) {
            return numS0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // W9.f
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // W9.f
    public final va.g c() {
        return W9.i.f9681e;
    }

    @Override // W9.f
    public final int d() {
        return 2;
    }

    @Override // W9.f
    public final String e(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return p251z9.j.a(this.f10453a, c10.f10453a) && p251z9.j.a(this.f10454b, c10.f10454b);
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
        return this.f10454b.hashCode() + ((this.f10453a.hashCode() + 710441009) * 31);
    }

    @Override // W9.f
    public final List i(int i10) {
        if (i10 >= 0) {
            return p120l9.r.f19440r;
        }
        throw new IllegalArgumentException(p245z2.a.B(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f10453a;
        }
        if (i11 == 1) {
            return this.f10454b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // W9.f
    public final boolean k(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(p245z2.a.B(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f10453a + ", " + this.f10454b + ')';
    }
}
