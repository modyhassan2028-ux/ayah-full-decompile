package p104k1;

import java.util.UUID;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f18903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f18904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f18905u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18906r;

    static {
        int i10 = 0;
        f18903s = new c(i10, 0);
        f18904t = new c(i10, 1);
        f18905u = new c(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f18906r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f18906r) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
