package O;

import Z.L0;
import p223x.C1424m;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L0 f6272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(L0 l10, int i10) {
        super(0);
        this.f6271r = i10;
        this.f6272s = l10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f6271r;
        L0 l10 = this.f6272s;
        switch (i10) {
            case 0:
                return new p171r0.c(((p171r0.c) l10.getValue()).f21387a);
            case 1:
                C1424m c1424m = B.f6273a;
                return new p171r0.c(((p171r0.c) l10.getValue()).f21387a);
            case 2:
                return Boolean.valueOf(((Number) l10.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) l10.getValue()).floatValue() > 0.0f);
        }
    }
}
