package p102k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import p204v.a;
import u.AbstractC1361p;
import u.C1360o;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f18823A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorFilter f18824B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f18825C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f18826D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f18827E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f18828F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f18829G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[][] f18830H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1360o f18831I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public P f18832J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f18834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f18838f;
    public Drawable[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18840i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f18841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18856z;

    public b(b bVar, e eVar, Resources resources) {
        this.f18840i = false;
        this.f18842l = false;
        this.f18853w = true;
        this.f18855y = 0;
        this.f18856z = 0;
        this.f18833a = eVar;
        this.f18834b = resources != null ? resources : bVar != null ? bVar.f18834b : null;
        int i10 = bVar != null ? bVar.f18835c : 0;
        int i11 = e.f18862K;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f18835c = i10;
        if (bVar != null) {
            this.f18836d = bVar.f18836d;
            this.f18837e = bVar.f18837e;
            this.f18851u = true;
            this.f18852v = true;
            this.f18840i = bVar.f18840i;
            this.f18842l = bVar.f18842l;
            this.f18853w = bVar.f18853w;
            this.f18854x = bVar.f18854x;
            this.f18855y = bVar.f18855y;
            this.f18856z = bVar.f18856z;
            this.f18823A = bVar.f18823A;
            this.f18824B = bVar.f18824B;
            this.f18825C = bVar.f18825C;
            this.f18826D = bVar.f18826D;
            this.f18827E = bVar.f18827E;
            this.f18828F = bVar.f18828F;
            this.f18829G = bVar.f18829G;
            if (bVar.f18835c == i10) {
                if (bVar.j) {
                    this.f18841k = bVar.f18841k != null ? new Rect(bVar.f18841k) : null;
                    this.j = true;
                }
                if (bVar.f18843m) {
                    this.f18844n = bVar.f18844n;
                    this.f18845o = bVar.f18845o;
                    this.f18846p = bVar.f18846p;
                    this.f18847q = bVar.f18847q;
                    this.f18843m = true;
                }
            }
            if (bVar.f18848r) {
                this.f18849s = bVar.f18849s;
                this.f18848r = true;
            }
            if (bVar.f18850t) {
                this.f18850t = true;
            }
            Drawable[] drawableArr = bVar.g;
            this.g = new Drawable[drawableArr.length];
            this.f18839h = bVar.f18839h;
            SparseArray sparseArray = bVar.f18838f;
            if (sparseArray != null) {
                this.f18838f = sparseArray.clone();
            } else {
                this.f18838f = new SparseArray(this.f18839h);
            }
            int i12 = this.f18839h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f18838f.put(i13, constantState);
                    } else {
                        this.g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.f18839h = 0;
        }
        if (bVar != null) {
            this.f18830H = bVar.f18830H;
        } else {
            this.f18830H = new int[this.g.length][];
        }
        if (bVar != null) {
            this.f18831I = bVar.f18831I;
            this.f18832J = bVar.f18832J;
        } else {
            this.f18831I = new C1360o((Object) null);
            this.f18832J = new P(0);
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.f18839h;
        if (i10 >= this.g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f18830H, 0, iArr, 0, i10);
            this.f18830H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f18833a);
        this.g[i10] = drawable;
        this.f18839h++;
        this.f18837e = drawable.getChangingConfigurations() | this.f18837e;
        this.f18848r = false;
        this.f18850t = false;
        this.f18841k = null;
        this.j = false;
        this.f18843m = false;
        this.f18851u = false;
        return i10;
    }

    public final void b() {
        this.f18843m = true;
        c();
        int i10 = this.f18839h;
        Drawable[] drawableArr = this.g;
        this.f18845o = -1;
        this.f18844n = -1;
        this.f18847q = 0;
        this.f18846p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f18844n) {
                this.f18844n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f18845o) {
                this.f18845o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f18846p) {
                this.f18846p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f18847q) {
                this.f18847q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f18838f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f18838f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18838f.valueAt(i10);
                Drawable[] drawableArr = this.g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f18834b);
                drawableNewDrawable.setLayoutDirection(this.f18854x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f18833a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f18838f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f18839h;
        Drawable[] drawableArr = this.g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18838f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f18838f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f18838f.valueAt(iIndexOfKey)).newDrawable(this.f18834b);
        drawableNewDrawable.setLayoutDirection(this.f18854x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f18833a);
        this.g[i10] = drawableMutate;
        this.f18838f.removeAt(iIndexOfKey);
        if (this.f18838f.size() == 0) {
            this.f18838f = null;
        }
        return drawableMutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        P p10 = this.f18832J;
        Object obj2 = 0;
        int iA = a.a(p10.f22707u, i10, p10.f22705s);
        if (iA >= 0 && (obj = p10.f22706t[iA]) != AbstractC1361p.f22746c) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f18830H;
        int i10 = this.f18839h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f18836d | this.f18837e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
