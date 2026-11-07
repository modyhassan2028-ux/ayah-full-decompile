package K;

import A.C0007a;
import H0.InterfaceC0215n;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.window.PopupLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4823c;

    public /* synthetic */ x0(int i10, Object obj, Object obj2) {
        this.f4821a = i10;
        this.f4822b = obj;
        this.f4823c = obj2;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        ArrayList arrayList;
        p110k9.j jVar;
        switch (this.f4821a) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (!(((H0.H) obj).i() instanceof z0)) {
                        arrayList2.add(obj);
                    }
                }
                List list2 = (List) ((p241y9.a) this.f4823c).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        p171r0.e eVar = (p171r0.e) list2.get(i11);
                        if (eVar != null) {
                            float f3 = eVar.f21390b;
                            float f7 = eVar.f21389a;
                            H0.U uA = ((H0.H) arrayList2.get(i11)).a(p063g1.b.b((int) Math.floor(eVar.f21391c - f7), (int) Math.floor(eVar.f21392d - f3), 5));
                            int iRound = Math.round(f7);
                            jVar = new p110k9.j(uA, new p063g1.j((((long) Math.round(f3)) & 4294967295L) | (((long) iRound) << 32)));
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            arrayList3.add(jVar);
                        }
                        i11++;
                        arrayList2 = arrayList2;
                        list2 = list2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj2 = list.get(i12);
                    if (((H0.H) obj2).i() instanceof z0) {
                        arrayList4.add(obj2);
                    }
                }
                return k7.g0(p063g1.a.h(j), p063g1.a.g(j), p120l9.s.f19441r, new C0007a(15, arrayList, T.n(arrayList4, (p241y9.a) this.f4822b)));
            case 1:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.f4822b;
                int childCount = viewFactoryHolder.getChildCount();
                p120l9.s sVar = p120l9.s.f19441r;
                if (childCount == 0) {
                    return k7.g0(p063g1.a.j(j), p063g1.a.i(j), sVar, p094j1.b.f18707t);
                }
                if (p063g1.a.j(j) != 0) {
                    viewFactoryHolder.getChildAt(0).setMinimumWidth(p063g1.a.j(j));
                }
                if (p063g1.a.i(j) != 0) {
                    viewFactoryHolder.getChildAt(0).setMinimumHeight(p063g1.a.i(j));
                }
                int iJ = p063g1.a.j(j);
                int iH = p063g1.a.h(j);
                ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams);
                int iK = AndroidViewHolder.k(viewFactoryHolder, iJ, iH, layoutParams.width);
                int i13 = p063g1.a.i(j);
                int iG = p063g1.a.g(j);
                ViewGroup.LayoutParams layoutParams2 = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams2);
                viewFactoryHolder.measure(iK, AndroidViewHolder.k(viewFactoryHolder, i13, iG, layoutParams2.height));
                return k7.g0(viewFactoryHolder.getMeasuredWidth(), viewFactoryHolder.getMeasuredHeight(), sVar, new p094j1.c(viewFactoryHolder, (J0.I) this.f4823c, 1));
            default:
                ((PopupLayout) this.f4822b).setParentLayoutDirection((p063g1.m) this.f4823c);
                return k7.g0(0, 0, p120l9.s.f19441r, p104k1.b.f18898u);
        }
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        switch (this.f4821a) {
            case 0:
                return p245z2.a.m(this, interfaceC0215n, list, i10);
            case 1:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.f4822b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams);
                viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.k(viewFactoryHolder, 0, i10, layoutParams.height));
                return viewFactoryHolder.getMeasuredWidth();
            default:
                return p245z2.a.m(this, interfaceC0215n, list, i10);
        }
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        switch (this.f4821a) {
            case 0:
                return p245z2.a.j(this, interfaceC0215n, list, i10);
            case 1:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.f4822b;
                ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams);
                viewFactoryHolder.measure(AndroidViewHolder.k(viewFactoryHolder, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return viewFactoryHolder.getMeasuredHeight();
            default:
                return p245z2.a.j(this, interfaceC0215n, list, i10);
        }
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        switch (this.f4821a) {
            case 0:
                return p245z2.a.g(this, interfaceC0215n, list, i10);
            case 1:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.f4822b;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams);
                viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.k(viewFactoryHolder, 0, i10, layoutParams.height));
                return viewFactoryHolder.getMeasuredWidth();
            default:
                return p245z2.a.g(this, interfaceC0215n, list, i10);
        }
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        switch (this.f4821a) {
            case 0:
                return p245z2.a.d(this, interfaceC0215n, list, i10);
            case 1:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.f4822b;
                ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
                p251z9.j.b(layoutParams);
                viewFactoryHolder.measure(AndroidViewHolder.k(viewFactoryHolder, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return viewFactoryHolder.getMeasuredHeight();
            default:
                return p245z2.a.d(this, interfaceC0215n, list, i10);
        }
    }
}
