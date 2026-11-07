package W2;

import I1.B0;
import I1.C0259l;
import I1.y0;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.window.OnBackInvokedDispatcher;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsSharedRealm;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements o, X7.x, I1.r, p071g9.d, ObjectServerFacade.RealmCacheAccessor, ObjectServerFacade.RealmInstanceFactory, I8.a, p100j8.c, p118l7.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9549r;

    public /* synthetic */ n(int i10) {
        this.f9549r = i10;
    }

    private final void d(I8.b bVar) {
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // p071g9.d
    public void a(View view, B0 b5, p071g9.f fVar) {
        int i10 = TafsirPage.f13889D;
        p251z9.j.e(view, "view");
        C0259l c0259lF = b5.f3671a.f();
        if (c0259lF != null) {
            p071g9.e eVar = fVar.f16349a;
            int i11 = Build.VERSION.SDK_INT;
            int iMax = Math.max(i11 >= 28 ? B1.a.i(c0259lF.f3758a) : 0, i11 >= 28 ? B1.a.f(c0259lF.f3758a) : 0);
            int iMax2 = Math.max(i11 >= 28 ? B1.a.g(c0259lF.f3758a) : 0, i11 >= 28 ? B1.a.h(c0259lF.f3758a) : 0);
            view.setPadding(eVar.f16345a + iMax2, eVar.f16346b + iMax, eVar.f16347c + iMax2, eVar.f16348d + iMax);
        }
    }

    @Override // W2.o
    public void b(m mVar, p pVar, boolean z10) {
        mVar.c();
    }

    @Override // p100j8.c
    public Object c(E6.u uVar) {
        switch (this.f9549r) {
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15395a.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15397c.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15396b.get();
            default:
                p100j8.l lVar = ExecutorsRegistrar.f15395a;
                return p109k8.j.f19063r;
        }
    }

    @Override // io.realm.internal.ObjectServerFacade.RealmInstanceFactory
    public Realm createInstance(OsSharedRealm osSharedRealm) {
        return Realm.createInstance(osSharedRealm);
    }

    @Override // io.realm.internal.ObjectServerFacade.RealmCacheAccessor
    public Realm createRealmOrGetFromCache(RealmConfiguration realmConfiguration, OsSharedRealm.VersionID versionID) {
        return Realm.lambda$initializeRealm$0(realmConfiguration, versionID);
    }

    @Override // I8.a
    public void e(I8.b bVar) {
        switch (this.f9549r) {
            case 20:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // p118l7.e
    public void h(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        int[] iArr = DrawerLayout.f12532h0;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        y0 y0Var = b5.f3671a;
        drawerLayout.setChildInsets(b5, y0Var.l().f463b > 0);
        return y0Var.c();
    }
}
