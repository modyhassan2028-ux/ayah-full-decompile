package C2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f708r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f709s;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f708r) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g((Context) this.f709s, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.f709s).run();
                break;
        }
    }
}
