package F7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f2424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2425c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p248z6.c f2426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p137n7.e f2427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p137n7.e f2428f;

    public b(ExtendedFloatingActionButton extendedFloatingActionButton, p248z6.c cVar) {
        this.f2424b = extendedFloatingActionButton;
        this.f2423a = extendedFloatingActionButton.getContext();
        this.f2426d = cVar;
    }

    public AnimatorSet a() {
        p137n7.e eVar = this.f2428f;
        if (eVar == null) {
            if (this.f2427e == null) {
                this.f2427e = p137n7.e.b(this.f2423a, c());
            }
            eVar = this.f2427e;
            eVar.getClass();
        }
        return b(eVar);
    }

    public final AnimatorSet b(p137n7.e eVar) {
        ArrayList arrayList = new ArrayList();
        boolean zG = eVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2424b;
        if (zG) {
            arrayList.add(eVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (eVar.g("scale")) {
            arrayList.add(eVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(eVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (eVar.g("width")) {
            arrayList.add(eVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f14912c0));
        }
        if (eVar.g("height")) {
            arrayList.add(eVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f14913d0));
        }
        if (eVar.g("paddingStart")) {
            arrayList.add(eVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f14914e0));
        }
        if (eVar.g("paddingEnd")) {
            arrayList.add(eVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f14915f0));
        }
        if (eVar.g("labelOpacity")) {
            arrayList.add(eVar.d("labelOpacity", extendedFloatingActionButton, new a(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        p050e8.b.R(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.f2426d.f24847s = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
