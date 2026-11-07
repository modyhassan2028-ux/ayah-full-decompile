package J7;

import android.window.OnBackInvokedCallback;
import p020c.z;
import p084i.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4373b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f4372a = i10;
        this.f4373b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4372a) {
            case 0:
                ((b) this.f4373b).a();
                break;
            case 1:
                ((z) this.f4373b).invoke();
                break;
            case 2:
                ((x) this.f4373b).F();
                break;
            case 3:
                p241y9.a aVar = (p241y9.a) this.f4373b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ((Runnable) this.f4373b).run();
                break;
        }
    }
}
