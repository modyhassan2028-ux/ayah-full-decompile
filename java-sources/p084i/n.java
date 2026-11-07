package p084i;

import android.view.Window;
import p140o.k;
import p140o.v;
import p151p.InterfaceC1237d0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1237d0, v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f16620r;

    public /* synthetic */ n(x xVar) {
        this.f16620r = xVar;
    }

    @Override // p140o.v
    public void b(k kVar, boolean z10) {
        w wVar;
        k kVarK = kVar.k();
        int i10 = 0;
        boolean z11 = kVarK != kVar;
        if (z11) {
            kVar = kVarK;
        }
        x xVar = this.f16620r;
        w[] wVarArr = xVar.f16674c0;
        int length = wVarArr != null ? wVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                wVar = wVarArr[i10];
                if (wVar != null && wVar.f16640h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                wVar = null;
                break;
            }
        }
        if (wVar != null) {
            if (!z11) {
                xVar.s(wVar, z10);
            } else {
                xVar.p(wVar.f16634a, wVar, kVarK);
                xVar.s(wVar, true);
            }
        }
    }

    @Override // p140o.v
    public boolean h(k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        x xVar = this.f16620r;
        if (!xVar.f16668W || (callback = xVar.f16653C.getCallback()) == null || xVar.f16679h0) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }
}
