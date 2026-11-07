package J7;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.ayah.R;
import p020c.C0776a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f4366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0776a f4371f;

    public a(View view) {
        this.f4367b = view;
        Context context = view.getContext();
        this.f4366a = p050e8.b.T(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4368c = p050e8.b.S(context, R.attr.motionDurationMedium2, 300);
        this.f4369d = p050e8.b.S(context, R.attr.motionDurationShort3, 150);
        this.f4370e = p050e8.b.S(context, R.attr.motionDurationShort2, 100);
    }

    public final C0776a a() {
        if (this.f4371f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0776a c0776a = this.f4371f;
        this.f4371f = null;
        return c0776a;
    }
}
