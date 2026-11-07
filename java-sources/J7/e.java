package J7;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p020c.C0776a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4376b;

    public e(f fVar, b bVar) {
        this.f4376b = fVar;
        this.f4375a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f4376b.f4374a != null) {
            this.f4375a.d();
        }
    }

    public final void onBackInvoked() {
        this.f4375a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f4376b.f4374a != null) {
            this.f4375a.b(new C0776a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f4376b.f4374a != null) {
            this.f4375a.c(new C0776a(backEvent));
        }
    }
}
