package F7;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2429a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2430b;

    public c(d dVar) {
        this.f2430b = dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f2429a) {
            case 1:
                return ((Drawable.ConstantState) this.f2430b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f2429a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f2430b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f2429a) {
            case 0:
                return (d) this.f2430b;
            default:
                X2.e eVar = new X2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2430b).newDrawable();
                eVar.f9876r = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f9874w);
                return eVar;
        }
    }

    public c(Drawable.ConstantState constantState) {
        this.f2430b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f2429a) {
            case 1:
                X2.e eVar = new X2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2430b).newDrawable(resources);
                eVar.f9876r = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f9874w);
                return eVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f2429a) {
            case 1:
                X2.e eVar = new X2.e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2430b).newDrawable(resources, theme);
                eVar.f9876r = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f9874w);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
