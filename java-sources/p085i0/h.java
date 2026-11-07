package p085i0;

import java.util.LinkedHashMap;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f16725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f16726t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16727r;

    static {
        int i10 = 0;
        f16725s = new h(i10, 0);
        f16726t = new h(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f16727r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f16727r) {
            case 0:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
