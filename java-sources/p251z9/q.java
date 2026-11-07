package p251z9;

import F9.b;
import F9.f;
import android.support.v4.media.session.p;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends c implements f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f24881x;

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f24881x = (i10 & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return c().equals(qVar.c()) && this.f24872u.equals(qVar.f24872u) && this.f24873v.equals(qVar.f24873v) && j.a(this.f24870s, qVar.f24870s);
        }
        if (obj instanceof f) {
            return obj.equals(f());
        }
        return false;
    }

    public final b f() {
        if (this.f24881x) {
            return this;
        }
        b bVar = this.f24869r;
        if (bVar != null) {
            return bVar;
        }
        b bVarB = b();
        this.f24869r = bVarB;
        return bVarB;
    }

    public final int hashCode() {
        return this.f24873v.hashCode() + a.x(this.f24872u, c().hashCode() * 31, 31);
    }

    public final String toString() {
        b bVarF = f();
        return bVarF != this ? bVarF.toString() : p.B(new StringBuilder("property "), this.f24872u, " (Kotlin reflection is not available)");
    }
}
