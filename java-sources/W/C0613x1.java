package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: W.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613x1 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613x1(int i10) {
        super(2);
        this.f9454r = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0616y1.a(C0672b.y(this.f9454r | 1), (C0698o) obj);
        return p110k9.y.f19095a;
    }
}
