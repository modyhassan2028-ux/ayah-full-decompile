package X2;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9863r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f9864s;

    public /* synthetic */ c() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f9863r) {
            case 0:
                ((e) this.f9864s).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f9863r) {
            case 0:
                ((e) this.f9864s).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f9864s;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f9863r) {
            case 0:
                ((e) this.f9864s).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f9864s;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public c(e eVar) {
        this.f9864s = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
