package p120l9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19444b;

    public u(int i10, Object obj) {
        this.f19443a = i10;
        this.f19444b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f19443a == uVar.f19443a && j.a(this.f19444b, uVar.f19444b);
    }

    public final int hashCode() {
        int i10 = this.f19443a * 31;
        Object obj = this.f19444b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f19443a + ", value=" + this.f19444b + ')';
    }
}
