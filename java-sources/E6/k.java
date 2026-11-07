package E6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1940a;

    public /* synthetic */ k(Context context) {
        this.f1940a = context;
    }

    public static k b(Context context) {
        k kVar = new k();
        kVar.f1940a = context;
        return kVar;
    }

    public l a() {
        Context context = this.f1940a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l lVar = new l();
        lVar.f1941r = G6.a.a(o.f1949a);
        F6.d dVar = new F6.d(1, context);
        lVar.f1942s = dVar;
        lVar.f1943t = G6.a.a(new F6.f(dVar, new F6.d(0, dVar), 0));
        F6.d dVar2 = lVar.f1942s;
        lVar.f1944u = new L6.e(dVar2, 1);
        p101j9.a aVarA = G6.a.a(new F6.f(lVar.f1944u, G6.a.a(new L6.e(dVar2, 0)), 1));
        lVar.f1945v = aVarA;
        p pVar = new p(1);
        F6.d dVar3 = lVar.f1942s;
        w wVar = new w(dVar3, aVarA, pVar, 1);
        p101j9.a aVar = lVar.f1941r;
        p101j9.a aVar2 = lVar.f1943t;
        lVar.f1946w = G6.a.a(new w(new J6.d(aVar, aVar2, wVar, aVarA, aVarA), new K6.j(dVar3, aVar2, aVarA, wVar, aVar, aVarA, aVarA), new K6.k(aVar, aVarA, wVar, aVarA), 0));
        return lVar;
    }

    public int c() {
        Configuration configuration = this.f1940a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int d() {
        Context context = this.f1940a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p073h.a.f16380a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }
}
