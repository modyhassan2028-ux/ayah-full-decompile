package p151p;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20576r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f20577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f20578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f20579u;

    public N(TextView textView, Typeface typeface, int i10) {
        this.f20578t = textView;
        this.f20579u = typeface;
        this.f20577s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20576r) {
            case 0:
                ((TextView) this.f20578t).setTypeface((Typeface) this.f20579u, this.f20577s);
                break;
            default:
                ((BottomSheetBehavior) this.f20579u).O(this.f20578t, this.f20577s, false);
                break;
        }
    }

    public N(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f20579u = bottomSheetBehavior;
        this.f20578t = view;
        this.f20577s = i10;
    }
}
