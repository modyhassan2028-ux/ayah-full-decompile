package p084i;

import K0.AbstractC0332a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class u extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0332a f16632a;

    public u(AbstractC0332a abstractC0332a) {
        this.f16632a = abstractC0332a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f16632a.m();
    }
}
