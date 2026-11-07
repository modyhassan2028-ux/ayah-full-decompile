package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import p172r1.a;
import p172r1.c;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RectF f12219A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable[] f12220B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LayerDrawable f12221C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12222D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f12223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f12224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f12225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f12226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Path f12227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewOutlineProvider f12228z;

    public ImageFilterButton(Context context) {
        super(context);
        this.f12223u = new c();
        this.f12224v = 0.0f;
        this.f12225w = 0.0f;
        this.f12226x = Float.NaN;
        this.f12222D = true;
        setPadding(0, 0, 0, 0);
    }

    private void setOverlay(boolean z10) {
        this.f12222D = z10;
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22042f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    this.f12224v = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f12222D));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f12220B = drawableArr;
                drawableArr[0] = getDrawable();
                this.f12220B[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f12220B);
                this.f12221C = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f12224v * 255.0f));
                super.setImageDrawable(this.f12221C);
            }
        }
    }

    public float getContrast() {
        return this.f12223u.f21410f;
    }

    public float getCrossfade() {
        return this.f12224v;
    }

    public float getRound() {
        return this.f12226x;
    }

    public float getRoundPercent() {
        return this.f12225w;
    }

    public float getSaturation() {
        return this.f12223u.f21409e;
    }

    public float getWarmth() {
        return this.f12223u.g;
    }

    public void setBrightness(float f3) {
        c cVar = this.f12223u;
        cVar.f21408d = f3;
        cVar.a(this);
    }

    public void setContrast(float f3) {
        c cVar = this.f12223u;
        cVar.f21410f = f3;
        cVar.a(this);
    }

    public void setCrossfade(float f3) {
        this.f12224v = f3;
        if (this.f12220B != null) {
            if (!this.f12222D) {
                this.f12221C.getDrawable(0).setAlpha((int) ((1.0f - this.f12224v) * 255.0f));
            }
            this.f12221C.getDrawable(1).setAlpha((int) (this.f12224v * 255.0f));
            super.setImageDrawable(this.f12221C);
        }
    }

    public void setRound(float f3) {
        if (Float.isNaN(f3)) {
            this.f12226x = f3;
            float f7 = this.f12225w;
            this.f12225w = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z10 = this.f12226x != f3;
        this.f12226x = f3;
        if (f3 != 0.0f) {
            if (this.f12227y == null) {
                this.f12227y = new Path();
            }
            if (this.f12219A == null) {
                this.f12219A = new RectF();
            }
            if (this.f12228z == null) {
                a aVar = new a(this, 1);
                this.f12228z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            this.f12219A.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f12227y.reset();
            Path path = this.f12227y;
            RectF rectF = this.f12219A;
            float f10 = this.f12226x;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f3) {
        boolean z10 = this.f12225w != f3;
        this.f12225w = f3;
        if (f3 != 0.0f) {
            if (this.f12227y == null) {
                this.f12227y = new Path();
            }
            if (this.f12219A == null) {
                this.f12219A = new RectF();
            }
            if (this.f12228z == null) {
                a aVar = new a(this, 0);
                this.f12228z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f12225w) / 2.0f;
            this.f12219A.set(0.0f, 0.0f, width, height);
            this.f12227y.reset();
            this.f12227y.addRoundRect(this.f12219A, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f3) {
        c cVar = this.f12223u;
        cVar.f21409e = f3;
        cVar.a(this);
    }

    public void setWarmth(float f3) {
        c cVar = this.f12223u;
        cVar.g = f3;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12223u = new c();
        this.f12224v = 0.0f;
        this.f12225w = 0.0f;
        this.f12226x = Float.NaN;
        this.f12222D = true;
        a(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12223u = new c();
        this.f12224v = 0.0f;
        this.f12225w = 0.0f;
        this.f12226x = Float.NaN;
        this.f12222D = true;
        a(attributeSet);
    }
}
