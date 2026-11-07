package F7;

import R7.z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.ayah.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p076h2.a f2483C = p137n7.a.f20017c;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f2484D = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f2485E = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f2486F = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f2487G = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f2488H = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f2489I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f2490J = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int[] f2491K = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int[] f2492L = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int[] f2493M = new int[0];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f2495B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R7.o f2496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public R7.i f2497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f2498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f2499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayerDrawable f2500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2501f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2503i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f2505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p137n7.e f2506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p137n7.e f2507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2508o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2510q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f2512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f2513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f2514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f2515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final O8.c f2516w;
    public boolean g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2509p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2511r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f2517x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f2518y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f2519z = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Matrix f2494A = new Matrix();

    public u(FloatingActionButton floatingActionButton, O8.c cVar) {
        this.f2515v = floatingActionButton;
        this.f2516w = cVar;
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(11);
        w wVar = (w) this;
        rVar.v(f2488H, d(new s(wVar, 1)));
        rVar.v(f2489I, d(new s(wVar, 0)));
        rVar.v(f2490J, d(new s(wVar, 0)));
        rVar.v(f2491K, d(new s(wVar, 0)));
        rVar.v(f2492L, d(new s(wVar, 2)));
        rVar.v(f2493M, d(new r(wVar)));
        this.f2508o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(t tVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f2483C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(tVar);
        valueAnimator.addUpdateListener(tVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f3, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f2515v.getDrawable();
        if (drawable == null || this.f2510q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f2518y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f7 = this.f2510q;
        RectF rectF2 = this.f2519z;
        rectF2.set(0.0f, 0.0f, f7, f7);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f10 = this.f2510q / 2.0f;
        matrix.postScale(f3, f3, f10, f10);
    }

    public final AnimatorSet b(p137n7.e eVar, float f3, float f7, float f10) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        int i10 = 0;
        float[] fArr = {f3};
        FloatingActionButton floatingActionButton = this.f2515v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f7);
        eVar.f("scale").a(objectAnimatorOfFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            p pVar = new p(i10);
            pVar.f2474b = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(pVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f7);
        eVar.f("scale").a(objectAnimatorOfFloat3);
        if (i11 == 26) {
            p pVar2 = new p(i10);
            pVar2.f2474b = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(pVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f2494A;
        a(f10, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new a(), new n(this), new Matrix(matrix));
        eVar.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        p050e8.b.R(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f3, float f7, float f10, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f2515v;
        valueAnimatorOfFloat.addUpdateListener(new o(this, floatingActionButton.getAlpha(), f3, floatingActionButton.getScaleX(), f7, floatingActionButton.getScaleY(), this.f2509p, f10, new Matrix(this.f2494A)));
        arrayList.add(valueAnimatorOfFloat);
        p050e8.b.R(animatorSet, arrayList);
        animatorSet.setDuration(p050e8.b.S(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(p050e8.b.T(floatingActionButton.getContext(), i11, p137n7.a.f20016b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int iMax = this.f2501f ? Math.max((this.f2504k - this.f2515v.getSizeDimension()) / 2, 0) : 0;
        float fE = this.g ? e() + this.j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fE));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f3, float f7, float f10);

    public final void l() {
        ArrayList arrayList = this.f2514u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                k kVar = (k) obj;
                C1256n c1256n = kVar.f2451a;
                FloatingActionButton floatingActionButton = kVar.f2452b;
                c1256n.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) c1256n.f20747s;
                bottomAppBar.f14629p0.n((floatingActionButton.getVisibility() == 0 && bottomAppBar.f14634u0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void m() {
        ArrayList arrayList = this.f2514u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                k kVar = (k) obj;
                C1256n c1256n = kVar.f2451a;
                FloatingActionButton floatingActionButton = kVar.f2452b;
                c1256n.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) c1256n.f20747s;
                int i11 = bottomAppBar.f14634u0;
                R7.i iVar = bottomAppBar.f14629p0;
                if (i11 == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    if (bottomAppBar.getTopEdgeTreatment().f21595x != translationX) {
                        bottomAppBar.getTopEdgeTreatment().f21595x = translationX;
                        iVar.invalidateSelf();
                    }
                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.getTopEdgeTreatment().f21594w != fMax) {
                        bottomAppBar.getTopEdgeTreatment().u(fMax);
                        iVar.invalidateSelf();
                    }
                    iVar.n(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public void n(ColorStateList colorStateList) {
        Drawable drawable = this.f2498c;
        if (drawable != null) {
            drawable.setTintList(O7.a.c(colorStateList));
        }
    }

    public final void o(R7.o oVar) {
        this.f2496a = oVar;
        R7.i iVar = this.f2497b;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(oVar);
        }
        Object obj = this.f2498c;
        if (obj instanceof z) {
            ((z) obj).setShapeAppearanceModel(oVar);
        }
        d dVar = this.f2499d;
        if (dVar != null) {
            dVar.f2443o = oVar;
            dVar.invalidateSelf();
        }
    }

    public abstract boolean p();

    public abstract void q();

    public final void r() {
        Rect rect = this.f2517x;
        f(rect);
        B0.c.i(this.f2500e, "Didn't initialize content background");
        boolean zP = p();
        O8.c cVar = this.f2516w;
        if (zP) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2500e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f2500e;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                cVar.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) cVar.f6511r;
        floatingActionButton.f14931C.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f14943z;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
