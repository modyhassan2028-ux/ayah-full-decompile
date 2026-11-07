package P3;

import D.X;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import Z.C0698o;
import com.ayah.R;
import com.ayah.common.ui.bookmarklist.view.wrapper.BookmarkListWrapper;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6635s;

    public /* synthetic */ f(int i10, boolean z10) {
        this.f6634r = i10;
        this.f6635s = z10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6634r;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                X x9 = (X) obj;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j.e(x9, "$this$TitleImageRow");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0698o.g(x9) ? 4 : 2;
                }
                if (!c0698o.K(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c0698o.N();
                } else {
                    androidx.compose.animation.b.b(x9, this.f6635s, null, null, null, null, e.f6632c, c0698o, (iIntValue & 14) | 1572864, 30);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i11 = BookmarkListWrapper.f13703v;
                j.e((X) obj, "$this$TextButton");
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c0698o2.N();
                } else {
                    AbstractC0542b2.b(p000a.a.m0(this.f6635s ? R.string.done : R.string.edit, c0698o2), null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).f8567m, c0698o2, 0, 0, 65530);
                }
                break;
        }
        return yVar;
    }
}
