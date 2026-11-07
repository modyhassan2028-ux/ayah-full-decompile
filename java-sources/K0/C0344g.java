package K0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: renamed from: K0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344g implements InterfaceC0353k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0346h f5073a;

    public C0344g(C0346h c0346h) {
        this.f5073a = c0346h;
    }

    public final void a(C0351j0 c0351j0) {
        ClipboardManager clipboardManager = this.f5073a.f5075a;
        if (c0351j0 != null) {
            clipboardManager.setPrimaryClip(c0351j0.f5084a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0341e0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
