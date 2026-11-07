package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p172r1.b;
import p172r1.c;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewOutlineProvider f12229A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RectF f12230B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable[] f12231C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LayerDrawable f12232D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f12233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f12235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f12236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f12237y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Path f12238z;

    public ImageFilterView(Context context) {
        super(context);
        this.f12233u = new c();
        this.f12234v = true;
        this.f12235w = 0.0f;
        this.f12236x = 0.0f;
        this.f12237y = Float.NaN;
    }

    private void setOverlay(boolean z10) {
        this.f12234v = z10;
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22042f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    this.f12235w = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 8) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 7) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 6) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 4) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f12234v));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f12231C = drawableArr;
                drawableArr[0] = getDrawable();
                this.f12231C[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f12231C);
                this.f12232D = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f12235w * 255.0f));
                super.setImageDrawable(this.f12232D);
            }
        }
    }

    public float getBrightness() {
        return this.f12233u.f21408d;
    }

    public float getContrast() {
        return this.f12233u.f21410f;
    }

    public float getCrossfade() {
        return this.f12235w;
    }

    public float getRound() {
        return this.f12237y;
    }

    public float getRoundPercent() {
        return this.f12236x;
    }

    public float getSaturation() {
        return this.f12233u.f21409e;
    }

    public float getWarmth() {
        return this.f12233u.g;
    }

    public void setBrightness(float f3) {
        c cVar = this.f12233u;
        cVar.f21408d = f3;
        cVar.a(this);
    }

    public void setContrast(float f3) {
        c cVar = this.f12233u;
        cVar.f21410f = f3;
        cVar.a(this);
    }

    public void setCrossfade(float f3) {
        this.f12235w = f3;
        if (this.f12231C != null) {
            if (!this.f12234v) {
                this.f12232D.getDrawable(0).setAlpha((int) ((1.0f - this.f12235w) * 255.0f));
            }
            this.f12232D.getDrawable(1).setAlpha((int) (this.f12235w * 255.0f));
            super.setImageDrawable(this.f12232D);
        }
    }

    public void setRound(float f3) {
        if (Float.isNaN(f3)) {
            this.f12237y = f3;
            float f7 = this.f12236x;
            this.f12236x = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z10 = this.f12237y != f3;
        this.f12237y = f3;
        if (f3 != 0.0f) {
            if (this.f12238z == null) {
                this.f12238z = new Path();
            }
            if (this.f12230B == null) {
                this.f12230B = new RectF();
            }
            if (this.f12229A == null) {
                b bVar = new b(this, 1);
                this.f12229A = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f12230B.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f12238z.reset();
            Path path = this.f12238z;
            RectF rectF = this.f12230B;
            float f10 = this.f12237y;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f3) {
        boolean z10 = this.f12236x != f3;
        this.f12236x = f3;
        if (f3 != 0.0f) {
            if (this.f12238z == null) {
                this.f12238z = new Path();
            }
            if (this.f12230B == null) {
                this.f12230B = new RectF();
            }
            if (this.f12229A == null) {
                b bVar = new b(this, 0);
                this.f12229A = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f12236x) / 2.0f;
            this.f12230B.set(0.0f, 0.0f, width, height);
            this.f12238z.reset();
            this.f12238z.addRoundRect(this.f12230B, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f3) {
        c cVar = this.f12233u;
        cVar.f21409e = f3;
        cVar.a(this);
    }

    public void setWarmth(float f3) {
        c cVar = this.f12233u;
        cVar.g = f3;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12233u = new c();
        this.f12234v = true;
        this.f12235w = 0.0f;
        this.f12236x = 0.0f;
        this.f12237y = Float.NaN;
        a(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12233u = new c();
        this.f12234v = true;
        this.f12235w = 0.0f;
        this.f12236x = 0.0f;
        this.f12237y = Float.NaN;
        a(attributeSet);
    }
}
