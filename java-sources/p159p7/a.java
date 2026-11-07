package p159p7;

import H7.D;
import H7.E;
import H7.H;
import I1.S;
import N7.e;
import R7.i;
import R7.m;
import R7.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f21002A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f21003B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public WeakReference f21004C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public WeakReference f21005D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WeakReference f21006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f21007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final E f21008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f21009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f21010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f21011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f21012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f21013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f21014z;

    public a(Context context, b bVar) {
        e eVar;
        WeakReference weakReference = new WeakReference(context);
        this.f21006r = weakReference;
        H.e(context, H.f3448b, "Theme.MaterialComponents");
        this.f21009u = new Rect();
        E e10 = new E(this);
        this.f21008t = e10;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = e10.f3441a;
        textPaint.setTextAlign(align);
        c cVar = new c(context, bVar);
        this.f21010v = cVar;
        boolean zF = f();
        b bVar2 = cVar.f21041b;
        i iVar = new i(o.a(context, zF ? bVar2.f21037x.intValue() : bVar2.f21035v.intValue(), f() ? bVar2.f21038y.intValue() : bVar2.f21036w.intValue()).a());
        this.f21007s = iVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && e10.g != (eVar = new e(context2, bVar2.f21034u.intValue()))) {
            e10.c(eVar, context2);
            textPaint.setColor(bVar2.f21033t.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i10 = bVar2.f21017C;
        if (i10 != -2) {
            this.f21013y = ((int) Math.pow(10.0d, ((double) i10) - 1.0d)) - 1;
        } else {
            this.f21013y = bVar2.f21018D;
        }
        e10.f3445e = true;
        j();
        invalidateSelf();
        e10.f3445e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f21032s.intValue());
        if (iVar.f7325r.f7296c != colorStateListValueOf) {
            iVar.m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f21033t.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f21004C;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f21004C.get();
            WeakReference weakReference3 = this.f21005D;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(bVar2.f21025K.booleanValue(), false);
    }

    @Override // H7.D
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.f21010v;
        b bVar = cVar.f21041b;
        b bVar2 = cVar.f21041b;
        String str = bVar.f21015A;
        WeakReference weakReference = this.f21006r;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i10 = this.f21013y;
            if (i10 == -2 || e() <= i10) {
                return NumberFormat.getInstance(bVar2.f21019E).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f21019E, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i10), "+");
        }
        int i11 = bVar.f21017C;
        if (i11 == -2 || str == null || str.length() <= i11) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i11 - 1), "…");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        c cVar = this.f21010v;
        b bVar = cVar.f21041b;
        b bVar2 = cVar.f21041b;
        if (bVar.f21015A != null) {
            CharSequence charSequence = bVar.f21020F;
            return charSequence != null ? charSequence : cVar.f21041b.f21015A;
        }
        if (!g()) {
            return bVar2.f21021G;
        }
        if (bVar2.f21022H == 0 || (context = (Context) this.f21006r.get()) == null) {
            return null;
        }
        int i10 = this.f21013y;
        return (i10 == -2 || e() <= i10) ? context.getResources().getQuantityString(bVar2.f21022H, e(), Integer.valueOf(e())) : context.getString(bVar2.f21023I, Integer.valueOf(i10));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f21005D;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f21007s.draw(canvas);
        if (!f() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        E e10 = this.f21008t;
        e10.f3441a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f21012x - rect.exactCenterY();
        canvas.drawText(strB, this.f21011w, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), e10.f3441a);
    }

    public final int e() {
        int i10 = this.f21010v.f21041b.f21016B;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public final boolean f() {
        return this.f21010v.f21041b.f21015A != null || g();
    }

    public final boolean g() {
        b bVar = this.f21010v.f21041b;
        return bVar.f21015A == null && bVar.f21016B != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21010v.f21041b.f21039z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21009u.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21009u.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f21006r.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        c cVar = this.f21010v;
        this.f21007s.setShapeAppearanceModel(o.a(context, zF ? cVar.f21041b.f21037x.intValue() : cVar.f21041b.f21035v.intValue(), f() ? cVar.f21041b.f21038y.intValue() : cVar.f21041b.f21036w.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f21004C = new WeakReference(view);
        this.f21005D = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:113:0x027d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    public final void j() {
        float y10;
        float x9;
        float y11;
        float x10;
        float height;
        float width;
        float f3;
        WeakReference weakReference = this.f21006r;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f21004C;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f21009u;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f21005D;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        c cVar = this.f21010v;
        float f7 = zF ? cVar.f21043d : cVar.f21042c;
        this.f21014z = f7;
        if (f7 != -1.0f) {
            this.f21002A = f7;
            this.f21003B = f7;
        } else {
            this.f21002A = Math.round((f() ? cVar.g : cVar.f21044e) / 2.0f);
            this.f21003B = Math.round((f() ? cVar.f21046h : cVar.f21045f) / 2.0f);
        }
        if (f()) {
            String strB = b();
            float f10 = this.f21002A;
            E e10 = this.f21008t;
            this.f21002A = Math.max(f10, (e10.a(strB) / 2.0f) + cVar.f21041b.f21026L.intValue());
            float f11 = this.f21003B;
            if (e10.f3445e) {
                e10.b(strB);
                f3 = e10.f3444d;
            } else {
                f3 = e10.f3444d;
            }
            float fMax = Math.max(f11, (f3 / 2.0f) + cVar.f21041b.f21027M.intValue());
            this.f21003B = fMax;
            this.f21002A = Math.max(this.f21002A, fMax);
        }
        b bVar = cVar.f21041b;
        b bVar2 = cVar.f21041b;
        int i10 = cVar.f21048k;
        int iIntValue = bVar.f21029O.intValue();
        if (f()) {
            iIntValue = bVar.Q.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = p137n7.a.c(iIntValue, p137n7.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - bVar.T.intValue());
            }
        }
        if (i10 == 0) {
            iIntValue -= Math.round(this.f21003B);
        }
        int iIntValue2 = bVar.S.intValue() + iIntValue;
        int iIntValue3 = bVar2.f21024J.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f21012x = rect3.bottom - iIntValue2;
        } else {
            this.f21012x = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? bVar.f21030P.intValue() : bVar2.f21028N.intValue();
        if (i10 == 1) {
            iIntValue4 += f() ? cVar.j : cVar.f21047i;
        }
        int iIntValue5 = bVar.R.intValue() + iIntValue4;
        int iIntValue6 = bVar2.f21024J.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = S.f3689a;
            this.f21011w = view.getLayoutDirection() == 0 ? (rect3.left - this.f21002A) + iIntValue5 : (rect3.right + this.f21002A) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = S.f3689a;
            this.f21011w = view.getLayoutDirection() == 0 ? (rect3.right + this.f21002A) - iIntValue5 : (rect3.left - this.f21002A) + iIntValue5;
        }
        if (bVar.U.booleanValue()) {
            View viewD = d();
            if (viewD != null) {
                FrameLayout frameLayoutD = d();
                if (frameLayoutD == null || frameLayoutD.getId() != R.id.mtrl_anchor_parent) {
                    y10 = 0.0f;
                    x9 = 0.0f;
                } else if (viewD.getParent() instanceof View) {
                    y10 = viewD.getY();
                    x9 = viewD.getX();
                    viewD = (View) viewD.getParent();
                }
                y11 = viewD.getY() + (this.f21012x - this.f21003B) + y10;
                x10 = viewD.getX() + (this.f21011w - this.f21002A) + x9;
                if (viewD.getParent() instanceof View) {
                    height = ((this.f21012x + this.f21003B) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.f21011w + this.f21002A) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x9;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f21012x = Math.abs(y11) + this.f21012x;
                }
                if (x10 < 0.0f) {
                    this.f21011w = Math.abs(x10) + this.f21011w;
                }
                if (height > 0.0f) {
                    this.f21012x -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f21011w -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y12 = view.getY();
                x9 = view.getX();
                View view2 = (View) view.getParent();
                y10 = y12;
                viewD = view2;
                y11 = viewD.getY() + (this.f21012x - this.f21003B) + y10;
                x10 = viewD.getX() + (this.f21011w - this.f21002A) + x9;
                if (viewD.getParent() instanceof View) {
                    height = ((this.f21012x + this.f21003B) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.f21011w + this.f21002A) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x9;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f21012x = Math.abs(y11) + this.f21012x;
                }
                if (x10 < 0.0f) {
                    this.f21011w = Math.abs(x10) + this.f21011w;
                }
                if (height > 0.0f) {
                    this.f21012x -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f21011w -= Math.abs(width);
                }
            }
        }
        float f12 = this.f21011w;
        float f13 = this.f21012x;
        float f14 = this.f21002A;
        float f15 = this.f21003B;
        rect2.set((int) (f12 - f14), (int) (f13 - f15), (int) (f12 + f14), (int) (f13 + f15));
        float f16 = this.f21014z;
        i iVar = this.f21007s;
        if (f16 != -1.0f) {
            m mVarG = iVar.f7325r.f7294a.g();
            mVarG.b(f16);
            iVar.setShapeAppearanceModel(mVarG.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        iVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, H7.D
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f21010v;
        cVar.f21040a.f21039z = i10;
        cVar.f21041b.f21039z = i10;
        this.f21008t.f3441a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
