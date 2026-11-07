package H5;

import A.C0030l0;
import G5.j;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import android.view.View;
import android.widget.ScrollView;
import com.ayah.feature.quran.view.QuranPage;
import com.ayah.feature.quran.view.QuranPageImageView;
import com.ayah.feature.quran.view.QuranPageViewGroup;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ QuranPage f3401t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(QuranPage quranPage, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f3399r = i10;
        this.f3401t = quranPage;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3399r) {
            case 0:
                f fVar = new f(this.f3401t, cVar, 0);
                fVar.f3400s = ((Number) obj).intValue();
                return fVar;
            default:
                return new f(this.f3401t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3399r) {
            case 0:
                f fVar = (f) create(Integer.valueOf(((Number) obj).intValue()), (p150o9.c) obj2);
                y yVar = y.f19095a;
                fVar.invokeSuspend(yVar);
                return yVar;
            default:
                return ((f) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f3399r;
        QuranPage quranPage = this.f3401t;
        switch (i10) {
            case 0:
                int i11 = this.f3400s;
                p110k9.a.e(obj);
                QuranPageViewGroup quranPageViewGroup = quranPage.f13837t;
                QuranPageImageView quranPageImageView = quranPageViewGroup.f13846s;
                if (quranPageViewGroup.f13850w) {
                    float fFloor = (float) Math.floor((((quranPageImageView.getHeight() - ((quranPageImageView.getWidth() * 174) / 1080)) / 14.0f) * i11) - 1);
                    View view = quranPageViewGroup.f13845r;
                    ScrollView scrollView = view instanceof ScrollView ? (ScrollView) view : null;
                    if (scrollView != null) {
                        scrollView.smoothScrollTo(0, (int) fFloor);
                    }
                }
                return y.f19095a;
            default:
                int i12 = this.f3400s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                j presenter = quranPage.getPresenter();
                int i13 = quranPage.f13839v;
                this.f3400s = 1;
                presenter.getClass();
                R9.e eVar = H.f5322a;
                Object objI = AbstractC0405x.I(R9.d.f7436t, new C0030l0(presenter, i13, (p150o9.c) null), this);
                p161p9.a aVar = p161p9.a.f21156r;
                return objI == aVar ? aVar : objI;
        }
    }
}
