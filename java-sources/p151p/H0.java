package p151p;

import X2.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import u.C1360o;
import u.O;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static H0 f20550i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f20551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f20552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f20553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f20554d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f20555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20556f;
    public C1271v g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f20549h = PorterDuff.Mode.SRC_IN;
    public static final F0 j = new F0(6);

    public static synchronized H0 d() {
        try {
            if (f20550i == null) {
                H0 h7 = new H0();
                f20550i = h7;
                j(h7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20550i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        F0 f3 = j;
        f3.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) f3.g(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(H0 h7) {
        if (Build.VERSION.SDK_INT < 24) {
            h7.a("vector", new G0(3));
            h7.a("animated-vector", new G0(2));
            h7.a("animated-selector", new G0(1));
            h7.a("drawable", new G0(0));
        }
    }

    public final void a(String str, G0 g10) {
        if (this.f20552b == null) {
            this.f20552b = new O(0);
        }
        this.f20552b.put(str, g10);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1360o c1360o = (C1360o) this.f20554d.get(context);
                if (c1360o == null) {
                    c1360o = new C1360o((Object) null);
                    this.f20554d.put(context, c1360o);
                }
                c1360o.h(j10, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f20555e == null) {
            this.f20555e = new TypedValue();
        }
        TypedValue typedValue = this.f20555e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableD = null;
        if (this.g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableD = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230778)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableD = C1271v.d(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableD = C1271v.d(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableD = C1271v.d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableD != null) {
            layerDrawableD.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawableD);
        }
        return layerDrawableD;
    }

    public final synchronized Drawable e(Context context, long j10) {
        C1360o c1360o = (C1360o) this.f20554d.get(context);
        if (c1360o == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1360o.d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1360o.i(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    public final synchronized Drawable g(Context context, int i10, boolean z10) {
        Drawable drawableK;
        try {
            if (!this.f20556f) {
                this.f20556f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof p) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f20556f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i10);
            if (drawableK == null) {
                drawableK = c(context, i10);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i10);
            }
            if (drawableK != null) {
                drawableK = n(context, i10, z10, drawableK);
            }
            if (drawableK != null) {
                AbstractC1249j0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        P p10;
        WeakHashMap weakHashMap = this.f20551a;
        ColorStateList colorStateListE = null;
        colorStateList = (weakHashMap == null || (p10 = (P) weakHashMap.get(context)) == null) ? null : (ColorStateList) p10.d(i10);
        if (colorStateList == null) {
            C1271v c1271v = this.g;
            if (c1271v != null) {
                colorStateListE = c1271v.e(context, i10);
            }
            if (colorStateListE != null) {
                if (this.f20551a == null) {
                    this.f20551a = new WeakHashMap();
                }
                P p11 = (P) this.f20551a.get(context);
                if (p11 == null) {
                    p11 = new P(0);
                    this.f20551a.put(context, p11);
                }
                p11.a(i10, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        O o10 = this.f20552b;
        if (o10 == null || o10.isEmpty()) {
            return null;
        }
        P p10 = this.f20553c;
        if (p10 != null) {
            String str = (String) p10.d(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f20552b.get(str) == null) {
                return null;
            }
        } else {
            this.f20553c = new P(0);
        }
        if (this.f20555e == null) {
            this.f20555e = new TypedValue();
        }
        TypedValue typedValue = this.f20555e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
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
                String name = xml.getName();
                this.f20553c.a(i10, name);
                G0 g10 = (G0) this.f20552b.get(name);
                if (g10 != null) {
                    drawableE = g10.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, drawableE);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableE == null) {
            this.f20553c.a(i10, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C1360o c1360o = (C1360o) this.f20554d.get(context);
        if (c1360o != null) {
            c1360o.b();
        }
    }

    public final synchronized void m(C1271v c1271v) {
        this.g = c1271v;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    public final Drawable n(Context context, int i10, boolean z10, Drawable drawable) {
        int i11;
        boolean z11;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListI = i(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListI != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListI);
            if (this.g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.g != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = Y0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1273w.f20796b;
                C1271v.f(drawableFindDrawableByLayerId, iC, mode2);
                C1271v.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), Y0.c(context, R.attr.colorControlNormal), mode2);
                C1271v.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), Y0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = Y0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1273w.f20796b;
                C1271v.f(drawableFindDrawableByLayerId2, iB, mode3);
                C1271v.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), Y0.c(context, R.attr.colorControlActivated), mode3);
                C1271v.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), Y0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1271v c1271v = this.g;
        boolean z12 = false;
        if (c1271v != null) {
            PorterDuff.Mode mode4 = C1273w.f20796b;
            if (C1271v.a((int[]) c1271v.f20790a, i10)) {
                i11 = R.attr.colorControlNormal;
            } else if (C1271v.a((int[]) c1271v.f20792c, i10)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (C1271v.a((int[]) c1271v.f20793d, i10)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == 2131230798) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z11 = true;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            i11 = 0;
                            z11 = false;
                        }
                        iRound = -1;
                    }
                    if (z11) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C1273w.c(Y0.c(context, i11), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z12 = true;
                    }
                }
                i11 = 16842801;
            }
            z11 = true;
            iRound = -1;
            if (z11) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C1273w.c(Y0.c(context, i11), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z12 = true;
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
