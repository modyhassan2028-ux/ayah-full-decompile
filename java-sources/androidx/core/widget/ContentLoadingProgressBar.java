package androidx.core.widget;

import N1.b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f12345t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f12346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f12347s;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f12346r);
        removeCallbacks(this.f12347s);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f12346r);
        removeCallbacks(this.f12347s);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [N1.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [N1.b] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i10 = 0;
        this.f12346r = new Runnable(this) { // from class: N1.b

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f5973s;

            {
                this.f5973s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f5973s;
                switch (i11) {
                    case 0:
                        int i12 = ContentLoadingProgressBar.f12345t;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i13 = ContentLoadingProgressBar.f12345t;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f12347s = new Runnable(this) { // from class: N1.b

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f5973s;

            {
                this.f5973s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f5973s;
                switch (i12) {
                    case 0:
                        int i13 = ContentLoadingProgressBar.f12345t;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i14 = ContentLoadingProgressBar.f12345t;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
