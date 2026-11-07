package p232y;

import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class L extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final L f24435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final L f24436t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24437r;

    static {
        int i10 = 0;
        f24435s = new L(i10, 0);
        f24436t = new L(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, int i11) {
        super(i10);
        this.f24437r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f24437r) {
            case 0:
                return C1468w.f24594a;
            case 1:
                return new W();
            default:
                return new j0(0);
        }
    }
}
