package L1;

import I1.I;
import I1.S;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5440b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A1.c f5441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.c f5442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5443e;

    public d(ViewGroup viewGroup) {
        A1.c cVar = A1.c.f461e;
        this.f5441c = cVar;
        this.f5442d = cVar;
        Drawable background = viewGroup.getBackground();
        this.f5443e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b bVar = new b(this, viewGroup.getContext(), viewGroup);
        this.f5439a = bVar;
        bVar.setWillNotDraw(true);
        C6.b bVar2 = new C6.b(8, this);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(bVar, bVar2);
        S.r(bVar, new c(this));
        viewGroup.addView(bVar, 0);
    }
}
