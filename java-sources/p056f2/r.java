package p056f2;

import android.os.Bundle;
import androidx.lifecycle.K;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0947u f16115a;

    public r(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        this.f16115a = abstractComponentCallbacksC0947u;
    }

    public final void a() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16115a;
        abstractComponentCallbacksC0947u.f16158k0.H();
        K.c(abstractComponentCallbacksC0947u);
        Bundle bundle = abstractComponentCallbacksC0947u.f16162s;
        abstractComponentCallbacksC0947u.f16158k0.I(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
