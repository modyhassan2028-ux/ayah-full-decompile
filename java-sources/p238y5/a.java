package p238y5;

import C4.g;
import Z.C0690k;
import Z.C0698o;
import com.ayah.feature.notelist.ui.wrapper.NotesListWrapper;
import p074h0.j;
import p110k9.y;
import p220w5.d;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NotesListWrapper f24648s;

    public /* synthetic */ a(NotesListWrapper notesListWrapper, int i10) {
        this.f24647r = i10;
        this.f24648s = notesListWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f24647r;
        int i11 = 2;
        int i12 = 1;
        y yVar = y.f19095a;
        NotesListWrapper notesListWrapper = this.f24648s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = NotesListWrapper.f13820u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(1106130825, new a(notesListWrapper, i12), c0698o), c0698o, 48);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = NotesListWrapper.f13820u;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    d presenter = notesListWrapper.getPresenter();
                    C4.e eVar = new C4.e(22, new C4.e(21, new g(presenter.f23741a.f22896b, presenter, 28)));
                    boolean zI = c0698o2.i(notesListWrapper);
                    Object objH = c0698o2.H();
                    if (zI || objH == C0690k.f10683a) {
                        objH = new a(notesListWrapper, i11);
                        c0698o2.e0(objH);
                    }
                    p229x5.a.c(eVar, (e) objH, c0698o2, 0);
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = NotesListWrapper.f13820u;
                notesListWrapper.getPresenter().f23743c.a(iIntValue3, iIntValue4, null);
                break;
        }
        return yVar;
    }
}
