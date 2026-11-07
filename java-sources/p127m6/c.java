package p127m6;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.graphics.Bitmap;
import android.widget.Spinner;
import androidx.appcompat.widget.SwitchCompat;
import com.ayah.share.ShareActivity;
import java.io.IOException;
import p017b7.g;
import p110k9.y;
import p161p9.a;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ShareActivity f19630t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ShareActivity shareActivity, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f19628r = i10;
        this.f19630t = shareActivity;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f19628r) {
            case 0:
                return new c(this.f19630t, cVar, 0);
            default:
                return new c(this.f19630t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f19628r) {
            case 0:
                break;
        }
        return ((c) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i10 = this.f19628r;
        p150o9.c cVar = null;
        a aVar = a.f21156r;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                int i11 = this.f19629s;
                ShareActivity shareActivity = this.f19630t;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    Spinner spinner = shareActivity.f13925a0;
                    if (spinner == null) {
                        j.k("fromSpinner");
                        throw null;
                    }
                    int selectedItemId = ((int) spinner.getSelectedItemId()) - 1;
                    Spinner spinner2 = shareActivity.f13924Z;
                    if (spinner2 == null) {
                        j.k("toSpinner");
                        throw null;
                    }
                    int selectedItemId2 = ((int) spinner2.getSelectedItemId()) - 1;
                    ?? r10 = shareActivity.f13928d0;
                    if (r10 == 0) {
                        j.k("suraVerses");
                        throw null;
                    }
                    p124m3.j jVar = (p124m3.j) r10.get(selectedItemId);
                    ?? r11 = shareActivity.f13928d0;
                    if (r11 == 0) {
                        j.k("suraVerses");
                        throw null;
                    }
                    p124m3.j jVar2 = (p124m3.j) r11.get(selectedItemId2);
                    p057f4.c cVar2 = shareActivity.f13931g0;
                    if (cVar2 == null) {
                        j.k("quranShareUtil");
                        throw null;
                    }
                    int i12 = jVar.f19596n.f19528b;
                    int i13 = jVar.f19586b;
                    int i14 = jVar2.f19586b;
                    SwitchCompat switchCompat = shareActivity.f13923Y;
                    if (switchCompat == null) {
                        j.k("addBadgeSwitch");
                        throw null;
                    }
                    boolean zIsChecked = switchCompat.isChecked();
                    this.f19629s = 1;
                    obj = p057f4.c.a(cVar2, shareActivity, i12, i13, i14, zIsChecked, this, 96);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                int i15 = ShareActivity.f13920i0;
                g.n0(shareActivity, (Bitmap) obj);
                return yVar;
            default:
                int i16 = this.f19629s;
                if (i16 == 0) {
                    p110k9.a.e(obj);
                    this.f19629s = 1;
                    int i17 = ShareActivity.f13920i0;
                    R9.e eVar = H.f5322a;
                    Object objI = AbstractC0405x.I(d.f7436t, new c(this.f19630t, cVar, 0), this);
                    if (objI != aVar) {
                        objI = yVar;
                    }
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
        }
    }
}
