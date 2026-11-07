package p223x;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24040b;

    public m0(Object obj, Object obj2) {
        this.f24039a = obj;
        this.f24040b = obj2;
    }

    @Override // p223x.l0
    public final Object a() {
        return this.f24039a;
    }

    @Override // p223x.l0
    public final boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    @Override // p223x.l0
    public final Object c() {
        return this.f24040b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return j.a(this.f24039a, l0Var.a()) && j.a(this.f24040b, l0Var.c());
    }

    public final int hashCode() {
        Object obj = this.f24039a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f24040b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
