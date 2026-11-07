package p130n;

import C1.a;
import I1.AbstractC0245c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.media.session.p;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p140o.m;
import p140o.r;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f19743A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f19744B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f19747E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f19748a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19755i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f19756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f19757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f19759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f19761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f19769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f19770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC0245c f19771z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f19745C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f19746D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19749b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19750c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19751d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19752e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19753f = true;
    public boolean g = true;

    public g(h hVar, Menu menu) {
        this.f19747E = hVar;
        this.f19748a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f19747E.f19776c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.f19747E;
        Context context = hVar.f19776c;
        boolean z10 = false;
        menuItem.setChecked(this.f19764s).setVisible(this.f19765t).setEnabled(this.f19766u).setCheckable(this.f19763r >= 1).setTitleCondensed(this.f19757l).setIcon(this.f19758m);
        int i10 = this.f19767v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f19770y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f19777d == null) {
                hVar.f19777d = h.a(context);
            }
            Object obj = hVar.f19777d;
            String str = this.f19770y;
            f fVar = new f();
            fVar.f19741r = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f19742s = cls.getMethod(str, f.f19740t);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e10) {
                StringBuilder sbD = p.D("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbD.append(cls.getName());
                InflateException inflateException = new InflateException(sbD.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f19763r >= 2) {
            if (menuItem instanceof m) {
                ((m) menuItem).f(true);
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                a aVar = rVar.f20193c;
                try {
                    if (rVar.f20194d == null) {
                        rVar.f20194d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.f20194d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f19769x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f19772e, hVar.f19774a));
            z10 = true;
        }
        int i11 = this.f19768w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        AbstractC0245c abstractC0245c = this.f19771z;
        if (abstractC0245c != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(abstractC0245c);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f19743A;
        boolean z11 = menuItem instanceof a;
        if (z11) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Z6.a.l(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f19744B;
        if (z11) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Z6.a.p(menuItem, charSequence2);
        }
        char c10 = this.f19759n;
        int i12 = this.f19760o;
        if (z11) {
            ((a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Z6.a.k(menuItem, c10, i12);
        }
        char c11 = this.f19761p;
        int i13 = this.f19762q;
        if (z11) {
            ((a) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Z6.a.o(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.f19746D;
        if (mode != null) {
            if (z11) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                Z6.a.n(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f19745C;
        if (colorStateList != null) {
            if (z11) {
                ((a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                Z6.a.m(menuItem, colorStateList);
            }
        }
    }
}
