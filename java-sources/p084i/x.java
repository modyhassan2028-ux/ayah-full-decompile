package p084i;

import E1.e;
import E1.g;
import I1.D;
import I1.I;
import I1.InterfaceC0260m;
import I1.S;
import I1.Z;
import K0.AbstractC0332a;
import K0.RunnableC0354l;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0771u;
import io.realm.RealmFieldTypeConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p050e8.b;
import p130n.a;
import p130n.c;
import p130n.h;
import p140o.i;
import p140o.k;
import p151p.C1240f;
import p151p.C1250k;
import p151p.C1273w;
import p151p.InterfaceC1239e0;
import p151p.i1;
import p151p.n1;
import p151p.q1;
import p185s8.u0;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class x extends k implements i, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f16651A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Context f16652B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Window f16653C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public s f16654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f16655E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f16656F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public h f16657G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f16658H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public InterfaceC1239e0 f16659I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public m f16660J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public n f16661K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public a f16662L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ActionBarContextView f16663M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public PopupWindow f16664N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public l f16665O;
    public boolean Q;
    public ViewGroup R;
    public TextView S;
    public View T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f16667V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f16668W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f16669X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f16670Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f16671Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f16672a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f16673b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public w[] f16674c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public w f16675d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f16676e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f16677f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f16678g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f16679h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Configuration f16680i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f16681j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f16682k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f16683l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f16684m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public t f16685n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public t f16686o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f16687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f16688q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f16690s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f16691t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f16692u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public B f16693v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f16694w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedCallback f16695x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final O f16649y0 = new O(0);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[] f16650z0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f16648A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Z f16666P = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final l f16689r0 = new l(this, 0);

    public x(Context context, Window window, InterfaceC0960h interfaceC0960h, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f16681j0 = -100;
        this.f16652B = context;
        this.f16655E = interfaceC0960h;
        this.f16651A = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f16681j0 = ((x) appCompatActivity.o()).f16681j0;
            }
        }
        if (this.f16681j0 == -100) {
            String name = this.f16651A.getClass().getName();
            O o10 = f16649y0;
            Integer num = (Integer) o10.get(name);
            if (num != null) {
                this.f16681j0 = num.intValue();
                o10.remove(this.f16651A.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C1273w.d();
    }

    public static e A(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? q.b(configuration) : e.b(p.b(configuration.locale));
    }

    public static e o(Context context) {
        e eVar;
        e eVarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (eVar = k.f16610t) == null) {
            return null;
        }
        g gVar = eVar.f1426a;
        e eVarA = A(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        if (i10 < 24) {
            eVarB = gVar.isEmpty() ? e.f1425b : e.b(p.b(gVar.get(0)));
        } else if (gVar.isEmpty()) {
            eVarB = e.f1425b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < eVarA.f1426a.size() + gVar.size()) {
                Locale locale = i11 < gVar.size() ? gVar.get(i11) : eVarA.f1426a.get(i11 - gVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            eVarB = e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return eVarB.f1426a.isEmpty() ? eVarA : eVarB;
    }

    public static Configuration t(Context context, int i10, e eVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            g gVar = eVar.f1426a;
            if (Build.VERSION.SDK_INT >= 24) {
                q.d(configuration2, eVar);
                return configuration2;
            }
            configuration2.setLocale(gVar.get(0));
            configuration2.setLayoutDirection(gVar.get(0));
        }
        return configuration2;
    }

    public final w B(int i10) {
        w[] wVarArr = this.f16674c0;
        if (wVarArr == null || wVarArr.length <= i10) {
            w[] wVarArr2 = new w[i10 + 1];
            if (wVarArr != null) {
                System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
            }
            this.f16674c0 = wVarArr2;
            wVarArr = wVarArr2;
        }
        w wVar = wVarArr[i10];
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w();
        wVar2.f16634a = i10;
        wVar2.f16645n = false;
        wVarArr[i10] = wVar2;
        return wVar2;
    }

    public final void C() {
        w();
        if (this.f16668W && this.f16656F == null) {
            Object obj = this.f16651A;
            if (obj instanceof Activity) {
                this.f16656F = new J((Activity) obj, this.f16669X);
            } else if (obj instanceof Dialog) {
                this.f16656F = new J((Dialog) obj);
            }
            b bVar = this.f16656F;
            if (bVar != null) {
                bVar.U(this.f16690s0);
            }
        }
    }

    public final void D(int i10) {
        this.f16688q0 = (1 << i10) | this.f16688q0;
        if (this.f16687p0) {
            return;
        }
        View decorView = this.f16653C.getDecorView();
        WeakHashMap weakHashMap = S.f3689a;
        decorView.postOnAnimation(this.f16689r0);
        this.f16687p0 = true;
    }

    public final int E(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f16686o0 == null) {
                            this.f16686o0 = new t(this, context);
                        }
                        return this.f16686o0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).g();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean F() {
        boolean z10 = this.f16676e0;
        this.f16676e0 = false;
        w wVarB = B(0);
        if (!wVarB.f16644m) {
            a aVar = this.f16662L;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            C();
            b bVar = this.f16656F;
            if (bVar == null || !bVar.n()) {
                return false;
            }
        } else if (!z10) {
            s(wVarB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f20126w.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(p084i.w r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p084i.x.G(i.w, android.view.KeyEvent):void");
    }

    public final boolean H(w wVar, int i10, KeyEvent keyEvent) {
        k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f16642k || I(wVar, keyEvent)) && (kVar = wVar.f16640h) != null) {
            return kVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public final boolean I(w wVar, KeyEvent keyEvent) {
        k kVar;
        InterfaceC1239e0 interfaceC1239e0;
        InterfaceC1239e0 interfaceC1239e1;
        Resources.Theme themeNewTheme;
        InterfaceC1239e0 interfaceC1239e2;
        InterfaceC1239e0 interfaceC1239e3;
        if (!this.f16679h0) {
            boolean z10 = wVar.f16642k;
            int i10 = wVar.f16634a;
            if (z10) {
                return true;
            }
            w wVar2 = this.f16675d0;
            if (wVar2 != null && wVar2 != wVar) {
                s(wVar2, false);
            }
            Window.Callback callback = this.f16653C.getCallback();
            if (callback != null) {
                wVar.g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (interfaceC1239e3 = this.f16659I) != null) {
                interfaceC1239e3.setMenuPrepared();
            }
            if (wVar.g == null && (!z11 || !(this.f16656F instanceof E))) {
                k kVar2 = wVar.f16640h;
                if (kVar2 == null || wVar.f16646o) {
                    if (kVar2 == null) {
                        Context context = this.f16652B;
                        if ((i10 == 0 || i10 == 108) && this.f16659I != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.ayah.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.ayah.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.ayah.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                c cVar = new c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        k kVar3 = new k(context);
                        kVar3.f20138e = this;
                        k kVar4 = wVar.f16640h;
                        if (kVar3 != kVar4) {
                            if (kVar4 != null) {
                                kVar4.r(wVar.f16641i);
                            }
                            wVar.f16640h = kVar3;
                            p140o.g gVar = wVar.f16641i;
                            if (gVar != null) {
                                kVar3.b(gVar, kVar3.f20134a);
                            }
                        }
                        if (wVar.f16640h != null) {
                            if (z11 && (interfaceC1239e1 = this.f16659I) != null) {
                                if (this.f16660J == null) {
                                    this.f16660J = new m(this);
                                }
                                interfaceC1239e1.setMenu(wVar.f16640h, this.f16660J);
                            }
                            wVar.f16640h.y();
                            if (callback.onCreatePanelMenu(i10, wVar.f16640h)) {
                                wVar.f16646o = false;
                            } else {
                                kVar = wVar.f16640h;
                                if (kVar != null) {
                                    if (kVar != null) {
                                        kVar.r(wVar.f16641i);
                                    }
                                    wVar.f16640h = null;
                                }
                                if (z11 && (interfaceC1239e0 = this.f16659I) != null) {
                                    interfaceC1239e0.setMenu(null, this.f16660J);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.f16660J == null) {
                                this.f16660J = new m(this);
                            }
                            interfaceC1239e1.setMenu(wVar.f16640h, this.f16660J);
                        }
                        wVar.f16640h.y();
                        if (callback.onCreatePanelMenu(i10, wVar.f16640h)) {
                            kVar = wVar.f16640h;
                            if (kVar != null) {
                                if (kVar != null) {
                                    kVar.r(wVar.f16641i);
                                }
                                wVar.f16640h = null;
                            }
                            if (z11) {
                                interfaceC1239e0.setMenu(null, this.f16660J);
                            }
                        } else {
                            wVar.f16646o = false;
                        }
                    }
                }
                wVar.f16640h.y();
                Bundle bundle = wVar.f16647p;
                if (bundle != null) {
                    wVar.f16640h.s(bundle);
                    wVar.f16647p = null;
                }
                if (!callback.onPreparePanel(0, wVar.g, wVar.f16640h)) {
                    if (z11 && (interfaceC1239e2 = this.f16659I) != null) {
                        interfaceC1239e2.setMenu(null, this.f16660J);
                    }
                    wVar.f16640h.x();
                    return false;
                }
                wVar.f16640h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                wVar.f16640h.x();
            }
            wVar.f16642k = true;
            wVar.f16643l = false;
            this.f16675d0 = wVar;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f16694w0 != null && (B(0).f16644m || this.f16662L != null)) {
                z10 = true;
            }
            if (z10 && this.f16695x0 == null) {
                this.f16695x0 = r.b(this.f16694w0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f16695x0) == null) {
                    return;
                }
                r.c(this.f16694w0, onBackInvokedCallback);
                this.f16695x0 = null;
            }
        }
    }

    @Override // p084i.k
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f16652B);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof x) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p084i.k
    public final void b() {
        if (this.f16656F != null) {
            C();
            if (this.f16656F.D()) {
                return;
            }
            D(0);
        }
    }

    @Override // p084i.k
    public final void d() {
        String strC;
        this.f16677f0 = true;
        m(false, true);
        x();
        Object obj = this.f16651A;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = p216w1.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                b bVar = this.f16656F;
                if (bVar == null) {
                    this.f16690s0 = true;
                } else {
                    bVar.U(true);
                }
            }
            synchronized (k.f16615y) {
                k.f(this);
                k.f16614x.add(new WeakReference(this));
            }
        }
        this.f16680i0 = new Configuration(this.f16652B.getResources().getConfiguration());
        this.f16678g0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p084i.k
    public final void e() {
        if (this.f16651A instanceof Activity) {
            synchronized (k.f16615y) {
                k.f(this);
            }
        }
        if (this.f16687p0) {
            this.f16653C.getDecorView().removeCallbacks(this.f16689r0);
        }
        this.f16679h0 = true;
        if (this.f16681j0 != -100) {
            Object obj = this.f16651A;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f16649y0.put(this.f16651A.getClass().getName(), Integer.valueOf(this.f16681j0));
            } else {
                f16649y0.remove(this.f16651A.getClass().getName());
            }
        } else {
            f16649y0.remove(this.f16651A.getClass().getName());
        }
        b bVar = this.f16656F;
        if (bVar != null) {
            bVar.M();
        }
        t tVar = this.f16685n0;
        if (tVar != null) {
            tVar.d();
        }
        t tVar2 = this.f16686o0;
        if (tVar2 != null) {
            tVar2.d();
        }
    }

    @Override // p084i.k
    public final boolean g(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f16672a0 && i10 == 108) {
            return false;
        }
        if (this.f16668W && i10 == 1) {
            this.f16668W = false;
        }
        if (i10 == 1) {
            J();
            this.f16672a0 = true;
            return true;
        }
        if (i10 == 2) {
            J();
            this.U = true;
            return true;
        }
        if (i10 == 5) {
            J();
            this.f16667V = true;
            return true;
        }
        if (i10 == 10) {
            J();
            this.f16670Y = true;
            return true;
        }
        if (i10 == 108) {
            J();
            this.f16668W = true;
            return true;
        }
        if (i10 != 109) {
            return this.f16653C.requestFeature(i10);
        }
        J();
        this.f16669X = true;
        return true;
    }

    @Override // p084i.k
    public final void h(int i10) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f16652B).inflate(i10, viewGroup);
        this.f16654D.a(this.f16653C.getCallback());
    }

    @Override // p084i.k
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f16654D.a(this.f16653C.getCallback());
    }

    @Override // p084i.k
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f16654D.a(this.f16653C.getCallback());
    }

    @Override // p084i.k
    public final void l(CharSequence charSequence) {
        this.f16658H = charSequence;
        InterfaceC1239e0 interfaceC1239e0 = this.f16659I;
        if (interfaceC1239e0 != null) {
            interfaceC1239e0.setWindowTitle(charSequence);
            return;
        }
        b bVar = this.f16656F;
        if (bVar != null) {
            bVar.b0(charSequence);
            return;
        }
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0101  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        int i11;
        if (this.f16679h0) {
            return false;
        }
        int i12 = this.f16681j0;
        if (i12 == -100) {
            i12 = k.f16609s;
        }
        Context context = this.f16652B;
        int iE = E(context, i12);
        int i13 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        e eVarO = i13 < 33 ? o(context) : null;
        if (!z11 && eVarO != null) {
            eVarO = A(context.getResources().getConfiguration());
        }
        Configuration configurationT = t(context, iE, eVarO, null, false);
        boolean z15 = this.f16684m0;
        Object obj3 = this.f16651A;
        if (z15 || !(obj3 instanceof Activity)) {
            this.f16684m0 = true;
            i10 = this.f16683l0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                if (i13 >= 29) {
                    i11 = 269221888;
                } else {
                    i11 = i13 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11);
                    if (activityInfo != null) {
                        this.f16683l0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f16683l0 = 0;
                }
                this.f16684m0 = true;
                i10 = this.f16683l0;
            }
        }
        Configuration configuration = this.f16680i0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i14 = configuration.uiMode & 48;
        int i15 = configurationT.uiMode & 48;
        e eVarA = A(configuration);
        e eVarA2 = eVarO == null ? null : A(configurationT);
        int i16 = i14 != i15 ? 512 : 0;
        if (eVarA2 != null && !eVarA.equals(eVarA2)) {
            i16 |= 8196;
        }
        if (((~i10) & i16) != 0 && z10 && this.f16677f0 && ((f16648A0 || this.f16678g0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z12 = false;
            } else {
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && (i16 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationT.getLayoutDirection());
                }
                if (i17 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0354l(22, activity));
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i16 == 0) {
            z13 = z12;
        } else {
            boolean z16 = (i10 & i16) == i16;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i15;
            if (eVarA2 != null) {
                g gVar = eVarA2.f1426a;
                if (Build.VERSION.SDK_INT >= 24) {
                    q.d(configuration2, eVarA2);
                } else {
                    configuration2.setLocale(gVar.get(0));
                    configuration2.setLayoutDirection(gVar.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 26 && i18 < 28) {
                if (i18 >= 24) {
                    if (!u0.f22474h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            u0.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                        }
                        u0.f22474h = true;
                    }
                    Field field = u0.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e12) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!u0.f22469b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    u0.f22468a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                                }
                                u0.f22469b = true;
                            }
                            Field field2 = u0.f22468a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e14) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                                }
                            }
                            if (obj2 != null) {
                                u0.p(obj2);
                            }
                        }
                    }
                } else {
                    if (!u0.f22469b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            u0.f22468a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        u0.f22469b = true;
                    }
                    Field field3 = u0.f22468a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e16);
                        }
                    }
                    if (obj2 != null) {
                        u0.p(obj2);
                    }
                }
            }
            int i19 = this.f16682k0;
            if (i19 != 0) {
                context.setTheme(i19);
                z14 = true;
                context.getTheme().applyStyle(this.f16682k0, true);
            } else {
                z14 = true;
            }
            if (z16 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0771u) {
                    if (((InterfaceC0771u) activity2).h().f12672c.compareTo(EnumC0767p.f12663t) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f16678g0 && !this.f16679h0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z13 = z14;
        }
        if (eVarA2 != null) {
            e eVarA3 = A(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                q.c(eVarA3);
            } else {
                Locale.setDefault(eVarA3.f1426a.get(0));
            }
        }
        if (i12 == 0) {
            y(context).q();
        } else {
            t tVar = this.f16685n0;
            if (tVar != null) {
                tVar.d();
            }
        }
        if (i12 == 3) {
            if (this.f16686o0 == null) {
                this.f16686o0 = new t(this, context);
            }
            this.f16686o0.q();
        } else {
            t tVar2 = this.f16686o0;
            if (tVar2 != null) {
                tVar2.d();
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void n(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f16653C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof s) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        s sVar = new s(this, callback);
        this.f16654D = sVar;
        window.setCallback(sVar);
        p074h0.i iVarA = p074h0.i.A(this.f16652B, null, f16650z0);
        Drawable drawableS = iVarA.s(0);
        if (drawableS != null) {
            window.setBackgroundDrawable(drawableS);
        }
        iVarA.C();
        this.f16653C = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f16694w0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f16695x0) != null) {
            r.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16695x0 = null;
        }
        Object obj = this.f16651A;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f16694w0 = r.a(activity);
            } else {
                this.f16694w0 = null;
            }
        } else {
            this.f16694w0 = null;
        }
        K();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        View view2 = null;
        if (this.f16693v0 == null) {
            int[] iArr = p073h.a.f16388k;
            Context context2 = this.f16652B;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f16693v0 = new B();
            } else {
                try {
                    this.f16693v0 = (B) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f16693v0 = new B();
                }
            }
        }
        B b5 = this.f16693v0;
        int i10 = n1.f20750a;
        b5.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p073h.a.f16377B, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof c) && ((c) context).f19727a == resourceId)) ? context : new c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(cVar, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(cVar, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(cVar, attributeSet);
                break;
            case 3:
                appCompatRatingBar = b5.e(cVar, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(cVar, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(cVar, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(cVar, attributeSet);
                break;
            case 7:
                appCompatRatingBar = b5.d(cVar, attributeSet);
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(cVar, attributeSet);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(cVar, attributeSet);
                break;
            case 10:
                appCompatRatingBar = b5.a(cVar, attributeSet);
                break;
            case 11:
                appCompatRatingBar = b5.c(cVar, attributeSet);
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(cVar, attributeSet);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                appCompatRatingBar = b5.b(cVar, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar != null || context == cVar) {
            view2 = appCompatRatingBar;
        } else {
            Object[] objArr = b5.f16504a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = B.g;
                        if (i11 < 3) {
                            View viewF = b5.f(cVar, str, strArr[i11]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = b5.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, B.f16499c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new A(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, B.f16500d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = S.f3689a;
                    new D(com.ayah.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(view2, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, B.f16501e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    S.p(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, B.f16502f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = S.f3689a;
                    new D(com.ayah.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    public final void p(int i10, w wVar, k kVar) {
        if (kVar == null) {
            if (wVar == null && i10 >= 0) {
                w[] wVarArr = this.f16674c0;
                if (i10 < wVarArr.length) {
                    wVar = wVarArr[i10];
                }
            }
            if (wVar != null) {
                kVar = wVar.f16640h;
            }
        }
        if ((wVar == null || wVar.f16644m) && !this.f16679h0) {
            s sVar = this.f16654D;
            Window.Callback callback = this.f16653C.getCallback();
            sVar.getClass();
            try {
                sVar.f16627v = true;
                callback.onPanelClosed(i10, kVar);
            } finally {
                sVar.f16627v = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p140o.i
    public final boolean q(k kVar, MenuItem menuItem) {
        w wVar;
        Window.Callback callback = this.f16653C.getCallback();
        if (callback != null && !this.f16679h0) {
            k kVarK = kVar.k();
            w[] wVarArr = this.f16674c0;
            int length = wVarArr != null ? wVarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                wVar = wVarArr[i10];
                if (wVar != null && wVar.f16640h == kVarK) {
                    if (wVar != null) {
                        return callback.onMenuItemSelected(wVar.f16634a, menuItem);
                    }
                }
            }
            wVar = null;
            if (wVar != null) {
                return callback.onMenuItemSelected(wVar.f16634a, menuItem);
            }
        }
        return false;
    }

    public final void r(k kVar) {
        C1250k c1250k;
        if (this.f16673b0) {
            return;
        }
        this.f16673b0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16659I;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f11470v).f20674a.f11705r;
        if (actionMenuView != null && (c1250k = actionMenuView.f11479K) != null) {
            c1250k.d();
            C1240f c1240f = c1250k.f20702L;
            if (c1240f != null && c1240f.b()) {
                c1240f.f20204i.dismiss();
            }
        }
        Window.Callback callback = this.f16653C.getCallback();
        if (callback != null && !this.f16679h0) {
            callback.onPanelClosed(108, kVar);
        }
        this.f16673b0 = false;
    }

    public final void s(w wVar, boolean z10) {
        v vVar;
        InterfaceC1239e0 interfaceC1239e0;
        if (z10 && wVar.f16634a == 0 && (interfaceC1239e0 = this.f16659I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1239e0;
            actionBarOverlayLayout.k();
            if (((i1) actionBarOverlayLayout.f11470v).f20674a.p()) {
                r(wVar.f16640h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f16652B.getSystemService("window");
        if (windowManager != null && wVar.f16644m && (vVar = wVar.f16638e) != null) {
            windowManager.removeView(vVar);
            if (z10) {
                p(wVar.f16634a, wVar, null);
            }
        }
        wVar.f16642k = false;
        wVar.f16643l = false;
        wVar.f16644m = false;
        wVar.f16639f = null;
        wVar.f16645n = true;
        if (this.f16675d0 == wVar) {
            this.f16675d0 = null;
        }
        if (wVar.f16634a == 0) {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c A[RETURN] */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        w wVarB;
        InterfaceC1239e0 interfaceC1239e0;
        Context context;
        boolean z10;
        boolean zV;
        boolean zI;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C1250k c1250k;
        w wVarB2;
        Object obj = this.f16651A;
        if ((!(obj instanceof InterfaceC0260m) && !(obj instanceof z)) || (decorView = this.f16653C.getDecorView()) == null || !b.p(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                s sVar = this.f16654D;
                Window.Callback callback = this.f16653C.getCallback();
                sVar.getClass();
                try {
                    sVar.f16626u = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    sVar.f16626u = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f16676e0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    wVarB2 = B(0);
                                    if (!wVarB2.f16644m) {
                                        I(wVarB2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f16662L == null) {
                                    wVarB = B(0);
                                    interfaceC1239e0 = this.f16659I;
                                    context = this.f16652B;
                                    if (interfaceC1239e0 != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1239e0;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((i1) actionBarOverlayLayout.f11470v).f20674a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f11705r) == null || !actionMenuView.f11478J || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z10 = wVarB.f16644m;
                                            if (!z10 || wVarB.f16643l) {
                                                s(wVarB, true);
                                                zV = z10;
                                            } else {
                                                if (wVarB.f16642k) {
                                                    if (wVarB.f16646o) {
                                                        wVarB.f16642k = false;
                                                        zI = I(wVarB, keyEvent);
                                                    } else {
                                                        zI = true;
                                                    }
                                                    if (zI) {
                                                        G(wVarB, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f16659I;
                                            actionBarOverlayLayout2.k();
                                            if (((i1) actionBarOverlayLayout2.f11470v).f20674a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f16659I;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((i1) actionBarOverlayLayout3.f11470v).f20674a.f11705r;
                                                if (actionMenuView2 != null && (c1250k = actionMenuView2.f11479K) != null && c1250k.d()) {
                                                    zV = true;
                                                }
                                            } else if (!this.f16679h0 && I(wVarB, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f16659I;
                                                actionBarOverlayLayout4.k();
                                                zV = ((i1) actionBarOverlayLayout4.f11470v).f20674a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z10 = wVarB.f16644m;
                                        if (z10) {
                                        }
                                        s(wVarB, true);
                                        zV = z10;
                                    }
                                    if (zV) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (F()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    sVar.f16626u = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f16676e0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            wVarB2 = B(0);
                            if (!wVarB2.f16644m) {
                                I(wVarB2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f16662L == null) {
                            wVarB = B(0);
                            interfaceC1239e0 = this.f16659I;
                            context = this.f16652B;
                            if (interfaceC1239e0 != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) interfaceC1239e0;
                                actionBarOverlayLayout5.k();
                                toolbar = ((i1) actionBarOverlayLayout5.f11470v).f20674a;
                                if (toolbar.getVisibility() == 0) {
                                    z10 = wVarB.f16644m;
                                    if (z10) {
                                    }
                                    s(wVarB, true);
                                    zV = z10;
                                } else {
                                    z10 = wVarB.f16644m;
                                    if (z10) {
                                    }
                                    s(wVarB, true);
                                    zV = z10;
                                }
                            } else {
                                z10 = wVarB.f16644m;
                                if (z10) {
                                }
                                s(wVarB, true);
                                zV = z10;
                            }
                            if (zV) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (F()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void v(int i10) {
        w wVarB = B(i10);
        if (wVarB.f16640h != null) {
            Bundle bundle = new Bundle();
            wVarB.f16640h.u(bundle);
            if (bundle.size() > 0) {
                wVarB.f16647p = bundle;
            }
            wVarB.f16640h.y();
            wVarB.f16640h.clear();
        }
        wVarB.f16646o = true;
        wVarB.f16645n = true;
        if ((i10 == 108 || i10 == 0) && this.f16659I != null) {
            w wVarB2 = B(0);
            wVarB2.f16642k = false;
            I(wVarB2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.Q) {
            return;
        }
        Context context = this.f16652B;
        int[] iArr = p073h.a.f16388k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f16671Z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.f16653C.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f16672a0) {
            viewGroup = this.f16670Y ? (ViewGroup) layoutInflaterFrom.inflate(com.ayah.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.ayah.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f16671Z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.ayah.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f16669X = false;
            this.f16668W = false;
        } else if (this.f16668W) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ayah.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new c(context, typedValue.resourceId) : context).inflate(com.ayah.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1239e0 interfaceC1239e0 = (InterfaceC1239e0) viewGroup.findViewById(com.ayah.R.id.decor_content_parent);
            this.f16659I = interfaceC1239e0;
            interfaceC1239e0.setWindowCallback(this.f16653C.getCallback());
            if (this.f16669X) {
                ((ActionBarOverlayLayout) this.f16659I).h(109);
            }
            if (this.U) {
                ((ActionBarOverlayLayout) this.f16659I).h(2);
            }
            if (this.f16667V) {
                ((ActionBarOverlayLayout) this.f16659I).h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f16668W + ", windowActionBarOverlay: " + this.f16669X + ", android:windowIsFloating: " + this.f16671Z + ", windowActionModeOverlay: " + this.f16670Y + ", windowNoTitle: " + this.f16672a0 + " }");
        }
        m mVar = new m(this);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(viewGroup, mVar);
        if (this.f16659I == null) {
            this.S = (TextView) viewGroup.findViewById(com.ayah.R.id.title);
        }
        boolean z10 = q1.f20766a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.ayah.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f16653C.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f16653C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new n(this));
        this.R = viewGroup;
        Object obj = this.f16651A;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f16658H;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1239e0 interfaceC1239e1 = this.f16659I;
            if (interfaceC1239e1 != null) {
                interfaceC1239e1.setWindowTitle(title);
            } else {
                b bVar = this.f16656F;
                if (bVar != null) {
                    bVar.b0(title);
                } else {
                    TextView textView = this.S;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.R.findViewById(R.id.content);
        View decorView = this.f16653C.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.Q = true;
        w wVarB = B(0);
        if (this.f16679h0 || wVarB.f16640h != null) {
            return;
        }
        D(108);
    }

    public final void x() {
        if (this.f16653C == null) {
            Object obj = this.f16651A;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f16653C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0332a y(Context context) {
        if (this.f16685n0 == null) {
            if (p074h0.i.f16419v == null) {
                Context applicationContext = context.getApplicationContext();
                p074h0.i.f16419v = new p074h0.i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f16685n0 = new t(this, p074h0.i.f16419v);
        }
        return this.f16685n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // p140o.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(p140o.k r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p084i.x.z(o.k):void");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
