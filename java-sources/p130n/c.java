package p130n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f19726f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f19728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f19729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f19730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f19731e;

    public c(Context context, int i10) {
        super(context);
        this.f19727a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f19731e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f19730d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f19730d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f19728b == null) {
            this.f19728b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f19728b.setTo(theme);
            }
        }
        this.f19728b.applyStyle(this.f19727a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f19731e == null) {
            Configuration configuration = this.f19730d;
            if (configuration == null) {
                this.f19731e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f19726f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f19726f = configuration2;
                    }
                    if (configuration.equals(f19726f)) {
                        this.f19731e = super.getResources();
                    }
                }
                this.f19731e = createConfigurationContext(this.f19730d).getResources();
            }
        }
        return this.f19731e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f19729c == null) {
            this.f19729c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f19729c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f19728b;
        if (theme != null) {
            return theme;
        }
        if (this.f19727a == 0) {
            this.f19727a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f19728b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f19727a != i10) {
            this.f19727a = i10;
            b();
        }
    }
}
