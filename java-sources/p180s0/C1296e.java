package p180s0;

import android.os.Build;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.platform.AndroidComposeView;
import p205v0.b;
import p205v0.d;
import p205v0.e;
import p205v0.f;
import p205v0.h;

/* JADX INFO: renamed from: s0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1296e implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f21822d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f21823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21824b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewLayerContainer f21825c;

    public C1296e(AndroidComposeView androidComposeView) {
        this.f21823a = androidComposeView;
    }

    @Override // p180s0.v
    public final void a(b bVar) {
        synchronized (this.f21824b) {
            if (!bVar.f23020s) {
                bVar.f23020s = true;
                bVar.b();
            }
        }
    }

    @Override // p180s0.v
    public final b b() {
        d hVar;
        b bVar;
        synchronized (this.f21824b) {
            try {
                AndroidComposeView androidComposeView = this.f21823a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    AbstractC1293b.b(androidComposeView);
                }
                if (i10 >= 29) {
                    hVar = new f();
                } else if (f21822d) {
                    try {
                        hVar = new e(this.f21823a, new p(), new p196u0.b());
                    } catch (Throwable unused) {
                        f21822d = false;
                        AndroidComposeView androidComposeView2 = this.f21823a;
                        ViewLayerContainer viewLayerContainer = this.f21825c;
                        if (viewLayerContainer == null) {
                            ViewLayerContainer viewLayerContainer2 = new ViewLayerContainer(androidComposeView2.getContext());
                            androidComposeView2.addView(viewLayerContainer2, -1);
                            this.f21825c = viewLayerContainer2;
                            viewLayerContainer = viewLayerContainer2;
                        }
                        hVar = new h(viewLayerContainer);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.f21823a;
                    ViewLayerContainer viewLayerContainer3 = this.f21825c;
                    if (viewLayerContainer3 == null) {
                        ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(androidComposeView3.getContext());
                        androidComposeView3.addView(viewLayerContainer4, -1);
                        this.f21825c = viewLayerContainer4;
                        viewLayerContainer3 = viewLayerContainer4;
                    }
                    hVar = new h(viewLayerContainer3);
                }
                bVar = new b(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
