package I4;

import Z.F;
import com.ayah.MainActivity;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.library.view.LibraryComposePage;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3838s;

    public /* synthetic */ e(MainActivity mainActivity, int i10) {
        this.f3837r = i10;
        this.f3838s = mainActivity;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f3837r;
        MainActivity mainActivity = this.f3838s;
        switch (i10) {
            case 0:
                int i11 = AyahMenuWrapper.f13763v;
                j.e((F) obj, "$this$DisposableEffect");
                return new g(mainActivity, 0);
            case 1:
                String str = (String) obj;
                int i12 = MainActivity.f13622J0;
                j.e(str, "it");
                p236y3.a aVar = mainActivity.f13625C0;
                if (aVar != null) {
                    aVar.a(str);
                    return y.f19095a;
                }
                j.k("searchModel");
                throw null;
            default:
                int i13 = LibraryComposePage.f13804x;
                j.e((F) obj, "$this$DisposableEffect");
                return new g(mainActivity, 1);
        }
    }
}
