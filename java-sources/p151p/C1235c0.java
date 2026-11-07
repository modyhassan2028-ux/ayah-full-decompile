package p151p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: p.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1235c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f20641l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f20642m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20644b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20645c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20646d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20647e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f20648f = new int[0];
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f20649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f20650i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z f20651k;

    public C1235c0(TextView textView) {
        this.f20650i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20651k = new C1231a0();
        } else {
            this.f20651k = new Z();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f20642m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f20644b) {
                if (this.f20650i.getMeasuredHeight() <= 0 || this.f20650i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f20651k.b(this.f20650i) ? 1048576 : (this.f20650i.getMeasuredWidth() - this.f20650i.getTotalPaddingLeft()) - this.f20650i.getTotalPaddingRight();
                int height = (this.f20650i.getHeight() - this.f20650i.getCompoundPaddingBottom()) - this.f20650i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f20641l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f20650i.getTextSize()) {
                            g(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f20644b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f20648f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f20648f[i13];
            TextView textView = this.f20650i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f20649h;
            if (textPaint == null) {
                this.f20649h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f20649h.set(textView.getPaint());
            this.f20649h.setTextSize(i14);
            StaticLayout staticLayoutA = Y.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, textView, this.f20649h, this.f20651k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f20648f[i11];
    }

    public final boolean f() {
        return j() && this.f20643a != 0;
    }

    public final void g(int i10, float f3) {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i10, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f20650i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f20644b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f20643a == 1) {
            if (!this.g || this.f20648f.length == 0) {
                int iFloor = ((int) Math.floor((this.f20647e - this.f20646d) / this.f20645c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f20645c) + this.f20646d);
                }
                this.f20648f = b(iArr);
            }
            this.f20644b = true;
        } else {
            this.f20644b = false;
        }
        return this.f20644b;
    }

    public final boolean i() {
        int[] iArr = this.f20648f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.g = z10;
        if (z10) {
            this.f20643a = 1;
            this.f20646d = iArr[0];
            this.f20647e = iArr[length - 1];
            this.f20645c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f20650i instanceof AppCompatEditText);
    }

    public final void k(float f3, float f7, float f10) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f7 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f20643a = 1;
        this.f20646d = f3;
        this.f20647e = f7;
        this.f20645c = f10;
        this.g = false;
    }
}
