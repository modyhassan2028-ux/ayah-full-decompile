package F;

import G.C0173g;
import G.C0175i;
import G.a0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0153b f2056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f2057d;

    public i(A a9, h hVar, C0153b c0153b, a0 a0Var) {
        this.f2054a = a9;
        this.f2055b = hVar;
        this.f2056c = c0153b;
        this.f2057d = a0Var;
    }

    public final Object a(int i10) {
        h hVar = this.f2055b;
        hVar.getClass();
        C0175i c0175iE = hVar.f2052a.e(i10);
        return ((p241y9.c) c0175iE.f2702c.f11365t).e(Integer.valueOf(i10 - c0175iE.f2700a));
    }

    public final int b() {
        h hVar = this.f2055b;
        hVar.getClass();
        return hVar.f2052a.f2654b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(int i10) {
        Object obj;
        Object objE;
        a0 a0Var = this.f2057d;
        Object[] objArr = (Object[]) a0Var.f2656d;
        int i11 = i10 - a0Var.f2654b;
        if (i11 >= 0) {
            p251z9.j.e(objArr, "<this>");
            if (i11 <= objArr.length - 1) {
                obj = objArr[i11];
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        h hVar = this.f2055b;
        hVar.getClass();
        C0175i c0175iE = hVar.f2052a.e(i10);
        int i12 = i10 - c0175iE.f2700a;
        p241y9.c cVar = (p241y9.c) c0175iE.f2702c.f11364s;
        return (cVar == null || (objE = cVar.e(Integer.valueOf(i12))) == null) ? new C0173g(i10) : objE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return p251z9.j.a(this.f2055b, ((i) obj).f2055b);
    }

    public final int hashCode() {
        return this.f2055b.hashCode();
    }
}
