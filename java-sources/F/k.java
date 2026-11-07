package F;

import Z.X;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f2060s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(X x9, int i10) {
        super(0);
        this.f2059r = i10;
        this.f2060s = x9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f2059r) {
            case 0:
                return new h((p241y9.c) this.f2060s.getValue());
            case 1:
                return (i) ((p241y9.a) this.f2060s.getValue()).invoke();
            case 2:
                return new p171r0.c(((p171r0.c) this.f2060s.getValue()).f21387a);
            case 3:
                X x9 = this.f2060s;
                if (x9 != null) {
                    return (List) x9.getValue();
                }
                return null;
            case 4:
                Boolean bool = (Boolean) this.f2060s.getValue();
                bool.booleanValue();
                return bool;
            default:
                return (V.e) this.f2060s.getValue();
        }
    }
}
