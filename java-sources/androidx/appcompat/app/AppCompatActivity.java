package androidx.appcompat.app;

import C2.g;
import E1.e;
import F2.y;
import L5.c;
import M2.a;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import j$.util.Objects;
import p050e8.b;
import p084i.E;
import p084i.InterfaceC0960h;
import p084i.J;
import p084i.k;
import p084i.q;
import p084i.x;
import p130n.h;
import p151p.C1273w;
import p151p.n1;
import p216w1.w;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0960h {
    public x R;

    public AppCompatActivity() {
        ((c) this.f11380u.f5533t).L("androidx:appcompat", new a(this));
        k(new I5.a(this, 6));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        x xVar = (x) o();
        xVar.w();
        ((ViewGroup) xVar.R.findViewById(R.id.content)).addView(view, layoutParams);
        xVar.f16654D.a(xVar.f16653C.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:0x019d  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:90:0x014b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        p130n.c cVar;
        float f3;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        x xVar = (x) o();
        xVar.f16677f0 = true;
        int i47 = xVar.f16681j0;
        if (i47 == -100) {
            i47 = k.f16609s;
        }
        int iE = xVar.E(context, i47);
        if (k.c(context) && k.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (k.f16616z) {
                    try {
                        e eVar = k.f16610t;
                        if (eVar == null) {
                            if (k.f16611u == null) {
                                k.f16611u = e.b(p216w1.e.e(context));
                            }
                            if (!k.f16611u.f1426a.isEmpty()) {
                                k.f16610t = k.f16611u;
                            }
                        } else if (!eVar.equals(k.f16611u)) {
                            e eVar2 = k.f16610t;
                            k.f16611u = eVar2;
                            p216w1.e.d(context, eVar2.f1426a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!k.f16613w) {
                k.f16608r.execute(new g(context, 2));
            }
        }
        e eVarO = x.o(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(x.t(context, iE, eVarO, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof p130n.c) {
                    try {
                        ((p130n.c) context).a(x.t(context, iE, eVarO, null, false));
                    } catch (IllegalStateException unused2) {
                        if (x.f16648A0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f3 = configuration.fontScale;
                                    f7 = configuration2.fontScale;
                                    if (f3 != f7) {
                                        configuration3.fontScale = f7;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    i14 = Build.VERSION.SDK_INT;
                                    if (i14 >= 24) {
                                        q.a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i15 = configuration.touchscreen;
                                    i16 = configuration2.touchscreen;
                                    if (i15 != i16) {
                                        configuration3.touchscreen = i16;
                                    }
                                    i17 = configuration.keyboard;
                                    i18 = configuration2.keyboard;
                                    if (i17 != i18) {
                                        configuration3.keyboard = i18;
                                    }
                                    i19 = configuration.keyboardHidden;
                                    i20 = configuration2.keyboardHidden;
                                    if (i19 != i20) {
                                        configuration3.keyboardHidden = i20;
                                    }
                                    i21 = configuration.navigation;
                                    i22 = configuration2.navigation;
                                    if (i21 != i22) {
                                        configuration3.navigation = i22;
                                    }
                                    i23 = configuration.navigationHidden;
                                    i24 = configuration2.navigationHidden;
                                    if (i23 != i24) {
                                        configuration3.navigationHidden = i24;
                                    }
                                    i25 = configuration.orientation;
                                    i26 = configuration2.orientation;
                                    if (i25 != i26) {
                                        configuration3.orientation = i26;
                                    }
                                    i27 = configuration.screenLayout & 15;
                                    i28 = configuration2.screenLayout & 15;
                                    if (i27 != i28) {
                                        configuration3.screenLayout |= i28;
                                    }
                                    i29 = configuration.screenLayout & 192;
                                    i30 = configuration2.screenLayout & 192;
                                    if (i29 != i30) {
                                        configuration3.screenLayout |= i30;
                                    }
                                    i31 = configuration.screenLayout & 48;
                                    i32 = configuration2.screenLayout & 48;
                                    if (i31 != i32) {
                                        configuration3.screenLayout |= i32;
                                    }
                                    i33 = configuration.screenLayout & 768;
                                    i34 = configuration2.screenLayout & 768;
                                    if (i33 != i34) {
                                        configuration3.screenLayout |= i34;
                                    }
                                    if (i14 >= 26) {
                                        Z6.a.b(configuration, configuration2, configuration3);
                                    }
                                    i35 = configuration.uiMode & 15;
                                    i36 = configuration2.uiMode & 15;
                                    if (i35 != i36) {
                                        configuration3.uiMode |= i36;
                                    }
                                    i37 = configuration.uiMode & 48;
                                    i38 = configuration2.uiMode & 48;
                                    if (i37 != i38) {
                                        configuration3.uiMode |= i38;
                                    }
                                    i39 = configuration.screenWidthDp;
                                    i40 = configuration2.screenWidthDp;
                                    if (i39 != i40) {
                                        configuration3.screenWidthDp = i40;
                                    }
                                    i41 = configuration.screenHeightDp;
                                    i42 = configuration2.screenHeightDp;
                                    if (i41 != i42) {
                                        configuration3.screenHeightDp = i42;
                                    }
                                    i43 = configuration.smallestScreenWidthDp;
                                    i44 = configuration2.smallestScreenWidthDp;
                                    if (i43 != i44) {
                                        configuration3.smallestScreenWidthDp = i44;
                                    }
                                    i45 = configuration.densityDpi;
                                    i46 = configuration2.densityDpi;
                                    if (i45 != i46) {
                                        configuration3.densityDpi = i46;
                                    }
                                }
                            }
                            Configuration configurationT = x.t(context, iE, eVarO, configuration3, true);
                            cVar = new p130n.c(context, com.ayah.R.style.Theme_AppCompat_Empty);
                            cVar.a(configurationT);
                            try {
                                if (context.getTheme() != null) {
                                    p244z1.a.n(cVar.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = cVar;
                        }
                    }
                } else if (x.f16648A0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f3 = configuration.fontScale;
                            f7 = configuration2.fontScale;
                            if (f3 != f7) {
                                configuration3.fontScale = f7;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 24) {
                                q.a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i15 = configuration.touchscreen;
                            i16 = configuration2.touchscreen;
                            if (i15 != i16) {
                                configuration3.touchscreen = i16;
                            }
                            i17 = configuration.keyboard;
                            i18 = configuration2.keyboard;
                            if (i17 != i18) {
                                configuration3.keyboard = i18;
                            }
                            i19 = configuration.keyboardHidden;
                            i20 = configuration2.keyboardHidden;
                            if (i19 != i20) {
                                configuration3.keyboardHidden = i20;
                            }
                            i21 = configuration.navigation;
                            i22 = configuration2.navigation;
                            if (i21 != i22) {
                                configuration3.navigation = i22;
                            }
                            i23 = configuration.navigationHidden;
                            i24 = configuration2.navigationHidden;
                            if (i23 != i24) {
                                configuration3.navigationHidden = i24;
                            }
                            i25 = configuration.orientation;
                            i26 = configuration2.orientation;
                            if (i25 != i26) {
                                configuration3.orientation = i26;
                            }
                            i27 = configuration.screenLayout & 15;
                            i28 = configuration2.screenLayout & 15;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.screenLayout & 192;
                            i30 = configuration2.screenLayout & 192;
                            if (i29 != i30) {
                                configuration3.screenLayout |= i30;
                            }
                            i31 = configuration.screenLayout & 48;
                            i32 = configuration2.screenLayout & 48;
                            if (i31 != i32) {
                                configuration3.screenLayout |= i32;
                            }
                            i33 = configuration.screenLayout & 768;
                            i34 = configuration2.screenLayout & 768;
                            if (i33 != i34) {
                                configuration3.screenLayout |= i34;
                            }
                            if (i14 >= 26) {
                                Z6.a.b(configuration, configuration2, configuration3);
                            }
                            i35 = configuration.uiMode & 15;
                            i36 = configuration2.uiMode & 15;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.uiMode & 48;
                            i38 = configuration2.uiMode & 48;
                            if (i37 != i38) {
                                configuration3.uiMode |= i38;
                            }
                            i39 = configuration.screenWidthDp;
                            i40 = configuration2.screenWidthDp;
                            if (i39 != i40) {
                                configuration3.screenWidthDp = i40;
                            }
                            i41 = configuration.screenHeightDp;
                            i42 = configuration2.screenHeightDp;
                            if (i41 != i42) {
                                configuration3.screenHeightDp = i42;
                            }
                            i43 = configuration.smallestScreenWidthDp;
                            i44 = configuration2.smallestScreenWidthDp;
                            if (i43 != i44) {
                                configuration3.smallestScreenWidthDp = i44;
                            }
                            i45 = configuration.densityDpi;
                            i46 = configuration2.densityDpi;
                            if (i45 != i46) {
                                configuration3.densityDpi = i46;
                            }
                        }
                    }
                    Configuration configurationT2 = x.t(context, iE, eVarO, configuration3, true);
                    cVar = new p130n.c(context, com.ayah.R.style.Theme_AppCompat_Empty);
                    cVar.a(configurationT2);
                    if (context.getTheme() != null) {
                        p244z1.a.n(cVar.getTheme());
                    }
                    context = cVar;
                }
            }
        } else if (context instanceof p130n.c) {
            ((p130n.c) context).a(x.t(context, iE, eVarO, null, false));
        } else if (x.f16648A0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f3 = configuration.fontScale;
                    f7 = configuration2.fontScale;
                    if (f3 != f7) {
                        configuration3.fontScale = f7;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        q.a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i15 = configuration.touchscreen;
                    i16 = configuration2.touchscreen;
                    if (i15 != i16) {
                        configuration3.touchscreen = i16;
                    }
                    i17 = configuration.keyboard;
                    i18 = configuration2.keyboard;
                    if (i17 != i18) {
                        configuration3.keyboard = i18;
                    }
                    i19 = configuration.keyboardHidden;
                    i20 = configuration2.keyboardHidden;
                    if (i19 != i20) {
                        configuration3.keyboardHidden = i20;
                    }
                    i21 = configuration.navigation;
                    i22 = configuration2.navigation;
                    if (i21 != i22) {
                        configuration3.navigation = i22;
                    }
                    i23 = configuration.navigationHidden;
                    i24 = configuration2.navigationHidden;
                    if (i23 != i24) {
                        configuration3.navigationHidden = i24;
                    }
                    i25 = configuration.orientation;
                    i26 = configuration2.orientation;
                    if (i25 != i26) {
                        configuration3.orientation = i26;
                    }
                    i27 = configuration.screenLayout & 15;
                    i28 = configuration2.screenLayout & 15;
                    if (i27 != i28) {
                        configuration3.screenLayout |= i28;
                    }
                    i29 = configuration.screenLayout & 192;
                    i30 = configuration2.screenLayout & 192;
                    if (i29 != i30) {
                        configuration3.screenLayout |= i30;
                    }
                    i31 = configuration.screenLayout & 48;
                    i32 = configuration2.screenLayout & 48;
                    if (i31 != i32) {
                        configuration3.screenLayout |= i32;
                    }
                    i33 = configuration.screenLayout & 768;
                    i34 = configuration2.screenLayout & 768;
                    if (i33 != i34) {
                        configuration3.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        Z6.a.b(configuration, configuration2, configuration3);
                    }
                    i35 = configuration.uiMode & 15;
                    i36 = configuration2.uiMode & 15;
                    if (i35 != i36) {
                        configuration3.uiMode |= i36;
                    }
                    i37 = configuration.uiMode & 48;
                    i38 = configuration2.uiMode & 48;
                    if (i37 != i38) {
                        configuration3.uiMode |= i38;
                    }
                    i39 = configuration.screenWidthDp;
                    i40 = configuration2.screenWidthDp;
                    if (i39 != i40) {
                        configuration3.screenWidthDp = i40;
                    }
                    i41 = configuration.screenHeightDp;
                    i42 = configuration2.screenHeightDp;
                    if (i41 != i42) {
                        configuration3.screenHeightDp = i42;
                    }
                    i43 = configuration.smallestScreenWidthDp;
                    i44 = configuration2.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration3.smallestScreenWidthDp = i44;
                    }
                    i45 = configuration.densityDpi;
                    i46 = configuration2.densityDpi;
                    if (i45 != i46) {
                        configuration3.densityDpi = i46;
                    }
                }
            }
            Configuration configurationT3 = x.t(context, iE, eVarO, configuration3, true);
            cVar = new p130n.c(context, com.ayah.R.style.Theme_AppCompat_Empty);
            cVar.a(configurationT3);
            if (context.getTheme() != null) {
                p244z1.a.n(cVar.getTheme());
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        b bVarP = p();
        if (getWindow().hasFeature(0)) {
            if (bVarP == null || !bVarP.m()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        b bVarP = p();
        if (keyCode == 82 && bVarP != null && bVarP.O(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        x xVar = (x) o();
        xVar.w();
        return xVar.f16653C.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        x xVar = (x) o();
        if (xVar.f16657G == null) {
            xVar.C();
            b bVar = xVar.f16656F;
            xVar.f16657G = new h(bVar != null ? bVar.B() : xVar.f16652B);
        }
        return xVar.f16657G;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = n1.f20750a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        o().b();
    }

    public final k o() {
        if (this.R == null) {
            y yVar = k.f16608r;
            this.R = new x(this, null, this, this);
        }
        return this.R;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x xVar = (x) o();
        if (xVar.f16668W && xVar.Q) {
            xVar.C();
            b bVar = xVar.f16656F;
            if (bVar != null) {
                bVar.L();
            }
        }
        C1273w c1273wA = C1273w.a();
        Context context = xVar.f16652B;
        synchronized (c1273wA) {
            c1273wA.f20798a.l(context);
        }
        xVar.f16680i0 = new Configuration(xVar.f16652B.getResources().getConfiguration());
        xVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intentB;
        if (!super.onMenuItemSelected(i10, menuItem)) {
            b bVarP = p();
            if (menuItem.getItemId() != 16908332 || bVarP == null || (bVarP.w() & 4) == 0 || (intentB = p216w1.e.b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            w wVar = new w(this);
            Intent intentB2 = p216w1.e.b(this);
            if (intentB2 == null) {
                intentB2 = p216w1.e.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(wVar.f23625s.getPackageManager());
                }
                wVar.b(component);
                wVar.f23624r.add(intentB2);
            }
            wVar.c();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((x) o()).w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        x xVar = (x) o();
        xVar.C();
        b bVar = xVar.f16656F;
        if (bVar != null) {
            bVar.a0(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((x) o()).m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        x xVar = (x) o();
        xVar.C();
        b bVar = xVar.f16656F;
        if (bVar != null) {
            bVar.a0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        o().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        b bVarP = p();
        if (getWindow().hasFeature(0)) {
            if (bVarP == null || !bVarP.P()) {
                super.openOptionsMenu();
            }
        }
    }

    public final b p() {
        x xVar = (x) o();
        xVar.C();
        return xVar.f16656F;
    }

    public final void q(Toolbar toolbar) {
        x xVar = (x) o();
        if (xVar.f16651A instanceof Activity) {
            xVar.C();
            b bVar = xVar.f16656F;
            if (bVar instanceof J) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            xVar.f16657G = null;
            if (bVar != null) {
                bVar.M();
            }
            xVar.f16656F = null;
            if (toolbar != null) {
                Object obj = xVar.f16651A;
                E e10 = new E(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : xVar.f16658H, xVar.f16654D);
                xVar.f16656F = e10;
                xVar.f16654D.f16624s = e10.g;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                xVar.f16654D.f16624s = null;
            }
            xVar.b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        l();
        o().h(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((x) o()).f16682k0 = i10;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        l();
        o().i(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        o().j(view, layoutParams);
    }
}
