package p102k;

import E2.RunnableC0147v;
import X2.c;
import X2.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.gms.internal.measurement.B1;
import org.xmlpull.v1.XmlPullParserException;
import p111l.b;
import p151p.H0;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f18862K = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f18863A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f18864B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public c f18865C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b f18866D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f18867E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f18868F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B1 f18869G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f18872J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f18873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f18874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f18875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f18876u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18878w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18880y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RunnableC0147v f18881z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18877v = 255;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18879x = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f18870H = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f18871I = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayI = a.i(resources2, theme, attributeSet, b.f19297a);
        int i10 = 1;
        eVar.setVisible(typedArrayI.getBoolean(1, true), true);
        b bVar = eVar.f18868F;
        bVar.f18836d |= p111l.a.b(typedArrayI);
        int i11 = 2;
        bVar.f18840i = typedArrayI.getBoolean(2, bVar.f18840i);
        int i12 = 3;
        bVar.f18842l = typedArrayI.getBoolean(3, bVar.f18842l);
        bVar.f18855y = typedArrayI.getInt(4, bVar.f18855y);
        bVar.f18856z = typedArrayI.getInt(5, bVar.f18856z);
        boolean z10 = false;
        eVar.setDither(typedArrayI.getBoolean(0, bVar.f18853w));
        b bVar2 = eVar.f18873r;
        if (resources2 != null) {
            bVar2.f18834b = resources2;
            int i13 = resources2.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = bVar2.f18835c;
            bVar2.f18835c = i13;
            if (i14 != i13) {
                bVar2.f18843m = false;
                bVar2.j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayI.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayI2 = a.i(resources2, theme, attributeSet, b.f19298b);
                    int resourceId = typedArrayI2.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                    int resourceId2 = typedArrayI2.getResourceId(i10, -1);
                    Drawable drawableF = resourceId2 > 0 ? H0.d().f(context2, resourceId2) : null;
                    typedArrayI2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = z10 ? 1 : 0;
                    for (int i16 = i15 == true ? 1 : 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = (i15 == true ? 1 : 0) + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z10)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15 == true ? 1 : 0] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i15 == true ? 1 : 0);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new p();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableF = p111l.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f18868F;
                    int iA = bVar3.a(drawableF);
                    bVar3.f18830H[iA] = iArrTrimStateSet;
                    bVar3.f18832J.f(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayI3 = a.i(resources2, theme, attributeSet, b.f19299c);
                        int resourceId3 = typedArrayI3.getResourceId(2, -1);
                        int resourceId4 = typedArrayI3.getResourceId(1, -1);
                        int resourceId5 = typedArrayI3.getResourceId(z10 ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? H0.d().f(context2, resourceId5) : null;
                        boolean z11 = typedArrayI3.getBoolean(3, z10);
                        typedArrayI3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new X2.e(context2, z10 ? 1 : 0);
                                drawableF2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableF2 = p111l.a.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.f18868F;
                        int iA2 = bVar4.a(drawableF2);
                        long j = resourceId3;
                        long j10 = resourceId4;
                        long j11 = (j << 32) | j10;
                        long j12 = z11 ? 8589934592L : 0L;
                        long j13 = iA2;
                        bVar4.f18831I.a(j11, Long.valueOf(j13 | j12));
                        if (z11) {
                            bVar4.f18831I.a((j10 << 32) | j, Long.valueOf(j13 | 4294967296L | j12));
                        }
                        context2 = context;
                        resources2 = resources;
                        i10 = 1;
                        z10 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i11 = 2;
                    i12 = 3;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j;
        boolean z12 = true;
        this.f18878w = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f18875t;
        if (drawable2 != null) {
            long j10 = this.f18863A;
            if (j10 != 0) {
                if (j10 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f18877v);
                    this.f18863A = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j10 - jUptimeMillis) * 255)) / this.f18873r.f18855y)) * this.f18877v) / 255);
                    z11 = true;
                }
            }
            drawable = this.f18876u;
            if (drawable != null) {
                j = this.f18864B;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f18876u = null;
                        this.f18864B = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f18873r.f18856z) * this.f18877v) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f18881z, jUptimeMillis + 16);
                return;
            }
            this.f18864B = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f18863A = 0L;
        z11 = false;
        drawable = this.f18876u;
        if (drawable != null) {
            j = this.f18864B;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f18876u = null;
                    this.f18864B = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f18873r.f18856z) * this.f18877v) / 255);
                }
            }
            if (z10) {
            }
        }
        this.f18864B = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f18873r;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i10 = bVar.f18839h;
        Drawable[] drawableArr = bVar.g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i11].applyTheme(theme);
                bVar.f18837e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f18834b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar.f18835c;
            bVar.f18835c = i12;
            if (i13 != i12) {
                bVar.f18843m = false;
                bVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f18873r.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f18865C == null) {
            this.f18865C = new c();
        }
        c cVar = this.f18865C;
        cVar.f9864s = drawable.getCallback();
        drawable.setCallback(cVar);
        try {
            if (this.f18873r.f18855y <= 0 && this.f18878w) {
                drawable.setAlpha(this.f18877v);
            }
            b bVar = this.f18873r;
            if (bVar.f18825C) {
                drawable.setColorFilter(bVar.f18824B);
            } else {
                if (bVar.f18828F) {
                    drawable.setTintList(bVar.f18826D);
                }
                b bVar2 = this.f18873r;
                if (bVar2.f18829G) {
                    drawable.setTintMode(bVar2.f18827E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18873r.f18853w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f18873r.f18823A);
            Rect rect = this.f18874s;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            c cVar2 = this.f18865C;
            Drawable.Callback callback = (Drawable.Callback) cVar2.f9864s;
            cVar2.f9864s = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18876u;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z10;
        Drawable drawable = this.f18876u;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18876u = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f18875t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18878w) {
                this.f18875t.setAlpha(this.f18877v);
            }
        }
        if (this.f18864B != 0) {
            this.f18864B = 0L;
            z10 = true;
        }
        if (this.f18863A != 0) {
            this.f18863A = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f18880y && super.mutate() == this) {
            b bVar = new b(this.f18868F, this, null);
            bVar.f18831I = bVar.f18831I.clone();
            bVar.f18832J = bVar.f18832J.clone();
            i(bVar);
            this.f18880y = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f18867E) {
            f();
            b bVar = this.f18866D;
            bVar.f18831I = bVar.f18831I.clone();
            bVar.f18832J = bVar.f18832J.clone();
            this.f18867E = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18877v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18873r.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f18873r;
        if (!bVar.f18851u) {
            bVar.c();
            bVar.f18851u = true;
            int i10 = bVar.f18839h;
            Drawable[] drawableArr = bVar.g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    bVar.f18852v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    bVar.f18852v = false;
                    z10 = false;
                    break;
                }
                i11++;
            }
        } else {
            z10 = bVar.f18852v;
        }
        if (!z10) {
            return null;
        }
        this.f18873r.f18836d = getChangingConfigurations();
        return this.f18873r;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f18875t;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18874s;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f18873r;
        if (bVar.f18842l) {
            if (!bVar.f18843m) {
                bVar.b();
            }
            return bVar.f18845o;
        }
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f18873r;
        if (bVar.f18842l) {
            if (!bVar.f18843m) {
                bVar.b();
            }
            return bVar.f18844n;
        }
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f18873r;
        if (bVar.f18842l) {
            if (!bVar.f18843m) {
                bVar.b();
            }
            return bVar.f18847q;
        }
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f18873r;
        if (bVar.f18842l) {
            if (!bVar.f18843m) {
                bVar.b();
            }
            return bVar.f18846p;
        }
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18875t;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f18873r;
            if (bVar.f18848r) {
                return bVar.f18849s;
            }
            bVar.c();
            int i10 = bVar.f18839h;
            Drawable[] drawableArr = bVar.g;
            opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            bVar.f18849s = opacity;
            bVar.f18848r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f18873r;
        Rect rect2 = null;
        boolean padding = false;
        if (!bVar.f18840i) {
            Rect rect3 = bVar.f18841k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.f18839h;
                Drawable[] drawableArr = bVar.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                bVar.j = true;
                bVar.f18841k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f18875t;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f18873r.f18823A && getLayoutDirection() == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean h(int i10) {
        if (i10 == this.f18879x) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f18873r.f18856z > 0) {
            Drawable drawable = this.f18876u;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f18875t;
            if (drawable2 != null) {
                this.f18876u = drawable2;
                this.f18864B = ((long) this.f18873r.f18856z) + jUptimeMillis;
            } else {
                this.f18876u = null;
                this.f18864B = 0L;
            }
        } else {
            Drawable drawable3 = this.f18875t;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            b bVar = this.f18873r;
            if (i10 < bVar.f18839h) {
                Drawable drawableD = bVar.d(i10);
                this.f18875t = drawableD;
                this.f18879x = i10;
                if (drawableD != null) {
                    int i11 = this.f18873r.f18855y;
                    if (i11 > 0) {
                        this.f18863A = jUptimeMillis + ((long) i11);
                    }
                    d(drawableD);
                }
            } else {
                this.f18875t = null;
                this.f18879x = -1;
            }
        } else {
            this.f18875t = null;
            this.f18879x = -1;
        }
        if (this.f18863A != 0 || this.f18864B != 0) {
            RunnableC0147v runnableC0147v = this.f18881z;
            if (runnableC0147v == null) {
                this.f18881z = new RunnableC0147v(23, this);
            } else {
                unscheduleSelf(runnableC0147v);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.f18873r = bVar;
        int i10 = this.f18879x;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f18875t = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f18876u = null;
        this.f18866D = bVar;
        this.f18868F = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f18873r;
        if (bVar != null) {
            bVar.f18848r = false;
            bVar.f18850t = false;
        }
        if (drawable != this.f18875t || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f18873r.f18823A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f18876u;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f18875t;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        B1 b5 = this.f18869G;
        if (b5 != null) {
            b5.K();
            this.f18869G = null;
            h(this.f18870H);
            this.f18870H = -1;
            this.f18871I = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f18872J) {
            g();
            b bVar = this.f18868F;
            bVar.f18831I = bVar.f18831I.clone();
            bVar.f18832J = bVar.f18832J.clone();
            this.f18872J = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18876u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18875t;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f18873r;
        int i11 = this.f18879x;
        int i12 = bVar.f18839h;
        Drawable[] drawableArr = bVar.g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i10);
                if (i13 == i11) {
                    z10 = layoutDirection;
                }
            }
        }
        bVar.f18854x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f18876u;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f18875t;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iE;
        B1 aVar;
        b bVar = this.f18868F;
        int iF = bVar.f(iArr);
        if (iF < 0) {
            iF = bVar.f(StateSet.WILD_CARD);
        }
        int i10 = this.f18879x;
        boolean z10 = false;
        if (iF != i10) {
            B1 b5 = this.f18869G;
            if (b5 == null) {
                this.f18869G = null;
                this.f18871I = -1;
                this.f18870H = -1;
                b bVar2 = this.f18868F;
                int iE2 = bVar2.e(i10);
                iE = bVar2.e(iF);
                if (iE == 0 && iE2 != 0) {
                    long j = ((long) iE) | (((long) iE2) << 32);
                    int iLongValue = (int) ((Long) bVar2.f18831I.e(j)).longValue();
                    if (iLongValue >= 0) {
                        boolean z11 = (((Long) bVar2.f18831I.e(j)).longValue() & 8589934592L) != 0;
                        h(iLongValue);
                        Object obj = this.f18875t;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar2.f18831I.e(j)).longValue() & 4294967296L) != 0, z11);
                        } else if (obj instanceof X2.e) {
                            aVar = new a((X2.e) obj, 1);
                        } else if (obj instanceof Animatable) {
                            aVar = new a((Animatable) obj, 0);
                        } else if (h(iF)) {
                            z10 = true;
                        }
                        aVar.J();
                        this.f18869G = aVar;
                        this.f18871I = i10;
                        this.f18870H = iF;
                        z10 = true;
                    } else if (h(iF)) {
                        z10 = true;
                    }
                } else if (h(iF)) {
                    z10 = true;
                }
            } else {
                if (iF != this.f18870H) {
                    if (iF == this.f18871I && b5.i()) {
                        b5.H();
                        this.f18870H = this.f18871I;
                        this.f18871I = iF;
                    } else {
                        i10 = this.f18870H;
                        b5.K();
                        this.f18869G = null;
                        this.f18871I = -1;
                        this.f18870H = -1;
                        b bVar3 = this.f18868F;
                        int iE3 = bVar3.e(i10);
                        iE = bVar3.e(iF);
                        if (iE == 0) {
                            if (h(iF)) {
                            }
                        } else if (h(iF)) {
                        }
                    }
                }
                z10 = true;
            }
        }
        Drawable drawable = this.f18875t;
        return drawable != null ? drawable.setState(iArr) | z10 : z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f18875t || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f18878w && this.f18877v == i10) {
            return;
        }
        this.f18878w = true;
        this.f18877v = i10;
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            if (this.f18863A == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f18873r;
        if (bVar.f18823A != z10) {
            bVar.f18823A = z10;
            Drawable drawable = this.f18875t;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f18873r;
        bVar.f18825C = true;
        if (bVar.f18824B != colorFilter) {
            bVar.f18824B = colorFilter;
            Drawable drawable = this.f18875t;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        b bVar = this.f18873r;
        if (bVar.f18853w != z10) {
            bVar.f18853w = z10;
            Drawable drawable = this.f18875t;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f7) {
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            drawable.setHotspot(f3, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f18874s;
        if (rect == null) {
            this.f18874s = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f18875t;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f18873r;
        bVar.f18828F = true;
        if (bVar.f18826D != colorStateList) {
            bVar.f18826D = colorStateList;
            this.f18875t.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f18873r;
        bVar.f18829G = true;
        if (bVar.f18827E != mode) {
            bVar.f18827E = mode;
            this.f18875t.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean zJ = j(z10, z11);
        B1 b5 = this.f18869G;
        if (b5 != null && (zJ || z11)) {
            if (z10) {
                b5.J();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f18875t || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
