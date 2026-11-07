package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import i7.D;
import p085i0.n;
import t.a;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f11721w = {R.attr.colorBackground};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final D f11722x = new D(12);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f11725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f11726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n f11727v;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((a) ((Drawable) this.f11727v.f16733s)).f22499h;
    }

    public float getCardElevation() {
        return ((CardView) this.f11727v.f16734t).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f11725t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f11725t.left;
    }

    public int getContentPaddingRight() {
        return this.f11725t.right;
    }

    public int getContentPaddingTop() {
        return this.f11725t.top;
    }

    public float getMaxCardElevation() {
        return ((a) ((Drawable) this.f11727v.f16733s)).f22497e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f11724s;
    }

    public float getRadius() {
        return ((a) ((Drawable) this.f11727v.f16733s)).f22493a;
    }

    public boolean getUseCompatPadding() {
        return this.f11723r;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        a aVar = (a) ((Drawable) this.f11727v.f16733s);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f22499h = colorStateListValueOf;
        aVar.f22494b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f22499h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        ((CardView) this.f11727v.f16734t).setElevation(f3);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f11725t.set(i10, i11, i12, i13);
        f11722x.t(this.f11727v);
    }

    public void setMaxCardElevation(float f3) {
        f11722x.q(f3, this.f11727v);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f11724s) {
            this.f11724s = z10;
            n nVar = this.f11727v;
            f11722x.q(((a) ((Drawable) nVar.f16733s)).f22497e, nVar);
        }
    }

    public void setRadius(float f3) {
        a aVar = (a) ((Drawable) this.f11727v.f16733s);
        if (f3 == aVar.f22493a) {
            return;
        }
        aVar.f22493a = f3;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f11723r != z10) {
            this.f11723r = z10;
            n nVar = this.f11727v;
            f11722x.q(((a) ((Drawable) nVar.f16733s)).f22497e, nVar);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f11725t = rect;
        this.f11726u = new Rect();
        n nVar = new n(14, this);
        this.f11727v = nVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.a.f21768a, i10, com.ayah.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f11721w);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.ayah.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.ayah.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f11723r = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f11724s = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a(colorStateListValueOf, dimension);
        nVar.f16733s = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f11722x.q(dimension3, nVar);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        a aVar = (a) ((Drawable) this.f11727v.f16733s);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f22499h = colorStateList;
        aVar.f22494b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f22499h.getDefaultColor()));
        aVar.invalidateSelf();
    }
}
