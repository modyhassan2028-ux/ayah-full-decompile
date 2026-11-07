package p140o;

import I1.AbstractC0245c;
import X4.c;
import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0245c implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f20186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionProvider f20187c;

    public n(r rVar, ActionProvider actionProvider) {
        this.f20187c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        c cVar = this.f20186b;
        if (cVar != null) {
            k kVar = ((m) cVar.f9953r).f20173n;
            kVar.f20140h = true;
            kVar.p(true);
        }
    }
}
