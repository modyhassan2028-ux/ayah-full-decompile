package A8;

import B6.f;
import E6.u;
import I1.B0;
import I1.C0259l;
import I1.r;
import android.os.Build;
import android.view.View;
import com.ayah.feature.quran.view.QuranPage;
import com.ayah.feature.reciterlist.RecitersActivity;
import com.google.firebase.datatransport.TransportRegistrar;
import p071g9.d;
import p071g9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p100j8.c, f, d, r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f553r;

    public /* synthetic */ c(int i10) {
        this.f553r = i10;
    }

    @Override // p071g9.d
    public void a(View view, B0 b5, p071g9.f fVar) {
        int i10 = QuranPage.f13836z;
        j.e(view, "view");
        C0259l c0259lF = b5.f3671a.f();
        if (c0259lF != null) {
            e eVar = fVar.f16349a;
            int i11 = Build.VERSION.SDK_INT;
            int iMax = Math.max(i11 >= 28 ? B1.a.i(c0259lF.f3758a) : 0, i11 >= 28 ? B1.a.f(c0259lF.f3758a) : 0);
            int iMax2 = Math.max(i11 >= 28 ? B1.a.g(c0259lF.f3758a) : 0, i11 >= 28 ? B1.a.h(c0259lF.f3758a) : 0);
            view.setPadding(eVar.f16345a + iMax2, eVar.f16346b + iMax, eVar.f16347c + iMax2, eVar.f16348d + iMax);
        }
    }

    @Override // B6.f
    public void b(Exception exc) {
    }

    @Override // p100j8.c
    public Object c(u uVar) {
        switch (this.f553r) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(uVar);
            case 1:
                return TransportRegistrar.lambda$getComponents$1(uVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(uVar);
        }
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        switch (this.f553r) {
            case 18:
                int i10 = RecitersActivity.f13853Z;
                j.e(view, "v");
                A1.c cVarG = b5.f3671a.g(519);
                j.d(cVarG, "getInsets(...)");
                view.setPadding(0, cVarG.f463b, 0, 0);
                break;
            default:
                int i11 = RecitersActivity.f13853Z;
                j.e(view, "v");
                A1.c cVarG2 = b5.f3671a.g(647);
                j.d(cVarG2, "getInsets(...)");
                view.setPadding(cVarG2.f462a, 0, cVarG2.f464c, cVarG2.f465d);
                break;
        }
        return b5;
    }
}
