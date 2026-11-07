package E2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f1829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1830f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f1828d;
        if (i10 >= 0) {
            this.f1828d = -1;
            recyclerView.U(i10);
            this.f1830f = false;
            return;
        }
        if (!this.f1830f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.f1829e;
        if (interpolator != null && this.f1827c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f1827c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f12917v0.c(this.f1825a, this.f1826b, i11, interpolator);
        int i12 = this.g + 1;
        this.g = i12;
        if (i12 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1830f = false;
    }
}
