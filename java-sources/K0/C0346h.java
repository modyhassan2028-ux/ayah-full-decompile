package K0;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: K0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0346h implements InterfaceC0355l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f5075a;

    public C0346h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        p251z9.j.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f5075a = (ClipboardManager) systemService;
    }
}
