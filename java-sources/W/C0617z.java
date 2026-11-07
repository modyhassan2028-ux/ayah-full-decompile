package W;

import D.AbstractC0071n;
import Z.C0698o;

/* JADX INFO: renamed from: W.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0617z extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f9470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f9471s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617z(float f3, float f7) {
        super(2);
        this.f9470r = f3;
        this.f9471s = f7;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            AbstractC0071n.a(androidx.compose.foundation.layout.c.k(l0.o.f19333a, this.f9470r, this.f9471s), c0698o, 0);
        }
        return p110k9.y.f19095a;
    }
}
