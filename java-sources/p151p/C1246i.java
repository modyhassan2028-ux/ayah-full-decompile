package p151p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.ayah.R;
import p017b7.g;
import p140o.C1228b;

/* JADX INFO: renamed from: p.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1246i extends AppCompatImageView implements InterfaceC1252l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1250k f20673u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246i(C1250k c1250k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f20673u = c1250k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g.r0(this, getContentDescription());
        setOnTouchListener(new C1228b(this, this, 1));
    }

    @Override // p151p.InterfaceC1252l
    public final boolean b() {
        return false;
    }

    @Override // p151p.InterfaceC1252l
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f20673u.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
