package W7;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.material.tabs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9645a;

    public /* synthetic */ a(int i10) {
        this.f9645a = i10;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f9645a) {
            case 0:
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
                RectF rectFA2 = com.google.android.material.tabs.a.a(tabLayout, view2);
                if (rectFA.left < rectFA2.left) {
                    double d5 = (((double) f3) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d5));
                    fCos = (float) Math.sin(d5);
                } else {
                    double d9 = (((double) f3) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d9);
                    fCos = (float) (1.0d - Math.cos(d9));
                }
                drawable.setBounds(p137n7.a.c((int) rectFA.left, fSin, (int) rectFA2.left), drawable.getBounds().top, p137n7.a.c((int) rectFA.right, fCos, (int) rectFA2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f3 >= 0.5f) {
                    view = view2;
                }
                RectF rectFA3 = com.google.android.material.tabs.a.a(tabLayout, view);
                float fB = f3 < 0.5f ? p137n7.a.b(1.0f, 0.0f, 0.0f, 0.5f, f3) : p137n7.a.b(0.0f, 1.0f, 0.5f, 1.0f, f3);
                drawable.setBounds((int) rectFA3.left, drawable.getBounds().top, (int) rectFA3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
