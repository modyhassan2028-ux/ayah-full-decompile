package p151p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f20636a;

    public C1230a(ActionBarContainer actionBarContainer) {
        this.f20636a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f20636a;
        if (actionBarContainer.f11427y) {
            Drawable drawable = actionBarContainer.f11426x;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f11424v;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f11425w;
        if (drawable3 == null || !actionBarContainer.f11428z) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f20636a;
        if (actionBarContainer.f11427y) {
            if (actionBarContainer.f11426x != null) {
                actionBarContainer.f11424v.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f11424v;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
