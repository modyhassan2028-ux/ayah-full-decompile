package p151p;

import B1.a;
import I1.S;
import I1.T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.ayah.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static l1 f20722B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static l1 f20723C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20724A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f20725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f20726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f20728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k1 f20729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m1 f20732y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20733z;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.k1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.k1] */
    public l1(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f20728u = new Runnable(this) { // from class: p.k1

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l1 f20717s;

            {
                this.f20717s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f20717s.c(false);
                        break;
                    default:
                        this.f20717s.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f20729v = new Runnable(this) { // from class: p.k1

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l1 f20717s;

            {
                this.f20717s = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f20717s.c(false);
                        break;
                    default:
                        this.f20717s.a();
                        break;
                }
            }
        };
        this.f20725r = view;
        this.f20726s = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = T.f3695a;
        this.f20727t = Build.VERSION.SDK_INT >= 28 ? a.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f20724A = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l1 l1Var) {
        l1 l1Var2 = f20722B;
        if (l1Var2 != null) {
            l1Var2.f20725r.removeCallbacks(l1Var2.f20728u);
        }
        f20722B = l1Var;
        if (l1Var != null) {
            l1Var.f20725r.postDelayed(l1Var.f20728u, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l1 l1Var = f20723C;
        View view = this.f20725r;
        if (l1Var == this) {
            f20723C = null;
            m1 m1Var = this.f20732y;
            if (m1Var != null) {
                View view2 = (View) m1Var.f20741b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m1Var.f20740a).getSystemService("window")).removeView(view2);
                }
                this.f20732y = null;
                this.f20724A = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f20722B == this) {
            b(null);
        }
        view.removeCallbacks(this.f20729v);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j10;
        View view = this.f20725r;
        if (view.isAttachedToWindow()) {
            b(null);
            l1 l1Var = f20723C;
            if (l1Var != null) {
                l1Var.a();
            }
            f20723C = this;
            this.f20733z = z10;
            m1 m1Var = new m1(view.getContext());
            View view2 = (View) m1Var.f20741b;
            Context context = (Context) m1Var.f20740a;
            this.f20732y = m1Var;
            int width = this.f20730w;
            int i13 = this.f20731x;
            boolean z11 = this.f20733z;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) m1Var.f20743d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) m1Var.f20742c).setText(this.f20726s);
            int[] iArr = (int[]) m1Var.g;
            int[] iArr2 = (int[]) m1Var.f20745f;
            Rect rect = (Rect) m1Var.f20744e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i10 = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i14 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context.getResources();
                    i12 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i15;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams.x = (i15 + i14) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[i12];
                int i17 = ((i16 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i17 >= 0) {
                        layoutParams.y = i17;
                    } else {
                        layoutParams.y = i18;
                    }
                } else if (measuredHeight + i18 <= rect.height()) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i17;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f20733z) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = S.f3689a;
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j10 = j - longPressTimeout;
            }
            k1 k1Var = this.f20729v;
            view.removeCallbacks(k1Var);
            view.postDelayed(k1Var, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f20732y == null || !this.f20733z) {
            View view2 = this.f20725r;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f20724A = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f20732y == null) {
                    int x9 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (this.f20724A) {
                        this.f20730w = x9;
                        this.f20731x = y10;
                        this.f20724A = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x9 - this.f20730w);
                        int i10 = this.f20727t;
                        if (iAbs > i10 || Math.abs(y10 - this.f20731x) > i10) {
                            this.f20730w = x9;
                            this.f20731x = y10;
                            this.f20724A = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f20730w = view.getWidth() / 2;
        this.f20731x = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
