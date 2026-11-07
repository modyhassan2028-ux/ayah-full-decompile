package p202u7;

import I1.S;
import R7.i;
import R7.o;
import R7.z;
import Y2.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.ayah.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f22964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f22965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22969f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f22971i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f22972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f22973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f22974m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22978q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f22980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22981t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22975n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22976o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22977p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22979r = true;

    public c(MaterialButton materialButton, o oVar) {
        this.f22964a = materialButton;
        this.f22965b = oVar;
    }

    public final z a() {
        RippleDrawable rippleDrawable = this.f22980s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f22980s.getNumberOfLayers() > 2 ? (z) this.f22980s.getDrawable(2) : (z) this.f22980s.getDrawable(1);
    }

    public final i b(boolean z10) {
        RippleDrawable rippleDrawable = this.f22980s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f22980s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(o oVar) {
        this.f22965b = oVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(oVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(oVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(oVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = S.f3689a;
        MaterialButton materialButton = this.f22964a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f22968e;
        int i13 = this.f22969f;
        this.f22969f = i11;
        this.f22968e = i10;
        if (!this.f22976o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void e() {
        i iVar = new i(this.f22965b);
        MaterialButton materialButton = this.f22964a;
        iVar.k(materialButton.getContext());
        iVar.setTintList(this.j);
        PorterDuff.Mode mode = this.f22971i;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f3 = this.f22970h;
        ColorStateList colorStateList = this.f22972k;
        iVar.s(f3);
        iVar.r(colorStateList);
        i iVar2 = new i(this.f22965b);
        iVar2.setTint(0);
        float f7 = this.f22970h;
        int iB = this.f22975n ? a.B(R.attr.colorSurface, materialButton) : 0;
        iVar2.s(f7);
        iVar2.r(ColorStateList.valueOf(iB));
        i iVar3 = new i(this.f22965b);
        this.f22974m = iVar3;
        iVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(O7.a.c(this.f22973l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f22966c, this.f22968e, this.f22967d, this.f22969f), this.f22974m);
        this.f22980s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i iVarB = b(false);
        if (iVarB != null) {
            iVarB.l(this.f22981t);
            iVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        i iVarB = b(false);
        i iVarB2 = b(true);
        if (iVarB != null) {
            float f3 = this.f22970h;
            ColorStateList colorStateList = this.f22972k;
            iVarB.s(f3);
            iVarB.r(colorStateList);
            if (iVarB2 != null) {
                float f7 = this.f22970h;
                int iB = this.f22975n ? a.B(R.attr.colorSurface, this.f22964a) : 0;
                iVarB2.s(f7);
                iVarB2.r(ColorStateList.valueOf(iB));
            }
        }
    }
}
