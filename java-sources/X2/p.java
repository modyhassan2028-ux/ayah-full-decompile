package X2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.internal.measurement.B1;
import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final PorterDuff.Mode f9923A = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f9924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f9925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorFilter f9926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f9929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Matrix f9930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f9931z;

    public p() {
        this.f9928w = true;
        this.f9929x = new float[9];
        this.f9930y = new Matrix();
        this.f9931z = new Rect();
        n nVar = new n();
        nVar.f9914c = null;
        nVar.f9915d = f9923A;
        nVar.f9913b = new m();
        this.f9924s = nVar;
    }

    public static p a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            p pVar = new p();
            ThreadLocal threadLocal = p244z1.j.f24770a;
            pVar.f9876r = resources.getDrawable(i10, theme);
            new o(pVar.f9876r.getConstantState());
            return pVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            p pVar2 = new p();
            pVar2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
            return pVar2;
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9876r;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f9931z;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f9926u;
        if (colorFilter == null) {
            colorFilter = this.f9925t;
        }
        Matrix matrix = this.f9930y;
        canvas.getMatrix(matrix);
        float[] fArr = this.f9929x;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f9924s;
        Bitmap bitmap = nVar.f9917f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f9917f.getHeight()) {
            nVar.f9917f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f9920k = true;
        }
        if (this.f9928w) {
            n nVar2 = this.f9924s;
            if (nVar2.f9920k || nVar2.g != nVar2.f9914c || nVar2.f9918h != nVar2.f9915d || nVar2.j != nVar2.f9916e || nVar2.f9919i != nVar2.f9913b.getRootAlpha()) {
                n nVar3 = this.f9924s;
                nVar3.f9917f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f9917f);
                m mVar = nVar3.f9913b;
                mVar.a(mVar.g, m.f9898p, canvas2, iMin, iMin2);
                n nVar4 = this.f9924s;
                nVar4.g = nVar4.f9914c;
                nVar4.f9918h = nVar4.f9915d;
                nVar4.f9919i = nVar4.f9913b.getRootAlpha();
                nVar4.j = nVar4.f9916e;
                nVar4.f9920k = false;
            }
        } else {
            n nVar5 = this.f9924s;
            nVar5.f9917f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f9917f);
            m mVar2 = nVar5.f9913b;
            mVar2.a(mVar2.g, m.f9898p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f9924s;
        if (nVar6.f9913b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f9921l == null) {
                Paint paint2 = new Paint();
                nVar6.f9921l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f9921l.setAlpha(nVar6.f9913b.getRootAlpha());
            nVar6.f9921l.setColorFilter(colorFilter);
            paint = nVar6.f9921l;
        }
        canvas.drawBitmap(nVar6.f9917f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getAlpha() : this.f9924s.f9913b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f9924s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getColorFilter() : this.f9926u;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9876r != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f9876r.getConstantState());
        }
        this.f9924s.f9912a = getChangingConfigurations();
        return this.f9924s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f9924s.f9913b.f9906i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f9924s.f9913b.f9905h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.isAutoMirrored() : this.f9924s.f9916e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f9924s;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f9913b;
        if (mVar.f9910n == null) {
            mVar.f9910n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.f9910n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f9924s.f9914c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f9927v && super.mutate() == this) {
            n nVar = this.f9924s;
            n nVar2 = new n();
            nVar2.f9914c = null;
            nVar2.f9915d = f9923A;
            if (nVar != null) {
                nVar2.f9912a = nVar.f9912a;
                m mVar = new m(nVar.f9913b);
                nVar2.f9913b = mVar;
                if (nVar.f9913b.f9903e != null) {
                    mVar.f9903e = new Paint(nVar.f9913b.f9903e);
                }
                if (nVar.f9913b.f9902d != null) {
                    nVar2.f9913b.f9902d = new Paint(nVar.f9913b.f9902d);
                }
                nVar2.f9914c = nVar.f9914c;
                nVar2.f9915d = nVar.f9915d;
                nVar2.f9916e = nVar.f9916e;
            }
            this.f9924s = nVar2;
            this.f9927v = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f9924s;
        ColorStateList colorStateList = nVar.f9914c;
        if (colorStateList == null || (mode = nVar.f9915d) == null) {
            z10 = false;
        } else {
            this.f9925t = b(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        m mVar = nVar.f9913b;
        if (mVar.f9910n == null) {
            mVar.f9910n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.f9910n.booleanValue()) {
            boolean zB = nVar.f9913b.g.b(iArr);
            nVar.f9920k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f9924s.f9913b.getRootAlpha() != i10) {
            this.f9924s.f9913b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f9924s.f9916e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9926u = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            B1.I(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f9924s;
        if (nVar.f9914c != colorStateList) {
            nVar.f9914c = colorStateList;
            this.f9925t = b(colorStateList, nVar.f9915d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f9924s;
        if (nVar.f9915d != mode) {
            nVar.f9915d = mode;
            this.f9925t = b(nVar.f9914c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f9876r;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f9876r;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f9924s;
        nVar.f9913b = new m();
        TypedArray typedArrayI = p244z1.a.i(resources, theme, attributeSet, a.f9853a);
        n nVar2 = this.f9924s;
        m mVar = nVar2.f9913b;
        int i14 = !p244z1.a.f(xmlPullParser, "tintMode") ? -1 : typedArrayI.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (i14 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i14 != 5) {
            if (i14 != 9) {
                switch (i14) {
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f9915d = mode;
        ColorStateList colorStateListC = p244z1.a.c(typedArrayI, xmlPullParser, theme);
        if (colorStateListC != null) {
            nVar2.f9914c = colorStateListC;
        }
        boolean z10 = nVar2.f9916e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayI.getBoolean(5, z10);
        }
        nVar2.f9916e = z10;
        float f3 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f3 = typedArrayI.getFloat(7, f3);
        }
        mVar.j = f3;
        float f7 = mVar.f9907k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f7 = typedArrayI.getFloat(8, f7);
        }
        mVar.f9907k = f7;
        if (mVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 > 0.0f) {
            mVar.f9905h = typedArrayI.getDimension(3, mVar.f9905h);
            int i16 = 2;
            float dimension = typedArrayI.getDimension(2, mVar.f9906i);
            mVar.f9906i = dimension;
            if (mVar.f9905h <= 0.0f) {
                throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayI.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = typedArrayI.getString(0);
                if (string != null) {
                    mVar.f9909m = string;
                    mVar.f9911o.put(string, mVar);
                }
                typedArrayI.recycle();
                nVar.f9912a = getChangingConfigurations();
                int i17 = 1;
                nVar.f9920k = true;
                n nVar3 = this.f9924s;
                m mVar2 = nVar3.f9913b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.g;
                C1350e c1350e = mVar2.f9911o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
                    if (eventType == i16) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.f9878e = 0.0f;
                            iVar.g = 1.0f;
                            iVar.f9880h = 1.0f;
                            iVar.f9881i = 0.0f;
                            iVar.j = 1.0f;
                            iVar.f9882k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f9883l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f9884m = join2;
                            iVar.f9885n = 4.0f;
                            TypedArray typedArrayI2 = p244z1.a.i(resources, theme, attributeSet, a.f9855c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayI2.getString(0);
                                if (string2 != null) {
                                    iVar.f9896b = string2;
                                }
                                String string3 = typedArrayI2.getString(2);
                                if (string3 != null) {
                                    iVar.f9895a = B0.c.u(string3);
                                }
                                iVar.f9879f = p244z1.a.d(typedArrayI2, xmlPullParser, theme, "fillColor", 1);
                                float f10 = iVar.f9880h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f10 = typedArrayI2.getFloat(12, f10);
                                }
                                iVar.f9880h = f10;
                                int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayI2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f9883l;
                                if (i18 == 0) {
                                    cap = cap2;
                                } else if (i18 != 1) {
                                    cap = i18 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f9883l = cap;
                                int i19 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayI2.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f9884m;
                                if (i19 == 0) {
                                    join = join2;
                                } else if (i19 != 1) {
                                    join = i19 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f9884m = join;
                                float f11 = iVar.f9885n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f11 = typedArrayI2.getFloat(10, f11);
                                }
                                iVar.f9885n = f11;
                                iVar.f9877d = p244z1.a.d(typedArrayI2, xmlPullParser, theme, "strokeColor", 3);
                                float f12 = iVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f12 = typedArrayI2.getFloat(11, f12);
                                }
                                iVar.g = f12;
                                float f13 = iVar.f9878e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f13 = typedArrayI2.getFloat(4, f13);
                                }
                                iVar.f9878e = f13;
                                float f14 = iVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f14 = typedArrayI2.getFloat(6, f14);
                                }
                                iVar.j = f14;
                                float f15 = iVar.f9882k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f15 = typedArrayI2.getFloat(7, f15);
                                }
                                iVar.f9882k = f15;
                                float f16 = iVar.f9881i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f16 = typedArrayI2.getFloat(5, f16);
                                }
                                iVar.f9881i = f16;
                                int i20 = iVar.f9897c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i20 = typedArrayI2.getInt(13, i20);
                                }
                                iVar.f9897c = i20;
                            }
                            typedArrayI2.recycle();
                            jVar2.f9887b.add(iVar);
                            if (iVar.getPathName() != null) {
                                c1350e.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f9912a = nVar3.f9912a;
                            i13 = 1;
                            z11 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayI3 = p244z1.a.i(resources, theme, attributeSet, a.f9856d);
                                    String string4 = typedArrayI3.getString(0);
                                    if (string4 != null) {
                                        hVar.f9896b = string4;
                                    }
                                    String string5 = typedArrayI3.getString(1);
                                    if (string5 != null) {
                                        hVar.f9895a = B0.c.u(string5);
                                    }
                                    hVar.f9897c = !p244z1.a.f(xmlPullParser, "fillType") ? 0 : typedArrayI3.getInt(2, 0);
                                    typedArrayI3.recycle();
                                }
                                jVar2.f9887b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    c1350e.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f9912a = nVar3.f9912a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray typedArrayI4 = p244z1.a.i(resources, theme, attributeSet, a.f9854b);
                                float f17 = jVar3.f9888c;
                                if (p244z1.a.f(xmlPullParser, "rotation")) {
                                    f17 = typedArrayI4.getFloat(5, f17);
                                }
                                jVar3.f9888c = f17;
                                i13 = 1;
                                jVar3.f9889d = typedArrayI4.getFloat(1, jVar3.f9889d);
                                jVar3.f9890e = typedArrayI4.getFloat(2, jVar3.f9890e);
                                float f18 = jVar3.f9891f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f18 = typedArrayI4.getFloat(3, f18);
                                }
                                jVar3.f9891f = f18;
                                float f19 = jVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f19 = typedArrayI4.getFloat(4, f19);
                                }
                                jVar3.g = f19;
                                float f20 = jVar3.f9892h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f20 = typedArrayI4.getFloat(6, f20);
                                }
                                jVar3.f9892h = f20;
                                float f21 = jVar3.f9893i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f21 = typedArrayI4.getFloat(7, f21);
                                }
                                jVar3.f9893i = f21;
                                String string6 = typedArrayI4.getString(0);
                                if (string6 != null) {
                                    jVar3.f9894k = string6;
                                }
                                jVar3.c();
                                typedArrayI4.recycle();
                                jVar2.f9887b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    c1350e.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f9912a = nVar3.f9912a;
                            }
                            i13 = 1;
                        }
                        i12 = i13;
                        i11 = 3;
                    } else {
                        i10 = depth;
                        i11 = i15;
                        i12 = 1;
                        if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i15 = i11;
                    i17 = i12;
                    depth = i10;
                    i16 = 2;
                }
                if (!z11) {
                    this.f9925t = b(nVar.f9914c, nVar.f9915d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f9928w = true;
        this.f9929x = new float[9];
        this.f9930y = new Matrix();
        this.f9931z = new Rect();
        this.f9924s = nVar;
        this.f9925t = b(nVar.f9914c, nVar.f9915d);
    }
}
