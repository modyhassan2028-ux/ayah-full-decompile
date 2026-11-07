package G7;

import R7.i;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f2916a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f2917b;

    public a(ShapeableImageView shapeableImageView) {
        this.f2917b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f2917b;
        if (shapeableImageView.f14948C == null) {
            return;
        }
        if (shapeableImageView.f14947B == null) {
            shapeableImageView.f14947B = new i(shapeableImageView.f14948C);
        }
        RectF rectF = shapeableImageView.f14959v;
        Rect rect = this.f2916a;
        rectF.round(rect);
        shapeableImageView.f14947B.setBounds(rect);
        shapeableImageView.f14947B.getOutline(outline);
    }
}
