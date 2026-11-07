package p035d3;

import F2.t;
import N9.k0;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.ayah.MainActivity;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.ui.util.view.PermissionsRequestWrapper;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p165q3.d;
import p165q3.h;
import p241y9.e;
import p251z9.j;
import q9.i;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class B extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15579t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(MainActivity mainActivity, c cVar, int i10) {
        super(2, cVar);
        this.f15577r = i10;
        this.f15579t = mainActivity;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f15577r) {
            case 0:
                B b5 = new B(this.f15579t, cVar, 0);
                b5.f15578s = obj;
                return b5;
            case 1:
                B b10 = new B(this.f15579t, cVar, 1);
                b10.f15578s = obj;
                return b10;
            case 2:
                B b11 = new B(this.f15579t, cVar, 2);
                b11.f15578s = obj;
                return b11;
            case 3:
                B b12 = new B(this.f15579t, cVar, 3);
                b12.f15578s = obj;
                return b12;
            case 4:
                B b13 = new B(this.f15579t, cVar, 4);
                b13.f15578s = obj;
                return b13;
            default:
                B b14 = new B(this.f15579t, cVar, 5);
                b14.f15578s = obj;
                return b14;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15577r) {
            case 0:
                B b5 = (B) create((BookType) obj, (c) obj2);
                y yVar = y.f19095a;
                b5.invokeSuspend(yVar);
                return yVar;
            case 1:
                B b10 = (B) create((z3.e) obj, (c) obj2);
                y yVar2 = y.f19095a;
                b10.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                B b11 = (B) create((d) obj, (c) obj2);
                y yVar3 = y.f19095a;
                b11.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                B b12 = (B) create((h) obj, (c) obj2);
                y yVar4 = y.f19095a;
                b12.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                B b13 = (B) create((p227x3.c) obj, (c) obj2);
                y yVar5 = y.f19095a;
                b13.invokeSuspend(yVar5);
                return yVar5;
            default:
                B b14 = (B) create((p227x3.e) obj, (c) obj2);
                y yVar6 = y.f19095a;
                b14.invokeSuspend(yVar6);
                return yVar6;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15577r;
        MainActivity mainActivity = this.f15579t;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                BookType bookType = (BookType) this.f15578s;
                a.e(obj);
                TextView textView = mainActivity.f13643h0;
                if (textView != null) {
                    textView.setText(bookType.f13687c);
                    return yVar;
                }
                j.k("tafsirSelection");
                throw null;
            case 1:
                z3.e eVar = (z3.e) this.f15578s;
                a.e(obj);
                if (mainActivity.f13655t0) {
                    if (eVar instanceof z3.a) {
                        int i11 = eVar.f24786a;
                        int i12 = ((z3.a) eVar).f24782b;
                        MenuItem menuItem = mainActivity.f13653r0;
                        if (menuItem != null && menuItem.isActionViewExpanded()) {
                            menuItem.collapseActionView();
                        }
                        mainActivity.x(i11);
                        mainActivity.t();
                        p218w3.h hVar = mainActivity.f13661z0;
                        if (hVar == null) {
                            j.k("selectionModel");
                            throw null;
                        }
                        hVar.a(i12, true);
                    } else if (eVar instanceof z3.d) {
                        int i13 = ((z3.d) eVar).f24785b;
                        int i14 = eVar.f24786a;
                        ViewPager2 viewPager2 = mainActivity.f13636a0;
                        if (viewPager2 == null) {
                            j.k("mainPager");
                            throw null;
                        }
                        viewPager2.setCurrentItem(i14 - 1);
                        mainActivity.t();
                        p218w3.h hVar2 = mainActivity.f13661z0;
                        if (hVar2 == null) {
                            j.k("selectionModel");
                            throw null;
                        }
                        hVar2.b(i13, true);
                    } else if (eVar instanceof z3.c) {
                        int i15 = eVar.f24786a;
                        ViewPager2 viewPager3 = mainActivity.f13636a0;
                        if (viewPager3 == null) {
                            j.k("mainPager");
                            throw null;
                        }
                        viewPager3.setCurrentItem(i15 - 1);
                        mainActivity.t();
                    } else if (!(eVar instanceof b)) {
                        throw new A6.a();
                    }
                }
                return yVar;
            case 2:
                d dVar = (d) this.f15578s;
                a.e(obj);
                if (dVar instanceof p165q3.b) {
                    int i16 = ((p165q3.b) dVar).f21287e;
                    int i17 = mainActivity.f13645j0;
                    if (i17 == -1 || i17 == mainActivity.v()) {
                        mainActivity.x(i16);
                    }
                    mainActivity.f13645j0 = i16;
                } else {
                    mainActivity.f13645j0 = -1;
                    p176r6.a aVar = mainActivity.f13635Z;
                    if (aVar == null) {
                        j.k("mainAdapter");
                        throw null;
                    }
                    aVar.f1651r.d(mainActivity.v() - 1, 1, new p045e3.a(-1, false));
                }
                return yVar;
            case 3:
                h hVar3 = (h) this.f15578s;
                a.e(obj);
                int i18 = MainActivity.f13622J0;
                mainActivity.B(hVar3, false);
                return yVar;
            case 4:
                p227x3.c cVar = (p227x3.c) this.f15578s;
                a.e(obj);
                int i19 = MainActivity.f13622J0;
                cVar.getClass();
                MainActivity mainActivity2 = this.f15579t;
                p227x3.a aVarW = mainActivity2.w();
                k0 k0Var = aVarW.f24363a;
                p227x3.d dVar2 = (p227x3.d) k0Var.getValue();
                k0Var.n(null, p227x3.b.f24368a);
                aVarW.f24364b.m(dVar2);
                if (p216w1.b.g(mainActivity2)) {
                    mainActivity2.s(new PermissionsRequestWrapper(mainActivity2, cVar, new E5.c(1, mainActivity2, MainActivity.class, "onPermissionRationaleAccepted", "onPermissionRationaleAccepted(Ljava/lang/String;)V", 0, 0, 8), new t(0, mainActivity2, MainActivity.class, "onPermissionRationaleDenied", "onPermissionRationaleDenied()V", 0, 0, 8)));
                } else {
                    mainActivity2.f13630H0.S("android.permission.POST_NOTIFICATIONS");
                }
                return yVar;
            default:
                p227x3.e eVar2 = (p227x3.e) this.f15578s;
                a.e(obj);
                int i20 = MainActivity.f13622J0;
                if ("android.permission.POST_NOTIFICATIONS".equals(eVar2.f24371a)) {
                    mainActivity.B((h) mainActivity.u().f20302d.f6130r.getValue(), true);
                }
                return yVar;
        }
    }
}
