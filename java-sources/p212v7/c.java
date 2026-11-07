package p212v7;

import I1.S;
import I1.Y;
import R7.C0483e;
import R7.i;
import R7.l;
import R7.m;
import R7.o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.ayah.R;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;
import p050e8.b;
import p128m7.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f23346y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f23347z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f23348a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f23350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f23351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23353f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f23355i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f23356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f23357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f23358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f23359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f23360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f23361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f23362q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f23365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f23366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f23367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f23368w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f23349b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23363r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f23369x = 0.0f;

    static {
        f23347z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i10) {
        this.f23348a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, i10, R.style.Widget_MaterialComponents_CardView);
        this.f23350c = iVar;
        iVar.k(materialCardView.getContext());
        iVar.p();
        m mVarG = iVar.f7325r.f7294a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, a.f19667h, i10, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            mVarG.b(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f23351d = new i();
        h(mVarG.a());
        this.f23366u = b.T(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, p137n7.a.f20015a);
        this.f23367v = b.S(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f23368w = b.S(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(b bVar, float f3) {
        if (bVar instanceof l) {
            return (float) ((1.0d - f23346y) * ((double) f3));
        }
        if (bVar instanceof C0483e) {
            return f3 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        b bVar = this.f23358m.f7348a;
        i iVar = this.f23350c;
        return Math.max(Math.max(b(bVar, iVar.i()), b(this.f23358m.f7349b, iVar.f7325r.f7294a.f7353f.a(iVar.g()))), Math.max(b(this.f23358m.f7350c, iVar.f7325r.f7294a.g.a(iVar.g())), b(this.f23358m.f7351d, iVar.f7325r.f7294a.f7354h.a(iVar.g()))));
    }

    public final LayerDrawable c() {
        if (this.f23360o == null) {
            int[] iArr = O7.a.f6500a;
            this.f23362q = new i(this.f23358m);
            this.f23360o = new RippleDrawable(this.f23356k, null, this.f23362q);
        }
        if (this.f23361p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f23360o, this.f23351d, this.j});
            this.f23361p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f23361p;
    }

    public final b d(Drawable drawable) {
        int iCeil;
        int i10;
        MaterialCardView materialCardView = this.f23348a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new b(drawable, iCeil, i10, iCeil, i10);
    }

    public final void e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f23361p != null) {
            MaterialCardView materialCardView = this.f23348a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f23352e) - this.f23353f) - iCeil2 : this.f23352e;
            int i16 = (i14 & 80) == 80 ? this.f23352e : ((i11 - this.f23352e) - this.f23353f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f23352e : ((i10 - this.f23352e) - this.f23353f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f23352e) - this.f23353f) - iCeil : this.f23352e;
            WeakHashMap weakHashMap = S.f3689a;
            if (materialCardView.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f23361p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(boolean z10, boolean z11) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z11) {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f23369x = z10 ? 1.0f : 0.0f;
                return;
            }
            float f3 = z10 ? 1.0f : 0.0f;
            float f7 = z10 ? 1.0f - this.f23369x : this.f23369x;
            ValueAnimator valueAnimator = this.f23365t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f23365t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f23369x, f3);
            this.f23365t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new Y(6, this));
            this.f23365t.setInterpolator(this.f23366u);
            this.f23365t.setDuration((long) ((z10 ? this.f23367v : this.f23368w) * f7));
            this.f23365t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.f23357l);
            f(this.f23348a.f14744A, false);
        } else {
            this.j = f23347z;
        }
        LayerDrawable layerDrawable = this.f23361p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(o oVar) {
        this.f23358m = oVar;
        i iVar = this.f23350c;
        iVar.setShapeAppearanceModel(oVar);
        iVar.f7324N = !iVar.f7325r.f7294a.f(iVar.g());
        i iVar2 = this.f23351d;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(oVar);
        }
        i iVar3 = this.f23362q;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(oVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f23348a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        i iVar = this.f23350c;
        return iVar.f7325r.f7294a.f(iVar.g()) && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f23348a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f23355i;
        Drawable drawableC = j() ? c() : this.f23351d;
        this.f23355i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f23348a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final void l() {
        float fA;
        MaterialCardView materialCardView = this.f23348a;
        float cardViewRadius = 0.0f;
        if (materialCardView.getPreventCornerOverlap()) {
            i iVar = this.f23350c;
            if (!iVar.f7325r.f7294a.f(iVar.g())) {
                fA = a();
            } else if (i()) {
                fA = a();
            } else {
                fA = 0.0f;
            }
        } else if (i()) {
            fA = a();
        } else {
            fA = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f23346y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i10 = (int) (fA - cardViewRadius);
        Rect rect = this.f23349b;
        materialCardView.f(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
    }

    public final void m() {
        boolean z10 = this.f23363r;
        MaterialCardView materialCardView = this.f23348a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f23350c));
        }
        materialCardView.setForeground(d(this.f23355i));
    }
}
