package M7;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X2.b f5749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5751c;

    public /* synthetic */ c(int i10, View view) {
        this.f5750b = i10;
        this.f5751c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f5750b) {
            case 0:
                BaseProgressIndicator baseProgressIndicator = (BaseProgressIndicator) this.f5751c;
                baseProgressIndicator.setIndeterminate(false);
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.f15104s, baseProgressIndicator.f15105t);
                break;
            case 1:
                BaseProgressIndicator baseProgressIndicator2 = (BaseProgressIndicator) this.f5751c;
                if (!baseProgressIndicator2.f15109x) {
                    baseProgressIndicator2.setVisibility(baseProgressIndicator2.f15110y);
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.f5751c).f14774F;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f5750b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f5751c;
                ColorStateList colorStateList = materialCheckBox.f14774F;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f14778J, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
