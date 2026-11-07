package A;

import Z.C0672b;
import Z.InterfaceC0687i0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017f extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0017f f231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0017f f232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0017f f233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0017f f234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0017f f235w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f236r;

    static {
        int i10 = 1;
        f231s = new C0017f(i10, 0);
        f232t = new C0017f(i10, 1);
        f233u = new C0017f(i10, 2);
        f234v = new C0017f(i10, 3);
        f235w = new C0017f(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0017f(int i10, int i11) {
        super(i10);
        this.f236r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f236r) {
            case 0:
                Z.M0 m10 = AndroidCompositionLocals_androidKt.f12063b;
                p074h0.h hVar = (p074h0.h) ((InterfaceC0687i0) obj);
                hVar.getClass();
                if (((Context) C0672b.s(hVar, m10)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0019g.f241b;
                }
                InterfaceC0015e.f226a.getClass();
                return C0013d.f216c;
            case 1:
                long j = ((p171r0.c) obj).f21387a;
                return p110k9.y.f19095a;
            case 2:
                return Boolean.TRUE;
            case 3:
                ((Number) obj).longValue();
                return p110k9.y.f19095a;
            default:
                return Boolean.valueOf(!(((D0.v) obj).f1139i == 2));
        }
    }
}
