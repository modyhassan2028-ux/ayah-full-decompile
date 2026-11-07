package p151p;

import Z0.B;
import android.content.Context;
import android.view.View;
import com.ayah.R;
import p140o.C;
import p140o.k;
import p140o.s;
import p140o.u;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240f extends u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20657l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1250k f20658m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240f(C1250k c1250k, Context context, k kVar, View view) {
        super(context, kVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f20658m = c1250k;
        this.f20202f = 8388613;
        B b5 = c1250k.f20705O;
        this.f20203h = b5;
        s sVar = this.f20204i;
        if (sVar != null) {
            sVar.h(b5);
        }
    }

    @Override // p140o.u
    public final void c() {
        switch (this.f20657l) {
            case 0:
                C1250k c1250k = this.f20658m;
                c1250k.f20702L = null;
                c1250k.f20706P = 0;
                super.c();
                break;
            default:
                C1250k c1250k2 = this.f20658m;
                k kVar = c1250k2.f20709t;
                if (kVar != null) {
                    kVar.c(true);
                }
                c1250k2.f20701K = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240f(C1250k c1250k, Context context, C c10, View view) {
        super(context, c10, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f20658m = c1250k;
        if ((c10.f20074A.f20183x & 32) != 32) {
            View view2 = c1250k.f20691A;
            this.f20201e = view2 == null ? (View) c1250k.f20714y : view2;
        }
        B b5 = c1250k.f20705O;
        this.f20203h = b5;
        s sVar = this.f20204i;
        if (sVar != null) {
            sVar.h(b5);
        }
    }
}
