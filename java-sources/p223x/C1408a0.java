package p223x;

import Aa.a;
import p123m2.c;
import p151p.C1256n;
import p151p.V;
import p251z9.j;

/* JADX INFO: renamed from: x.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1408a0 implements InterfaceC1435y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23936c;

    public C1408a0(float f3, float f7, Object obj) {
        this.f23934a = f3;
        this.f23935b = f7;
        this.f23936c = obj;
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        Object c1256n;
        Object obj = this.f23936c;
        AbstractC1427p abstractC1427p = obj == null ? null : (AbstractC1427p) v0Var.f24111a.e(obj);
        int[] iArr = y0.f24125a;
        float f3 = this.f23934a;
        float f7 = this.f23935b;
        if (abstractC1427p != null) {
            c1256n = new C1256n(abstractC1427p, f3, f7);
        } else {
            V v10 = new V();
            v10.f20603r = new A(f3, f7, 0.01f);
            c1256n = v10;
        }
        V v11 = new V();
        v11.f20603r = new a(c1256n);
        return v11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1408a0) {
            C1408a0 c1408a0 = (C1408a0) obj;
            if (c1408a0.f23934a == this.f23934a && c1408a0.f23935b == this.f23935b && j.a(c1408a0.f23936c, this.f23936c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f23936c;
        return Float.floatToIntBits(this.f23935b) + c.n((obj != null ? obj.hashCode() : 0) * 31, this.f23934a, 31);
    }

    public /* synthetic */ C1408a0(int i10, Object obj) {
        this(1.0f, 1500.0f, (i10 & 4) != 0 ? null : obj);
    }
}
