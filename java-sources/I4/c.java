package I4;

import A4.k;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import W.P;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f3830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f3831t;

    public /* synthetic */ c(InterfaceC0402u interfaceC0402u, P p10, int i10) {
        this.f3829r = i10;
        this.f3830s = interfaceC0402u;
        this.f3831t = p10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f3829r;
        y yVar = y.f19095a;
        P p10 = this.f3831t;
        InterfaceC0402u interfaceC0402u = this.f3830s;
        switch (i10) {
            case 0:
                int i11 = AyahMenuWrapper.f13763v;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 1), 3);
                return yVar;
            case 1:
                int i12 = KhatmahWrapper.f13794v;
                return AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 2), 3);
            case 2:
                int i13 = TodayPage.f13902v;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 4), 3);
                return yVar;
            case 3:
                int i14 = TodayPage.f13902v;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 3), 3);
                return yVar;
            case 4:
                int i15 = EditLibraryComposePage.f13797v;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 6), 3);
                return yVar;
            case 5:
                int i16 = EditLibraryComposePage.f13797v;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 5), 3);
                return yVar;
            case 6:
                int i17 = LibraryComposePage.f13804x;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 8), 3);
                return yVar;
            default:
                int i18 = LibraryComposePage.f13804x;
                AbstractC0405x.x(interfaceC0402u, null, new k(p10, null, 7), 3);
                return yVar;
        }
    }
}
