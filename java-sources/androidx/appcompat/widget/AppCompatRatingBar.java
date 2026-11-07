package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.ayah.R;
import p151p.A;
import p151p.Y0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A f11532r;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f11532r.f20507c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Y0.a(this, getContext());
        A a9 = new A(this);
        this.f11532r = a9;
        a9.b(attributeSet, i10);
    }
}
