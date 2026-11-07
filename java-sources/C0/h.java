package C0;

import D0.AbstractC0090h;
import G.L;
import G.h0;
import J0.B0;
import J0.C0;
import J0.InterfaceC0290m;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import l0.q;
import p162q0.t;
import p251z9.j;
import p251z9.k;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f687s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(v vVar, int i10) {
        super(1);
        this.f686r = i10;
        this.f687s = vVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f686r;
        boolean z10 = false;
        v vVar = this.f687s;
        switch (i10) {
            case 0:
                InterfaceC0290m interfaceC0290m = (C0) obj;
                if (((q) interfaceC0290m).f19339r.f19338E) {
                    vVar.f24886r = interfaceC0290m;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                AbstractC0090h abstractC0090h = (AbstractC0090h) obj;
                Object obj2 = vVar.f24886r;
                if (obj2 == null && abstractC0090h.f1104H) {
                    vVar.f24886r = abstractC0090h;
                } else if (obj2 != null) {
                    abstractC0090h.getClass();
                }
                return Boolean.TRUE;
            case 2:
                C0 c10 = (C0) obj;
                j.c(c10, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                L l10 = ((h0) c10).f2699F;
                List listM = (List) vVar.f24886r;
                if (listM != null) {
                    listM.add(l10);
                } else {
                    listM = AbstractC0813f2.M(l10);
                }
                vVar.f24886r = listM;
                return B0.f3879s;
            default:
                vVar.f24886r = (t) obj;
                return Boolean.TRUE;
        }
    }
}
