package I1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0244b0 f3742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3745d;

    public i0(AbstractC0244b0 abstractC0244b0) {
        super(abstractC0244b0.f3712r);
        this.f3745d = new HashMap();
        this.f3742a = abstractC0244b0;
    }

    public final l0 a(WindowInsetsAnimation windowInsetsAnimation) {
        l0 l0Var = (l0) this.f3745d.get(windowInsetsAnimation);
        if (l0Var == null) {
            l0Var = new l0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                l0Var.f3759a = new j0(windowInsetsAnimation);
            }
            this.f3745d.put(windowInsetsAnimation, l0Var);
        }
        return l0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3742a.d(a(windowInsetsAnimation));
        this.f3745d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3742a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f3744c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f3744c = arrayList2;
            this.f3743b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            l0 l0VarA = a(windowInsetsAnimation);
            l0VarA.f3759a.e(windowInsetsAnimation.getFraction());
            this.f3744c.add(l0VarA);
        }
        return this.f3742a.f(B0.h(null, windowInsets), this.f3743b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        M.k kVarG = this.f3742a.g(a(windowInsetsAnimation), new M.k(bounds));
        kVarG.getClass();
        h0.c();
        return h0.a(((A1.c) kVarG.f5618s).e(), ((A1.c) kVarG.f5619t).e());
    }
}
