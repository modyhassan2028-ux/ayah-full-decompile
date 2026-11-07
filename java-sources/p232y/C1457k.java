package p232y;

import J0.K;
import K0.AbstractC0359n0;
import R0.f;
import R0.j;
import R0.s;
import R0.u;
import R0.v;
import Z.C0672b;
import Z.InterfaceC0687i0;
import Z.M0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p074h0.h;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1457k extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1457k f24542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1457k f24543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1457k f24544u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1457k f24545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1457k f24546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1457k f24547x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24548r;

    static {
        int i10 = 1;
        f24542s = new C1457k(i10, 0);
        f24543t = new C1457k(i10, 1);
        f24544u = new C1457k(i10, 2);
        f24545v = new C1457k(i10, 3);
        f24546w = new C1457k(i10, 4);
        f24547x = new C1457k(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1457k(int i10, int i11) {
        super(i10);
        this.f24548r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f24548r;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                ((K) obj).a();
                return yVar;
            case 1:
                return yVar;
            case 2:
                ((Number) obj).longValue();
                return yVar;
            case 3:
                int i11 = AbstractC1454h.f24519a;
                M0 m10 = AndroidCompositionLocals_androidKt.f12063b;
                h hVar = (h) ((InterfaceC0687i0) obj);
                hVar.getClass();
                Context context = (Context) C0672b.s(hVar, m10);
                p063g1.c cVar = (p063g1.c) C0672b.s(hVar, AbstractC0359n0.f5118h);
                W w9 = (W) C0672b.s(hVar, X.f24464a);
                if (w9 == null) {
                    return null;
                }
                return new C1453g(context, cVar, w9.f24462a, w9.f24463b);
            case 4:
                f fVar = f.f7075d;
                F9.f[] fVarArr = u.f7181a;
                v vVar = s.f7158c;
                F9.f fVar2 = u.f7181a[1];
                vVar.a((j) obj, fVar);
                return yVar;
            default:
                return new j0(((Number) obj).intValue());
        }
    }
}
