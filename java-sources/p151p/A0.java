package p151p;

import O1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.ayah.R;
import java.lang.reflect.Method;
import p140o.A;

/* JADX INFO: loaded from: classes.dex */
public class A0 implements A {
    public static final Method R;
    public static final Method S;
    public static final Method T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20508A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f20509B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f20510C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f20511D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public a f20512E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f20513F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AdapterView.OnItemClickListener f20514G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f20515H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final RunnableC1276x0 f20516I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ViewOnTouchListenerC1280z0 f20517J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C1278y0 f20518K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RunnableC1276x0 f20519L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Handler f20520M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Rect f20521N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Rect f20522O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f20523P;
    public final C1279z Q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f20524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ListAdapter f20525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1261p0 f20526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f20531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20532z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                S = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public A0(Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    @Override // p140o.A
    public final boolean a() {
        return this.Q.isShowing();
    }

    public final int b() {
        return this.f20529w;
    }

    @Override // p140o.A
    public final void d() {
        int i10;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        C1261p0 c1261p0;
        C1261p0 c1261p1 = this.f20526t;
        Context context = this.f20524r;
        C1279z c1279z = this.Q;
        int i11 = 0;
        if (c1261p1 == null) {
            C1261p0 c1261p0Q = q(context, !this.f20523P);
            this.f20526t = c1261p0Q;
            c1261p0Q.setAdapter(this.f20525s);
            this.f20526t.setOnItemClickListener(this.f20514G);
            this.f20526t.setFocusable(true);
            this.f20526t.setFocusableInTouchMode(true);
            this.f20526t.setOnItemSelectedListener(new C1270u0(i11, this));
            this.f20526t.setOnScrollListener(this.f20518K);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f20515H;
            if (onItemSelectedListener != null) {
                this.f20526t.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1279z.setContentView(this.f20526t);
        }
        Drawable background = c1279z.getBackground();
        Rect rect = this.f20521N;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i10 = rect.bottom + i12;
            if (!this.f20532z) {
                this.f20530x = -i12;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z10 = c1279z.getInputMethodMode() == 2;
        View view = this.f20513F;
        int i13 = this.f20530x;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = S;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c1279z, view, Integer.valueOf(i13), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = c1279z.getMaxAvailableHeight(view, i13);
                }
            } else {
                iA = c1279z.getMaxAvailableHeight(view, i13);
            }
        } else {
            iA = AbstractC1272v0.a(c1279z, view, i13, z10);
        }
        int i14 = this.f20527u;
        if (i14 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i15 = this.f20528v;
            if (i15 != -2) {
                iMakeMeasureSpec = i15 != -1 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f20526t.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f20526t.getPaddingBottom() + this.f20526t.getPaddingTop() + i10 : 0);
        }
        boolean z11 = c1279z.getInputMethodMode() == 2;
        c1279z.setWindowLayoutType(this.f20531y);
        if (c1279z.isShowing()) {
            if (this.f20513F.isAttachedToWindow()) {
                int width = this.f20528v;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f20513F.getWidth();
                }
                if (i14 == -1) {
                    i14 = z11 ? paddingBottom : -1;
                    if (z11) {
                        c1279z.setWidth(this.f20528v == -1 ? -1 : 0);
                        c1279z.setHeight(0);
                    } else {
                        c1279z.setWidth(this.f20528v == -1 ? -1 : 0);
                        c1279z.setHeight(-1);
                    }
                } else if (i14 == -2) {
                    i14 = paddingBottom;
                }
                c1279z.setOutsideTouchable(true);
                View view2 = this.f20513F;
                int i16 = width;
                int i17 = this.f20529w;
                int i18 = this.f20530x;
                int i19 = i16 < 0 ? -1 : i16;
                if (i14 < 0) {
                    i14 = -1;
                }
                c1279z.update(view2, i17, i18, i19, i14);
                return;
            }
            return;
        }
        int width2 = this.f20528v;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f20513F.getWidth();
        }
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = paddingBottom;
        }
        c1279z.setWidth(width2);
        c1279z.setHeight(i14);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = R;
            if (method2 != null) {
                try {
                    method2.invoke(c1279z, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1274w0.b(c1279z, true);
        }
        c1279z.setOutsideTouchable(true);
        c1279z.setTouchInterceptor(this.f20517J);
        if (this.f20509B) {
            c1279z.setOverlapAnchor(this.f20508A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = T;
            if (method3 != null) {
                try {
                    method3.invoke(c1279z, this.f20522O);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            AbstractC1274w0.a(c1279z, this.f20522O);
        }
        c1279z.showAsDropDown(this.f20513F, this.f20529w, this.f20530x, this.f20510C);
        this.f20526t.setSelection(-1);
        if ((!this.f20523P || this.f20526t.isInTouchMode()) && (c1261p0 = this.f20526t) != null) {
            c1261p0.setListSelectionHidden(true);
            c1261p0.requestLayout();
        }
        if (this.f20523P) {
            return;
        }
        this.f20520M.post(this.f20519L);
    }

    @Override // p140o.A
    public final void dismiss() {
        C1279z c1279z = this.Q;
        c1279z.dismiss();
        c1279z.setContentView(null);
        this.f20526t = null;
        this.f20520M.removeCallbacks(this.f20516I);
    }

    public final Drawable f() {
        return this.Q.getBackground();
    }

    @Override // p140o.A
    public final C1261p0 g() {
        return this.f20526t;
    }

    public final void i(Drawable drawable) {
        this.Q.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.f20530x = i10;
        this.f20532z = true;
    }

    public final void l(int i10) {
        this.f20529w = i10;
    }

    public final int n() {
        if (this.f20532z) {
            return this.f20530x;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        a aVar = this.f20512E;
        if (aVar == null) {
            this.f20512E = new a(1, this);
        } else {
            ListAdapter listAdapter2 = this.f20525s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f20525s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f20512E);
        }
        C1261p0 c1261p0 = this.f20526t;
        if (c1261p0 != null) {
            c1261p0.setAdapter(this.f20525s);
        }
    }

    public C1261p0 q(Context context, boolean z10) {
        return new C1261p0(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.Q.getBackground();
        if (background == null) {
            this.f20528v = i10;
            return;
        }
        Rect rect = this.f20521N;
        background.getPadding(rect);
        this.f20528v = rect.left + rect.right + i10;
    }

    public A0(Context context, AttributeSet attributeSet, int i10, int i11) {
        int resourceId;
        this.f20527u = -2;
        this.f20528v = -2;
        this.f20531y = 1002;
        this.f20510C = 0;
        this.f20511D = Integer.MAX_VALUE;
        this.f20516I = new RunnableC1276x0(this, 1);
        this.f20517J = new ViewOnTouchListenerC1280z0(this);
        this.f20518K = new C1278y0(this);
        this.f20519L = new RunnableC1276x0(this, 0);
        this.f20521N = new Rect();
        this.f20524r = context;
        this.f20520M = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p073h.a.f16394q, i10, 0);
        this.f20529w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f20530x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f20532z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1279z c1279z = new C1279z(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p073h.a.f16398u, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c1279z.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1279z.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : Y2.a.E(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.Q = c1279z;
        c1279z.setInputMethodMode(1);
    }
}
