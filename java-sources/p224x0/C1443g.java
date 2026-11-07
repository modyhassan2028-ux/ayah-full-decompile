package p224x0;

import android.graphics.PathMeasure;
import p110k9.y;
import p180s0.C1301j;
import p241y9.a;
import p251z9.k;

/* JADX INFO: renamed from: x0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1443g extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1443g f24224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1443g f24225t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24226r;

    static {
        int i10 = 0;
        f24224s = new C1443g(i10, 0);
        f24225t = new C1443g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1443g(int i10, int i11) {
        super(i10);
        this.f24226r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f24226r) {
            case 0:
                return new C1301j(new PathMeasure());
            default:
                return y.f19095a;
        }
    }
}
